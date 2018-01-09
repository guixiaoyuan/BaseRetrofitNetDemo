package com.nongfenqi.controller.configure;


import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.library.AppConfigure;
import com.nongfenqi.library.tools.ImageUtil;
import com.nongfenqi.library.tools.LogcatUtil;

import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.util.List;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Function
 *
 * @author jiezhi
 * @version 1.0, 17/11/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */
public class RetrofitTool {
    private static final String TAG = RetrofitTool.class.getSimpleName();

    /**
     * 上传图片到服务器
     *
     * @param filePathList
     * @param observableFunc1
     * @param subscriber
     */
    public static void uploadImages(List<String> filePathList, Func1<String, Observable<BaseResponse<String>>> observableFunc1, Subscriber<String> subscriber) {
        if (observableFunc1 == null) {
            return;
        }
        Observable.from(filePathList)
                .filter(new Func1<String, Boolean>() {
                    @Override
                    public Boolean call(String imgPath) {
                        return !("".equals(imgPath) || imgPath.startsWith("http"));
                    }
                })
                .flatMap(observableFunc1)
                .map(new ServiceGenerator.HttpResultFunc<String>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * @param applyId
     * @param filePath
     * @return
     */
    public static MultipartBody.Part getMultipartBody(String applyId, String filePath) {
        return getMultipartBody(applyId, filePath, true);
    }

    /**
     * @param applyId
     * @param filePath
     * @param needCompress
     * @return
     */
    public static MultipartBody.Part getMultipartBody(String applyId, String filePath, boolean needCompress) {
        File file = new File(filePath);
        if (!file.exists()) {
            LogcatUtil.e(TAG, "file not exists :" + filePath);
            return null;
        }
        String compressImage = null;
        if (needCompress) {
            compressImage = ImageUtil.getCompressedExifImage(AppConfigure.getImageCacheDir(applyId), filePath);
        }
        if (StringUtils.isEmpty(compressImage)) {
            compressImage = filePath;
        }
        File compressedFile = new File(compressImage);
        return MultipartBody.Part.createFormData("file", compressedFile.getName(), RequestBody.create(MediaType.parse("image/*"), compressedFile));
    }
}
