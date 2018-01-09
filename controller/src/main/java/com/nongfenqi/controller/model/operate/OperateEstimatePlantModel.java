package com.nongfenqi.controller.model.operate;

import com.nongfenqi.controller.model.common.StateModel;

import java.io.Serializable;
import java.util.List;

/**
 * 经营预估种植信息
 *
 * @author luzhichao
 * @version 2.1, 2017/8/17
 * @since [sherlock/V2.1.2]
 */

public class OperateEstimatePlantModel implements Serializable {


    /**
     * areaName : string
     * growArea : 0
     * growModel : string
     * growProductId : string
     * growSeason : {"id":0,"name":"string"}
     * growYear : 0
     * id : 0
     * maxAcreYield : 0
     * maxPrice : 0
     * minAcreYield : 0
     * minPrice : 0
     * operateEstimateCosts : [{"costType":{"id":0,"name":"string"},"maxCost":0,"minCost":0}]
     * ruleId:0
     */

    private String areaName;
    private int growArea;
    private String growModel;
    private String growProductId;
    private StateModel growSeason;
    private int growYear;
    private int id;
    private int maxAcreYield;
    private float maxPrice;
    private int minAcreYield;
    private float minPrice;
    private List<OperateEstimateCostsEntity> operateEstimateCosts;
    private String ruleId;


    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public String getRuleId() {
        return ruleId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public int getGrowArea() {
        return growArea;
    }

    public void setGrowArea(int growArea) {
        this.growArea = growArea;
    }

    public String getGrowModel() {
        return growModel;
    }

    public void setGrowModel(String growModel) {
        this.growModel = growModel;
    }

    public String getGrowProductId() {
        return growProductId;
    }

    public void setGrowProductId(String growProductId) {
        this.growProductId = growProductId;
    }

    public StateModel getGrowSeason() {
        return growSeason;
    }

    public void setGrowSeason(StateModel growSeason) {
        this.growSeason = growSeason;
    }

    public int getGrowYear() {
        return growYear;
    }

    public void setGrowYear(int growYear) {
        this.growYear = growYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaxAcreYield() {
        return maxAcreYield;
    }

    public void setMaxAcreYield(int maxAcreYield) {
        this.maxAcreYield = maxAcreYield;
    }

    public float getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(float maxPrice) {
        this.maxPrice = maxPrice;
    }

    public int getMinAcreYield() {
        return minAcreYield;
    }

    public void setMinAcreYield(int minAcreYield) {
        this.minAcreYield = minAcreYield;
    }

    public float getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(float minPrice) {
        this.minPrice = minPrice;
    }

    public List<OperateEstimateCostsEntity> getOperateEstimateCosts() {
        return operateEstimateCosts;
    }

    public void setOperateEstimateCosts(List<OperateEstimateCostsEntity> operateEstimateCosts) {
        this.operateEstimateCosts = operateEstimateCosts;
    }

    public static class OperateEstimateCostsEntity implements Serializable {
        /**
         * costType : {"id":0,"name":"string"}
         * maxCost : 0
         * minCost : 0
         */

        private StateModel costType;
        private float maxCost;
        private float minCost;

        public StateModel getCostType() {
            return costType;
        }

        public void setCostType(StateModel costType) {
            this.costType = costType;
        }

        public float getMaxCost() {
            return maxCost;
        }

        public void setMaxCost(float maxCost) {
            this.maxCost = maxCost;
        }

        public float getMinCost() {
            return minCost;
        }

        public void setMinCost(float minCost) {
            this.minCost = minCost;
        }

    }
}
