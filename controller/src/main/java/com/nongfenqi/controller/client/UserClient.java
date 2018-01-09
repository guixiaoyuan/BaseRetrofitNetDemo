package com.nongfenqi.controller.client;

import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.model.user.PasswordModel;
import com.nongfenqi.controller.model.user.UserDeptModel;
import com.nongfenqi.controller.model.user.UserDetailModel;
import com.nongfenqi.controller.model.user.UserModel;

import java.util.List;
import java.util.Map;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * 用户接口
 *
 * @author luzhichao
 * @version 1.0, 17/3/22
 * @since [sherlock/V1.0.0]
 */

public interface UserClient {
    //当前用户所在大区下的人员分页查询
    @GET("/boss/regional-user")
    Observable<BaseResponse<UserModel>> getRegionalUser(@QueryMap Map<String, String> options);

    //展现所有部门
    @GET("/boss/dept")
    Observable<BaseResponse<List<UserDeptModel>>> getAllDept();

    //查询用户大区
    @GET("/boss/user/{userId}/regional")
    Observable<BaseResponse<UserDeptModel.DataEntity>> getUserRegion(@Path("userId") String userId);

    //用户查询
    @GET("/boss/user/{userId}")
    Observable<BaseResponse<UserDetailModel>> getUserInfo(@Path("userId") String userId);

    // 修改密码
    @PATCH("/boss/password/_modify")
    Observable<BaseResponse<Object>> modifyPassword(@Body PasswordModel passwordModel);
}
