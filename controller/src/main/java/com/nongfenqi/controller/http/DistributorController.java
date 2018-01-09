package com.nongfenqi.controller.http;

import com.nongfenqi.controller.BasePageResponse;
import com.nongfenqi.controller.client.DistributorClient;
import com.nongfenqi.controller.configure.ServiceGenerator;
import com.nongfenqi.controller.model.other.DistributorModel;

import java.util.Map;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 经销商信息
 *
 * @author jiezhi
 * @version 1.0, 10/04/2017
 * @since [sherlock/V1.0.0]
 */
public class DistributorController {
    private static final String TAG = DistributorController.class.getSimpleName();


    /**
     * 查询经销商列表
     */
    public static void getDistributors(Map<String, String> queryOptions, Subscriber<BasePageResponse<DistributorModel>> subscriber) {
        DistributorClient distributorClient = ServiceGenerator.createService(DistributorClient.class);
        distributorClient.getDistributors(queryOptions)
                .map(new ServiceGenerator.HttpResultFunc<BasePageResponse<DistributorModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

}
