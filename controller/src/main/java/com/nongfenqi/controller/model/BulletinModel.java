package com.nongfenqi.controller.model;

/**
 * 简报数据
 *
 * @author guixiaoyuan
 * @version 2.3, 2017/9/6
 * @since [sherlock/V2.3.2]
 */
public class BulletinModel {
    private static final String TAG = BulletinModel.class.getSimpleName();

    private String createNum;
    private String rejectNum;
    private String name;
    private String id;
    private String acceptNum;
    private String stopNum;
    private String repeatNum;

    public String getCreateNum() {
        return createNum;
    }

    public void setCreateNum(String createNum) {
        this.createNum = createNum;
    }

    public String getRejectNum() {
        return rejectNum;
    }

    public void setRejectNum(String rejectNum) {
        this.rejectNum = rejectNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAcceptNum() {
        return acceptNum;
    }

    public void setAcceptNum(String acceptNum) {
        this.acceptNum = acceptNum;
    }

    public String getStopNum() {
        return stopNum;
    }

    public void setStopNum(String stopNum) {
        this.stopNum = stopNum;
    }

    public String getRepeatNum() {
        return repeatNum;
    }

    public void setRepeatNum(String repeatNum) {
        this.repeatNum = repeatNum;
    }
}
