package com.nongfenqi.controller.client.quest;


import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.model.operate.OperateEstimateBaseInfo;
import com.nongfenqi.controller.model.operate.OperateEstimateInfoModel;
import com.nongfenqi.controller.model.operate.OperateEstimatePlantModel;
import com.nongfenqi.controller.model.operate.OperateHistoryCropModel;
import com.nongfenqi.controller.model.operate.OperateHistoryCultivateModel;
import com.nongfenqi.controller.model.operate.OperateHistoryExpenseModel;
import com.nongfenqi.controller.model.operate.OperateHistoryIncomeModel;
import com.nongfenqi.controller.model.operate.OperateHistoryModel;
import com.nongfenqi.controller.model.operate.OperateHistoryOtherModel;
import com.nongfenqi.controller.model.operate.OperateHistoryReapModel;
import com.nongfenqi.controller.model.operate.OperateHistorySituationModel;
import com.nongfenqi.controller.model.operate.OperateHistoryWorkModel;
import com.nongfenqi.controller.model.operate.OperateOwnerShipModel;
import com.nongfenqi.controller.model.operate.OperateSituationModel;

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
 * 经营信息接口
 *
 * @author jiezhi
 * @version 1.0, 02/11/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */
public interface OperateClient {

    @GET("apply/{applyId}/operate/history")
    Observable<BaseResponse<List<OperateHistoryModel>>> getOperateHistory(@Path("applyId") String applyId);

    @POST("apply/{applyId}/operate/history-situation")
    Observable<BaseResponse<Integer>> postOperateHistorySituation(@Path("applyId") String applyId, @Body OperateHistorySituationModel operateHistorySituationModel);

    @PUT("apply/{applyId}/operate/history-situation")
    Observable<BaseResponse<Object>> putOperateHistorySituation(@Path("applyId") String applyId, @Body OperateHistorySituationModel operateHistorySituationModel);

    @GET("apply/{applyId}/operate/history-situation/{id}")
    Observable<BaseResponse<OperateHistorySituationModel>> getOperateHistorySituationById(@Path("applyId") String applyId, @Path("id") int id);

    @DELETE("apply/{applyId}/operate/history-situation/{operateHistorySituationId}")
    Observable<BaseResponse<Object>> deleteOperateHistorySituation(@Path("applyId") String applyId, @Path("operateHistorySituationId") int operateHistorySituationId);

    //------------大额支出---------
    @POST("apply/{applyId}/operate/history/expense")
    Observable<BaseResponse<Integer>> postOperateHistoryExpense(@Path("applyId") String applyId, @Body OperateHistoryExpenseModel operateHistoryExpenseModel);

    @PUT("apply/{applyId}/operate/history/expense")
    Observable<BaseResponse<Object>> putOperateHistoryExpense(@Path("applyId") String applyId, @Body OperateHistoryExpenseModel operateHistoryExpenseModel);

    @DELETE("apply/{applyId}/operate/history/{operateHistorySituationId}/expense/{expenseDetailId}")
    Observable<BaseResponse<Object>> deleteOperateHistoryExpense(@Path("applyId") String applyId, @Path("operateHistorySituationId") int operateHistorySituationId, @Path("expenseDetailId") int expenseDetailId);

    @GET("apply/{applyId}/operate/history/expense/{expenseDetailId}")
    Observable<BaseResponse<OperateHistoryExpenseModel>> getOperateHistoryExpense(@Path("applyId") String applyId, @Path("expenseDetailId") int expenseDetailId);

    // 查询大额支出详情列表
    @GET("apply/{applyId}/operate/history/{operateHistorySituationId}/expense")
    Observable<BaseResponse<List<OperateHistoryExpenseModel>>> getOperateHistoryExpenseSituation(@Path("applyId") String applyId, @Path("operateHistorySituationId") int expenseDetailId);

    //查询收入详情列表
    @GET("apply/{applyId}/operate/history/{operateHistorySituationId}/income")
    Observable<BaseResponse<List<OperateHistoryIncomeModel>>> getOperateHistoryIncomeSituation(@Path("applyId") String applyId, @Path("operateHistorySituationId") int expenseDetailId);

    //-------------种植经营历史--------
    @GET("apply/{applyId}/operate/history/{operateHistoryId}/crop")
    Observable<BaseResponse<OperateHistoryCropModel>> getOperateHistoryCrop(@Path("applyId") String applyId, @Path("operateHistoryId") int operateHistoryId);

    @POST("apply/{applyId}/operate/history/crop")
    Observable<BaseResponse<Integer>> postOperateHistoryCrop(@Path("applyId") String applyId, @Body OperateHistoryCropModel operateHistoryCropModel);

    @PUT("apply/{applyId}/operate/history/crop")
    Observable<BaseResponse<Object>> putOperateHistoryCrop(@Path("applyId") String applyId, @Body OperateHistoryCropModel operateHistoryCropModel);

    //-------------养殖经营历史--------
    @GET("apply/{applyId}/operate/history/{operateHistoryId}/cultivate")
    Observable<BaseResponse<OperateHistoryCultivateModel>> getOperateHistoryCultivate(@Path("applyId") String applyId, @Path("operateHistoryId") int operateHistoryId);

    @POST("apply/{applyId}/operate/history/cultivate")
    Observable<BaseResponse<Integer>> postOperateHistoryCultivate(@Path("applyId") String applyId, @Body OperateHistoryCultivateModel operateHistoryCultivateModel);

    @PUT("apply/{applyId}/operate/history/cultivate")
    Observable<BaseResponse<Object>> putOperateHistoryCultivate(@Path("applyId") String applyId, @Body OperateHistoryCultivateModel operateHistoryCultivateModel);


    //------------其他经营历史---------
    @GET("apply/{applyId}/operate/history/{operateHistoryId}/other")
    Observable<BaseResponse<OperateHistoryOtherModel>> getOperateHistoryOther(@Path("applyId") String applyId, @Path("operateHistoryId") int operateHistoryId);

    @POST("apply/{applyId}/operate/history/other")
    Observable<BaseResponse<Integer>> postOperateHistoryOther(@Path("applyId") String applyId, @Body OperateHistoryOtherModel operateHistoryOtherModel);

    @PUT("apply/{applyId}/operate/history/other")
    Observable<BaseResponse<Object>> putOperateHistoryOther(@Path("applyId") String applyId, @Body OperateHistoryOtherModel operateHistoryOtherModel);

    //------------收割经营历史---------
    @GET("apply/{applyId}/operate/history/{operateHistoryId}/reap")
    Observable<BaseResponse<OperateHistoryReapModel>> getOperateHistoryReap(@Path("applyId") String applyId, @Path("operateHistoryId") int operateHistoryId);

    @POST("apply/{applyId}/operate/history/reap")
    Observable<BaseResponse<Integer>> postOperateHistoryReap(@Path("applyId") String applyId, @Body OperateHistoryReapModel operateHistoryReapModel);

    @PUT("apply/{applyId}/operate/history/reap")
    Observable<BaseResponse<Object>> putOperateHistoryReap(@Path("applyId") String applyId, @Body OperateHistoryReapModel operateHistoryReapModel);

    //------------打工经营历史---------
    @GET("apply/{applyId}/operate/history/{operateHistoryId}/work")
    Observable<BaseResponse<OperateHistoryWorkModel>> getOperateHistoryWork(@Path("applyId") String applyId, @Path("operateHistoryId") int operateHistoryId);

    @POST("apply/{applyId}/operate/history/work")
    Observable<BaseResponse<Integer>> postOperateHistoryWork(@Path("applyId") String applyId, @Body OperateHistoryWorkModel operateHistoryWorkModel);

    @PUT("apply/{applyId}/operate/history/work")
    Observable<BaseResponse<Object>> putOperateHistoryWork(@Path("applyId") String applyId, @Body OperateHistoryWorkModel operateHistoryWorkModel);

    //删除经营历史
    @DELETE("apply/{applyId}/operate/history/{operateHistorySituationId}/income/{operateHistoryId}")
    Observable<BaseResponse<Object>> deleteOperateIncomeHistory(@Path("applyId") String applyId, @Path("operateHistorySituationId") int operateHistorySituationId, @Path("operateHistoryId") int operateHistoryId);

    //------------经营状况---------
    @GET("apply/{applyId}/operate/situation")
    Observable<BaseResponse<OperateSituationModel>> getOperateSituation(@Path("applyId") String applyId);

    @POST("apply/{applyId}/operate/situation")
    Observable<BaseResponse<Integer>> postOperateSituation(@Path("applyId") String applyId, @Body OperateSituationModel operateSituationModel);

    @PUT("apply/{applyId}/operate/situation")
    Observable<BaseResponse<Object>> putOperateSituation(@Path("applyId") String applyId, @Body OperateSituationModel operateSituationModel);

    //------------经营权属---------
    @GET("/apply/{applyId}/operate/ownership")
    Observable<BaseResponse<OperateOwnerShipModel>> getOperateOwnerShip(@Path("applyId") String applyId);

    @POST("/apply/{applyId}/operate/ownership")
    Observable<BaseResponse<Integer>> postOperateOwnerShip(@Path("applyId") String applyId, @Body OperateOwnerShipModel operateSituationModel);

    @PUT("/apply/{applyId}/operate/ownership")
    Observable<BaseResponse<Object>> putOperateOwnerShip(@Path("applyId") String applyId, @Body OperateOwnerShipModel operateSituationModel);


    @Multipart
    @POST("apply/{applyId}/operate/situation/pic")
    Observable<BaseResponse<String>> postOperatePic(@Path("applyId") String applyId, @Part MultipartBody.Part file);

    @Multipart
    @POST("/apply/{applyId}/operate/ownership/pic")
    Observable<BaseResponse<String>> postOperateOwnerShipPic(@Path("applyId") String applyId, @Part MultipartBody.Part file);
//    Observable<BaseResponse<String>> postOperatePic(@Path("applyId") String applyId, @Part("file") RequestBody description, @Part MultipartBody.Part file);
    /*
    //---//
    @POST("apply/{applyId}/operate/history")
    Observable<BaseResponse<Integer>> postOperateHistory(@Path("applyId") String applyId, @Body OperateHistoryModel operateHistoryModel);

    @PUT("apply/{applyId}/operate/history")
    Observable<BaseResponse<Object>> putOperateHistory(@Path("applyId") String applyId, @Body OperateHistoryModel operateHistoryModel);
    */

    //经营预估
    @GET("/apply/{applyId}/operate/estimate")
    Observable<BaseResponse<OperateEstimateInfoModel>> getOperateEstimate(@Path("applyId") String applyId);

    @POST("/apply/{applyId}/operate/estimate")
    Observable<BaseResponse<String>> postOperateEstimate(@Path("applyId") String applyId, @Body OperateEstimateBaseInfo operateEstimateBaseInfo);

    @PUT("/apply/{applyId}/operate/estimate")
    Observable<BaseResponse<String>> putOperateEstimate(@Path("applyId") String applyId, @Body OperateEstimateBaseInfo operateEstimateBaseInfo);

    //经营预估种植
    @POST("/apply/{applyId}/operate/grow")
    Observable<BaseResponse<String>> postOperateEstimatePlant(@Path("applyId") String applyId, @Body OperateEstimatePlantModel plantModel);

    @PUT("/apply/{applyId}/operate/grow")
    Observable<BaseResponse<String>> putOperateEstimatePlant(@Path("applyId") String applyId, @Body OperateEstimatePlantModel plantModel);

    @DELETE("/apply/{applyId}/operate/grow/{operateGrowInfoId}")
    Observable<BaseResponse<String>> deleteOperateEstimatePlant(@Path("applyId") String applyId, @Path("operateGrowInfoId") int operateGrowInfoId);

    @POST("/apply/{applyId}/operate/estimate/_preview")
    Observable<BaseResponse<OperateEstimateInfoModel>> postOperateEstimateSectionPreview(@Path("applyId") String applyId);

    @POST("/apply/{applyId}/operate/estimate/_generate")
    Observable<BaseResponse<String>> postOperateEstimateSection(@Path("applyId") String applyId);

}
