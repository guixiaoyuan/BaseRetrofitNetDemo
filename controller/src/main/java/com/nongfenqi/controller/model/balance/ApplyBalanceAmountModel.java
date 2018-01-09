package com.nongfenqi.controller.model.balance;

/**
 * Function
 * 查询资产/负债的总金额
 *
 * @author jiezhi
 * @version 1.0, 13/02/2017
 * @see [相关类/方法]
 * @since [农人帮/V1.1.2]
 */
public class ApplyBalanceAmountModel {
    private static final String TAG = ApplyBalanceAmountModel.class.getSimpleName();


    /**
     * grossAssetAmount : 0
     * grossBalanceAmount : 0
     */
    private double grossAssetAmount;
    private double grossBalanceAmount;

    public double getGrossAssetAmount() {
        return grossAssetAmount;
    }

    public void setGrossAssetAmount(double grossAssetAmount) {
        this.grossAssetAmount = grossAssetAmount;
    }

    public double getGrossBalanceAmount() {
        return grossBalanceAmount;
    }

    public void setGrossBalanceAmount(double grossBalanceAmount) {
        this.grossBalanceAmount = grossBalanceAmount;
    }
}
