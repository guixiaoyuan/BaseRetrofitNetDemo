package com.nongfenqi.controller.model.balance;

/**
 * Function
 *
 * @author guixy
 * @version 1.0, 02/05/2017
 * @since [sherlock/V1.0.0]
 */
public class ApplyNavBalanceModel {
    private static final String TAG = ApplyNavBalanceModel.class.getSimpleName();

    /**
     * "currentAsset": 150000,流动资产(现金 + 银行存款 + 应收账款 + 预收款项 + 存货) ,
     * "currentLiability": 80000,流动负债(应付账款 + 预收款项 + 短期贷款) ,
     * "inventoryAsset": 5000,资产存货 ,
     * "nonCurrentAsset": 300000,非流动资产(待摊租金 + 经营性固定资产(农机 + 库房厂房 + 其他)) ,
     * "otherLiability": 20000,其他负债
     */
    private float currentAsset;
    private float currentLiability;
    private float inventoryAsset;
    private float nonCurrentAsset;
    private float otherLiability;

    public ApplyNavBalanceModel(Builder builder) {
        setCurrentAsset(builder.currentAsset);
        setCurrentLiability(builder.currentLiability);
        setInventoryAsset(builder.inventoryAsset);
        setNonCurrentAsset(builder.nonCurrentAsset);
        setOtherLiability(builder.otherLiability);
    }

    public float getCurrentAsset() {
        return currentAsset;
    }

    public void setCurrentAsset(float currentAsset) {
        this.currentAsset = currentAsset;
    }

    public float getCurrentLiability() {
        return currentLiability;
    }

    public void setCurrentLiability(float currentLiability) {
        this.currentLiability = currentLiability;
    }

    public float getInventoryAsset() {
        return inventoryAsset;
    }

    public void setInventoryAsset(float inventoryAsset) {
        this.inventoryAsset = inventoryAsset;
    }

    public float getNonCurrentAsset() {
        return nonCurrentAsset;
    }

    public void setNonCurrentAsset(float nonCurrentAsset) {
        this.nonCurrentAsset = nonCurrentAsset;
    }

    public float getOtherLiability() {
        return otherLiability;
    }

    public void setOtherLiability(float otherLiability) {
        this.otherLiability = otherLiability;
    }

    public final static class Builder {
        public float currentAsset;
        public float currentLiability;
        public float inventoryAsset;
        public float nonCurrentAsset;
        public float otherLiability;

        public Builder withCurrentAsset(float val) {
            currentAsset = val;
            return this;
        }

        public Builder withCurrentLiability(float val) {
            currentLiability = val;
            return this;
        }

        public Builder withInventoryAsset(float val) {
            inventoryAsset = val;
            return this;
        }

        public Builder withNonCurrentAsset(float val) {
            nonCurrentAsset = val;
            return this;
        }

        public Builder withOtherLiability(float val) {
            otherLiability = val;
            return this;
        }

        public ApplyNavBalanceModel Builder() {
            return new ApplyNavBalanceModel(this);
        }

    }

}
