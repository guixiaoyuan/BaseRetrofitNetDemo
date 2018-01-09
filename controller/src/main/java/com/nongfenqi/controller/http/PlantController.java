package com.nongfenqi.controller.http;

import com.nongfenqi.controller.client.PlantClient;
import com.nongfenqi.controller.configure.ServiceGenerator;
import com.nongfenqi.controller.configure.UrlConstant;
import com.nongfenqi.controller.model.operate.PlantProductInfoModel;
import com.nongfenqi.controller.model.operate.PlantTypeInfoModel;

import java.util.List;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 种植
 *
 * @author guixiaoyuan
 * @version 2.2, 2017/8/16
 * @since [sherlock/V2.2.0]
 */
public class PlantController {
    private static final String Tag = PlantController.class.getSimpleName();
    private static PlantClient sPlantClient;

    /**
     * 种植类型查询
     */
    public static void getGrowTypeInfo(String name, Subscriber<List<PlantTypeInfoModel>> subscriber) {
        getPlantClient().getPlantTypeInfo(name)
                .map(new ServiceGenerator.HttpResultFunc<List<PlantTypeInfoModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 种植品种查询
     */
    public static void getPlantProductInfo(String typeId, String cropId, String name, Subscriber<List<PlantProductInfoModel>> subscriber) {
        getPlantClient().getPlantProductInfo(typeId, cropId, name)
                .map(new ServiceGenerator.HttpResultFunc<List<PlantProductInfoModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 种植作物查询
     */
    public static void getPlantCropInfo(String typeId, Subscriber<List<PlantProductInfoModel>> subscriber) {
        getPlantClient().getPlantCropInfo(typeId)
                .map(new ServiceGenerator.HttpResultFunc<List<PlantProductInfoModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    public static PlantClient getPlantClient() {
        if (sPlantClient == null) {
            sPlantClient = ServiceGenerator.createService(PlantClient.class, UrlConstant.SERVER_API_BASE_URL, true);
        }
        return sPlantClient;
    }
}
