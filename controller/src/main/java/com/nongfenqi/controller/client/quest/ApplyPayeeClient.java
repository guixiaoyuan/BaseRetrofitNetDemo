package com.nongfenqi.controller.client.quest;


import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.model.payee.PayeeCompanyPrivateModel;
import com.nongfenqi.controller.model.payee.PayeeCompanyPublicModel;
import com.nongfenqi.controller.model.payee.PayeeMachineDistributorModel;
import com.nongfenqi.controller.model.payee.PayeeModel;
import com.nongfenqi.controller.model.payee.PayeePersonalModel;
import com.nongfenqi.controller.model.payee.PayeeSelfModel;
import com.nongfenqi.controller.model.payee.PayeeTypeModel;
import com.nongfenqi.controller.model.payee.PayeeVendorModel;

import okhttp3.MultipartBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Function
 * 下款收款方:http://swagger.dev.zhongzijinfu.com/#/下款收款方
 *
 * @author jiezhi
 * @version 1.0, 07/02/2017
 * @see [相关类/方法]
 * @since [农人帮/V1.1.2]
 */
public interface ApplyPayeeClient {

    // 收款方查询
    @GET("/apply/{applyId}/payee")
    Observable<BaseResponse<PayeeModel>> getPayee(@Path("applyId") String applyId);

    // 设置收款方类型
    @PATCH("apply/{applyId}/payee-type")
    Observable<BaseResponse<Object>> setPayeeType(@Path("applyId") String applyId, @Body PayeeTypeModel payeeTypeModel);

    // 查询对私代理收款信息
    @GET("/apply/{applyId}/payee-proxy-company-private")
    Observable<BaseResponse<PayeeCompanyPrivateModel>> getPayeeProxyCompanyPrivate(@Path("applyId") String applyId);

    // 设置对私代理收款信息
    @PATCH("/apply/{applyId}/payee-proxy-company-private")
    Observable<BaseResponse<Object>> setPayeeProxyCompanyPrivate(@Path("applyId") String applyId, @Body PayeeCompanyPrivateModel payeeCompanyPrivateModel);

    // 查询对公代理收款信息
    @GET("/apply/{applyId}/payee-proxy-company-public")
    Observable<BaseResponse<PayeeCompanyPublicModel>> getPayeeProxyCompanyPublic(@Path("applyId") String applyId);

    // 设置对公代理收款信息
    @PATCH("/apply/{applyId}/payee-proxy-company-public")
    Observable<BaseResponse<Object>> setPayeeProxyCompanyPublic(@Path("applyId") String applyId, @Body PayeeCompanyPublicModel payeeCompanyPublicModel);

    // 查询农机经销商代理收款信息
    @GET("/apply/{applyId}/payee-proxy-machine-distributor")
    Observable<BaseResponse<PayeeMachineDistributorModel>> getPayeeProxyMachineDistributor(@Path("applyId") String applyId);

    // 设置农机经销商代理收款信息
    @PATCH("/apply/{applyId}/payee-proxy-machine-distributor")
    Observable<BaseResponse<Object>> setPayeeProxyMachineDistributor(@Path("applyId") String applyId, @Body PayeeMachineDistributorModel payeeMachineDistributorModel);

    // 查询个人代理收款信息
    @GET("/apply/{applyId}/payee-proxy-personal")
    Observable<BaseResponse<PayeePersonalModel>> getPayeeProxyPersonal(@Path("applyId") String applyId);

    // 设置个人代理收款信息
    @PATCH("/apply/{applyId}/payee-proxy-personal")
    Observable<BaseResponse<Object>> setPayeeProxyPersonal(@Path("applyId") String applyId, @Body PayeePersonalModel payeePersonalModel);

    // 查询农机厂家代理收款信息
    @GET("/apply/{applyId}/payee-proxy-vendor")
    Observable<BaseResponse<PayeeVendorModel>> getPayeeProxyVendor(@Path("applyId") String applyId);

    // 设置农机厂家代理收款信息
    @PATCH("/apply/{applyId}/payee-proxy-vendor")
    Observable<BaseResponse<Object>> setPayeeProxyVendor(@Path("applyId") String applyId, @Body PayeeVendorModel payeeVendorModel);

    // 查询自收款信息
    @GET("/apply/{applyId}/payee-self")
    Observable<BaseResponse<PayeeSelfModel>> getPayeeProxySelf(@Path("applyId") String applyId);

    // 设置查询自收款信息
    @PATCH("/apply/{applyId}/payee-self")
    Observable<BaseResponse<Object>> setPayeeProxySelf(@Path("applyId") String applyId, @Body PayeeSelfModel payeeSelfModel);

    // 收款方图片上传
    @Multipart
    @POST("apply/{applyId}/payee/pic")
    Observable<BaseResponse<String>> postPayeePic(@Path("applyId") String applyId, @Part MultipartBody.Part file);

}
