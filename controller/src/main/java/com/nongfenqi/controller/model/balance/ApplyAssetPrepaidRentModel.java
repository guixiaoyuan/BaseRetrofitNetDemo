package com.nongfenqi.controller.model.balance;

import java.io.Serializable;

/**
 * Function
 *
 * @author jiezhi
 * @version 1.0, 15/02/2017
 * @see [相关类/方法]
 * @since [农人帮/V1.1.2]
 */
public class ApplyAssetPrepaidRentModel implements Serializable {
    private static final String TAG = ApplyAssetPrepaidRentModel.class.getSimpleName();

    /**
     * amount : 23000
     * beginDate : 2017-02-15 09:38:22
     * endDate : 2017-02-15 09:38:22
     * id : 1
     * payTime : 2017-02-15 09:38:22
     * picGroupId : 0123
     * prepaidRent : 2000
     */
    private float amount;
    private String beginDate;
    private String endDate;

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    private String formula;
    private int id;
    private String payTime;
    private String picGroupId;
    private float prepaidRent;

    private ApplyAssetPrepaidRentModel(Builder builder) {
        setAmount(builder.amount);
        setBeginDate(builder.beginDate);
        setEndDate(builder.endDate);
        setFormula(builder.formula);
        setId(builder.id);
        setPayTime(builder.payTime);
        setPicGroupId(builder.picGroupId);
        setPrepaidRent(builder.prepaidRent);
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
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

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getPicGroupId() {
        return picGroupId;
    }

    public void setPicGroupId(String picGroupId) {
        this.picGroupId = picGroupId;
    }

    public float getPrepaidRent() {
        return prepaidRent;
    }

    public void setPrepaidRent(float prepaidRent) {
        this.prepaidRent = prepaidRent;
    }

    public static final class Builder {
        private float amount;
        private String beginDate;
        private String endDate;
        private String formula;
        private int id;
        private String payTime;
        private String picGroupId;
        private float prepaidRent;

        public Builder() {
        }

        public Builder withAmount(float val) {
            amount = val;
            return this;
        }

        public Builder withBeginDate(String val) {
            beginDate = val;
            return this;
        }

        public Builder withEndDate(String val) {
            endDate = val;
            return this;
        }

        public Builder withFormula(String val) {
            formula = val;
            return this;
        }

        public Builder withId(int val) {
            id = val;
            return this;
        }

        public Builder withPayTime(String val) {
            payTime = val;
            return this;
        }

        public Builder withPicGroupId(String val) {
            picGroupId = val;
            return this;
        }

        public Builder withPrepaidRent(float val) {
            prepaidRent = val;
            return this;
        }

        public ApplyAssetPrepaidRentModel build() {
            return new ApplyAssetPrepaidRentModel(this);
        }
    }

    @Override
    public String toString() {
        return "ApplyAssetPrepaidRentModel{" +
                "amount=" + amount +
                ", beginDate='" + beginDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", formula='" + formula + '\'' +
                ", id=" + id +
                ", payTime='" + payTime + '\'' +
                ", picGroupId='" + picGroupId + '\'' +
                ", prepaidRent=" + prepaidRent +
                '}';
    }
}
