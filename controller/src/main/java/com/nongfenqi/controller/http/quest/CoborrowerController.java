package com.nongfenqi.controller.http.quest;

import android.support.annotation.NonNull;

import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.BaseSubscriber;
import com.nongfenqi.controller.client.quest.CoborrowerClient;
import com.nongfenqi.controller.configure.RetrofitTool;
import com.nongfenqi.controller.configure.ServiceGenerator;
import com.nongfenqi.controller.configure.ServiceGenerator.HttpResultFunc;
import com.nongfenqi.controller.model.coborrower.CoborrowerInfoModel;

import java.util.List;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

import static com.nongfenqi.controller.configure.RetrofitTool.getMultipartBody;

/**
 * 共借人
 *
 * @author yuanfei
 * @version 1.0, 2017/4/12
 * @since [sherlock/V1.0.0]
 */

public class CoborrowerController {
    public static final String TAG = CoborrowerController.class.getSimpleName();
    private String applyId;
    private CoborrowerClient coborrowerClient;


    public CoborrowerController(@NonNull String applyId) {
        this.applyId = applyId;
        coborrowerClient = ServiceGenerator.createService(CoborrowerClient.class);
    }

    /**
     * 查询共借人基本信息
     *
     * @param subscriber
     */

    public void getCoborrowerInfo(Subscriber<List<CoborrowerInfoModel>> subscriber) {
        coborrowerClient.getCoborrowerInfo(applyId)
                .map(new HttpResultFunc<List<CoborrowerInfoModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 创建共借人基本信息
     */

    public void postCoborrowerInfo(CoborrowerInfoModel coborrowerInfoModel, BaseSubscriber<Integer> subscriber) {
        coborrowerClient.postCoborrower(applyId, coborrowerInfoModel)
                .map(new HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 修改共借人基本信息
     */

    public void putCoborrowerInfo(CoborrowerInfoModel coborrowerInfoModel, BaseSubscriber<Object> subscriber) {
        coborrowerClient.putCoborrower(applyId, coborrowerInfoModel)
                .map(new HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);

    }

    /**
     * 删除共借人基本信息
     */

    public void delCoborrowerInfo(String personId, Subscriber<Object> subscriber) {
        coborrowerClient.delCoborrower(applyId, personId)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);

    }

    /**
     * 上传图片信息
     * @param filePathList
     * @param subscriber
     */
    public void uploadCoborrowerPic(final String borrowerId,List<String> filePathList, Subscriber<String> subscriber) {
        RetrofitTool.uploadImages(filePathList, new Func1<String, Observable<BaseResponse<String>>>() {
            @Override
            public Observable<BaseResponse<String>> call(String filePath) {
                return coborrowerClient.postCoborrowerPic(applyId,borrowerId,getMultipartBody(applyId,filePath, true));
            }
        }, subscriber);
    }


}
