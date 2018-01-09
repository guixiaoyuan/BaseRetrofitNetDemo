package com.nongfenqi.controller.http;

import com.nongfenqi.controller.BaseSubscriber;
import com.nongfenqi.controller.client.CenterClient;
import com.nongfenqi.controller.configure.ServiceGenerator;
import com.nongfenqi.controller.model.CenterActivityModel;
import com.nongfenqi.controller.model.MedalModel;

import java.util.List;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 活动接口
 *
 * @author guixy
 * @version 2.1, 14/07/17
 * @since [sherlock/V2.1.0]
 */
public class ActivityCenterController {
    private static final String TAG = ActivityCenterController.class.getSimpleName();

    public static final int MEDAL_FILTER = 1;//过滤掉小勋章,留下大勋章

    private static CenterClient sCenterClient;

    /*
    勋章详情
     "id":1,"medalName":"蜂盾小能手",
      "id":2,"medalName":"蜂盾抢鲜者",
      "id":3,"medalName":"农分期三周年",
      "id":4,"medalName":"农分期三周年plus"
      */

    /**
     * 查询所有活动
     *
     * @param subscriber
     */
    public static void getAllCenterActivities(BaseSubscriber<List<CenterActivityModel>> subscriber) {
        getCenterClient().getAllCenterActivities()
                .map(new ServiceGenerator.HttpResultFunc<List<CenterActivityModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 查询单个活动
     *
     * @param id
     * @param subscriber
     */
    public static void getCenterActivitityById(String id, BaseSubscriber<CenterActivityModel> subscriber) {
        getCenterClient().getCenterActivityById(id)
                .map(new ServiceGenerator.HttpResultFunc<CenterActivityModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 查询所有的勋章
     *
     * @param subscriber
     */
    public static void getAllMedals(BaseSubscriber<List<MedalModel>> subscriber) {
        getCenterClient().getAllMedals()
                .map(new ServiceGenerator.HttpResultFunc<List<MedalModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);

    }

    /**
     * 查询单个勋章
     *
     * @param id
     * @param subscriber
     */
    public static void getMedalById(String id, BaseSubscriber<MedalModel> subscriber) {
        getCenterClient().getMedalById(id)
                .map(new ServiceGenerator.HttpResultFunc<MedalModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 查询用户已获得的勋章(有过滤器)
     *
     * @param userId
     * @param medalType
     * @param subscriber
     */
    public static void getMedalsByUser(String userId, int medalType, BaseSubscriber<List<MedalModel>> subscriber) {
        getCenterClient().getMedalsByUser(userId, medalType)
                .map(new ServiceGenerator.HttpResultFunc<List<MedalModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    private static CenterClient getCenterClient() {
        if (sCenterClient == null) {
            sCenterClient = ServiceGenerator.createService(CenterClient.class);
        }
        return sCenterClient;
    }
}
