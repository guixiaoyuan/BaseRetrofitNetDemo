package com.nongfenqi.controller.client.quest;

import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.model.family.impression.FamilyImpressionModel;
import com.nongfenqi.controller.model.family.impression.FamilyVisitModel;

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
 * 家访情况
 *
 * @author jiezhi
 * @version 1.0, 14/04/2017
 * @since [sherlock/V1.0.0]
 */
public interface FamilyVisitClient {
    // 查询家访印象
    @GET("/apply/{applyId}/family/visit/impression")
    Observable<BaseResponse<FamilyImpressionModel>>
    getFamilyImpression(@Path("applyId") String applyId);


    // 添加家访印象标签
    @POST("/apply/{applyId}/family/visit/impression")
    Observable<BaseResponse<Object>>
    postFamilyImpression(@Path("applyId") String applyId,
                         @Body FamilyImpressionModel familyImpressionModel);

    // 删除家访情况标签
    @DELETE("/apply/{applyId}/family/visit/impression/{familyImpressionId}")
    Observable<BaseResponse<Object>>
    deleteFamilyImpression(@Path("applyId") String applyId,
                           @Path("familyImpressionId") int familyImpressionId);

    // 查询家访情况
    @GET("/apply/{applyId}/family/visit")
    Observable<BaseResponse<FamilyVisitModel>>
    getFamilyVisit(@Path("applyId") String applyId);

    // 添加家访情况
    @POST("/apply/{applyId}/family/visit")
    Observable<BaseResponse<Integer>>
    postFamilyVisit(@Path("applyId") String applyId,
                    @Body FamilyVisitModel familyVisitModel);

    // 修改家访情况
    @PUT("/apply/{applyId}/family/visit")
    Observable<BaseResponse<Object>>
    putFamilyVisit(@Path("applyId") String applyId,
                   @Body FamilyVisitModel familyVisitModel);

    //  家访情况上传图片
    @Multipart
    @POST("/apply/{applyId}/family/visit/pic")
    Observable<BaseResponse<String>>
    uploadFamilyVisitPic(@Path("applyId") String applyId,
                         @Part MultipartBody.Part file);

}
