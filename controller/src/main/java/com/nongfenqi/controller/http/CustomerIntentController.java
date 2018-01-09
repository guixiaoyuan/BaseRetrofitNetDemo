package com.nongfenqi.controller.http;

import com.nongfenqi.controller.client.CustomerIntentClient;
import com.nongfenqi.controller.configure.ServiceGenerator;
import com.nongfenqi.controller.model.customer.CustomerIntentModel;

import java.util.Map;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 客户意向接口
 *
 * @author luzhichao
 * @version 1.0, 17/3/21
 * @since [sherlock/V1.0.0]
 */

public class CustomerIntentController {
    private static final String TAG = CustomerIntentController.class.getSimpleName();
    private static CustomerIntentClient customerClient;

    /**
     * 客户意向分页查询
     *
     * @param queryOptions
     * @param subscriber
     */
    public static void getCustomerIntentPool(Map<String, String> queryOptions, Subscriber<CustomerIntentModel> subscriber) {
        getCustomerIntentClient().getCustomerIntentPool(queryOptions)
                .map(new ServiceGenerator.HttpResultFunc<CustomerIntentModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);

    }

    /**
     * 客户意向详情
     *
     * @param customerId
     * @param subscriber
     */
    public static void getCustomerIntentDetail(String customerId, Map<String, String> queryOptions, Subscriber<CustomerIntentModel> subscriber) {
        getCustomerIntentClient().getCustomerIntentDetail(customerId, queryOptions)
                .map(new ServiceGenerator.HttpResultFunc<CustomerIntentModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);

    }

    private static CustomerIntentClient getCustomerIntentClient() {
        if (customerClient == null) {
            customerClient = ServiceGenerator.createService(CustomerIntentClient.class);
        }
        return customerClient;
    }
}
