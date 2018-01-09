package com.nongfenqi.controller;

import com.nongfenqi.controller.configure.ServiceGenerator;
import com.nongfenqi.controller.configure.UrlConstant;
import com.nongfenqi.library.tools.EventBusMessage;

import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Function
 *
 * @author jiezhi
 * @version 1.0, 09/10/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.0.0]
 */
public class RetCodeUtil {
    private static final String TAG = RetCodeUtil.class.getSimpleName();

    /**
     * 检查服务器返回的状态码，如果异常，则统一处理
     *
     * @param response
     * @throws Exception
     */
    public static void checkRetCode(String response) {
        JSONObject object;
        try {
            object = new JSONObject(response);
            int retCode = object.getInt("retCode");
            checkRetCode(retCode);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void checkRetCode(int retCode) {
        switch (retCode) {
            // 认证失败
            case UrlConstant.AUTH_FAILED:
                ServiceGenerator.cancelAllRequests();
                EventBus.getDefault().post(new EventBusMessage(EventBusMessage.BACK_TO_LOGIN));
                break;
            case UrlConstant.OTHER_DEVICE_LOGIN:
                ServiceGenerator.cancelAllRequests();
                EventBus.getDefault().post(new EventBusMessage(EventBusMessage.BACK_TO_LOGIN));
                break;
            default:
                break;
        }
    }
}
