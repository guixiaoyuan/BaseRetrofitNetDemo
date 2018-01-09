package com.nongfenqi.controller.http;

import com.nongfenqi.controller.client.WorkbenchClient;
import com.nongfenqi.controller.configure.ServiceGenerator;
import com.nongfenqi.controller.configure.UrlConstant;
import com.nongfenqi.controller.model.BulletinModel;
import com.nongfenqi.controller.model.BusinessModel;
import com.nongfenqi.controller.model.BusinessStateModel;

import java.util.Map;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 工作台
 *
 * @author guixiaoyuan
 * @version 2.3, 05/09/2017
 * @since [Sherlock/V2.3.0]
 */
public class WorkbenchController {
    private static final String TAG = WorkbenchController.class.getSimpleName();
    private static WorkbenchClient sWorkbenchClient;

    /**
     * 获得业务状态数据
     */
    public static void getBusinessState(String json, Subscriber<BusinessModel<BusinessStateModel>> subscriber) {
        getWorkbenchClient().getBusinessState(json)
                .map(new ServiceGenerator.HttpResultFunc<BusinessModel<BusinessStateModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 获得简报数据
     */
    public static void getBulletinInfo(Map<String, String> options, Subscriber<BusinessModel<BulletinModel>> subscriber) {
        getWorkbenchClient().getBulltinInfo(options)
                .map(new ServiceGenerator.HttpResultFunc<BusinessModel<BulletinModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    private static WorkbenchClient getWorkbenchClient() {
        if (sWorkbenchClient == null) {
            sWorkbenchClient = ServiceGenerator.createService(WorkbenchClient.class, UrlConstant.REPORT_API_URL, true);
        }
        return sWorkbenchClient;
    }

}
