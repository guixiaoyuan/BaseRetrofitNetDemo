package com.nongfenqi.controller.model.operate;

import java.util.List;

/**
 * Function
 *
 * @author jiezhi
 * @version 1.0, 15/11/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */
public class OperateHistoryCropModel {
    private static final String TAG = OperateHistoryCropModel.class.getSimpleName();

    /**
     * applyOperateHisCropContents : [{"area":20,"cost":500,"id":1,"output":2000,"price":1.1,"type":"大豆"}]
     * applyOperateHisCropLands : [{"area":100,"avgPrice":2500,"endTime":"2016-11-15 09:48:55","id":1,"payTime":"2016-11-15 09:48:55","payWay":0,"price":250000,"rentalHouse":"村委会","startTime":"2016-11-15 09:48:55"}]
     * beginDate : 2016-11-15 09:48:55
     * endDate : 2016-11-15 09:48:55
     * id : 1
     * manageType : {"id":0,"name":"string"}
     * operateHistoryId : 1
     * operateHistorySituationId : 1
     * state : false
     */
    private String beginDate;
    private String endDate;
    private int id;
    private ManageTypeEntity manageType;
    private int operateHistoryId;
    private int operateHistorySituationId;
    private boolean state;
    private List<ApplyOperateHisCropContentsEntity> applyOperateHisCropContents;
    private List<ApplyOperateHisCropLandsEntity> applyOperateHisCropLands;

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

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public List<ApplyOperateHisCropContentsEntity> getApplyOperateHisCropContents() {
        return applyOperateHisCropContents;
    }

    public void setApplyOperateHisCropContents(List<ApplyOperateHisCropContentsEntity> applyOperateHisCropContents) {
        this.applyOperateHisCropContents = applyOperateHisCropContents;
    }

    public List<ApplyOperateHisCropLandsEntity> getApplyOperateHisCropLands() {
        return applyOperateHisCropLands;
    }

    public void setApplyOperateHisCropLands(List<ApplyOperateHisCropLandsEntity> applyOperateHisCropLands) {
        this.applyOperateHisCropLands = applyOperateHisCropLands;
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

    public static class ApplyOperateHisCropContentsEntity {
        /**
         * area : 20
         * cost : 500
         * id : 1
         * output : 2000
         * price : 1.1
         * type : 大豆
         */

        private float area;
        private float cost;
        private int id;
        private float output;
        private float price;
        private String type;

        public float getArea() {
            return area;
        }

        public void setArea(float area) {
            this.area = area;
        }

        public float getCost() {
            return cost;
        }

        public void setCost(float cost) {
            this.cost = cost;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public float getOutput() {
            return output;
        }

        public void setOutput(float output) {
            this.output = output;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "ApplyOperateHisCropContentsEntity{" +
                    "area=" + area +
                    ", cost=" + cost +
                    ", id=" + id +
                    ", output=" + output +
                    ", price=" + price +
                    ", type='" + type + '\'' +
                    '}';
        }
    }

    public static class ApplyOperateHisCropLandsEntity {
        /**
         * area : 100
         * avgPrice : 2500
         * endTime : 2016-11-15 09:48:55
         * id : 1
         * payTime : 2016-11-15 09:48:55
         * payWay : 0
         * price : 250000
         * rentalHouse : 村委会
         * startTime : 2016-11-15 09:48:55
         */

        private float area;
        private float avgPrice;
        private String endTime;
        private int id;
        private String payTime;
        private int payWay;
        private float price;
        private String rentalHouse;
        private String startTime;

        public float getArea() {
            return area;
        }

        public void setArea(float area) {
            this.area = area;
        }

        public float getAvgPrice() {
            return avgPrice;
        }

        public void setAvgPrice(float avgPrice) {
            this.avgPrice = avgPrice;
        }

        public String getEndTime() {
            return endTime;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getPayTime() {
            return payTime;
        }

        public void setPayTime(String payTime) {
            this.payTime = payTime;
        }

        public int getPayWay() {
            return payWay;
        }

        public void setPayWay(int payWay) {
            this.payWay = payWay;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public String getRentalHouse() {
            return rentalHouse;
        }

        public void setRentalHouse(String rentalHouse) {
            this.rentalHouse = rentalHouse;
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        @Override
        public String toString() {
            return "ApplyOperateHisCropLandsEntity{" +
                    "area=" + area +
                    ", avgPrice=" + avgPrice +
                    ", endTime='" + endTime + '\'' +
                    ", id=" + id +
                    ", payTime='" + payTime + '\'' +
                    ", payWay=" + payWay +
                    ", price=" + price +
                    ", rentalHouse='" + rentalHouse + '\'' +
                    ", startTime='" + startTime + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "OperateHistoryCropModel{" +
                "beginDate='" + beginDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", id=" + id +
                ", manageType=" + manageType +
                ", operateHistoryId=" + operateHistoryId +
                ", operateHistorySituationId=" + operateHistorySituationId +
                ", state=" + state +
                ", applyOperateHisCropContents=" + applyOperateHisCropContents +
                ", applyOperateHisCropLands=" + applyOperateHisCropLands +
                '}';
    }
}
