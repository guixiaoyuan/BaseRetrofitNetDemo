package com.nongfenqi.controller.client.quest;


import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.model.credit.CreditAllLoanGuaranteeModel;
import com.nongfenqi.controller.model.credit.CreditCourtInfoModel;
import com.nongfenqi.controller.model.credit.CreditExplanationModel;
import com.nongfenqi.controller.model.credit.CreditLoanBalanceModel;
import com.nongfenqi.controller.model.credit.CreditNavInfoModel;
import com.nongfenqi.controller.model.credit.CreditPbcModel;
import com.nongfenqi.controller.model.credit.CreditPbcRecordModel;
import com.nongfenqi.controller.model.credit.CreditPbcRecordSummaryModel;
import com.nongfenqi.controller.model.credit.CreditRiskReportModel;
import com.nongfenqi.controller.model.credit.ReportInfoModel;

import java.util.List;
import java.util.Map;

import okhttp3.MultipartBody;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Function
 * 信用历史
 *
 * @author jiezhi
 * @version 1.0, 16/11/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */
public interface CreditClient {

    //查询客户/担保人／共借人本公司贷款／担保历史情况（新)
    @GET("/apply/{applyId}/person/credit/all-loan-guarantee")
    Observable<BaseResponse<List<CreditAllLoanGuaranteeModel>>> getCusGuaAndCoBorrower(@Path("applyId") String applyId, @QueryMap Map<String, String> options);

    @GET("/apply/person/credit-history/pbc/record")
    Observable<BaseResponse<CreditPbcRecordSummaryModel>> getCreditPbcSummary(@QueryMap Map<String, String> options);

    @GET("/apply/{applyId}/navigation/credit-history")
    Observable<BaseResponse<List<CreditNavInfoModel>>> getCreditNavInfo(@Path("applyId") String applyId);

    //--------------------信用历史---------------------
    @GET("/apply/{applyId}/person/{personId}/credit-history/explanation")
    Observable<BaseResponse<CreditExplanationModel>> getCreditExplanation(@Path("applyId") String applyId, @Path("personId") String personId);

    @POST("/apply/{applyId}/person/credit-history/explanation")
    Observable<BaseResponse<Integer>> postCreditExplanation(@Path("applyId") String applyId, @Body CreditExplanationModel creditExplanationModel);

    @PUT("apply/{applyId}/person/credit-history/explanation")
    Observable<BaseResponse<Object>> putCreditExplanation(@Path("applyId") String applyId, @Body CreditExplanationModel creditExplanationModel);

    @DELETE("apply/{applyId}/person/credit-history/explanation/{explanationId}")
    Observable<BaseResponse<Object>> deleteCreditExplanation(@Path("applyId") String applyId, @Path("explanationId") int explanationId);

    //--------------------央行征信账户---------------------
    @GET("/apply/{applyId}/person/{personId}/credit-history/pbc")
    Observable<BaseResponse<CreditPbcModel>> getCreditPbc(@Path("applyId") String applyId, @Path("personId") String personId);

    @POST("/apply/{applyId}/person/credit-history/pbc")
    Observable<BaseResponse<Integer>> postCreditPbc(@Path("applyId") String applyId, @Body CreditPbcModel creditPbcModel);

    @PUT("/apply/{applyId}/person/credit-history/pbc")
    Observable<BaseResponse<Object>> putCreditPbc(@Path("applyId") String applyId, @Body CreditPbcModel creditPbcModel);

    //--------------------央行征信详情---------------------
    @GET("apply/{applyId}/person/credit-history/pbc/record/{id}")
    Observable<BaseResponse<CreditPbcRecordModel>> getCreditPbcRecord(@Path("applyId") String applyId, @Path("id") int id);

    @POST("apply/{applyId}/person/credit-history/pbc/record")
    Observable<BaseResponse<Integer>> postCreditPbcRecord(@Path("applyId") String applyId, @Body CreditPbcRecordModel creditPbcRecordModel);

    @PUT("apply/{applyId}/person/credit-history/pbc/record")
    Observable<BaseResponse<Object>> putCreditPbcRecord(@Path("applyId") String applyId, @Body CreditPbcRecordModel creditPbcRecordModel);

    @DELETE("apply/{applyId}/person/credit-history/pbc/record/{id}")
    Observable<BaseResponse<Object>> deleteCreditPbcRecord(@Path("applyId") String applyId, @Path("id") int id);

    //查询客户本公司贷款记录
    @GET("apply/{applyId}/person/credit/loan-balance")
    Observable<BaseResponse<CreditLoanBalanceModel>> getCreditLoanBalance(@Path("applyId") String applyId, @Query("cardId") String cardId);

    @Multipart
    @POST("/apply/{applyId}/person/{personId}/credit-history/pic")
    Observable<BaseResponse<String>> postCreditPic(@Path("applyId") String applyId, @Path("personId") String personId, @Part MultipartBody.Part file);

    //查询客户云风控报告
    @GET("risk/report")
    Observable<BaseResponse<CreditRiskReportModel>> getRiskReport(@Query("cardId") String cardId);

    @GET("risk/law-report")
    Observable<BaseResponse<CreditCourtInfoModel>> getLawCourtReport(@Query("cardId") String cardId, @Query("name") String name, @Query("type") int type);

    @POST("/risk/report")
    Observable<BaseResponse<ReportInfoModel>> postReportInfo(@Body ReportInfoModel reportInfoModel);
}
