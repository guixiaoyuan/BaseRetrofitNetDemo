package com.nongfenqi.controller.http;

import com.nongfenqi.controller.client.UserClient;
import com.nongfenqi.controller.configure.ServiceGenerator;
import com.nongfenqi.controller.model.user.PasswordModel;
import com.nongfenqi.controller.model.user.UserDeptModel;
import com.nongfenqi.controller.model.user.UserDetailModel;
import com.nongfenqi.controller.model.user.UserModel;

import java.util.List;
import java.util.Map;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 用户接口
 *
 * @author luzhichao
 * @version 1.0, 17/3/21
 * @since [sherlock/V1.0.0]
 */

public class UserController {
    private static final String TAG = UserController.class.getSimpleName();

    private static UserClient userClient;

    //当前用户所在大区下的人员分页查询
    public static void getRegionalUser(Map<String, String> options, Subscriber<UserModel> subscriber) {
        getUserClient().getRegionalUser(options)
                .map(new ServiceGenerator.HttpResultFunc<UserModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    //展现所有部门
    public static void getAllDept(Subscriber<List<UserDeptModel>> subscriber) {
        getUserClient().getAllDept()
                .map(new ServiceGenerator.HttpResultFunc<List<UserDeptModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    //查询用户大区
    public static void getUserRegion(String userId, Subscriber<UserDeptModel.DataEntity> subscriber) {
        getUserClient().getUserRegion(userId)
                .map(new ServiceGenerator.HttpResultFunc<UserDeptModel.DataEntity>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    //用户查询
    public static void getUserInfo(String userId, Subscriber<UserDetailModel> subscriber) {
        getUserClient().getUserInfo(userId)
                .map(new ServiceGenerator.HttpResultFunc<UserDetailModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    //修改密码
    public static void modifyPassword(PasswordModel passwordModel, Subscriber<Object> subscriber) {
        UserClient userClient = ServiceGenerator.createService(UserClient.class);
        userClient.modifyPassword(passwordModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    private static UserClient getUserClient() {
        if (userClient == null) {
            userClient = ServiceGenerator.createService(UserClient.class);
        }
        return userClient;
    }
}
