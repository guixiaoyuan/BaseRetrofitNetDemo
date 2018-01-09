package com.nongfenqi.controller.client.quest;


import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.model.balance.ApplyAssetFixEstateModel;
import com.nongfenqi.controller.model.balance.ApplyAssetFixMachineModel;
import com.nongfenqi.controller.model.balance.ApplyAssetFixOtherModel;
import com.nongfenqi.controller.model.balance.ApplyAssetInventoryModel;
import com.nongfenqi.controller.model.balance.ApplyAssetMoneyModel;
import com.nongfenqi.controller.model.balance.ApplyAssetPrepaidRentModel;
import com.nongfenqi.controller.model.balance.ApplyAssetPrepaymentModel;
import com.nongfenqi.controller.model.balance.ApplyAssetReceivableModel;
import com.nongfenqi.controller.model.balance.ApplyBalanceAccountReceivableModel;
import com.nongfenqi.controller.model.balance.ApplyBalanceAmountModel;
import com.nongfenqi.controller.model.balance.ApplyBalanceAssetFixModel;
import com.nongfenqi.controller.model.balance.ApplyBalanceModel;
import com.nongfenqi.controller.model.balance.ApplyNavBalanceModel;
import com.nongfenqi.controller.model.balance.ApplySheetModel;

import java.util.List;

import okhttp3.MultipartBody;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Function
 * 资产负债信息
 *
 * @author jiezhi
 * @version 1.0, 13/02/2017
 * @see [相关类/方法]
 * @since [农人帮/V1.1.2]
 */
public interface ApplyBalanceClient {

    // 查询资产负债导航
    @GET("/apply/{applyId}/navigation/balance")
    Observable<BaseResponse<ApplyNavBalanceModel>> getNavBalance(@Path("applyId") String applyId);

    // 查询资产负债
    @GET("/apply/{applyId}/balance")
    Observable<BaseResponse<ApplyBalanceModel>> getBalance(@Path("applyId") String applyId);

    // 创建资产负债
    @POST("/apply/{applyId}/balance")
    Observable<BaseResponse<Integer>> postBalance(@Path("applyId") String applyId,
                                                  @Body ApplyBalanceModel applyBalanceModel);

    // 修改资产负债
    @PUT("/apply/{applyId}/balance")
    Observable<BaseResponse<Object>> putBalance(@Path("applyId") String applyId,
                                                @Body ApplyBalanceModel applyBalanceModel);

    // 查询资产/负债的总金额
    @GET("/apply/{applyId}/balance/amount")
    Observable<BaseResponse<ApplyBalanceAmountModel>> getBalanceAmount(@Path("applyId") String applyId);

    // 查询固定性资产
    @GET("/apply/{applyId}/balance/asset/fix")
    Observable<BaseResponse<ApplyBalanceAssetFixModel>> getBalanceAssetFix(@Path("applyId") String applyId);

    /*--------------------------------固定资产-库房厂房-------------------------------------------*/
    // 新增固定资产-库房厂房
    @POST("/apply/{applyId}/balance/asset/fix/estate")
    Observable<BaseResponse<Integer>> postAssetFixEstate(@Path("applyId") String applyId,
                                                         @Body ApplyAssetFixEstateModel applyAssetFixEstateModel);

    // 修改固定资产-库房厂房
    @PUT("/apply/{applyId}/balance/asset/fix/estate")
    Observable<BaseResponse<Object>> putAssetFixEstate(@Path("applyId") String applyId,
                                                       @Body ApplyAssetFixEstateModel applyAssetFixEstateModel);

    // 上传资产信息（固定资产-库房厂房）图片
    @Multipart
    @POST("/apply/{applyId}/balance/asset/fix/estate/{estateId}/pic")
    Observable<BaseResponse<String>> uploadAssetFixEstatePicById(@Path("applyId") String applyId,
                                                                 @Path("estateId") int estateId,
                                                                 @Part MultipartBody.Part file);

    // 删除固定资产-库房厂房
    @DELETE("/apply/{applyId}/balance/asset/fix/estate/{id}")
    Observable<BaseResponse<Object>> deleteAssetFixEstateById(@Path("applyId") String applyId,
                                                              @Path("id") int id);

    /*--------------------------------固定资产-农机设备-------------------------------------------*/
    // 新增固定性资产-农机设备
    @POST("/apply/{applyId}/balance/asset/fix/machine")
    Observable<BaseResponse<Integer>> postAssetFixMachine(@Path("applyId") String applyId,
                                                          @Body ApplyAssetFixMachineModel applyAssetFixMachineModel);

    // 修改固定资产-农机设备
    @PUT("/apply/{applyId}/balance/asset/fix/machine")
    Observable<BaseResponse<Object>> putAssetFixMachine(@Path("applyId") String applyId,
                                                        @Body ApplyAssetFixMachineModel applyAssetFixMachineModel);

    // 上传资产信息（固定资产-农机）图片
    @Multipart
    @POST("/apply/{applyId}/balance/asset/fix/machine/{machineId}/pic")
    Observable<BaseResponse<String>> uploadAssetFixMachinePicById(@Path("applyId") String applyId,
                                                                  @Path("machineId") int machineId,
                                                                  @Part MultipartBody.Part file);

    // 删除固定资产-农机设备
    @DELETE("/apply/{applyId}/balance/asset/fix/machine/{id}")
    Observable<BaseResponse<Object>> deleteAssetFixMachineById(@Path("applyId") String applyId,
                                                               @Path("id") int id);


    /*--------------------------------固定资产-其他-------------------------------------------*/
    // 新增固定资产-其他
    @POST("/apply/{applyId}/balance/asset/fix/other")
    Observable<BaseResponse<Integer>> postAssetFixOther(@Path("applyId") String applyId,
                                                        @Body ApplyAssetFixOtherModel applyAssetFixOtherModel);

    // 修改固定资产-其他
    @PUT("/apply/{applyId}/balance/asset/fix/other")
    Observable<BaseResponse<Object>> putAssetFixOther(@Path("applyId") String applyId,
                                                      @Body ApplyAssetFixOtherModel applyAssetFixOtherModel);

    // 上传资产信息（固定资产-其他）图片
    @Multipart
    @POST("/apply/{applyId}/balance/asset/fix/other/{otherId}/pic")
    Observable<BaseResponse<String>> uploadAssetFixOtherPicById(@Path("applyId") String applyId,
                                                                @Path("otherId") int otherId,
                                                                @Part MultipartBody.Part file);

    // 删除固定资产-其他
    @DELETE("/apply/{applyId}/balance/asset/fix/other/{id}")
    Observable<BaseResponse<Object>> deleteAssetFixOtherById(@Path("applyId") String applyId,
                                                             @Path("id") int id);

    /*--------------------------------存货-------------------------------------------*/
    // 查询存货
    @GET("/apply/{applyId}/balance/asset/inventory")
    Observable<BaseResponse<List<ApplyAssetInventoryModel>>> getAssetInventory(@Path("applyId") String applyId);

    // 新增存货
    @POST("/apply/{applyId}/balance/asset/inventory")
    Observable<BaseResponse<Integer>> postAssetInventory(@Path("applyId") String applyId,
                                                         @Body ApplyAssetInventoryModel applyAssetInventoryModel);

    // 修改存货
    @PUT("/apply/{applyId}/balance/asset/inventory")
    Observable<BaseResponse<Object>> putAssetInventory(@Path("applyId") String applyId,
                                                       @Body ApplyAssetInventoryModel applyAssetInventoryModel);

    // 删除存货
    @DELETE("/apply/{applyId}/balance/asset/inventory/{id}")
    Observable<BaseResponse<Object>> deleteAssetInventoryById(@Path("applyId") String applyId,
                                                              @Path("id") int id);

    // 上传资产信息（存货）图片
    @Multipart
    @POST("/apply/{applyId}/balance/asset/inventory/{inventoryId}/pic")
    Observable<BaseResponse<String>> uploadAssetInventoryPicById(@Path("applyId") String applyId,
                                                                 @Path("inventoryId") int inventoryId,
                                                                 @Part MultipartBody.Part file);

    /*--------------------------------资产信息(现金、银行存款)-------------------------------------------*/
    // 查询资产信息(现金、银行存款)
    @GET("/apply/{applyId}/balance/asset/money")
    Observable<BaseResponse<List<ApplyAssetMoneyModel>>> getAssetMoney(@Path("applyId") String applyId);

    // 新增资产信息(现金、银行存款)
    @POST("/apply/{applyId}/balance/asset/money")
    Observable<BaseResponse<Integer>> postAssetMoney(@Path("applyId") String applyId,
                                                     @Body ApplyAssetMoneyModel applyAssetMoneyModel);

    // 修改资产信息(现金、银行存款)
    @PUT("/apply/{applyId}/balance/asset/money")
    Observable<BaseResponse<Object>> putAssetMoney(@Path("applyId") String applyId,
                                                   @Body ApplyAssetMoneyModel applyAssetMoneyModel);

    // 删除资产信息(现金、银行存款)
    @DELETE("/apply/{applyId}/balance/asset/money/{id}")
    Observable<BaseResponse<Object>> deleteAssetMoneyById(@Path("applyId") String applyId,
                                                          @Path("id") int id);

    // 上传资产信息(现金、银行存款)图片
    @Multipart
    @POST("/apply/{applyId}/balance/asset/money/{moneyId}/pic")
    Observable<BaseResponse<String>> uploadAssetMoneyPicById(@Path("applyId") String applyId,
                                                             @Path("moneyId") int moneyId,
                                                             @Part MultipartBody.Part file);

    /*--------------------------------外摊租金-------------------------------------------*/
    // 查询外摊租金
    @GET("/apply/{applyId}/balance/asset/prepaid-rent")
    Observable<BaseResponse<List<ApplyAssetPrepaidRentModel>>> getAssetPrepaidRent(@Path("applyId") String applyId);

    // 新增修改外摊租金
    @POST("/apply/{applyId}/balance/asset/prepaid-rent")
    Observable<BaseResponse<Integer>> postAssetPrepaidRent(@Path("applyId") String applyId,
                                                           @Body ApplyAssetPrepaidRentModel applyAssetPrepaidRentModel);

    // 修改修改外摊租金
    @PUT("/apply/{applyId}/balance/asset/prepaid-rent")
    Observable<BaseResponse<Object>> putAssetPrepaidRent(@Path("applyId") String applyId,
                                                         @Body ApplyAssetPrepaidRentModel applyAssetPrepaidRentModel);

    // 删除修改外摊租金
    @DELETE("/apply/{applyId}/balance/asset/prepaid-rent/{id}")
    Observable<BaseResponse<Object>> deleteAssetPrepaidRentById(@Path("applyId") String applyId,
                                                                @Path("id") int id);

    // 上传修改外摊租金图片
    @Multipart
    @POST("/apply/{applyId}/balance/asset/prepaid-rent/{rentId}/pic")
    Observable<BaseResponse<String>> uploadAssetPrepaidRentPicById(@Path("applyId") String applyId,
                                                                   @Path("rentId") int rentId,
                                                                   @Part MultipartBody.Part file);

    /*--------------------------------预付款项-------------------------------------------*/
    // 查询预付款项
    @GET("/apply/{applyId}/balance/asset/prepayment")
    Observable<BaseResponse<List<ApplyAssetPrepaymentModel>>> getAssetPrepayment(@Path("applyId") String applyId);

    // 新增预付款项
    @POST("/apply/{applyId}/balance/asset/prepayment")
    Observable<BaseResponse<Integer>> postAssetPrepayment(@Path("applyId") String applyId,
                                                          @Body ApplyAssetPrepaymentModel applyAssetPrepaymentModel);

    // 修改预付款项
    @PUT("/apply/{applyId}/ balance/asset/prepayment")
    Observable<BaseResponse<Object>> putAssetPrepayment(@Path("applyId") String applyId,
                                                        @Body ApplyAssetPrepaymentModel applyAssetPrepaymentModel);

    // 删除预付款项
    @DELETE("/apply/{applyId}/balance/asset/prepayment/{id}")
    Observable<BaseResponse<Object>> deleteAssetPrepaymentById(@Path("applyId") String applyId,
                                                               @Path("id") int id);

    // 上传预付款项图片
    @Multipart
    @POST("/apply/{applyId}/balance/asset/prepayment/{prepaymentId}/pic")
    Observable<BaseResponse<String>> uploadAssetPrepaymentPicById(@Path("applyId") String applyId,
                                                                  @Path("prepaymentId") int prepaymentId,
                                                                  @Part MultipartBody.Part file);

    /*--------------------------------应收账款-------------------------------------------*/
    // 查询应收账款
    @GET("/apply/{applyId}/balance/asset/receivable")
    Observable<BaseResponse<List<ApplyAssetReceivableModel>>> getAssetReceivable(@Path("applyId") String applyId);

    // 新增应收账款
    @POST("/apply/{applyId}/balance/asset/receivable")
    Observable<BaseResponse<Integer>> postAssetReceivable(@Path("applyId") String applyId,
                                                          @Body ApplyAssetReceivableModel applyAssetReceivableModel);

    // 修改应收账款
    @PUT("/apply/{applyId}/ balance/asset/receivable")
    Observable<BaseResponse<Object>> putAssetReceivable(@Path("applyId") String applyId,
                                                        @Body ApplyAssetReceivableModel applyAssetReceivableModel);

    // 删除应收账款
    @DELETE("/apply/{applyId}/balance/asset/receivable/{id}")
    Observable<BaseResponse<Object>> deleteAssetReceivableById(@Path("applyId") String applyId,
                                                               @Path("id") int id);

    // 上传应收账款片
    @Multipart
    @POST("/apply/{applyId}/balance/asset/receivable/{receivableId}/pic")
    Observable<BaseResponse<String>> uploadAssetReceivablePicById(@Path("applyId") String applyId,
                                                                  @Path("receivableId") int prepaymentId,
                                                                  @Part MultipartBody.Part file);

    /*--------------------------------表外项目-------------------------------------------*/
    // 查询表外项目
    @GET("/apply/{applyId}/balance/sheet-items")
    Observable<BaseResponse<List<ApplySheetModel>>> getSheetItems(@Path("applyId") String applyId);

    // 新增表外项目
    @POST("/apply/{applyId}/balance/sheet-items")
    Observable<BaseResponse<Integer>> postSheetItem(@Path("applyId") String applyId,
                                                    @Body ApplySheetModel applySheetModel);

    // 修改表外项目
    @PUT("/apply/{applyId}/ balance/sheet-items")
    Observable<BaseResponse<Object>> putSheetItem(@Path("applyId") String applyId,
                                                  @Body ApplySheetModel applySheetModel);

    // 删除表外项目
    @DELETE("/apply/{applyId}/balance/sheet-items/{id}")
    Observable<BaseResponse<Object>> deleteSheetItemById(@Path("applyId") String applyId,
                                                         @Path("id") int id);

    /*--------------------------------负债信息-------------------------------------------*/
    //查询负债信息(应付账款、预收款项、短期贷款、其他负债)
    @GET("/apply/{applyId}/balance/liability")
    Observable<BaseResponse<List<ApplyBalanceAccountReceivableModel>>> getAccountReceivable(@Path("applyId") String applyId);

    // 新增负债信息(应付账款、预收款项、短期贷款、其他负债)
    @POST("/apply/{applyId}/balance/liability")
    Observable<BaseResponse<Integer>> postAccountReceivable(@Path("applyId") String applyId,
                                                            @Body ApplyBalanceAccountReceivableModel applyAssetReceivableModel);

    // 修改应收账款
    @PUT("/apply/{applyId}/balance/liability")
    Observable<BaseResponse<Object>> putAccountReceivable(@Path("applyId") String applyId,
                                                          @Body ApplyBalanceAccountReceivableModel applyAssetReceivableModel);

    // 删除应收账款
    @DELETE("/apply/{applyId}/balance/liability/{id}")
    Observable<BaseResponse<Object>> deleteAccountReceivableById(@Path("applyId") String applyId,
                                                                 @Path("id") int id);
}
