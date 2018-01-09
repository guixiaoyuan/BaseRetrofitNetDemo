package com.nongfenqi.controller.client;

import com.nongfenqi.controller.BasePageResponse;
import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.model.other.DistributorModel;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * 经销商信息
 *
 * @author jiezhi
 * @version 1.0, 10/04/2017
 * @since [sherlock/V1.0.0]
 */
public interface DistributorClient {

    // 查询经销商列表
    @GET("/distributor")
    Observable<BaseResponse<BasePageResponse<DistributorModel>>> getDistributors(@QueryMap Map<String, String> queryOptions);

}
