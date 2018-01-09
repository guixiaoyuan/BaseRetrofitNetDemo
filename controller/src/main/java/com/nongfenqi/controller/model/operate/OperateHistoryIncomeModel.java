package com.nongfenqi.controller.model.operate;

import java.io.Serializable;
import java.util.List;

/**
 * Function
 *
 * @author jiezhi
 * @version 1.0, 17/11/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */
public class OperateHistoryIncomeModel implements Serializable {
    private static final String TAG = OperateHistoryIncomeModel.class.getSimpleName();
    /**
     * beginDate : 2016-11-19 17:10:56
     * endDate : 2016-11-19 17:10:56
     * id : 0
     * manageType : {"id":0,"name":"string"}
     * operateHistoryId : 0
     * operateHistorySituationId : 0
     */

    private String beginDate;
    private String endDate;
    private int id;
    private ManageTypeEntity manageType;
    private int operateHistoryId;
    private int operateHistorySituationId;

    //        private String beginDate;
//        private String endDate;
//        private int id;
//        private OperateHistoryCropModel.ManageTypeEntity manageType;
//        private int operateHistoryId;
//        private int operateHistorySituationId;
    private boolean state;
    private List<OperateHistoryCropModel.ApplyOperateHisCropContentsEntity> applyOperateHisCropContents;
    private List<OperateHistoryCropModel.ApplyOperateHisCropLandsEntity> applyOperateHisCropLands;

    //        private String beginDate;
    private int cost;
    //        private String endDate;
//        private int id;
    private int income;
    //        private OperateHistoryCultivateModel.ManageTypeEntity manageType;
//        private int operateHistoryId;
//        private int operateHistorySituationId;
    private String scale;
    private String type;

    //        private String beginDate;
    private String content;
//        private int cost;
//        private String endDate;
//        private int id;
//        private int income;
//        private OperateHistoryOtherModel.ManageTypeEntity manageType;
//        private int operateHistoryId;
//        private int operateHistorySituationId;

    private int acreage;
    private String area;
    //        private String beginDate;
//        private int cost;
//        private String endDate;
//        private int id;
//        private OperateHistoryReapModel.ManageTypeEntity manageType;
//        private int operateHistoryId;
//        private int operateHistorySituationId;
    private float price;
    //        private String type;

    private String profession;

    private List<OperateHistoryReapModel.ApplyOperateHisReapHarvestersEntity> applyOperateHisReapHarvesters;


    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public List<OperateHistoryCropModel.ApplyOperateHisCropContentsEntity> getApplyOperateHisCropContents() {
        return applyOperateHisCropContents;
    }

    public void setApplyOperateHisCropContents(List<OperateHistoryCropModel.ApplyOperateHisCropContentsEntity> applyOperateHisCropContents) {
        this.applyOperateHisCropContents = applyOperateHisCropContents;
    }

    public List<OperateHistoryCropModel.ApplyOperateHisCropLandsEntity> getApplyOperateHisCropLands() {
        return applyOperateHisCropLands;
    }

    public void setApplyOperateHisCropLands(List<OperateHistoryCropModel.ApplyOperateHisCropLandsEntity> applyOperateHisCropLands) {
        this.applyOperateHisCropLands = applyOperateHisCropLands;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getAcreage() {
        return acreage;
    }

    public void setAcreage(int acreage) {
        this.acreage = acreage;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public List<OperateHistoryReapModel.ApplyOperateHisReapHarvestersEntity> getApplyOperateHisReapHarvesters() {
        return applyOperateHisReapHarvesters;
    }

    public void setApplyOperateHisReapHarvesters(List<OperateHistoryReapModel.ApplyOperateHisReapHarvestersEntity> applyOperateHisReapHarvesters) {
        this.applyOperateHisReapHarvesters = applyOperateHisReapHarvesters;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ManageTypeEntity getManageType() {
        return manageType;
    }

    public void setManageType(ManageTypeEntity manageType) {
        this.manageType = manageType;
    }

    public int getOperateHistoryId() {
        return operateHistoryId;
    }

    public void setOperateHistoryId(int operateHistoryId) {
        this.operateHistoryId = operateHistoryId;
    }

    public int getOperateHistorySituationId() {
        return operateHistorySituationId;
    }

    public void setOperateHistorySituationId(int operateHistorySituationId) {
        this.operateHistorySituationId = operateHistorySituationId;
    }

    public static class ManageTypeEntity {
        /**
         * id : 0
         * name : string
         */

        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "ManageTypeEntity{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "OperateHistoryIncomeModel{" +
                "beginDate='" + beginDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", id=" + id +
                ", manageType=" + manageType +
                ", operateHistoryId=" + operateHistoryId +
                ", operateHistorySituationId=" + operateHistorySituationId +
                ", state=" + state +
                ", applyOperateHisCropContents=" + applyOperateHisCropContents +
                ", applyOperateHisCropLands=" + applyOperateHisCropLands +
                ", cost=" + cost +
                ", income=" + income +
                ", scale='" + scale + '\'' +
                ", type='" + type + '\'' +
                ", content='" + content + '\'' +
                ", acreage=" + acreage +
                ", area='" + area + '\'' +
                ", price=" + price +
                ", profession='" + profession + '\'' +
                ", applyOperateHisReapHarvesters=" + applyOperateHisReapHarvesters +
                '}';
    }
}
