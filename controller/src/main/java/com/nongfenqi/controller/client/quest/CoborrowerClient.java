package com.nongfenqi.controller.client.quest;


import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.model.coborrower.CoborrowerInfoModel;

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
 * 调查表－共借人
 *
 * @author colin
 * @version 1.0, 16/12/7
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */

public interface CoborrowerClient {
    // 查询共借人信息
    @GET("/apply/{applyId}/co-borrower")
    Observable<BaseResponse<List<CoborrowerInfoModel>>> getCoborrowerInfo(@Path("applyId") String applyId);

    // 创建共借人
    @POST("/apply/{applyId}/co-borrower")
    Observable<BaseResponse<Integer>> postCoborrower(@Path("applyId") String applyId, @Body CoborrowerInfoModel coborrowerInfoModel);

    // 修改共借人信息
    @PUT("/apply/{applyId}/co-borrower")
    Observable<BaseResponse<Object>> putCoborrower(@Path("applyId") String applyId, @Body CoborrowerInfoModel coborrowerInfoModel);

    // 删除共借人信息
    @DELETE("/apply/{applyId}/co-borrower/{personId}")
    Observable<BaseResponse<Object>> delCoborrower(@Path("applyId") String applyId, @Path("personId") String personId);

    //上传共借人信息
    @Multipart
    @POST("/apply/{applyId}/co-borrower/{borrowerId}/pic")
    Observable<BaseResponse<String>> postCoborrowerPic(@Path("applyId") String applyId, @Path("borrowerId") String borrowerId, @Part MultipartBody.Part file);
}
