package com.nongfenqi.controller.http.quest;

import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.client.quest.FamilyVisitClient;
import com.nongfenqi.controller.configure.RetrofitTool;
import com.nongfenqi.controller.configure.ServiceGenerator;
import com.nongfenqi.controller.model.family.impression.FamilyImpressionModel;
import com.nongfenqi.controller.model.family.impression.FamilyVisitModel;

import java.util.List;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * @author jiezhi
 * @version 1.0, 14/04/2017
 * @since [sherlock/V1.0.0]
 */
public class FamilyVisitController {
    private static final String TAG = FamilyVisitController.class.getSimpleName();
    private String applyId;
    private FamilyVisitClient client;

    public FamilyVisitController(String applyId) {
        this.applyId = applyId;
        client = ServiceGenerator.createService(FamilyVisitClient.class);
    }

    /**
     * 查询家访印象
     *
     * @param subscriber
     */
    public void getFamilyImpression(Subscriber<FamilyImpressionModel> subscriber) {
        client.getFamilyImpression(applyId)
                .map(new ServiceGenerator.HttpResultFunc<FamilyImpressionModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 添加家访印象标签
     *
     * @param familyImpressionModel
     * @param subscriber
     */
    public void postFamilyImpression(FamilyImpressionModel familyImpressionModel, Subscriber<Object> subscriber) {
        client.postFamilyImpression(applyId, familyImpressionModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 删除家访情况标签
     *
     * @param familyImpressionId
     * @param subscriber
     */
    public void deleteFamilyImpression(int familyImpressionId, Subscriber<Object> subscriber) {
        client.deleteFamilyImpression(applyId, familyImpressionId)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 查询家访情况
     *
     * @param subscriber
     */
    public void getFamilyVisit(Subscriber<FamilyVisitModel> subscriber) {
        client.getFamilyVisit(applyId)
                .map(new ServiceGenerator.HttpResultFunc<FamilyVisitModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 添加家访情况
     *
     * @param familyVisitModel
     * @param subscriber
     */
    public void postFamilyVisit(FamilyVisitModel familyVisitModel, Subscriber<Integer> subscriber) {
        client.postFamilyVisit(applyId, familyVisitModel)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 修改家访情况
     *
     * @param familyVisitModel
     * @param subscriber
     */
    public void putFamilyVisit(FamilyVisitModel familyVisitModel, Subscriber<Object> subscriber) {
        client.putFamilyVisit(applyId, familyVisitModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 家访情况上传图片
     *
     * @param filePathList
     * @param subscriber
     */
    public void uploadFamilyVisitPic(List<String> filePathList, Subscriber<String> subscriber) {
        RetrofitTool.uploadImages(filePathList, new Func1<String, Observable<BaseResponse<String>>>() {
            @Override
            public Observable<BaseResponse<String>> call(String filePath) {
                return client.uploadFamilyVisitPic(applyId, RetrofitTool.getMultipartBody(applyId, filePath, true));
            }
        }, subscriber);
    }
}
