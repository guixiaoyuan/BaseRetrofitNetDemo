package com.nongfenqi.controller.client;


import com.nongfenqi.controller.BasePageResponse;
import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.model.business.ApplyControlExtModel;
import com.nongfenqi.controller.model.business.ApplyControlRecordModel;
import com.nongfenqi.controller.model.business.ApplyItemModel;
import com.nongfenqi.controller.model.business.ApplyManagerModel;
import com.nongfenqi.controller.model.business.ApplyOrderModel;
import com.nongfenqi.controller.model.business.ApplyOrderRecordModel;
import com.nongfenqi.controller.model.business.ApplyOrderRecordSummaryModel;
import com.nongfenqi.controller.model.business.ApplyOrderStartModel;
import com.nongfenqi.controller.model.business.ApplyPreUseModel;
import com.nongfenqi.controller.model.business.BusinessTemplateModel;
import com.nongfenqi.controller.model.business.StateCountModel;

import java.util.List;
import java.util.Map;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Function
 * 申请单业务：http://swagger.dev.zhongzijinfu.com/#/申请单业务
 *
 * @author jiezhi
 * @version 1.0, 01/11/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */
public interface ApplyClient {

    //---------------申请查询------------------
    //模板查询
    @GET("/apply/config/template")
    Observable<BaseResponse<List<BusinessTemplateModel>>> getConfigTemplate();

    // 项目查询
    @GET("apply/{applyId}/item")
    Observable<BaseResponse<List<ApplyItemModel>>> getApplyItems(@Path("applyId") String applyId);

    // 申请单查询
    @GET("apply/order")
    Observable<BaseResponse<BasePageResponse<ApplyOrderModel>>> getApplyOrder(@QueryMap Map<String, String> options);


    // 申请单查询
    @GET("apply/order/{applyId}")
    Observable<BaseResponse<ApplyOrderModel>> getApplyOrderById(@Path("applyId") String applyId);


    // 创建申请单
    @POST("apply/order")
    Observable<BaseResponse<String>> postApplyOrder(@Body ApplyOrderStartModel applyOrderStartModel);

    // 申请单记录分页查询
    @GET("apply/order-record")
    Observable<BaseResponse<ApplyOrderRecordSummaryModel>> getApplyOrderRecord(@QueryMap Map<String, String> options);

    // 申请单状态数量查询
    @GET("apply/order/state-count")
    Observable<BaseResponse<List<StateCountModel>>> getApplyOrderStateCount(@QueryMap Map<String, String> options);

    // 提交申请单
    @PATCH("apply/{applyId}/_commit")
    Observable<BaseResponse<Integer>> commitApply(@Path("applyId") String applyId, @Query("remark") String remark);

    // 申请业务单重审
    @PATCH("apply/{applyId}/_rollback")
    Observable<BaseResponse<Integer>> rollbackApply(@Path("applyId") String applyId, @Query("remark") String remark);

    // 撤回申请单
    @PATCH("apply/{applyId}/_undo")
    Observable<BaseResponse<Integer>> undoApply(@Path("applyId") String applyId);

    // 提交
    @PATCH("apply/{applyId}/contract/_commit")
    Observable<BaseResponse<Integer>> commitApplyContract(@Path("applyId") String applyId);

    // 否决申请单
    @PATCH("apply/{applyId}/_stop")
    Observable<BaseResponse<Integer>> stopApply(@Path("applyId") String applyId, @Query("remark") String remark);

    //恢复申请单
    @PATCH("apply/{applyId}/_recover")
    Observable<BaseResponse<Integer>> recoverApply(@Path("applyId") String applyId, @Query("remark") String remark);

    // 申请单流程纪录列表查询
    @GET("apply/{applyId}/order-record")
    Observable<BaseResponse<List<ApplyOrderRecordModel>>> getApplyOrderRecord(@Path("applyId") String applyId);

    // 查询申请单控制流程记录
    @GET("apply/{applyId}/control-record/{recordId}")
    Observable<BaseResponse<ApplyControlRecordModel>> getApplyControlRecord(@Path("applyId") String applyId, @Path("recordId") int recordId);

    // 申请单控制记录扩展查询
    @GET("apply/{applyId}/control-ext")
    Observable<BaseResponse<ApplyControlExtModel>> getApplyControlExt(@Path("applyId") String applyId);

    // 变更申请单模板
    @PUT("/apply/{applyId}/template/_change")
    Observable<BaseResponse<Object>> changeApplyTemplate(@Path("applyId") String applyId, @Query("templateId") String templateId);

    // 变更申请单负责人--同时修改主调辅调
    @PUT("/apply/{applyId}/manager/_change")
    Observable<BaseResponse<Object>> changeApplyManager(@Path("applyId") String applyId, @QueryMap Map<String, String> queryOptions);

    // 变更申请单负责人
    @PUT("/apply/{applyId}/manager/_change")
    Observable<BaseResponse<Object>> changeApplyManager(@Path("applyId") String applyId, @Body ApplyManagerModel applyManagerModel);

    //变更申请单调查表(新)
    @PUT("/apply/{applyId}/item/_change")
    Observable<BaseResponse<Object>> changeApplyItemTemplate(@Path("applyId") String applyId,@Body List<String> itemIds);

    /*-----------------------------------预申请信息----------------------------------------------------*/
    // 查询申请单预申请信息
    @GET("/apply/{applyId}/usepre")
    Observable<BaseResponse<ApplyPreUseModel>> getApplyPreUse(@Path("applyId") String applyId);

    @PATCH("/apply/{applyId}/preapply/_commit")
    Observable<BaseResponse<Object>> patchApplyPreUse(@Path("applyId") String applyId, @Body ApplyPreUseModel applyPreUseModel);
}
