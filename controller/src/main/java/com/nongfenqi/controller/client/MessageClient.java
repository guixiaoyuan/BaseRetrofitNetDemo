package com.nongfenqi.controller.client;

import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.model.message.MessageNumberModel;
import com.nongfenqi.controller.model.message.PublicMessageModel;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * 消息接口
 *
 * @author guixy
 * @version 2.4, 14/07/17
 * @since [sherlock/V2.4.5]
 */
public interface MessageClient {


    /**
     * 查询用户消息未读数量
     *
     * @return observable
     */
    @GET("/information/personal/unread-amount")
    Observable<BaseResponse<MessageNumberModel>> getUnReadMessageNumber();

    /**
     * 用户公告查询
     *
     * @param queryOptions
     * @return observable
     */
    @GET("/information/personal/public-information")
    Observable<BaseResponse<PublicMessageModel>> getPublicMessageModel(@QueryMap Map<String, String> queryOptions);

    /**
     * 将所有公告标为已读
     *
     * @return Object
     */
    @PUT("/information/personal/public-information")
    Observable<BaseResponse<Object>> setPublicMessageRead();

    /**
     * 查询公告详情
     *
     * @param publicInformationId
     * @return
     */
    @GET("/information/personal/public-information/{publicInformationId}")
    Observable<BaseResponse<String>> getPublicMsgDetailModel(@Path("publicInformationId") int publicInformationId);

    /**
     * 用户业务消息查询
     *
     * @param queryOptions
     * @return observable
     */
    @GET("/information/personal/business-information")
    Observable<BaseResponse<PublicMessageModel>> getBusinessMessageModel(@QueryMap Map<String, String> queryOptions);

    /**
     * 将所有业务消息标为已读
     *
     * @return Object
     */
    @PUT("/information/personal/business-information")
    Observable<BaseResponse<Object>> setBusinessMessageRead();


    /**
     * 查询系统消息详情
     *
     * @param businessInformationId
     * @return
     */
    @GET("/information/personal/business-information/{businessInformationId}")
    Observable<BaseResponse<String>> getBusinessMsgDetailModel(@Path("businessInformationId") int businessInformationId);


    /**
     * 用户系统消息查询
     *
     * @param queryOptions
     * @return observable
     */
    @GET("/information/personal/system-information")
    Observable<BaseResponse<PublicMessageModel>> getSystemMessageModel(@QueryMap Map<String, String> queryOptions);

    /**
     * 将所有系统消息标为已读
     *
     * @return Object
     */
    @PUT("/information/personal/system-information")
    Observable<BaseResponse<Object>> setSystemMessageRead();


    /**
     * 查询消息详情
     *
     * @param systemInformationId
     * @return
     */
    @GET("/information/personal/system-information/{systemInformationId}")
    Observable<BaseResponse<String>> getSystemMsgDetailModel(@Path("systemInformationId") int systemInformationId);

}
