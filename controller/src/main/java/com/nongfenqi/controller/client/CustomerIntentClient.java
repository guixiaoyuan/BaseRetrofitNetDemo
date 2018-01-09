package com.nongfenqi.controller.client;

import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.model.customer.CustomerIntentModel;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * 客户相关接口
 *
 * @author luzhichao
 * @version 1.0, 17/3/21
 * @since [sherlock/V1.0.0]
 */

public interface CustomerIntentClient {
    // 客户意向池分页查询
    @GET("/customer/intent-pool")
    Observable<BaseResponse<CustomerIntentModel>> getCustomerIntentPool(@QueryMap Map<String, String> queryOptions);

    // 客户意向详情
    @GET("/customer/{customerId}/intent")
    Observable<BaseResponse<CustomerIntentModel>> getCustomerIntentDetail(@Path("customerId") String customerId, @QueryMap Map<String, String> queryOptions);
}
