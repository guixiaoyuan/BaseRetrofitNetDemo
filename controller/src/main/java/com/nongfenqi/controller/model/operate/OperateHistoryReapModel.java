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
public class OperateHistoryReapModel {
    private static final String TAG = OperateHistoryReapModel.class.getSimpleName();

    /**
     * acreage : 200
     * applyOperateHisReapHarvesters : [{"brandId":"XYZ","brandName":"雷沃","buyingPrice":23.3,"customerMachineId":1,"depreciationPrice":18000,"id":1,"issuedTime":"2016-11-15 09:48:55","machineCode":"M100000","machineName":"收割机-久保田-PRO-GH688Q","machineTypeId":"XYZ","machineTypeName":"收割机","mileage":120.5,"registeredTime":"2016-11-15 09:48:55","workingTime":80}]
     * area : 华北区域
     * beginDate : 2016-11-15 09:48:55
     * cost : 3000
     * endDate : 2016-11-15 09:48:55
     * id : 1
     * manageType : {"id":0,"name":"string"}
     * operateHistoryId : 1
     * operateHistorySituationId : 1
     * price : 65
     * type : 小麦
     */

    private float acreage;
    private String area;
    private String beginDate;
    private float cost;
    private String endDate;
    private int id;
    private ManageTypeEntity manageType;
    private int operateHistoryId;
    private int operateHistorySituationId;
    private float price;
    private String type;
    private List<ApplyOperateHisReapHarvestersEntity> applyOperateHisReapHarvesters;

    public float getAcreage() {
        return acreage;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public void setAcreage(float acreage) {
        this.acreage = acreage;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
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


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<ApplyOperateHisReapHarvestersEntity> getApplyOperateHisReapHarvesters() {
        return applyOperateHisReapHarvesters;
    }

    public void setApplyOperateHisReapHarvesters(List<ApplyOperateHisReapHarvestersEntity> applyOperateHisReapHarvesters) {
        this.applyOperateHisReapHarvesters = applyOperateHisReapHarvesters;
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
    }

    public static class ApplyOperateHisReapHarvestersEntity {
        /**
         * brandId : XYZ
         * brandName : 雷沃
         * buyingPrice : 23.3
         * customerMachineId : 1
         * depreciationPrice : 18000
         * id : 1
         * issuedTime : 2016-11-15 09:48:55
         * machineCode : M100000
         * machineName : 收割机-久保田-PRO-GH688Q
         * machineTypeId : XYZ
         * machineTypeName : 收割机
         * mileage : 120.5
         * registeredTime : 2016-11-15 09:48:55
         * workingTime : 80
         */

        private String brandId;
        private String brandName;
        private double buyingPrice;
        private Integer customerMachineId;
        private int depreciationPrice;
        private int id;
        private String issuedTime;
        private String machineCode;
        private String machineName;
        private String machineTypeId;
        private String machineTypeName;
        private double mileage;
        private String registeredTime;
        private float workingTime;

        public String getBrandId() {
            return brandId;
        }

        public void setBrandId(String brandId) {
            this.brandId = brandId;
        }

        public String getBrandName() {
            return brandName;
        }

        public void setBrandName(String brandName) {
            this.brandName = brandName;
        }

        public double getBuyingPrice() {
            return buyingPrice;
        }

        public void setBuyingPrice(double buyingPrice) {
            this.buyingPrice = buyingPrice;
        }

        public int getCustomerMachineId() {
            return customerMachineId;
        }

        public void setCustomerMachineId(int customerMachineId) {
            this.customerMachineId = customerMachineId;
        }

        public int getDepreciationPrice() {
            return depreciationPrice;
        }

        public void setDepreciationPrice(int depreciationPrice) {
            this.depreciationPrice = depreciationPrice;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getIssuedTime() {
            return issuedTime;
        }

        public void setIssuedTime(String issuedTime) {
            this.issuedTime = issuedTime;
        }

        public String getMachineCode() {
            return machineCode;
        }

        public void setMachineCode(String machineCode) {
            this.machineCode = machineCode;
        }

        public String getMachineName() {
            return machineName;
        }

        public void setMachineName(String machineName) {
            this.machineName = machineName;
        }

        public String getMachineTypeId() {
            return machineTypeId;
        }

        public void setMachineTypeId(String machineTypeId) {
            this.machineTypeId = machineTypeId;
        }

        public String getMachineTypeName() {
            return machineTypeName;
        }

        public void setMachineTypeName(String machineTypeName) {
            this.machineTypeName = machineTypeName;
        }

        public double getMileage() {
            return mileage;
        }

        public void setMileage(double mileage) {
            this.mileage = mileage;
        }

        public String getRegisteredTime() {
            return registeredTime;
        }

        public void setRegisteredTime(String registeredTime) {
            this.registeredTime = registeredTime;
        }

        public float getWorkingTime() {
            return workingTime;
        }

        public void setWorkingTime(float workingTime) {
            this.workingTime = workingTime;
        }

        @Override
        public String toString() {
            return "ApplyOperateHisReapHarvestersEntity{" +
                    "brandId='" + brandId + '\'' +
                    ", brandName='" + brandName + '\'' +
                    ", buyingPrice=" + buyingPrice +
                    ", customerMachineId=" + customerMachineId +
                    ", depreciationPrice=" + depreciationPrice +
                    ", id=" + id +
                    ", issuedTime='" + issuedTime + '\'' +
                    ", machineCode='" + machineCode + '\'' +
                    ", machineName='" + machineName + '\'' +
                    ", machineTypeId='" + machineTypeId + '\'' +
                    ", machineTypeName='" + machineTypeName + '\'' +
                    ", mileage=" + mileage +
                    ", registeredTime='" + registeredTime + '\'' +
                    ", workingTime=" + workingTime +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "OperateHistoryReapModel{" +
                "acreage=" + acreage +
                ", area='" + area + '\'' +
                ", beginDate='" + beginDate + '\'' +
                ", cost=" + cost +
                ", endDate='" + endDate + '\'' +
                ", id=" + id +
                ", manageType=" + manageType +
                ", operateHistoryId=" + operateHistoryId +
                ", operateHistorySituationId=" + operateHistorySituationId +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", applyOperateHisReapHarvesters=" + applyOperateHisReapHarvesters +
                '}';
    }
}
