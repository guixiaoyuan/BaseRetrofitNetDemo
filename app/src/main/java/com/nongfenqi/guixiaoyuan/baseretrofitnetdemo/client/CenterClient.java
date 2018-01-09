package com.nongfenqi.guixiaoyuan.baseretrofitnetdemo.client;

import com.nongfenqi.guixiaoyuan.baseretrofitnetdemo.model.BaseResponse;
import com.nongfenqi.guixiaoyuan.baseretrofitnetdemo.model.CenterActivityModel;

import java.util.List;

import retrofit2.http.GET;
import rx.Observable;

/**
 * 活动中心接口
 *
 * @author guixiaoyuan
 * @version 1.0, 2017/12/29
 * @since [BaseRetrofitNetDemo/V1.0]
 */
public interface CenterClient {

    /**
     * 查询所以的活动信息
     * @return data
     */
    @GET("/activity/all")
    Observable<BaseResponse<List<CenterActivityModel>>> getAllCenterActivities();
}
