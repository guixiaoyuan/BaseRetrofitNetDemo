package com.nongfenqi.controller;

import com.google.gson.annotations.SerializedName;

/**
 * Function
 * 对服务器返回的结果的封装
 *
 * @author jiezhi
 * @version 1.0, 19/10/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.0.0]
 */
public class BaseResponse<T> {
    private static final String TAG = BaseResponse.class.getSimpleName();

    @SerializedName("data")
    private T data;
    @SerializedName("retCode")
    private int retCode;
    @SerializedName("retMsg")
    private String retMsg;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getRetCode() {
        return retCode;
    }

    public void setRetCode(int retCode) {
        this.retCode = retCode;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    @Override
    public String toString() {
        return "BaseResponse{" +
                "data=" + data +
                ", retCode=" + retCode +
                ", retMsg='" + retMsg + '\'' +
                '}';
    }
}
