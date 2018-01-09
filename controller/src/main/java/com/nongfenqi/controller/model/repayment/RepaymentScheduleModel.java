package com.nongfenqi.controller.model.repayment;

import java.util.List;

/**
 * Function
 * 生成还款计划预览 body
 *
 * @author jiezhi
 * @version 1.0, 13/12/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */
public class RepaymentScheduleModel {
    private static final String TAG = RepaymentScheduleModel.class.getSimpleName();
    /**
     * applyRepaymentScheduleDetails : [{"amount":11000,"interest":1000,"principal":10000,"remainingPrincipal":5000,"repaymentDate":"2016-08-23 10:40:12"}]
     * beginDate : 2016-08-23 10:40:12
     * grossAmount : 103000
     * grossInterest : 3000
     * grossPrincipal : 100000
     * periods : 3
     * type : {"id":0,"name":"string"}
     */

    private String beginDate;
    private int periods;
    private RepaymentTypeModel type;
    private List<RepaymentScheduleDetailsModel> applyRepaymentScheduleDetails;


    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public int getPeriods() {
        return periods;
    }

    public void setPeriods(int periods) {
        this.periods = periods;
    }

    public RepaymentTypeModel getType() {
        return type;
    }

    public void setType(RepaymentTypeModel type) {
        this.type = type;
    }

    public List<RepaymentScheduleDetailsModel> getApplyRepaymentScheduleDetails() {
        return applyRepaymentScheduleDetails;
    }

    public void setApplyRepaymentScheduleDetails(List<RepaymentScheduleDetailsModel> applyRepaymentScheduleDetails) {
        this.applyRepaymentScheduleDetails = applyRepaymentScheduleDetails;
    }

    @Override
    public String toString() {
        return "RepaymentScheduleModel{" +
                "beginDate='" + beginDate + '\'' +
                ", periods=" + periods +
                ", type=" + type +
                ", applyRepaymentScheduleDetails=" + applyRepaymentScheduleDetails +
                '}';
    }
}
