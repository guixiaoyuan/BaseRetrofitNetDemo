package com.nongfenqi.controller.model.repayment;

/**
 * Function
 *
 * @author Jiezhi
 * @version 1.0, 27/12/2016
 */
public class DownPaymentModel {
    private static final String TAG = DownPaymentModel.class.getSimpleName();


    /**
     * amount : 11000
     * currentPeriod : 3
     * grossAmount : 20000
     * id : 1
     * repaymentDate : 2016-12-27 10:29:14
     */

    private float amount;
    private int currentPeriod;
    private float grossAmount;
    private int id;
    private String repaymentDate;

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getCurrentPeriod() {
        return currentPeriod;
    }

    public void setCurrentPeriod(int currentPeriod) {
        this.currentPeriod = currentPeriod;
    }

    public float getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(float grossAmount) {
        this.grossAmount = grossAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRepaymentDate() {
        return repaymentDate;
    }

    public void setRepaymentDate(String repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    @Override
    public String toString() {
        return "DownPaymentModel{" +
                "amount=" + amount +
                ", currentPeriod=" + currentPeriod +
                ", grossAmount=" + grossAmount +
                ", id=" + id +
                ", repaymentDate='" + repaymentDate + '\'' +
                '}';
    }
}
