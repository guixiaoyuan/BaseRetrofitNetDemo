package com.nongfenqi.controller.model.repayment;

import java.math.BigDecimal;

/**
 * Function
 *
 * @author jiezhi
 * @version 1.0, 13/12/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */
public class RepaymentScheduleDetailsModel {
    private static final String TAG = RepaymentScheduleDetailsModel.class.getSimpleName();

    /**
     * amount : 11000
     * interest : 1000
     * principal : 10000
     * remainingPrincipal : 5000
     * repaymentDate : 2016-08-23 10:40:12
     */

    private BigDecimal amount;
    private BigDecimal interest;
    private float principal;
    private BigDecimal remainingPrincipal;
    private String repaymentDate;
    private int repaymentType;

    public RepaymentScheduleDetailsModel() {
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public void setPrincipal(float principal) {
        this.principal = principal;
    }

    public void setRemainingPrincipal(BigDecimal remainingPrincipal) {
        this.remainingPrincipal = remainingPrincipal;
    }

    public void setRepaymentDate(String repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public float getPrincipal() {
        return principal;
    }

    public BigDecimal getRemainingPrincipal() {
        return remainingPrincipal;
    }

    public String getRepaymentDate() {
        return repaymentDate;
    }

    public int getRepaymentType() {
        return repaymentType;
    }

    public void setRepaymentType(int repaymentType) {
        this.repaymentType = repaymentType;
    }

    @Override
    public String toString() {
        return "RepaymentScheduleDetailsModel{" +
                "amount=" + amount +
                ", interest=" + interest +
                ", principal=" + principal +
                ", remainingPrincipal=" + remainingPrincipal +
                ", repaymentDate='" + repaymentDate + '\'' +
                '}';
    }
}
