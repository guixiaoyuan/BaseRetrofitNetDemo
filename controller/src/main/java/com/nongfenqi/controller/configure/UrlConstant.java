package com.nongfenqi.controller.configure;

import static com.nongfenqi.controller.configure.UrlConstant.NetModel.ONLINE;
import static com.nongfenqi.controller.configure.UrlConstant.NetModel.TEST;

/**
 * @author jiezhi
 * @version 1.0, 13/03/2017
 * @since [Sherlock/V1.0.0]
 */
public class UrlConstant {
    private static final String TAG = UrlConstant.class.getSimpleName();

    public static String SERVER_API_BASE_URL = null;
    public static String SERVER_GALEN_BASE_URL = null;
    public static String SERVER_API_FILE = null;
    public static String SERVER_API_GROUP = null;
    public static String SERVER_API_PIC = null;
    public static String APP_UPDATE_URL = null;
    public static String WEB_VIEW_URL = null;

    public static String REPORT_API_URL = null;

    public static final int ERROR_NO = 0x00000000;
    //认证失败
    public static final int AUTH_FAILED = 0x01000002;

    //在其他设备登录
    public static final int OTHER_DEVICE_LOGIN = 67108866;

    public enum NetModel {
        ONLINE, TEST, DEV, ONLINE_TEST
    }

    private static NetModel appNet = ONLINE;

    static {
        setServerUrl();
    }

    public static NetModel getAppNet() {
        return appNet;
    }

    public static void setAppNet(NetModel appNet) {
        UrlConstant.appNet = appNet;
    }

    public static void setServerUrl() {
        switch (appNet) {
            case ONLINE:
                SERVER_API_BASE_URL = "https://apinrb.nongfenqi.net";
                WEB_VIEW_URL = "https://apinrb.nongfenqi.net";
                SERVER_GALEN_BASE_URL = "https://apigalen.nongfenqi.net";
                SERVER_API_FILE = "https://apifile.nongfenqi.net/file/";
                SERVER_API_GROUP = "https://apifile.nongfenqi.net/group/";
                SERVER_API_PIC = "https://apifile.nongfenqi.net/pic/";
                APP_UPDATE_URL = "https://appversion.nongfenqi.net/";
                REPORT_API_URL = "https://dataapi.nongfenqi.net/";
                break;
            case DEV:
                SERVER_API_BASE_URL = "http://nrb-api.dev.nongfenqi.com";
                WEB_VIEW_URL = "http://nrb-api.dev.nongfenqi.com";
                SERVER_GALEN_BASE_URL = "http://galen.dev.nongfenqi.com";
                SERVER_API_FILE = "http://file.dev.nongfenqi.com/file/";
                SERVER_API_GROUP = "http://file.dev.nongfenqi.com/group/";
                SERVER_API_PIC = "http://file.dev.nongfenqi.com/pic/";
                APP_UPDATE_URL = "http://app.dev.nongfenqi.com";
                REPORT_API_URL = "http://report-api.dev.nongfenqi.com/";
                break;
            case TEST:
                SERVER_API_BASE_URL = "http://nrb-api.test.nongfenqi.com";
                WEB_VIEW_URL = "http://nrb-webview.test.nongfenqi.com";
                SERVER_GALEN_BASE_URL = "http://galen.test.nongfenqi.com";
                SERVER_API_FILE = "http://file.test.nongfenqi.com/file/";
                SERVER_API_GROUP = "http://file.test.nongfenqi.com/group/";
                SERVER_API_PIC = "http://file.test.nongfenqi.com/pic/";
                APP_UPDATE_URL = "http://app.test.nongfenqi.com";
                REPORT_API_URL = "http://report-api.test.nongfenqi.com/";
                break;
            case ONLINE_TEST:
                //SERVER_API_BASE_URL = "http://nrb-api-test.nongfenqi.com.cn";
                SERVER_API_BASE_URL = "http://192.168.10.81:8083";
                SERVER_GALEN_BASE_URL = "http://galen-test.nongfenqi.com.cn";
                SERVER_API_FILE = "http://file-test.nongfenqi.com.cn/file/";
                SERVER_API_GROUP = "http://file-test.nongfenqi.com.cn/group/";
                SERVER_API_PIC = "http://file-test.nongfenqi.com.cn/pic/";
                APP_UPDATE_URL = "http://appversion.nongfenqi.net/";
                break;
            default:
                break;
        }
    }
}
