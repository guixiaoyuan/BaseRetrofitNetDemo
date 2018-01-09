package com.nongfenqi.controller.model.quest;

import com.nongfenqi.controller.model.business.ApplyPayeeTypeModel;

import java.io.Serializable;

/**
 * 申请用途－其他用途
 *
 * @author colin
 * @version 1.0, 16/12/6
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */

public class ApplyUseOtherModel extends AbstractUseModel implements Serializable {

    /**
     * accountType : {"id":0,"name":"string"}
     * applyAmount : 2000
     * description : 申请其他说明
     * downPayment : 1000
     * marginAmount : 0
     * marginState : false
     * otherExplain : 其他用途解释
     * price : 3000
     * useId : AU100003
     */

    private ApplyPayeeTypeModel accountType;
    private float applyAmount;
    private String description;
    private float downPayment;
    private float marginAmount;
    private boolean marginState;
    private String otherExplain;
    private float price;
    private String useId;

    private ApplyUseOtherModel(Builder builder) {
        setAccountType(builder.accountType);
        setApplyAmount(builder.applyAmount);
        setDescription(builder.description);
        setDownPayment(builder.downPayment);
        setMarginAmount(builder.marginAmount);
        setMarginState(builder.marginState);
        setOtherExplain(builder.otherExplain);
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

    public String getOtherExplain() {
        return otherExplain;
    }

    public void setOtherExplain(String otherExplain) {
        this.otherExplain = otherExplain;
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
        private String description;
        private float downPayment;
        private float marginAmount;
        private boolean marginState;
        private String otherExplain;
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

        public Builder withOtherExplain(String val) {
            otherExplain = val;
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

        public ApplyUseOtherModel build() {
            return new ApplyUseOtherModel(this);
        }
    }
}