package com.nongfenqi.controller.http;

import com.nongfenqi.controller.client.SystemClient;
import com.nongfenqi.controller.configure.ServiceGenerator;
import com.nongfenqi.controller.configure.UrlConstant;
import com.nongfenqi.controller.model.PadLoginModel;
import com.nongfenqi.controller.model.PadLoginResultModel;
import com.nongfenqi.controller.model.TokenModel;
import com.nongfenqi.controller.model.system.NewAppModel;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * @author jiezhi
 * @version 1.0, 13/03/2017
 * @since [Sherlock/V1.0.0]
 */
public class SystemController {
    private static final String TAG = SystemController.class.getSimpleName();

    /**
     * 刷新token
     *
     * @param token
     * @param subscriber
     */
    public static void refreshToken(String token, Subscriber<PadLoginResultModel> subscriber) {
        ServiceGenerator.createService(SystemClient.class, UrlConstant.SERVER_API_BASE_URL, true, token)
                .refreshToken()
                .map(new ServiceGenerator.HttpResultFunc<PadLoginResultModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 登录pad
     *
     * @param padLoginModel
     * @param subscriber
     */
    public static void loginPad(PadLoginModel padLoginModel, Subscriber<PadLoginResultModel> subscriber) {
        ServiceGenerator.createService(SystemClient.class)
                .loginPad(padLoginModel)
                .map(new ServiceGenerator.HttpResultFunc<PadLoginResultModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 发送短信验证码
     *
     * @param padLoginModel
     * @param subscriber
     */
    public static void sendSMSAuthenticationCode(PadLoginModel padLoginModel, Subscriber<String> subscriber) {
        ServiceGenerator.createService(SystemClient.class)
                .postLoginSms(padLoginModel)
                .map(new ServiceGenerator.HttpResultFunc<String>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * app版本信息查询
     *
     * @param appName
     * @param subscriber
     */
    public static void getNewApp(String appName, Subscriber<NewAppModel> subscriber) {
        SystemClient demaciaClient = ServiceGenerator.createService(SystemClient.class, UrlConstant.APP_UPDATE_URL);
        demaciaClient.getNewApp(appName)
                .map(new ServiceGenerator.HttpResultFunc<NewAppModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }
}
