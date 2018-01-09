package com.nongfenqi.controller.model.balance;

import java.io.Serializable;

/**
 * Function
 *
 * @author jiezhi
 * @version 1.0, 13/02/2017
 * @see [相关类/方法]
 * @since [农人帮/V1.1.2]
 */
public class ApplyAssetFixMachineModel implements Serializable {
    private static final String TAG = ApplyAssetFixMachineModel.class.getSimpleName();

    private float buyingPrice;
    private float depreciationPrice;
    private Integer customerMachineId;
    private int id;
    private String issuedTime;
    private String machineCode;
    private String machineName;
    private float mileage;
    private String picGroupId;
    private String registeredTime;
    private float workingTime;

    public ApplyAssetFixMachineModel() {
    }

    private ApplyAssetFixMachineModel(ApplyAssetFixMachineModel.Builder builder) {
        setMachineName(builder.brandName);
        setBuyingPrice(builder.buyingPrice);
        setDepreciationPrice(builder.depreciationPrice);
        setMileage(builder.mileage);
        setWorkingTime(builder.workingTime);
        setRegisteredTime(builder.registeredTime);
        setIssuedTime(builder.issuedTime);
        setId(builder.id);
        setMachineCode(builder.machineCode);
    }

    public float getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(float buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public float getDepreciationPrice() {
        return depreciationPrice;
    }

    public void setDepreciationPrice(float depreciationPrice) {
        this.depreciationPrice = depreciationPrice;
    }

    public Integer getCustomerMachineId() {
        return customerMachineId;
    }

    public void setCustomerMachineId(Integer customerMachineId) {
        this.customerMachineId = customerMachineId;
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

    public float getMileage() {
        return mileage;
    }

    public void setMileage(float mileage) {
        this.mileage = mileage;
    }

    public String getPicGroupId() {
        return picGroupId;
    }

    public void setPicGroupId(String picGroupId) {
        this.picGroupId = picGroupId;
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

    public static final class Builder {
        private String brandName;//农机类型，名称
        private float buyingPrice;//购买价格
        private float depreciationPrice;//折旧后价格
        private float mileage;//里程
        private float workingTime;//工作时间
        private String registeredTime;//登记时间
        private String issuedTime;//发证时间
        private int id;//id
        private String machineCode;

        public Builder() {
        }

        public Builder withCustomerMachineId(String val) {
            this.machineCode = val;
            return this;
        }

        public Builder withBrandName(String val) {
            this.brandName = val;
            return this;
        }

        public Builder withBuyingPrice(float val) {
            this.buyingPrice = val;
            return this;
        }

        public Builder withDepreciationPrice(float val) {
            this.depreciationPrice = val;
            return this;
        }

        public Builder withMileage(float val) {
            this.mileage = val;
            return this;
        }

        public Builder withWorkTime(float val) {
            this.workingTime = val;
            return this;
        }

        public Builder withRegisterTime(String val) {
            this.registeredTime = val;
            return this;
        }

        public Builder withIssuedTime(String val) {
            this.issuedTime = val;
            return this;
        }

        public Builder withId(int val) {
            this.id = val;
            return this;
        }

        public ApplyAssetFixMachineModel build() {
            return new ApplyAssetFixMachineModel(this);
        }
    }
}
