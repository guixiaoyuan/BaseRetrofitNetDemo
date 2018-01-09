package com.nongfenqi.controller.client;

import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.model.operate.PlantProductInfoModel;
import com.nongfenqi.controller.model.operate.PlantTypeInfoModel;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * 种植查询
 *
 * @author guixy
 * @version 2.2, 15/08/2017
 * @since [Sherlock/V2.2.0]
 */
public interface PlantClient {
    // 查询种植类型
    @GET("/agr/grow-type")
    Observable<BaseResponse<List<PlantTypeInfoModel>>> getPlantTypeInfo(@Query("fuzzyTypeName") String name);

    // 查询种植作物
    @GET("/agr/grow-crop")
    Observable<BaseResponse<List<PlantProductInfoModel>>> getPlantCropInfo(@Query("growTypeId") String growTypeId);

    // 查询种植品种
    @GET("/agr/grow-product")
    Observable<BaseResponse<List<PlantProductInfoModel>>> getPlantProductInfo(@Query("growTypeId") String growTypeId,
                                                                              @Query("growCropId") String growCropId,
                                                                              @Query("fuzzyProductName") String fuzzyProductName);

}
