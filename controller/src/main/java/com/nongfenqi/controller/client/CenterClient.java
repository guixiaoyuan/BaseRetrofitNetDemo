package com.nongfenqi.controller.client;

import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.model.CenterActivityModel;
import com.nongfenqi.controller.model.MedalModel;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * 活动接口
 *
 * @author guixy
 * @version 2.2, 14/07/17
 * @since [sherlock/V2.2.0]
 */
public interface CenterClient {
    //查询所有的活动
    @GET("/activity/all")
    Observable<BaseResponse<List<CenterActivityModel>>> getAllCenterActivities();

    // 查询单个活动
    @GET("/activity/{id}")
    Observable<BaseResponse<CenterActivityModel>> getCenterActivityById(@Path("id") String id);

    //查询所有的勋章
    @GET("/activity/medal/all")
    Observable<BaseResponse<List<MedalModel>>> getAllMedals();

    // 查询单个勋章
    @GET("/activity/medal/{id}")
    Observable<BaseResponse<MedalModel>> getMedalById(@Path("id") String id);

    //查询用户已获得的勋章
    @GET("/activity/user-medal/{userId}")
    Observable<BaseResponse<List<MedalModel>>> getMedalsByUser(@Path("userId") String userId, @Query("type") int type);

    //查询用户已获得的勋章
    @GET("/activity/user-medal/{userId}")
    Observable<BaseResponse<List<MedalModel>>> getMedalsByUser(@Path("userId") String userId);

}
