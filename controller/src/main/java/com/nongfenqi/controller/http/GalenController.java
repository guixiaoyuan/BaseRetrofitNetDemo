package com.nongfenqi.controller.http;

import com.nongfenqi.controller.BasePageResponse;
import com.nongfenqi.controller.client.GalenClient;
import com.nongfenqi.controller.configure.ServiceGenerator;
import com.nongfenqi.controller.configure.UrlConstant;
import com.nongfenqi.controller.model.galen.BrandModel;
import com.nongfenqi.controller.model.galen.MachineModel;

import java.util.List;
import java.util.Map;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 公共服务
 *
 * @author jiezhi
 * @version 1.0, 21/03/2017
 * @since [Sherlock/V1.0.0]
 */
public class GalenController {
    private static final String TAG = GalenController.class.getSimpleName();
    private static GalenClient galenClient;

    /**
     * 获取品牌列表（农机、农资）农机品牌查询
     *
     * @param typeId
     * @param machineTypeId
     * @param subscriber
     */
    public static void getBrandListById(int typeId, String machineTypeId, Subscriber<List<BrandModel>> subscriber) {
        getGalenClient().getMachineBrandList(typeId, machineTypeId)
                .map(new ServiceGenerator.HttpResultFunc<List<BrandModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 机器类型查询
     *
     * @param brandId
     * @param subscriber
     */
    public static void getMachineTypeList(String brandId, Subscriber<List<BrandModel>> subscriber) {
        getGalenClient().getMachineTypeList(brandId)
                .map(new ServiceGenerator.HttpResultFunc<List<BrandModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 机器查询
     *
     * @param brandId
     * @param machineTypeId
     * @param subscriber
     */
    public static void getMachineList(String brandId, String machineTypeId, Subscriber<List<MachineModel>> subscriber) {
        getGalenClient().getMachineList(brandId, machineTypeId)
                .map(new ServiceGenerator.HttpResultFunc<List<MachineModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 机器记录分页查询
     *
     * @param options
     * @param subscriber
     */
    public static void getMachineListByOptions(Map<String, String> options, Subscriber<BasePageResponse<MachineModel>> subscriber) {
        getGalenClient().getMachineListByOptions(options)
                .map(new ServiceGenerator.HttpResultFunc<BasePageResponse<MachineModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    private static GalenClient getGalenClient() {
        if (galenClient == null) {
            galenClient = ServiceGenerator.createService(GalenClient.class, UrlConstant.SERVER_GALEN_BASE_URL, false);
        }
        return galenClient;
    }

}
