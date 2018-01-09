package com.nongfenqi.controller.model.operate;

import java.io.Serializable;
import java.util.List;

/**
 * 经营预估信息
 *
 * @author luzhichao
 * @version 2.1, 2017/8/11
 * @since [sherlock/V2.1.2]
 */

public class OperateEstimateInfoModel implements Serializable {

    /**
     * applyOperateGrowInfos : [{"growArea":0,"growSeason":{"id":0,"name":"string"},"growType":"string","id":0}]
     * contractLandRent : 0
     * contractTotalArea : 0
     * id : 0
     * maxEstimateAmount : 0
     * minEstimateAmount : 0
     * purchaseArea : 0
     */

    private float contractLandRent;//承包土地租金
    private int contractTotalArea;//承包总亩数
    private int id;
    private float maxEstimateAmount;
    private float minEstimateAmount;
    private int purchaseArea;//代购种植规模
    private List<OperateEstimatePlantModel> applyOperateGrows;

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

    public float getMaxEstimateAmount() {
        return maxEstimateAmount;
    }

    public void setMaxEstimateAmount(float maxEstimateAmount) {
        this.maxEstimateAmount = maxEstimateAmount;
    }

    public float getMinEstimateAmount() {
        return minEstimateAmount;
    }

    public void setMinEstimateAmount(float minEstimateAmount) {
        this.minEstimateAmount = minEstimateAmount;
    }

    public int getPurchaseArea() {
        return purchaseArea;
    }

    public void setPurchaseArea(int purchaseArea) {
        this.purchaseArea = purchaseArea;
    }

    public List<OperateEstimatePlantModel> getApplyOperateGrowInfos() {
        return applyOperateGrows;
    }

    public void setApplyOperateGrowInfos(List<OperateEstimatePlantModel> applyOperateGrowInfos) {
        this.applyOperateGrows = applyOperateGrowInfos;
    }
}
