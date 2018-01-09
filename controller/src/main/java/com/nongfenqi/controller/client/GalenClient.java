package com.nongfenqi.controller.client;

import com.nongfenqi.controller.BasePageResponse;
import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.model.galen.BrandModel;
import com.nongfenqi.controller.model.galen.MachineModel;

import java.util.List;
import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * 公共服务
 *
 * @author jiezhi
 * @version 1.0, 21/03/2017
 * @since [Sherlock/V1.0.0]
 */
public interface GalenClient {
    // 农机品牌查询
    @GET("agr/brands")
    Observable<BaseResponse<List<BrandModel>>> getMachineBrandList(@Query("type") int type, @Query("machineTypeId") String machineTypeId);

    // 机器类型查询
    @GET("/agr/machine-types")
    Observable<BaseResponse<List<BrandModel>>> getMachineTypeList(@Query("brandId") String brandId);

    // 机器查询
    @GET("/agr/machines")
    Observable<BaseResponse<List<MachineModel>>> getMachineList(@Query("brandId") String brandId, @Query("machineId") String machineId);

    // 机器分页查询
    @GET("/agr/machine-list")
    Observable<BaseResponse<BasePageResponse<MachineModel>>> getMachineListByOptions(@QueryMap Map<String, String> options);
}
