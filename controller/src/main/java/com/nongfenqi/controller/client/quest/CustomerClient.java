package com.nongfenqi.controller.client.quest;


import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.model.customer.CustomerInfoModel;

import java.util.List;

import okhttp3.MultipartBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
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

public interface CustomerClient {
    // 查询客户基本信息
    @GET("/apply/{applyId}/customer")
    Observable<BaseResponse<CustomerInfoModel>> getCustomerInfo(@Path("applyId") String applyId);

    // 创建客户
    @POST("/apply/{applyId}/customer")
    Observable<BaseResponse<Object>> postCustomer(@Path("applyId") String applyId, @Body CustomerInfoModel CustomerInfoModel);

    // 修改客户基本信息
    @PUT("/apply/{applyId}/customer")
    Observable<BaseResponse<Object>> putCustomer(@Path("applyId") String applyId, @Body CustomerInfoModel CustomerInfoModel);

    //上传客户信息
    @Multipart
    @POST("/apply/{applyId}/customer/pic")
    Observable<BaseResponse<String>> postCustomerPic(@Path("applyId") String applyId, @Part MultipartBody.Part file);

    //上传客户信息
    @Multipart
    @POST("/apply/{applyId}/customer/pic")
    Observable<BaseResponse<String>> postCustomerPics(@Path("applyId") String applyId, @Part List<MultipartBody.Part> files);
}
