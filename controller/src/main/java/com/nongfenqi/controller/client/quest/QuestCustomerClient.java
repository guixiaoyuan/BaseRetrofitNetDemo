package com.nongfenqi.controller.client.quest;


import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.http.quest.QuestCustomerController;
import com.nongfenqi.controller.model.customer.QuestCustomerModel;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import rx.Observable;

/**
 * 调查表－客户信息
 *
 * @author colin
 * @version 1.0, 16/12/7
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */

public interface QuestCustomerClient {
    // 查询客户信息
    @GET("/apply/{applyId}/customer")
    Observable<BaseResponse<QuestCustomerModel>> getCustomerInfo(@Path("applyId") String applyId);

    // 创建客户
    @POST("/apply/{applyId}/customer")
    Observable<BaseResponse<Object>> postCustomer(@Path("applyId") String applyId, @Body QuestCustomerModel questCustomerController);

    // 修改客户信息
    @PUT("/apply/{applyId}/customer")
    Observable<BaseResponse<Object>> putCustomer(@Path("applyId") String applyId, @Body QuestCustomerController questCustomerController);
}
