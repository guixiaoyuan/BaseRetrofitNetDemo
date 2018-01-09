package com.nongfenqi.guixiaoyuan.baseretrofitnetdemo.httpController;

import com.nongfenqi.guixiaoyuan.baseretrofitnetdemo.client.CenterClient;
import com.nongfenqi.guixiaoyuan.baseretrofitnetdemo.model.BaseSubscriber;
import com.nongfenqi.guixiaoyuan.baseretrofitnetdemo.model.CenterActivityModel;
import com.nongfenqi.guixiaoyuan.baseretrofitnetdemo.model.ServiceGenerator;

import java.util.List;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 活动中心接口
 *
 * @author guixiaoyuan
 * @version 1.0, 2017/12/29
 * @since [BaseRetrofitNetDemo/V1.0]
 */
public class CenterActivityController {

    private final static String TAG = CenterActivityController.class.getSimpleName();

    private static CenterClient sCenterClient;

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

    private static CenterClient getCenterClient(){
        if (sCenterClient == null){
            sCenterClient = ServiceGenerator.createService(CenterClient.class);
        }
        return sCenterClient;
    }
}
