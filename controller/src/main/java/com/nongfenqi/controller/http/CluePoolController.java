package com.nongfenqi.controller.http;

import android.transition.Scene;

import com.nongfenqi.controller.client.CluePoolClient;
import com.nongfenqi.controller.configure.ServiceGenerator;
import com.nongfenqi.controller.model.CluePool.CluePoolItemDetailModel;
import com.nongfenqi.controller.model.CluePool.CluePoolModel;

import java.util.Map;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 线索池接口
 *
 * @author guixiaoyuan
 * @version 2.2, 2017/10/10
 * @since [sherlock/V2.2.5]
 */
public class CluePoolController {
    private static final String TAG = CluePoolController.class.getSimpleName();
    private static CluePoolClient sCluePoolClient;

    /**
     * 线索池分页查询
     */
    public static void getCluePoolInfo(Map<String, String> queryOptions, Subscriber<CluePoolModel> subscriber) {
        getCluePoolClient().getCluePoolModel(queryOptions)
                .map(new ServiceGenerator.HttpResultFunc<CluePoolModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 线索详情
     *
     * @return
     */
    public static void getCluePoolItemInfo(String applyId, Subscriber<CluePoolItemDetailModel> subscriber) {
        getCluePoolClient().getCluePoolItemModel(applyId)
                .map(new ServiceGenerator.HttpResultFunc<CluePoolItemDetailModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    private static CluePoolClient getCluePoolClient() {
        if (sCluePoolClient == null) {
            sCluePoolClient = ServiceGenerator.createService(CluePoolClient.class);
        }
        return sCluePoolClient;
    }
}
