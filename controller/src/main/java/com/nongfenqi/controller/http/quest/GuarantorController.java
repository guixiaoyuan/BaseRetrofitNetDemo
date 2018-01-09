package com.nongfenqi.controller.http.quest;


import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.client.quest.GuarantorClient;
import com.nongfenqi.controller.configure.RetrofitTool;
import com.nongfenqi.controller.configure.ServiceGenerator;
import com.nongfenqi.controller.model.guarantor.GuarantorAssertModel;
import com.nongfenqi.controller.model.guarantor.GuarantorModel;

import java.util.List;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

import static com.nongfenqi.controller.configure.RetrofitTool.getMultipartBody;

/**
 * Function
 * 担保人
 *
 * @author Jiezhi
 * @version 1.0, 16/01/2017
 */
public class GuarantorController {

    private String applyId;
    private GuarantorClient client;

    public GuarantorController(String applyId) {
        this.applyId = applyId;
        client = ServiceGenerator.createService(GuarantorClient.class);
    }

    /**
     * 查询担保人列表
     *
     * @param subscriber
     */
    public void getGuarantorList(Subscriber<List<GuarantorModel>> subscriber) {
        client.getGuarantorList(applyId)
                .map(new ServiceGenerator.HttpResultFunc<List<GuarantorModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 添加担保人
     *
     * @param guarantorModel
     * @param subscriber
     */
    public void postGuarantor(GuarantorModel guarantorModel, Subscriber<String> subscriber) {
        client.postGuarantor(applyId, guarantorModel)
                .map(new ServiceGenerator.HttpResultFunc<String>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 修改担保人
     *
     * @param guarantorModel
     * @param subscriber
     */
    public void putGuarantor(GuarantorModel guarantorModel, Subscriber<Object> subscriber) {
        client.putGuarantor(applyId, guarantorModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 删除担保人
     *
     * @param id
     * @param subscriber
     */
    public void deleteGuarantor(String id, Subscriber<Object> subscriber) {
        client.deleteGuarantor(applyId, id)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 查询担保人资产
     *
     * @param subscriber
     */
    public void getGuarantorAssertList(String guarantorId, Subscriber<List<GuarantorAssertModel>> subscriber) {
        client.getGuarantorAssertList(applyId, guarantorId)
                .map(new ServiceGenerator.HttpResultFunc<List<GuarantorAssertModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 添加担保人资产
     *
     * @param guarantorModel
     * @param subscriber
     */
    public void postGuarantorAssert(String guaranteeId, GuarantorAssertModel guarantorModel, Subscriber<Integer> subscriber) {
        client.postGuarantorAssert(applyId, guaranteeId, guarantorModel)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 修改担保人资产
     *
     * @param guarantorModel
     * @param subscriber
     */
    public void putGuarantorAssert(String guaranteeId, GuarantorAssertModel guarantorModel, Subscriber<Object> subscriber) {
        client.putGuarantorAssert(applyId, guaranteeId, guarantorModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);

    }

    /**
     * 删除担保人资产
     *
     * @param id
     * @param subscriber
     */
    public void deleteGuarantorAssert(String guarantorId, Integer id, Subscriber<Object> subscriber) {
        client.deleteGuarantorAssert(applyId, guarantorId, id)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 上传担保人信息图片
     *
     * @param filePathList
     * @param subscriber
     */
    public void uploadCustomerPic(final String guarantorId, List<String> filePathList, Subscriber<String> subscriber) {
        RetrofitTool.uploadImages(filePathList, new Func1<String, Observable<BaseResponse<String>>>() {
            @Override
            public Observable<BaseResponse<String>> call(String filePath) {
                return client.postGuarantorPic(applyId, guarantorId, getMultipartBody(applyId, filePath, true));
            }
        }, subscriber);
    }

}
