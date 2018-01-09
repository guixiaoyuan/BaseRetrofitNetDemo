package com.nongfenqi.controller.client.quest;


import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.model.guarantor.GuarantorAssertModel;
import com.nongfenqi.controller.model.guarantor.GuarantorModel;

import java.util.List;

import okhttp3.MultipartBody;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Function
 * 担保人
 *
 * @author Jiezhi
 * @version 1.0, 16/01/2017
 */
public interface GuarantorClient {
    // 查询担保人列表
    @GET("/apply/{applyId}/guarantor")
    Observable<BaseResponse<List<GuarantorModel>>> getGuarantorList(@Path("applyId") String applyId);

    // 添加担保人
    @POST("/apply/{applyId}/guarantor")
    Observable<BaseResponse<String>> postGuarantor(@Path("applyId") String applyId, @Body GuarantorModel guarantorModel);

    // 修改担保人
    @PUT("/apply/{applyId}/guarantor")
    Observable<BaseResponse<Object>> putGuarantor(@Path("applyId") String applyId, @Body GuarantorModel guarantorModel);

    // 删除担保人
    @DELETE("/apply/{applyId}/guarantor/{id}")
    Observable<BaseResponse<Object>> deleteGuarantor(@Path("applyId") String applyId, @Path("id") String id);

    //查询担保人资产列表
    @GET("/apply/{applyId}/guarantor/{guarantorId}/asset")
    Observable<BaseResponse<List<GuarantorAssertModel>>> getGuarantorAssertList(@Path("applyId") String applyId, @Path("guarantorId") String guarantorId);

    //添加担保人资产列表
    @POST("/apply/{applyId}/guarantor/{guarantorId}/asset")
    Observable<BaseResponse<Integer>> postGuarantorAssert(@Path("applyId") String applyId, @Path("guarantorId") String guaranteeId, @Body GuarantorAssertModel guarantorAssertModel);

    //修改担保人资产列表
    @PUT("/apply/{applyId}/guarantor/{guarantorId}/asset")
    Observable<BaseResponse<Object>> putGuarantorAssert(@Path("applyId") String applyId, @Path("guarantorId") String guaranteeId, @Body GuarantorAssertModel guarantorAssertModel);

    //删除担保人资产列表
    @DELETE("/apply/{applyId}/guarantor/{guarantorId}/asset/{id}")
    Observable<BaseResponse<Object>> deleteGuarantorAssert(@Path("applyId") String applyId, @Path("guarantorId") String guarantorId, @Path("id") Integer id);

    //上传担保0人图片
    @Multipart
    @POST("/apply/{applyId}/guarantor/{id}/pic")
    Observable<BaseResponse<String>> postGuarantorPic(@Path("applyId") String applyId, @Path("id") String guarantorId, @Part MultipartBody.Part file);

}
