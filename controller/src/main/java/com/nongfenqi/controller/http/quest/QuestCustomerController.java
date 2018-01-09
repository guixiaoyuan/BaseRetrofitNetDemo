package com.nongfenqi.controller.http.quest;

import android.support.annotation.NonNull;

import com.nongfenqi.controller.client.quest.QuestCustomerClient;
import com.nongfenqi.controller.configure.ServiceGenerator;
import com.nongfenqi.controller.model.customer.QuestCustomerModel;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 调查表--客户信息业务
 * @author yuanfei
 * @version 1.0, 2017/4/11
 * @since [sherlock/V1.0.0]
 */

public class QuestCustomerController {
    private final String TAG  = QuestCustomerController.class.getSimpleName();
    private String applyId;
    private QuestCustomerClient questCustomerClient = null;


    public QuestCustomerController(@NonNull String applyId){
        this.applyId = applyId;
        questCustomerClient = ServiceGenerator.createService(QuestCustomerClient.class);
    }

    /**
     * 查询客户基本信息
     */

    public void getCustomerInfo(Subscriber<QuestCustomerModel> subscriber) {
        questCustomerClient.getCustomerInfo(applyId)
                .map(new ServiceGenerator.HttpResultFunc<QuestCustomerModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);


    }

    /**
     * 创建客户基本信息
     */

    public void postCustomerInfo(QuestCustomerModel questCustomerModel, Subscriber<Object> subscriber){
        questCustomerClient.postCustomer(applyId,questCustomerModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 修改客户基本信息
     */
    public void putCustomerInfo(QuestCustomerModel questCustomerModel, Subscriber<Object> subscriber){
        questCustomerClient.postCustomer(applyId,questCustomerModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }
}
