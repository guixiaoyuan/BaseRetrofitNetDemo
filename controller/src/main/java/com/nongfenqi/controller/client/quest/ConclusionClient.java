package com.nongfenqi.controller.client.quest;


import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.model.conclusion.ConclusionInfoModel;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import rx.Observable;

/**
 * 调查表－调查结论网络客户端
 *
 * @author colin
 * @version 1.0, 16/12/7
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */

public interface ConclusionClient {
    // 查询调查报告信息
    @GET("/apply/{applyId}/conclusion")
    Observable<BaseResponse<ConclusionInfoModel>> getConclusionInfo(@Path("applyId") String applyId);

    // 创建调查结论
    @POST("/apply/{applyId}/conclusion")
    Observable<BaseResponse<Object>> postConclusion(@Path("applyId") String applyId, @Body ConclusionInfoModel conclusionInfoModel);

    // 修改调查报告信息
    @PUT("/apply/{applyId}/conclusion")
    Observable<BaseResponse<Object>> putConclusion(@Path("applyId") String applyId, @Body ConclusionInfoModel conclusionInfoModel);
}
