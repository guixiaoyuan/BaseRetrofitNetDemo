package com.nongfenqi.controller.client;

import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.model.CluePool.CluePoolItemDetailModel;
import com.nongfenqi.controller.model.CluePool.CluePoolModel;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * 线索池相关接口
 *
 * @author guixiaoyuan
 * @version 2.2, 2017/10/10
 * @since [sherlock/V2.2.5]
 */
public interface CluePoolClient {
    //信贷线索池分页查询
    @GET("/apply/credit/clue-pool")
    Observable<BaseResponse<CluePoolModel>> getCluePoolModel(@QueryMap Map<String, String> queryOptions);

    //信贷线索详情
    @GET("/apply/{applyId}/credit/clue")
    Observable<BaseResponse<CluePoolItemDetailModel>> getCluePoolItemModel(@Path("applyId") String applyId);

}
