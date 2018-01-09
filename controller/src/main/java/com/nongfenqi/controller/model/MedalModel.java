package com.nongfenqi.controller.model;

/**
 * 勋章模型
 *
 * @author guixy
 * @version 2.2, 16/04/17
 * @see [相关类/方法]
 * @since [蜂盾/V2.2.0]
 */

public class MedalModel {

    private String finishTime;
    private int id;
    private int medalId;
    private int medalAmount;
    private String medalRemark;
    private String medalName;
    private String picFileId;
    private String addTime;
    private String publishTime;
    private String startTime;

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

    public int getMedalAmount() {
        return medalAmount;
    }

    public void setMedalAmount(int medalAmount) {
        this.medalAmount = medalAmount;
    }

    public String getMedalRemark() {
        return medalRemark;
    }

    public void setMedalRemark(String medalRemark) {
        this.medalRemark = medalRemark;
    }

    public void setMedalName(String medalName) {
        this.medalName = medalName;
    }

    public String getMedalName() {
        return medalName;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public void setMedalId(int medalId) {
        this.medalId = medalId;
    }

    public int getMedalId() {
        return medalId;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setPicFileId(String picFileId) {
        this.picFileId = picFileId;
    }

    public String getPicFileId() {
        return picFileId;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "MedalModel{" +
                "finishTime='" + finishTime + '\'' +
                ", id=" + id +
                ", medalId=" + medalId +
                ", medalAmount=" + medalAmount +
                ", medalRemark='" + medalRemark + '\'' +
                ", medalName='" + medalName + '\'' +
                ", picGroupId='" + picFileId + '\'' +
                ", addTime='" + addTime + '\'' +
                ", publishTime='" + publishTime + '\'' +
                ", startTime='" + startTime + '\'' +
                '}';
    }
}
