package com.nongfenqi.controller.model.repayment;

import java.math.BigDecimal;
import java.util.List;

/**
 * Function
 *
 * @author jiezhi
 * @version 1.0, 13/12/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */
public class RepaymentScheduleResultModel {
    private static final String TAG = RepaymentScheduleResultModel.class.getSimpleName();

    /**
     * applyRepaymentScheduleDetails : [{"amount":11000,"interest":1000,"principal":10000,"remainingPrincipal":5000,"repaymentDate":"2016-08-23 10:40:12"}]
     * beginDate : 2016-08-23 10:40:12
     * downPaymentState 首付状态（0 未拆，1 已拆）
     * grossAmount : 103000
     * grossInterest : 3000
     * grossPrincipal : 100000
     * periods : 3
     * type : {"id":0,"name":"string"}
     */

    private String beginDate;
    private int downPaymentState;
    private BigDecimal grossAmount;
    private BigDecimal grossInterest;
    private BigDecimal grossPrincipal;
    private int periods;
    private RepaymentTypeModel type;
    private List<RepaymentScheduleDetailsModel> applyRepaymentScheduleDetails;

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public void setGrossAmount(BigDecimal grossAmount) {
        this.grossAmount = grossAmount;
    }

    public void setGrossInterest(BigDecimal grossInterest) {
        this.grossInterest = grossInterest;
    }

    public void setGrossPrincipal(BigDecimal grossPrincipal) {
        this.grossPrincipal = grossPrincipal;
    }

    public int getDownPaymentState() {
        return downPaymentState;
    }

    public void setDownPaymentState(int downPaymentState) {
        this.downPaymentState = downPaymentState;
    }

    public void setPeriods(int periods) {
        this.periods = periods;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public BigDecimal getGrossAmount() {
        return grossAmount;
    }

    public BigDecimal getGrossInterest() {
        return grossInterest;
    }

    public BigDecimal getGrossPrincipal() {
        return grossPrincipal;
    }

    public int getPeriods() {
        return periods;
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
}
