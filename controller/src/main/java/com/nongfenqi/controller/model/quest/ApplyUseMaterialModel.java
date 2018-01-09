package com.nongfenqi.controller.model.quest;

import com.nongfenqi.controller.model.business.ApplyPayeeTypeModel;

import java.io.Serializable;

/**
 * 申请用途－农资用途
 *
 * @author colin
 * @version 1.0, 16/12/6
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */

public class ApplyUseMaterialModel extends AbstractUseModel implements Serializable {
    /**
     * accountType : {"id":0,"name":"string"}
     * applyAmount : 800
     * dealerName : 马鞍山农机经销商
     * description : 购买农资申请
     * downPayment : 200
     * marginAmount : 0
     * marginState : false
     * materialsCode : 化肥农药
     * price : 1000
     * useId : AU100002
     */

    private ApplyPayeeTypeModel accountType;
    private float applyAmount;
    private String dealerName;
    private String description;
    private float downPayment;
    private float marginAmount;
    private boolean marginState;
    private String materialsCode;
    private float price;
    private String useId;
    private double tonnage;

    private ApplyUseMaterialModel(Builder builder) {
        setAccountType(builder.accountType);
        setApplyAmount(builder.applyAmount);
        setDealerName(builder.dealerName);
        setDescription(builder.description);
        setDownPayment(builder.downPayment);
        setMarginAmount(builder.marginAmount);
        setMarginState(builder.marginState);
        setMaterialsCode(builder.materialsCode);
        setPrice(builder.price);
        setUseId(builder.useId);
        setTonnage(builder.tonnage);
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

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }
    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
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

    public String getMaterialsCode() {
        return materialsCode;
    }

    public void setMaterialsCode(String materialsCode) {
        this.materialsCode = materialsCode;
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

    public static final class Builder {
        private ApplyPayeeTypeModel accountType;
        private float applyAmount;
        private String dealerName;
        private String description;
        private float downPayment;
        private float marginAmount;
        private boolean marginState;
        private String materialsCode;
        private float price;
        private String useId;
        private double tonnage;

        public Builder() {
        }

        public Builder withAccountType(ApplyPayeeTypeModel val) {
            accountType = val;
            return this;
        }

        public Builder withTonnage(double val){
            tonnage = val;
            return  this;
        }


        public Builder withApplyAmount(float val) {
            applyAmount = val;
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

        public Builder withMarginAmount(float val) {
            marginAmount = val;
            return this;
        }

        public Builder withMarginState(boolean val) {
            marginState = val;
            return this;
        }

        public Builder withMaterialsCode(String val) {
            materialsCode = val;
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

        public ApplyUseMaterialModel build() {
            return new ApplyUseMaterialModel(this);
        }
    }
}
