package com.nongfenqi.controller.model.operate;

import java.io.Serializable;

/**
 * 经营预估基本信息
 *
 * @author luzhichao
 * @version 2.1, 2017/8/18
 * @since [sherlock/V2.1.2]
 */

public class OperateEstimateBaseInfo implements Serializable {

    /**
     * contractLandRent : 0
     * contractTotalArea : 0
     * id : 0
     * maxEstimateAmount : 0
     * minEstimateAmount : 0
     * purchaseArea : 0
     */

    private float contractLandRent;
    private int contractTotalArea;
    private int id;
    private int maxEstimateAmount;
    private int minEstimateAmount;
    private int purchaseArea;

    public float getContractLandRent() {
        return contractLandRent;
    }

    public void setContractLandRent(float contractLandRent) {
        this.contractLandRent = contractLandRent;
    }

    public int getContractTotalArea() {
        return contractTotalArea;
    }

    public void setContractTotalArea(int contractTotalArea) {
        this.contractTotalArea = contractTotalArea;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaxEstimateAmount() {
        return maxEstimateAmount;
    }

    public void setMaxEstimateAmount(int maxEstimateAmount) {
        this.maxEstimateAmount = maxEstimateAmount;
    }

    public int getMinEstimateAmount() {
        return minEstimateAmount;
    }

    public void setMinEstimateAmount(int minEstimateAmount) {
        this.minEstimateAmount = minEstimateAmount;
    }

    public int getPurchaseArea() {
        return purchaseArea;
    }

    public void setPurchaseArea(int purchaseArea) {
        this.purchaseArea = purchaseArea;
    }
}
