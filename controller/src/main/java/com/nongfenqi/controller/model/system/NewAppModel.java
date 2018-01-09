package com.nongfenqi.controller.model.system;

/**
 * Function
 * app版本信息查询
 *
 * @author jiezhi
 * @version 1.0, 07/12/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */
public class NewAppModel {
    private static final String TAG = NewAppModel.class.getSimpleName();
    /**
     * addTime : 2016-12-07 09:59:46
     * appName : string
     * appUrl : string
     * forceUpdate : false
     * id : 0
     * version : string
     */

    private String addTime;
    private String appName;
    private String appUrl;
    private boolean forceUpdate;
    private int id;
    private String changeLog;
    private String version;


    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppUrl() {
        return appUrl;
    }

    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl;
    }

    public boolean isForceUpdate() {
        return forceUpdate;
    }

    public String getChangeLog() {
        return changeLog;
    }

    public void setChangeLog(String changeLog) {
        this.changeLog = changeLog;
    }

    public void setForceUpdate(boolean forceUpdate) {
        this.forceUpdate = forceUpdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "NewAppModel{" +
                "addTime='" + addTime + '\'' +
                ", appName='" + appName + '\'' +
                ", appUrl='" + appUrl + '\'' +
                ", forceUpdate=" + forceUpdate +
                ", id=" + id +
                ", version='" + version + '\'' +
                '}';
    }
}
