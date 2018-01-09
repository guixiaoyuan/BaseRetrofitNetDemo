package com.nongfenqi.controller.client;

import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.model.business.AddressModel;

import java.util.List;

import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import rx.Observable;

/**
 * 申请单地址
 *
 * @author jiezhi
 * @version 1.0, 01/04/2017
 * @since [sherlock/V1.0.0]
 */
public interface AddressClient {
    // 查询申请单地址
    @GET("/apply/{applyId}/address")
    Observable<BaseResponse<List<AddressModel>>> getApplyAddresses(@Path("applyId") String applyId);

    // 新建申请单地址
    @POST("/apply/{applyId}/address")
    Observable<BaseResponse<String>> postApplyAddress(@Path("applyId") String applyId,
                                                      @Body AddressModel addressModel);

    // 编辑申请单地址
    @PUT("/apply/{applyId}/address")
    Observable<BaseResponse<Object>> putApplyAddress(@Path("applyId") String applyId,
                                                     @Body AddressModel addressModel);

    // 删除申请单地址
    @DELETE("/apply/{applyId}/address/{id}")
    Observable<BaseResponse<Object>> delApplyAddress(@Path("applyId") String applyId,
                                                     @Path("id") String id);

}
