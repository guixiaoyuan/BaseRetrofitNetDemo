package com.nongfenqi.controller.client;

import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.model.BulletinModel;
import com.nongfenqi.controller.model.BusinessModel;
import com.nongfenqi.controller.model.BusinessStateModel;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * 工作台
 *
 * @author guixiaoyuan
 * @version 2.3, 05/09/2017
 * @since [Sherlock/V2.3.0]
 */
public interface WorkbenchClient {
    // 待处理业务
    @GET("/workbench/boss/pending/business")
    Observable<BaseResponse<BusinessModel<BusinessStateModel>>> getBusinessState(@Query("jsonString") String json);

    //查询简报信息
    @GET("/workbench/boss/report/business")
    Observable<BaseResponse<BusinessModel<BulletinModel>>> getBulltinInfo(@QueryMap Map<String, String> options);
}
