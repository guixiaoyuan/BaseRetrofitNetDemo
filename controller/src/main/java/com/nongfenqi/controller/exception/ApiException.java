package com.nongfenqi.controller.exception;

/**
 * Function
 *
 * @author jiezhi
 * @version 1.0, 20/10/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.0.0]
 */
public class ApiException extends RuntimeException {
    private static final String TAG = ApiException.class.getSimpleName();

    public ApiException(String retMsg) {
        super(retMsg);
    }
}
