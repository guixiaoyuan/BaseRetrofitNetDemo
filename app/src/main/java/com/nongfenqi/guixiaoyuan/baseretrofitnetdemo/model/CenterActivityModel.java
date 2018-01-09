package com.nongfenqi.guixiaoyuan.baseretrofitnetdemo.model;


import java.io.Serializable;

/**
 * 活动中心模型
 *
 * @author guixiaoyuan
 * @version 1.0, 2017/12/29
 * @since [BaseRetrofitNetDemo/V1.0]
 */
public class CenterActivityModel implements Serializable {

    private static final String TAG = CenterActivityModel.class.getSimpleName();

    private String activityName;
    private String activityUrl;
    private String startTime;
    private String finishTime;
    private int id;
    private String picFileId;
    /**
     * 活动状态,0:未开始,1:已结束,2:进行中
     */
    private int state;
    /**
     * 类型，1，广告；2，活动
     */
    private int type;
    private String remark;

    public static String getTAG() {
        return TAG;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getActivityUrl() {
        return activityUrl;
    }

    public void setActivityUrl(String activityUrl) {
        this.activityUrl = activityUrl;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPicFileId(String picFileId) {
        this.picFileId = picFileId;
    }

    public String getPicFileId() {
        return picFileId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
