package com.nongfenqi.controller.model.quest;

import com.nongfenqi.controller.model.business.ApplyPayeeTypeModel;

import java.io.Serializable;

import me.yokeyword.indexablerv.IndexableEntity;

/**
 * 申请用途－农机用途
 *
 * @author colin
 * @version 1.0, 16/12/6
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */

public class ApplyUseMachineModel extends AbstractUseModel implements Serializable, IndexableEntity{
    /**
     * accountType : {"id":0,"name":"string"}
     * applyAmount : 30000
     * brandId : XYZ
     * brandName : 雷沃
     * dealerId : JX1000
     * dealerName : 马鞍山农机经销商
     * description : 购买农机申请
     * downPayment : 20000
     * machineCode : M100000
     * machineName : 收割机-久保田-PRO-GH688Q
     * machineTypeId : XYZ
     * machineTypeName : 收割机
     * marginAmount : 0
     * marginState : false
     * price : 50000
     * useId : AU100001
     */
    private ApplyPayeeTypeModel accountType;
    private float applyAmount;
    private String brandId;
    private String brandName;
    private String dealerId;
    private String dealerName;
    private String description;
    private float downPayment;
    private String machineCode;
    private String machineName;
    private String machineTypeId;
    private String machineTypeName;
    private float marginAmount;
    private boolean marginState;
    private float price;
    private String useId;

    private ApplyUseMachineModel(Builder builder) {
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
        setPrice(builder.price);
        setUseId(builder.useId);
    }

    public ApplyPayeeTypeModel getAccountType() {
        return accountType;
    }

    public void setAccountType(ApplyPayeeTypeModel accountType) {
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

    @Override
    public String getFieldIndexBy() {
        return brandName;
    }

    @Override
    public void setFieldIndexBy(String indexField) {

    }

    @Override
    public void setFieldPinyinIndexBy(String pinyin) {

    }

    public static final class Builder {
        private ApplyPayeeTypeModel accountType;
        private float applyAmount;
        private String brandId;
        private String brandName;
        private String dealerId;
        private String dealerName;
        private String description;
        private float downPayment;
        private String machineCode;
        private String machineName;
        private String machineTypeId;
        private String machineTypeName;
        private float marginAmount;
        private boolean marginState;
        private float price;
        private String useId;

        public Builder() {
        }

        public Builder withAccountType(ApplyPayeeTypeModel val) {
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

        public Builder withPrice(float val) {
            price = val;
            return this;
        }

        public Builder withUseId(String val) {
            useId = val;
            return this;
        }

        public ApplyUseMachineModel build() {
            return new ApplyUseMachineModel(this);
        }
    }
}
