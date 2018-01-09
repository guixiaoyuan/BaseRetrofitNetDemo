package com.nongfenqi.controller.http;

import android.support.annotation.NonNull;

import com.nongfenqi.controller.BaseSubscriber;
import com.nongfenqi.controller.client.AddressClient;
import com.nongfenqi.controller.configure.ServiceGenerator;
import com.nongfenqi.controller.model.business.AddressModel;

import java.util.List;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 申请单地址
 *
 * @author jiezhi
 * @version 1.0, 01/04/2017
 * @since [sherlock/V1.0.0]
 */
public class AddressController {

    private String applyId;
    private AddressClient addressClient;

    public AddressController(@NonNull String applyId) {
        this.applyId = applyId;
        addressClient = ServiceGenerator.createService(AddressClient.class);
    }


    /**
     * 查询申请单地址
     */
    public void getApplyAddresses(BaseSubscriber<List<AddressModel>> subscriber) {
        addressClient.getApplyAddresses(applyId)
                .map(new ServiceGenerator.HttpResultFunc<List<AddressModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 新建申请单地址
     */
    public void postApplyAddress(AddressModel addressModel, BaseSubscriber<String> subscriber) {
        addressClient.postApplyAddress(applyId, addressModel)
                .map(new ServiceGenerator.HttpResultFunc<String>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 编辑申请单地址
     */
    public void putApplyAddress(AddressModel addressModel, BaseSubscriber<Object> subscriber) {
        addressClient.putApplyAddress(applyId, addressModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 删除申请单地址
     */
    public void delApplyAddress(String personId, BaseSubscriber<Object> subscriber) {
        addressClient.delApplyAddress(applyId, personId)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

}
