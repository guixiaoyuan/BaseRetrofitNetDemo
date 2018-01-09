package com.nongfenqi.controller.model;

/**
 * EventBus
 *
 * @author luzhichao
 * @version 1.0, 17/4/25
 * @since [sherlock/V1.0.0]
 */

public class Bus {
    private static final String TAG = Bus.class.getSimpleName();
    private String busResMsg;
    private Integer busResCode;
    private int type;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    private Object data;

    public String getBusResMsg() {
        return busResMsg;
    }

    public void setBusResMsg(String busResMsg) {
        this.busResMsg = busResMsg;
    }

    public Integer getBusResCode() {
        return busResCode;
    }

    public void setBusResCode(Integer busResCode) {
        this.busResCode = busResCode;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public static final int DELETE_SURVEY_SUCCESS = 100;
    public static final int EDIT_SURVEY_SUCCESS = 101;
}
