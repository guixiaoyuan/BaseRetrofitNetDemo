package com.nongfenqi.controller.http.quest;

import android.support.annotation.NonNull;

import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.client.quest.CustomerClient;
import com.nongfenqi.controller.configure.RetrofitTool;
import com.nongfenqi.controller.configure.ServiceGenerator;
import com.nongfenqi.controller.model.customer.CustomerInfoModel;
import com.nongfenqi.library.tools.LogcatUtil;

import java.util.ArrayList;
import java.util.List;

import okhttp3.MultipartBody;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

import static com.nongfenqi.controller.configure.RetrofitTool.getMultipartBody;

/**
 * 调查表--借款人信息业务
 *
 * @author yuanfei
 * @version 1.0, 2017/4/11
 * @since [sherlock/V1.0.0]
 */

public class CustomerController {
    private final String TAG = CustomerController.class.getSimpleName();
    private String applyId;
    private CustomerClient customerClient = null;


    public CustomerController(@NonNull String applyId) {
        this.applyId = applyId;
        customerClient = ServiceGenerator.createService(CustomerClient.class);
    }


    /**
     * 查询客户基本信息
     */

    public void getCustomerInfo(Subscriber<CustomerInfoModel> subscriber) {
        customerClient.getCustomerInfo(applyId)
                .map(new ServiceGenerator.HttpResultFunc<CustomerInfoModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);


    }

    /**
     * 创建客户基本信息
     */

    public void postCustomerInfo(CustomerInfoModel customerInfoModel, Subscriber<Object> subscriber) {
        customerClient.postCustomer(applyId, customerInfoModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 修改客户基本信息
     */
    public void putCustomerInfo(CustomerInfoModel customerInfoModel, Subscriber<Object> subscriber) {
        customerClient.putCustomer(applyId, customerInfoModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 上传客户信息图片
     *
     * @param filePathList
     * @param subscriber
     */
    public void uploadCustomerPic(List<String> filePathList, Subscriber<String> subscriber) {
        RetrofitTool.uploadImages(filePathList, new Func1<String, Observable<BaseResponse<String>>>() {
            @Override
            public Observable<BaseResponse<String>> call(String filePath) {
                LogcatUtil.d("Retrofit", "uploadCustomerPic Func");
                return customerClient.postCustomerPic(applyId, getMultipartBody(applyId, filePath, true));
            }
        }, subscriber);
    }

    /**
     * 上传客户信息图片
     *
     * @param filePathList
     * @param subscriber
     */
    public void uploadCustomerPics(List<String> filePathList, Subscriber<String> subscriber) {
        List<MultipartBody.Part> partList = new ArrayList<>();
        for (String filePath : filePathList) {
            if (!("".equals(filePath) || filePath.startsWith("http"))) {
                partList.add(getMultipartBody(applyId, filePath, true));
            }
        }

        customerClient.postCustomerPics(applyId, partList)
                .map(new ServiceGenerator.HttpResultFunc<String>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


}
