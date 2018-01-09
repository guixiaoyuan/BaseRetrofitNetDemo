package com.nongfenqi.controller.model.quest;

import com.nongfenqi.controller.model.common.StateModel;

/**
 *农活服务 模版
 *
 * @author guixiaoyuan
 * @version 2.2, 2017/10/19
 * @since [sherlock/V2.2.5]
 */
public class ApplyFarmWorkModel {

    private StateModel accountType;
    private float applyAmount;
    private int area;
    private String customerId;
    private String description;
    private float downPayment;
    private StateModel farmWorkType;
    private String growModel;
    private String growProductId;
    private float marginAmount;
    private boolean marginState;
    private StateModel operationType;//作业方式/耕种方式(1:人工 2:机械 3:深耕 4:浅耕) ,
    private StateModel payeeType;
    private float price;
    private String useId;
    private StateModel useType;

    public ApplyFarmWorkModel(Builder builder) {
        setAccountType(builder.accountType);
        setApplyAmount(builder.applyAmount);
        setArea(builder.area);
        setCustomerId(builder.customerId);
        setDescription(builder.description);
        setDownPayment(builder.downPayment);
        setFarmWorkType(builder.farmWorkType);
        setGrowModel(builder.growModel);
        setGrowProductId(builder.growProductId);
        setMarginAmount(builder.marginAmount);
        setMarginState(builder.marginState);
        setOperationType(builder.operationType);
        setPayeeType(builder.payeeType);
        setPrice(builder.price);
        setUseId(builder.useId);
        setUseType(builder.useType);

    }


    public StateModel getAccountType() {
        return accountType;
    }

    public void setAccountType(StateModel accountType) {
        this.accountType = accountType;
    }

    public float getApplyAmount() {
        return applyAmount;
    }

    public void setApplyAmount(float applyAmount) {
        this.applyAmount = applyAmount;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(float downPayment) {
        this.downPayment = downPayment;
    }

    public StateModel getFarmWorkType() {
        return farmWorkType;
    }

    public void setFarmWorkType(StateModel farmWorkType) {
        this.farmWorkType = farmWorkType;
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

    public float getMarginAmount() {
        return marginAmount;
    }

    public void setMarginAmount(float marginAmount) {
        this.marginAmount = marginAmount;
    }

    public boolean isMarginState() {
        return marginState;
    }

    public void setMarginState(boolean marginState) {
        this.marginState = marginState;
    }

    public StateModel getOperationType() {
        return operationType;
    }

    public void setOperationType(StateModel operationType) {
        this.operationType = operationType;
    }

    public StateModel getPayeeType() {
        return payeeType;
    }

    public void setPayeeType(StateModel payeeType) {
        this.payeeType = payeeType;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getUseId() {
        return useId;
    }

    public void setUseId(String useId) {
        this.useId = useId;
    }

    public StateModel getUseType() {
        return useType;
    }

    public void setUseType(StateModel useType) {
        this.useType = useType;
    }

    public static class Builder {
        private StateModel accountType;
        private float applyAmount;
        private int area;
        private String customerId;
        private String description;
        private float downPayment;
        private StateModel farmWorkType;
        private String growModel;
        private String growProductId;
        private float marginAmount;
        private boolean marginState;
        private StateModel operationType;//作业方式/耕种方式(1:人工 2:机械 3:深耕 4:浅耕) ,
        private StateModel payeeType;
        private float price;
        private String useId;
        private StateModel useType;

        public Builder withAccountType(StateModel val) {
            accountType = val;
            return this;
        }

        public Builder withApplyAmount(float val) {
            applyAmount = val;
            return this;
        }

        public Builder withArea(int val) {
            area = val;
            return this;
        }

        public Builder withCustomerId(String val) {
            customerId = val;
            return this;
        }

        public Builder withDescription(String val) {
            description = val;
            return this;
        }

        public Builder withDownPayment(float val) {
            downPayment = val;
            return this;
        }

        public Builder withFarmWorkType(StateModel val){
            farmWorkType = val;
            return this;
        }

        public Builder withGrowModel(String val){
            growModel = val;
            return this;
        }

        public Builder withGrowProductId(String val){
            growProductId = val;
            return this;
        }

        public Builder withMarginAmount(float val) {
            marginAmount = val;
            return this;
        }

        public Builder withMarginState(boolean val) {
            marginState = val;
            return this;
        }

        public Builder withOperationType(StateModel val){
            operationType = val;
            return this;
        }
        public Builder withPrice(float val) {
            price = val;
            return this;
        }

        public Builder withUseId(String val) {
            useId = val;
            return this;
        }

        public Builder withPayteeType(StateModel val) {
            payeeType = val;
            return this;
        }

        public Builder withUseType(StateModel val) {
            useType = val;
            return this;
        }

        public ApplyFarmWorkModel build() {
            return new ApplyFarmWorkModel(this);
        }
    }
}
