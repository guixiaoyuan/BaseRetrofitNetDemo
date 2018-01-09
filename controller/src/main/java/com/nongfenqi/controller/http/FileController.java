package com.nongfenqi.controller.http;

import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.client.SystemClient;
import com.nongfenqi.controller.configure.PhotoConstant;
import com.nongfenqi.controller.configure.RetrofitTool;
import com.nongfenqi.controller.configure.ServiceGenerator;
import com.nongfenqi.controller.configure.UrlConstant;
import com.nongfenqi.controller.model.system.FileModel;
import com.nongfenqi.library.tools.LogcatUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.functions.FuncN;
import rx.schedulers.Schedulers;

import static com.nongfenqi.controller.configure.RetrofitTool.getMultipartBody;

/**
 * Function
 * 文件通用接口
 *
 * @author jiezhi
 * @version 1.0, 17/11/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */
public class FileController {
    private static final String TAG = FileController.class.getSimpleName();


    /**
     * 上传图片到指定的url
     *
     * @param fileUrl
     * @param cacheId
     * @param filePath
     * @param subscriber
     */
    public static void uploadImage(final String fileUrl, final String cacheId, String filePath, Subscriber<String> subscriber) {
        SystemClient demaciaClient = ServiceGenerator.createService(SystemClient.class);
        demaciaClient.uploadFile(fileUrl, getMultipartBody(cacheId, filePath, true))
                .map(new ServiceGenerator.HttpResultFunc<String>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 上传图片组到指定的url
     *
     * @param fileUrl
     * @param cacheId
     * @param filePathList
     * @param subscriber
     */
    public static void uploadImages(final String fileUrl, final String cacheId, List<String> filePathList, Subscriber<String> subscriber) {
        final SystemClient demaciaClient = ServiceGenerator.createService(SystemClient.class);
        RetrofitTool.uploadImages(filePathList, new Func1<String, Observable<BaseResponse<String>>>() {
            @Override
            public Observable<BaseResponse<String>> call(String filePath) {
                return demaciaClient.uploadFile(fileUrl, getMultipartBody(cacheId, filePath, true));
            }
        }, subscriber);
    }

    /**
     * 访问图片文件
     *
     * @param groupId
     * @param subscriber
     */
    public static void getFileList(String groupId, Subscriber<List<Map<String, String>>> subscriber) {
        SystemClient demaciaClient = ServiceGenerator.createService(SystemClient.class, UrlConstant.SERVER_API_GROUP, false);
        demaciaClient.getFileList(groupId)
                .map(new ServiceGenerator.HttpResultFunc<List<FileModel>>())
                .map(new Func1<List<FileModel>, List<Map<String, String>>>() {
                    @Override
                    public List<Map<String, String>> call(List<FileModel> fileModels) {
                        List<Map<String, String>> images = new ArrayList<>();
                        Map<String, String> imgMap;
                        for (FileModel data : fileModels) {
                            imgMap = new HashMap<>(1);
                            imgMap.put(PhotoConstant.PHOTO_INFO_KEY_FILE_URL, String.format(UrlConstant.SERVER_API_PIC + "%s", data.getFileId()));
                            imgMap.put(PhotoConstant.PHOTO_INFO_KEY_FILE_ID, data.getFileId());
                            imgMap.put(PhotoConstant.PHOTO_INFO_KEY_ADD_TIME, data.getCreatedTime());
                            imgMap.put(PhotoConstant.PHOTO_NAME, data.getFileName());
//                    imgMap.put(Constants.PHOTO_INFO_KEY_TYPE, data.getFileType());
                            images.add(imgMap);
                        }
                        return images;
                    }
                })
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 获取图片列表
     *
     * @param groupIdList
     * @param subscriber
     */
    public static void getFileListMap(final List<String> groupIdList, Subscriber<Map<String, List<Map<String, String>>>> subscriber) {
        SystemClient demaciaClient = ServiceGenerator.createService(SystemClient.class, UrlConstant.SERVER_API_GROUP, false);
        List<Observable<Map<String, List<Map<String, String>>>>> observableList = new ArrayList<>(groupIdList.size());
        for (final String groupId : groupIdList) {
            observableList.add(demaciaClient.getFileList(groupId)
                    .map(new ServiceGenerator.HttpResultFunc<List<FileModel>>())
                    .map(new Func1<List<FileModel>, Map<String, List<Map<String, String>>>>() {
                        @Override
                        public Map<String, List<Map<String, String>>> call(List<FileModel> fileModels) {
                            Map<String, List<Map<String, String>>> groupMap = new HashMap<>();
                            List<Map<String, String>> images = new ArrayList<>();
                            Map<String, String> imgMap;
                            for (FileModel data : fileModels) {
                                imgMap = new HashMap<>(1);
                                imgMap.put(PhotoConstant.PHOTO_INFO_KEY_FILE_URL, String.format(UrlConstant.SERVER_API_PIC + "%s", data.getFileId()));
                                imgMap.put(PhotoConstant.PHOTO_INFO_KEY_FILE_ID, data.getFileId());
                                imgMap.put(PhotoConstant.PHOTO_INFO_KEY_ADD_TIME, data.getCreatedTime());
//                    imgMap.put(Constants.PHOTO_INFO_KEY_TYPE, data.getFileType());
                                images.add(imgMap);
                            }
                            groupMap.put(groupId, images);
                            return groupMap;
                        }
                    })
                    .subscribeOn(Schedulers.newThread())
                    .observeOn(AndroidSchedulers.mainThread()));
        }
        Observable<Map<String, List<Map<String, String>>>> combinedObservable = Observable.zip(observableList,
                new FuncN<Map<String, List<Map<String, String>>>>() {
                    @Override
                    public Map<String, List<Map<String, String>>> call(Object... args) {
                        Map<String, List<Map<String, String>>> groupListMap = new HashMap<>();
                        if (args != null && args.length > 0) {
                            for (Object arg : args) {
                                LogcatUtil.d(TAG, arg.toString());
                                Map<String, List<Map<String, String>>> groupMap = (Map<String, List<Map<String, String>>>) arg;
                                groupListMap.putAll(groupMap);
                            }
                        }
                        return groupListMap;
                    }
                });
        combinedObservable.subscribe(subscriber);
    }

    /**
     * 下载文件
     *
     * @param url
     * @param subscriber
     */
    public static void downloadFile(String url, String filePath, Subscriber<Boolean> subscriber) {
        SystemClient demaciaClient = ServiceGenerator.createService(SystemClient.class);
        demaciaClient.downloadFile(url)
                .map(new ServiceGenerator.SaveFileFunc(filePath))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 删除文件
     *
     * @param fileId
     * @param subscriber
     */
    public static void deleteFile(String fileId, Subscriber<Object> subscriber) {
        SystemClient demaciaClient = ServiceGenerator.createService(SystemClient.class);
        demaciaClient.deleteFile(fileId)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }
}
