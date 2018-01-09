package com.nongfenqi.controller.client.quest;


import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.model.repayment.DownPaymentModel;
import com.nongfenqi.controller.model.repayment.RepaymentScheduleModel;
import com.nongfenqi.controller.model.repayment.RepaymentScheduleResultModel;
import com.nongfenqi.controller.model.repayment.SplitDownPaymentModel;

import java.util.List;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Function
 * 还款计划
 *
 * @author jiezhi
 * @version 1.0, 13/12/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */
public interface RepaymentClient {
    // 设置申请单利率
    @POST("apply/{applyId}/interest-rate")
    Observable<BaseResponse<Object>> postRepaymentInterestRate(@Path("applyId") String applyId, @Query("interestRate") double interestRate);

    // 查询申请单详情
    @GET("apply/{applyId}/repayment/down-payment")
    Observable<BaseResponse<List<DownPaymentModel>>> getRepayment(@Path("applyId") String applyId);

    // 生成还款计划预览
    @POST("apply/{applyId}/repayment")
    Observable<BaseResponse<RepaymentScheduleResultModel>> postRepayment(@Path("applyId") String applyId, @Body RepaymentScheduleModel repaymentScheduleModel);

    // 生成首付拆分预览
    @GET("apply/{applyId}/repayment/down-payment/_generate")
    Observable<BaseResponse<List<DownPaymentModel>>> postRepaymentDownPayment(@Path("applyId") String applyId);

    // 取消首付拆分
    @PATCH("apply/{applyId}/repayment/down-payment/_rollback")
    Observable<BaseResponse<Object>> postRepaymentDownPaymentRollback(@Path("applyId") String applyId);

    // 确认首付拆分
    @POST("apply/{applyId}/repayment/down-payment/_split")
    Observable<BaseResponse<Object>> postRepaymentDownPaymentSplit(@Path("applyId") String applyId, @Body List<SplitDownPaymentModel> splitDownPaymentModelList);

    // 查询还款计划和还款详情计划
    @GET("apply/{applyId}/repayment/schedule")
    Observable<BaseResponse<RepaymentScheduleResultModel>> getRepaymentSchedule(@Path("applyId") String applyId);

    // 新增还款计划
    @POST("apply/{applyId}/repayment/schedule")
    Observable<BaseResponse<Object>> postRepaymentSchedule(@Path("applyId") String applyId, @Body RepaymentScheduleModel repaymentScheduleModel);

}
