package com.nongfenqi.controller.http;

import com.nongfenqi.controller.BaseSubscriber;
import com.nongfenqi.controller.client.MessageClient;
import com.nongfenqi.controller.configure.ServiceGenerator;
import com.nongfenqi.controller.model.message.MessageNumberModel;
import com.nongfenqi.controller.model.message.PublicMessageModel;

import java.util.HashMap;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 消息接口
 *
 * @author guixiaoyuan
 * @version 2.4, 2017/11/29
 * @since [sherlock/V2.4.5]
 */
public class MessageController {
    private final static String TAG = MessageController.class.getSimpleName();
    private static MessageClient mMessageClient;

    /**
     * 查询未读消息
     *
     * @return unReadMessageNumber
     */
    public static void getUnReadMessageNumber(BaseSubscriber<MessageNumberModel> subscriber) {
        getMessageClient().getUnReadMessageNumber()
                .map(new ServiceGenerator.HttpResultFunc<MessageNumberModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 查询公告消息
     *
     * @return model
     */
    public static void getPublicMessageModel(HashMap<String, String> queryOptions,
                                             BaseSubscriber<PublicMessageModel> subscriber) {
        getMessageClient().getPublicMessageModel(queryOptions)
                .map(new ServiceGenerator.HttpResultFunc<PublicMessageModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 将所有未读公告标记为已读
     *
     * @return model
     */
    public static void setPublicMsgRead(BaseSubscriber<Object> subscriber) {
        getMessageClient().setPublicMessageRead()
                .map(new ServiceGenerator.HttpResultFunc<Object>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 查询公告详情
     *
     * @param publiciInfoId
     * @param subscriber
     */
    public static void queryPublicMsgDetailModel(int publicInfoId,
                                                 BaseSubscriber<String> subscriber) {
        getMessageClient().getPublicMsgDetailModel(publicInfoId)
                .map(new ServiceGenerator.HttpResultFunc<String>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 查询业务消息
     *
     * @return model
     */
    public static void getBusinessMessageModel(HashMap<String, String> queryOptions,
                                               BaseSubscriber<PublicMessageModel> subscriber) {
        getMessageClient().getBusinessMessageModel(queryOptions)
                .map(new ServiceGenerator.HttpResultFunc<PublicMessageModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 将所有未读业务消息标记为已读
     *
     * @return model
     */
    public static void setBusinessMsgRead(BaseSubscriber<Object> subscriber) {
        getMessageClient().setBusinessMessageRead()
                .map(new ServiceGenerator.HttpResultFunc<Object>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 查询公告详情
     *
     * @param businessInfoId
     * @param subscriber
     */
    public static void queryBusinessMsgDetailModel(int businessInfoId,
                                                   BaseSubscriber<String> subscriber) {
        getMessageClient().getBusinessMsgDetailModel(businessInfoId)
                .map(new ServiceGenerator.HttpResultFunc<String>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 查询系统消息
     *
     * @return model
     */
    public static void getSystemMessageModel(HashMap<String, String> queryOptions,
                                             BaseSubscriber<PublicMessageModel> subscriber) {
        getMessageClient().getSystemMessageModel(queryOptions)
                .map(new ServiceGenerator.HttpResultFunc<PublicMessageModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 将所有未读系统消息标记为已读
     *
     * @return model
     */
    public static void setSystemMsgRead(BaseSubscriber<Object> subscriber) {
        getMessageClient().setSystemMessageRead()
                .map(new ServiceGenerator.HttpResultFunc<Object>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 查询系统详情
     *
     * @param systemInfoId
     * @param subscriber
     */
    public static void querySystemMsgDetailModel(int systemInfoId,
                                                 BaseSubscriber<String> subscriber) {
        getMessageClient().getSystemMsgDetailModel(systemInfoId)
                .map(new ServiceGenerator.HttpResultFunc<String>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    public static MessageClient getMessageClient() {
        if (mMessageClient == null) {
            mMessageClient = ServiceGenerator.createService(MessageClient.class);
        }
        return mMessageClient;
    }
}
