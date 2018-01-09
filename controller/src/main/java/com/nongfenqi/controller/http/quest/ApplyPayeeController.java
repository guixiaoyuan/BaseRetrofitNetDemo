package com.nongfenqi.controller.http.quest;


import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.client.quest.ApplyPayeeClient;
import com.nongfenqi.controller.configure.RetrofitTool;
import com.nongfenqi.controller.configure.ServiceGenerator;
import com.nongfenqi.controller.model.payee.PayeeCompanyPrivateModel;
import com.nongfenqi.controller.model.payee.PayeeCompanyPublicModel;
import com.nongfenqi.controller.model.payee.PayeeMachineDistributorModel;
import com.nongfenqi.controller.model.payee.PayeeModel;
import com.nongfenqi.controller.model.payee.PayeePersonalModel;
import com.nongfenqi.controller.model.payee.PayeeSelfModel;
import com.nongfenqi.controller.model.payee.PayeeTypeModel;
import com.nongfenqi.controller.model.payee.PayeeVendorModel;

import java.util.List;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Function
 * 下款收款方
 *
 * @author jiezhi
 * @version 1.0, 07/02/2017
 * @see [相关类/方法]
 * @since [农人帮/V1.1.2]
 */
public class ApplyPayeeController {
    private static final String TAG = ApplyPayeeController.class.getSimpleName();

    private String applyId;
    private ApplyPayeeClient applyPayeeClient;

    public ApplyPayeeController(String applyId) {
        this.applyId = applyId;
        applyPayeeClient = ServiceGenerator.createService(ApplyPayeeClient.class);
    }

    /**
     * 收款方查询
     *
     * @param subscriber
     */
    public void getApplyPayee(Subscriber<PayeeModel> subscriber) {
        applyPayeeClient.getPayee(applyId)
                .map(new ServiceGenerator.HttpResultFunc<PayeeModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 设置收款方类型
     *
     * @param subscriber
     */
    public void setPayeeType(PayeeTypeModel payeeTypeModel, Subscriber<Object> subscriber) {
        applyPayeeClient.setPayeeType(applyId, payeeTypeModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 查询对私代理收款信息
     *
     * @param subscriber
     */
    public void getPayeeProxyCompanyPrivate(Subscriber<PayeeCompanyPrivateModel> subscriber) {
        applyPayeeClient.getPayeeProxyCompanyPrivate(applyId)
                .map(new ServiceGenerator.HttpResultFunc<PayeeCompanyPrivateModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 设置对私代理收款信息
     *
     * @param subscriber
     */
    public void setPayeeProxyCompanyPrivate(PayeeCompanyPrivateModel payeeCompanyPrivateModel, Subscriber<Object> subscriber) {
        applyPayeeClient.setPayeeProxyCompanyPrivate(applyId, payeeCompanyPrivateModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 查询对公代理收款信息
     *
     * @param subscriber
     */
    public void getPayeeProxyCompanyPublic(Subscriber<PayeeCompanyPublicModel> subscriber) {
        applyPayeeClient.getPayeeProxyCompanyPublic(applyId)
                .map(new ServiceGenerator.HttpResultFunc<PayeeCompanyPublicModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 设置对公代理收款信息
     *
     * @param subscriber
     */
    public void setPayeeProxyCompanyPublic(PayeeCompanyPublicModel payeeCompanyPublicModel, Subscriber<Object> subscriber) {
        applyPayeeClient.setPayeeProxyCompanyPublic(applyId, payeeCompanyPublicModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 查询农机经销商代理收款信息
     *
     * @param subscriber
     */
    public void getPayeeProxyMachineDistributor(Subscriber<PayeeMachineDistributorModel> subscriber) {
        applyPayeeClient.getPayeeProxyMachineDistributor(applyId)
                .map(new ServiceGenerator.HttpResultFunc<PayeeMachineDistributorModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 设置农机经销商代理收款信息
     *
     * @param subscriber
     */
    public void setPayeeProxyMachineDistributor(PayeeMachineDistributorModel payeeMachineDistributorModel, Subscriber<Object> subscriber) {
        applyPayeeClient.setPayeeProxyMachineDistributor(applyId, payeeMachineDistributorModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 查询个人代理收款信息
     *
     * @param subscriber
     */
    public void getPayeeProxyPersonal(Subscriber<PayeePersonalModel> subscriber) {
        applyPayeeClient.getPayeeProxyPersonal(applyId)
                .map(new ServiceGenerator.HttpResultFunc<PayeePersonalModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 设置个人代理收款信息
     *
     * @param subscriber
     */
    public void setPayeeProxyPersonal(PayeePersonalModel payeePersonalModel, Subscriber<Object> subscriber) {
        applyPayeeClient.setPayeeProxyPersonal(applyId, payeePersonalModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 查询农机厂家代理收款信息
     *
     * @param subscriber
     */
    public void getPayeeProxyVendor(Subscriber<PayeeVendorModel> subscriber) {
        applyPayeeClient.getPayeeProxyVendor(applyId)
                .map(new ServiceGenerator.HttpResultFunc<PayeeVendorModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 设置农机厂家代理收款信息
     *
     * @param subscriber
     */
    public void setPayeeProxyVendor(PayeeVendorModel payeeVendorModel, Subscriber<Object> subscriber) {
        applyPayeeClient.setPayeeProxyVendor(applyId, payeeVendorModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 查询自收款信息
     *
     * @param subscriber
     */
    public void getPayeeProxySelf(Subscriber<PayeeSelfModel> subscriber) {
        applyPayeeClient.getPayeeProxySelf(applyId)
                .map(new ServiceGenerator.HttpResultFunc<PayeeSelfModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 设置查询自收款信息
     *
     * @param subscriber
     */
    public void setPayeeProxySelf(PayeeSelfModel payeeSelfModel, Subscriber<Object> subscriber) {
        applyPayeeClient.setPayeeProxySelf(applyId, payeeSelfModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 收款方图片上传
     *
     * @param filePathList
     * @param subscriber
     */
    public void uploadCreditImages(List<String> filePathList, Subscriber<String> subscriber) {
        RetrofitTool.uploadImages(filePathList, new Func1<String, Observable<BaseResponse<String>>>() {
            @Override
            public Observable<BaseResponse<String>> call(String filePath) {
                return applyPayeeClient.postPayeePic(applyId, RetrofitTool.getMultipartBody(applyId, filePath, true));
            }
        }, subscriber);
    }

}
