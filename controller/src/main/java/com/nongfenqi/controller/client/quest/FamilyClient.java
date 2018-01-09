package com.nongfenqi.controller.client.quest;


import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.model.family.FamilyAssetNavModel;
import com.nongfenqi.controller.model.family.FamilyCarModel;
import com.nongfenqi.controller.model.family.FamilyHouseModel;
import com.nongfenqi.controller.model.family.FamilyInfoModel;
import com.nongfenqi.controller.model.family.FamilyMemberModel;
import com.nongfenqi.controller.model.family.FamilyMemberPicModel;
import com.nongfenqi.controller.model.family.FamilyOtherModel;
import com.nongfenqi.controller.model.family.FamilyResearchModel;

import java.util.List;

import okhttp3.MultipartBody;
import retrofit2.Call;
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
 * 家庭信息
 *
 * @author jiezhi
 * @version 1.0, 19/10/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.0.0]
 */
public interface FamilyClient {

    @GET("/apply/{applyId}/navigation/family/asset")
    Observable<BaseResponse<FamilyAssetNavModel>> getFamilyAssetNav(@Path("applyId") String applyId);

    // family info
    @GET("apply/{applyId}/family")
    Observable<BaseResponse<FamilyInfoModel>> getFamily(@Path("applyId") String applyId);

    @POST("apply/{applyId}/family")
    Observable<BaseResponse<Integer>> postFamily(@Path("applyId") String applyId, @Body FamilyInfoModel familyInfoModel);

    @PUT("apply/{applyId}/family")
    Observable<BaseResponse<Integer>> putFamily(@Path("applyId") String applyId, @Body FamilyInfoModel familyInfoModel);


    // family car
    @GET("apply/{applyId}/family/car")
    Observable<BaseResponse<List<FamilyCarModel>>> getFamilyCar(@Path("applyId") String applyId);

    @POST("apply/{applyId}/family/car")
    Observable<BaseResponse<Integer>> postFamilyCar(@Path("applyId") String applyId, @Body FamilyCarModel familyCarModel);

    @POST("apply/{applyId}/family/car")
    Call<BaseResponse<Integer>> postFamilyCarByCall(@Path("applyId") String applyId, @Body FamilyCarModel familyCarModel);

    @PUT("apply/{applyId}/family/car")
    Observable<BaseResponse<Integer>> putFamilyCar(@Path("applyId") String applyId, @Body FamilyCarModel familyCarModel);

    @Multipart
    @POST("apply/{applyId}/family/car/{carId}/pic")
    Observable<BaseResponse<String>> postFamilyCarPic(@Path("applyId") String applyId, @Path("carId") String carId, @Part MultipartBody.Part file);

    @DELETE("apply/{applyId}/family/car/{id}")
    Observable<BaseResponse<Integer>> deleteFamilyCar(@Path("applyId") String applyId, @Path("id") int id);

    //post房产图片
    @Multipart
    @POST("/apply/{applyId}/family/house/{houseId}/pic")
    Observable<BaseResponse<String>> postFamilyHousePic(@Path("applyId") String applyId, @Path("houseId") String id, @Part MultipartBody.Part file);

    //post其他图片
    @Multipart
    @POST("/apply/{applyId}/family/other/{otherId}/pic")
    Observable<BaseResponse<String>> postFamilyOtherPic(@Path("applyId") String applyId, @Path("otherId") String id, @Part MultipartBody.Part file);

    //上传家庭图片
    @Multipart
    @POST("/apply/{applyId}/family/pic")
    Observable<BaseResponse<String>> postFamilyMemberPic(@Path("applyId") String applyId, @Part MultipartBody.Part file);

    //查询家庭信息（图片组id）
    @GET("/apply/{applyId}/family")
    Observable<BaseResponse<FamilyMemberPicModel>> getFamilyPicGroupId(@Path("applyId") String applyId);

    // family house
    @GET("apply/{applyId}/family/house")
    Observable<BaseResponse<List<FamilyHouseModel>>> getFamilyHouse(@Path("applyId") String applyId);

    @POST("apply/{applyId}/family/house")
    Observable<BaseResponse<Integer>> postFamilyHouse(@Path("applyId") String applyId, @Body FamilyHouseModel familyHouseModel);

    @PUT("apply/{applyId}/family/house")
    Observable<BaseResponse<Integer>> putFamilyHouse(@Path("applyId") String applyId, @Body FamilyHouseModel familyHouseModel);

    @DELETE("apply/{applyId}/family/house/{id}")
    Observable<BaseResponse<Integer>> deleteFamilyHouse(@Path("applyId") String applyId, @Path("id") int id);

    //family other
    @GET("apply/{applyId}/family/other")
    Observable<BaseResponse<List<FamilyOtherModel>>> getFamilyOther(@Path("applyId") String applyId);

    @POST("apply/{applyId}/family/other")
    Observable<BaseResponse<Integer>> postFamilyOther(@Path("applyId") String applyId, @Body FamilyOtherModel familyOtherModel);

    @PUT("apply/{applyId}/family/other")
    Observable<BaseResponse<Integer>> putFamilyOther(@Path("applyId") String applyId, @Body FamilyOtherModel familyOtherModel);

    @DELETE("apply/{applyId}/family/other/{id}")
    Observable<BaseResponse<Integer>> deleteFamilyOther(@Path("applyId") String applyId, @Path("id") int id);

    // family member
    @GET("apply/{applyId}/family/member")
    Observable<BaseResponse<List<FamilyMemberModel>>> getFamilyMember(@Path("applyId") String applyId);

    @POST("apply/{applyId}/family/member")
    Observable<BaseResponse<Integer>> postFamilyMember(@Path("applyId") String applyId, @Body FamilyMemberModel familyMemberModel);

    @PUT("apply/{applyId}/family/member")
    Observable<BaseResponse<Integer>> putFamilyMember(@Path("applyId") String applyId, @Body FamilyMemberModel familyMemberModel);

    @DELETE("apply/{applyId}/family/member/{id}")
    Observable<BaseResponse<Integer>> deleteFamilyMember(@Path("applyId") String applyId, @Path("id") int id);


    // --------------------Family Research---------------------
    @GET("apply/{applyId}/family/research")
    Observable<BaseResponse<List<FamilyResearchModel>>> getFamilyResearch(@Path("applyId") String applyId);
}
