package com.nongfenqi.controller.client.quest;

import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.model.quest.ApplyArtificialModel;
import com.nongfenqi.controller.model.quest.ApplyMachineModel;
import com.nongfenqi.controller.model.quest.ApplyFarmWorkModel;
import com.nongfenqi.controller.model.quest.ApplyFoodStuffModel;
import com.nongfenqi.controller.model.quest.ApplyLandModel;
import com.nongfenqi.controller.model.quest.ApplyMaterialsModel;
import com.nongfenqi.controller.model.quest.ApplyUseMaterialModel;
import com.nongfenqi.controller.model.quest.ApplyUseModel;
import com.nongfenqi.controller.model.quest.ApplyUseOtherModel;
import com.nongfenqi.controller.model.quest.MarginPayeeModel;

import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Function
 * 申请用途
 *
 * @author jiezhi
 * @version 1.0, 06/12/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */
public interface ApplyUseClient {
    // 订单用途查询
    @GET("apply/{applyId}/use")
    Observable<BaseResponse<ApplyUseModel>> getApplyUseInfo(@Path("applyId") String applyId);

    // 查询申请金额
    @GET("/apply/{applyId}/use/apply-amount")
    Observable<BaseResponse<Float>> getApplyAmount(@Path("applyId") String applyId);


    // 创建土地租金申请用途        新
    @POST("/apply/{applyId}/use/land")
    Observable<BaseResponse<Object>> postApplyUseLand(@Path("applyId") String applyId, @Body ApplyLandModel applyUseLandModel);

    // 修改土地租金申请用途        新
    @PUT("/apply/{applyId}/use/land")
    Observable<BaseResponse<Object>> putApplyUseLand(@Path("applyId") String applyId, @Body ApplyLandModel applyUseLandModel);

    // 创建农机申请用途           新
    @POST("/apply/{applyId}/use/machine")
    Observable<BaseResponse<Object>> postApplyUseMachine(@Path("applyId") String applyId, @Body ApplyMachineModel applyUseMachineModel);

    // 修改农机申请用途           新
    @PUT("/apply/{applyId}/use/machine")
    Observable<BaseResponse<Object>> putApplyUseMachine(@Path("applyId") String applyId, @Body ApplyMachineModel applyUseMachineModel);

    // 创建农资申请用途
    @POST("/apply/{applyId}/use/material")
    Observable<BaseResponse<Object>> postApplyUseMaterial(@Path("applyId") String applyId, @Body ApplyUseMaterialModel applyUseMaterialModel);

    // 修改农资申请用途
    @PUT("/apply/{applyId}/use/material")
    Observable<BaseResponse<Object>> putApplyUseMaterial(@Path("applyId") String applyId, @Body ApplyMaterialsModel applyUseMaterialModel);

    // 创建其他申请用途           不用
    @POST("/apply/{applyId}/use/other")
    Observable<BaseResponse<Object>> postApplyUseOther(@Path("applyId") String applyId, @Body ApplyUseOtherModel applyUseOtherModel);

    // 修改其他申请用途           不用
    @PUT("/apply/{applyId}/use/other")
    Observable<BaseResponse<Object>> putApplyUseOther(@Path("applyId") String applyId, @Body ApplyUseOtherModel applyUseOtherModel);

    //修改人工申请
    @PUT("/apply/{applyId}/use/artificial")
    Observable<BaseResponse<Object>> putApplyArtificial(@Path("applyId") String applyId, @Body ApplyArtificialModel applyArtificialModel);

    //修改农活申请
    @PUT("/apply/{applyId}/use/farm-work")
    Observable<BaseResponse<Object>> putApplyFarmWork(@Path("applyId") String applyId, @Body ApplyFarmWorkModel applyFarmWorkModel);

    //修改粮食申请
    @PUT("/apply/{applyId}/use/foodstuff")
    Observable<BaseResponse<Object>> putApplyFoodStuff(@Path("applyId") String applyId, @Body ApplyFoodStuffModel applyFoodStuffModel);

    //修改农补申请
    @PUT("/apply/{applyId}/use/form-subsidy")
    Observable<BaseResponse<Object>> putApplyFormSubsidy(@Path("applyId") String applyId, @Body ApplyMachineModel applyMachineModel);

    //修改肥宝宝申请
    @POST("/apply/{applyId}/use/margin-payee")
    Observable<BaseResponse<Object>> putMarginPayee(@Path("applyId") String applyId, @Body MarginPayeeModel applyUseMarginModel);

    // 删除用途
    @DELETE("/apply/{applyId}/use/{useId}")
    Observable<BaseResponse<Object>> deleteApplyUse(@Path("applyId") String applyId, @Path("useId") String useId);

}
