package com.nongfenqi.controller.client.quest;

import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.model.survey.SideSurveyImpressionModel;
import com.nongfenqi.controller.model.survey.SideSurveyModel;

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
 * 侧面调查
 *
 * @author jiezhi
 * @version 1.0, 14/04/2017
 * @since [sherlock/V1.0.0]
 */
public interface SideSurveyClient {
    // 查询侧面调查对象列表
    @GET("/apply/{applyId}/side-survey")
    Observable<BaseResponse<List<SideSurveyModel>>>
    getSideSurveyList(@Path("applyId") String applyId);

    // 添加侧面调查对象
    @POST("/apply/{applyId}/side-survey")
    Observable<BaseResponse<Integer>>
    postSideSurvey(@Path("applyId") String applyId,
                   @Body SideSurveyModel sideSurveyModel);

    // 添加侧面调查对象
    @PUT("/apply/{applyId}/side-survey")
    Observable<BaseResponse<Object>>
    putSideSurvey(@Path("applyId") String applyId,
                  @Body SideSurveyModel sideSurveyModel);

    // 查询侧面调查对象的印象列表
    @GET("/apply/{applyId}/side-survey/{surveyTargetId}/impression")
    Observable<BaseResponse<SideSurveyImpressionModel>>
    getSideSurveyImpressionList(@Path("applyId") String applyId,
                                @Path("surveyTargetId") int surveyTargetId);

    // 添加侧面调查标签
    @POST("/apply/{applyId}/side-survey/{surveyTargetId}/impression")
    Observable<BaseResponse<Object>>
    postSideSurveyImpression(@Path("applyId") String applyId,
                             @Path("surveyTargetId") int surveyTargetId,
                             @Body SideSurveyImpressionModel sideSurveyImpressionModel);

    // 删除侧面调查对象标签
    @DELETE("/apply/{applyId}/side-survey/impression/{surveyTargetImpressionId}")
    Observable<BaseResponse<Object>>
    deleteSideSurveyImpressionById(@Path("applyId") String applyId,
                                   @Path("surveyTargetImpressionId") int surveyTargetImpressionId);

    // 侧面调查对象上传录音文件
    @Multipart
    @POST("/apply/{applyId}/side-survey/{id}/voice")
    Observable<BaseResponse<String>>
    postSideSurveyVoice(@Path("applyId") String applyId,
                        @Path("id") int id,
                        @Part MultipartBody.Part file);


    // 删除侧面调查对象
    @DELETE("/apply/{applyId}/side-survey/{surveyTargetId}")
    Observable<BaseResponse<Object>>
    deleteSideSurveyById(@Path("applyId") String applyId,
                         @Path("surveyTargetId") int surveyTargetId);
}
