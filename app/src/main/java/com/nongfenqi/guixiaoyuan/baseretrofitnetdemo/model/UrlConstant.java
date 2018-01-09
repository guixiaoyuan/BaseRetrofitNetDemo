package com.nongfenqi.guixiaoyuan.baseretrofitnetdemo.model;

/**
 * 定制自己的URL地址
 *
 * @author guixiaoyuan
 * @version 1.0, 2017/12/29
 * @since [BaseRetrofitNetDemo/V1.0]
 */
public class UrlConstant {
    private static final String TAG = UrlConstant.class.getSimpleName();

    public static final int ERROR_NO = 0x00000000;
    /**
     * 基础的URL地址，定制化
     */
    public static String SERVER_API_BASE_URL = "https://apinrb.nongfenqi.net" ;

    public static String SERVER_API_PIC = "https://apifile.nongfenqi.net/pic/";

}
