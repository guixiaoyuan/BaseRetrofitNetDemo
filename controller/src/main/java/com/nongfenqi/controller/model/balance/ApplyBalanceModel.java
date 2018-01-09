package com.nongfenqi.controller.model.balance;

/**
 * Function
 * 资产负债
 *
 * @author jiezhi
 * @version 1.0, 13/02/2017
 * @see [相关类/方法]
 * @since [农人帮/V1.1.2]
 */
public class ApplyBalanceModel {
    private static final String TAG = ApplyBalanceModel.class.getSimpleName();

    /**
     * buildTime : 2017-02-13 13:36:37
     * id : 1
     * remark : 写写备注
     */
    private String buildTime;
    private int id;
    private String remark;

    public String getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(String buildTime) {
        this.buildTime = buildTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
