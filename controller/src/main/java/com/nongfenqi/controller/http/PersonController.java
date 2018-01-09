package com.nongfenqi.controller.http;

import com.nongfenqi.controller.BaseSubscriber;
import com.nongfenqi.controller.client.PersonClient;
import com.nongfenqi.controller.configure.ServiceGenerator;
import com.nongfenqi.controller.model.business.PersonModel;
import com.nongfenqi.controller.model.business.PersonNameConfirmModel;

import java.util.List;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 申请单关系人
 *
 * @author jiezhi
 * @version 1.0, 01/04/2017
 * @since [sherlock/V1.0.0]
 */
public class PersonController {
    private String applyId;
    private PersonClient personClient;

    public PersonController(String applyId) {
        this.applyId = applyId;
        personClient = ServiceGenerator.createService(PersonClient.class);
    }


    /**
     * 查询申请单关系人
     */
    public void getApplyPersons(BaseSubscriber<List<PersonModel>> subscriber) {
        personClient.getApplyPersons(applyId)
                .map(new ServiceGenerator.HttpResultFunc<List<PersonModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 新建关系人
     */
    public void postApplyPerson(PersonModel personModel, BaseSubscriber<PersonModel> subscriber) {
        personClient.postApplyPerson(applyId, personModel)
                .map(new ServiceGenerator.HttpResultFunc<PersonModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 编辑关系人
     */
    public void putApplyPerson(PersonModel personModel, BaseSubscriber<Object> subscriber) {
        personClient.putApplyPerson(applyId, personModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 删除关系人
     */
    public void delApplyPerson(String personId, BaseSubscriber<Object> subscriber) {
        personClient.delApplyPerson(applyId, personId)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 编辑实名认证
     */
    public void putApplyPersonAuthente(PersonNameConfirmModel personNameConfirmModel, BaseSubscriber<Object> subscriber) {
        personClient.putApplyPersonAuthente(applyId, personNameConfirmModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


}
