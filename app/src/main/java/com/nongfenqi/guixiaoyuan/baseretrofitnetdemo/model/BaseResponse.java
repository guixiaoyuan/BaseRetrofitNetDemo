package com.nongfenqi.guixiaoyuan.baseretrofitnetdemo.model;

import com.google.gson.annotations.SerializedName;

/**
 * 对服务器返回的结果进行封装。
 *
 * @author guixiaoyuan
 * @version 1.0, 2017/12/29
 * @since [BaseRetrofitNetDemo/V1.0]
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
