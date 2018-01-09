package com.nongfenqi.controller.model.quest;

import com.nongfenqi.controller.model.common.StateModel;

/**
 * 农机 农补分期 模型
 *
 * @author guixiaoyuan
 * @version 2.2, 2017/10/19
 * @since [sherlock/V2.2.5]
 */
public class ApplyMachineModel {
    private StateModel accountType;
    private float applyAmount;
    private String brandId;
    private String brandName;
    private String customerId;
    private String dealerId;//经销商编号
    private String dealerName;
    private String description;
    private float downPayment;
    private String machineCode;
    private String machineName;
    private String machineTypeId;
    private String machineTypeName;
    private float marginAmount;//保证金额
    private boolean marginState;//是否有保证金 1 有 0 没有
    private StateModel payeeType;//收款方类型 0:本人收款; 16:委托个人; 17:委托农机经销商; 18:委托公司; 19:委托个体经商户; 20:委托厂家; 21: 委托合作社 ,
    private float price;
    private float subsidy;//补贴
    private String useId;
    private StateModel useType;

    public ApplyMachineModel(Builder builder) {
        setAccountType(builder.accountType);
        setApplyAmount(builder.applyAmount);
        setBrandId(builder.brandId);
        setBrandName(builder.brandName);
        setDealerId(builder.dealerId);
        setDealerName(builder.dealerName);
        setDescription(builder.description);
        setDownPayment(builder.downPayment);
        setMachineCode(builder.machineCode);
        setMachineName(builder.machineName);
        setMachineTypeId(builder.machineTypeId);
        setMachineTypeName(builder.machineTypeName);
        setMarginAmount(builder.marginAmount);
        setMarginState(builder.marginState);
        setPayeeType(builder.payeeType);
        setPrice(builder.price);
        setUseId(builder.useId);
        setUseType(builder.useType);
        setSubsidy(builder.subsidy);
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

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getDealerId() {
        return dealerId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
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

    public float getSubsidy() {
        return subsidy;
    }

    public void setSubsidy(float subsidy) {
        this.subsidy = subsidy;
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
        private String brandId;
        private String brandName;
        private String customerId;
        private String dealerId;//经销商编号
        private String dealerName;
        private String description;
        private float downPayment;
        private String machineCode;
        private String machineName;
        private String machineTypeId;
        private String machineTypeName;
        private float marginAmount;//保证金额
        private boolean marginState;//是否有保证金 1 有 0 没有
        private StateModel payeeType;//收款方类型 0:本人收款; 16:委托个人; 17:委托农机经销商; 18:委托公司; 19:委托个体经商户; 20:委托厂家; 21: 委托合作社 ,
        private float price;
        private float subsidy;//补贴
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

        public Builder withBrandId(String val) {
            brandId = val;
            return this;
        }

        public Builder withBrandName(String val) {
            brandName = val;
            return this;
        }

        public Builder withDealerId(String val) {
            dealerId = val;
            return this;
        }

        public Builder withDealerName(String val) {
            dealerName = val;
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

        public Builder withMachineCode(String val) {
            machineCode = val;
            return this;
        }

        public Builder withMachineName(String val) {
            machineName = val;
            return this;
        }

        public Builder withMachineTypeId(String val) {
            machineTypeId = val;
            return this;
        }

        public Builder withMachineTypeName(String val) {
            machineTypeName = val;
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

        public Builder withPayeeType(StateModel val) {
            payeeType = val;
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

        public Builder withUseType(StateModel val) {
            useType = val;
            return this;
        }

        public Builder withSubsidy(float val) {
            subsidy = val;
            return this;
        }

        public ApplyMachineModel build() {
            return new ApplyMachineModel(this);
        }

    }
}
