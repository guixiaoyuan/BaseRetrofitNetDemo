package com.nongfenqi.controller.http.quest;

import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.client.quest.SideSurveyClient;
import com.nongfenqi.controller.configure.RetrofitTool;
import com.nongfenqi.controller.configure.ServiceGenerator;
import com.nongfenqi.controller.model.survey.SideSurveyImpressionModel;
import com.nongfenqi.controller.model.survey.SideSurveyModel;

import java.util.List;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * 侧面调查
 *
 * @author jiezhi
 * @version 1.0, 14/04/2017
 * @since [sherlock/V1.0.0]
 */
public class SideSurveyController {
    private String applyId;
    private SideSurveyClient sideSurveyClient;

    public SideSurveyController(String applyId) {
        this.applyId = applyId;
        sideSurveyClient = ServiceGenerator.createService(SideSurveyClient.class);
    }

    /**
     * 查询侧面调查对象列表
     */
    public void getSideSurveyList(Subscriber<List<SideSurveyModel>> subscriber) {
        sideSurveyClient.getSideSurveyList(applyId)
                .map(new ServiceGenerator.HttpResultFunc<List<SideSurveyModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 添加侧面调查对象
     *
     * @param sideSurveyModel
     * @param subscriber
     */
    public void postSideSurvey(SideSurveyModel sideSurveyModel, Subscriber<Integer> subscriber) {
        sideSurveyClient.postSideSurvey(applyId, sideSurveyModel)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 添加侧面调查对象
     *
     * @param sideSurveyModel
     * @param subscriber
     */
    public void putSideSurvey(SideSurveyModel sideSurveyModel, Subscriber<Object> subscriber) {
        sideSurveyClient.putSideSurvey(applyId, sideSurveyModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 查询侧面调查对象的印象列表
     *
     * @param surveyTargetId
     * @param subscriber
     */
    public void getSideSurveyImpressionList(int surveyTargetId, Subscriber<SideSurveyImpressionModel> subscriber) {
        sideSurveyClient.getSideSurveyImpressionList(applyId, surveyTargetId)
                .map(new ServiceGenerator.HttpResultFunc<SideSurveyImpressionModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 添加侧面调查标签
     *
     * @param sideSurveyImpressionModel
     * @param subscriber
     */
    public void postSideSurveyImpression(int surveyTargetId, SideSurveyImpressionModel sideSurveyImpressionModel, Subscriber<Object> subscriber) {
        sideSurveyClient.postSideSurveyImpression(applyId, surveyTargetId, sideSurveyImpressionModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 删除侧面调查对象标签
     *
     * @param surveyTargetImpressionId
     * @param subscriber
     */
    public void deleteSideSurveyImpressionById(int surveyTargetImpressionId, Subscriber<Object> subscriber) {
        sideSurveyClient.deleteSideSurveyImpressionById(applyId, surveyTargetImpressionId)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 侧面调查对象上传录音文件
     *
     * @param id
     * @param filePathList
     * @param subscriber
     */
    public void postSideSurveyVoice(final int id, List<String> filePathList, Subscriber<String> subscriber) {
        // TODO: 14/04/2017 Change to file
        RetrofitTool.uploadImages(filePathList, new Func1<String, Observable<BaseResponse<String>>>() {
            @Override
            public Observable<BaseResponse<String>> call(String filePath) {
                return sideSurveyClient.postSideSurveyVoice(applyId, id, RetrofitTool.getMultipartBody(applyId, filePath, false));
            }
        }, subscriber);
    }

    /**
     * 删除侧面调查对象
     *
     * @param surveyTargetId
     * @param subscriber
     */
    public void deleteSideSurveyById(int surveyTargetId, Subscriber<Object> subscriber) {
        sideSurveyClient.deleteSideSurveyById(applyId, surveyTargetId)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }
}
