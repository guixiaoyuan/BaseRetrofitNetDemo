package com.nongfenqi.controller.model;

/**
 *
 * 报表数据
 *
 * @author guixiaoyuan
 * @version 2.3, 2017/9/5
 * @since [sherlock/V2.3.0]
 */
public class BusinessStateModel {
    private static final String TAG = BusinessStateModel.class.getSimpleName();

    private String initNum;//等待提交
    private String riskRejectNum;//风控否决
    private String riskStopNum;//风控驳回

    public String getInitNum() {
        return initNum;
    }

    public void setInitNum(String initNum) {
        this.initNum = initNum;
    }

    public String getRiskRejectNum() {
        return riskRejectNum;
    }

    public void setRiskRejectNum(String riskRejectNum) {
        this.riskRejectNum = riskRejectNum;
    }

    public String getRiskStopNum() {
        return riskStopNum;
    }

    public void setRiskStopNum(String riskStopNum) {
        this.riskStopNum = riskStopNum;
    }
}
