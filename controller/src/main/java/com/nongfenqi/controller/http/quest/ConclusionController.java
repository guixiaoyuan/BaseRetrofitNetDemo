package com.nongfenqi.controller.http.quest;


import android.support.annotation.NonNull;

import com.nongfenqi.controller.client.quest.ConclusionClient;
import com.nongfenqi.controller.configure.ServiceGenerator;
import com.nongfenqi.controller.model.conclusion.ConclusionInfoModel;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 调查表－调查结论业务
 *
 * @author colin
 * @version 1.0, 16/12/7
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */

public class ConclusionController {
    private final String TAG = ConclusionController.class.getSimpleName();
    private String applyId;
    private ConclusionClient conclusionClient = null;

    public ConclusionController(@NonNull String applyId) {
        this.applyId = applyId;
        conclusionClient = ServiceGenerator.createService(ConclusionClient.class);
    }

    /**
     * 查询调查报告信息
     *
     * @param subscriber
     */
    public void getConclusionInfo(Subscriber<ConclusionInfoModel> subscriber) {
        conclusionClient.getConclusionInfo(applyId)
                .map(new ServiceGenerator.HttpResultFunc<ConclusionInfoModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 创建调查报告信息
     *
     * @param subscriber
     */
    public void postConclusionInfo(ConclusionInfoModel conclusionInfoModel, Subscriber<Object> subscriber) {
        conclusionClient.postConclusion(applyId, conclusionInfoModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 修改调查报告信息
     *
     * @param subscriber
     */
    public void putConclusionInfo(ConclusionInfoModel conclusionInfoModel, Subscriber<Object> subscriber) {
        conclusionClient.putConclusion(applyId, conclusionInfoModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }
}
