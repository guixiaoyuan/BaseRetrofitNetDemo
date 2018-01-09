package com.nongfenqi.controller.model.credit;

/**
 * Function
 *
 * @author jiezhi
 * @version 1.0, 16/11/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */
public class CreditLoanBalanceModel {
    private static final String TAG = CreditLoanBalanceModel.class.getSimpleName();


    /**
     * guaranteeBalance : 100000
     * loan : false
     */

    private float guaranteeBalance;
    private boolean loan;

    public float getGuaranteeBalance() {
        return guaranteeBalance;
    }

    public void setGuaranteeBalance(float guaranteeBalance) {
        this.guaranteeBalance = guaranteeBalance;
    }

    public boolean isIsLoan() {
        return loan;
    }

    public void setIsLoan(boolean isLoan) {
        this.loan = isLoan;
    }

    @Override
    public String toString() {
        return "CreditLoanBalanceModel{" +
                "guaranteeBalance=" + guaranteeBalance +
                ", loan=" + loan +
                '}';
    }
}
