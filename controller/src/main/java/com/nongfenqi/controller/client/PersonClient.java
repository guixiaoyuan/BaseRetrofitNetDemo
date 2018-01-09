package com.nongfenqi.controller.client;

import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.model.business.PersonModel;
import com.nongfenqi.controller.model.business.PersonNameConfirmModel;

import java.util.List;

import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import rx.Observable;

/**
 * 关系人接口
 *
 * @author jiezhi
 * @version 1.0, 01/04/2017
 * @since [sherlock/V1.0.0]
 */
public interface PersonClient {
    //编辑关系人实名认证
    @PUT("/apply/{applyId}/authentication")
    Observable<BaseResponse<Object>> putApplyPersonAuthente(@Path("applyId") String applyId,@Body PersonNameConfirmModel personNameConfirmModel);

    // 查询申请单关系人
    @GET("/apply/{applyId}/person")
    Observable<BaseResponse<List<PersonModel>>> getApplyPersons(@Path("applyId") String applyId);

    // 新建关系人
    @POST("/apply/{applyId}/person")
    Observable<BaseResponse<PersonModel>> postApplyPerson(@Path("applyId") String applyId, @Body PersonModel personModel);

    // 编辑关系人
    @PUT("/apply/{applyId}/person")
    Observable<BaseResponse<Object>> putApplyPerson(@Path("applyId") String applyId, @Body PersonModel personModel);

    // 删除关系人
    @DELETE("/apply/{applyId}/person/{id}")
    Observable<BaseResponse<Object>> delApplyPerson(@Path("applyId") String applyId, @Path("id") String id);

}
