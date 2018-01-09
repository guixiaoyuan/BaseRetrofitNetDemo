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
public class ApplyAssetFixEstateModel implements Serializable {
    private static final String TAG = ApplyAssetFixEstateModel.class.getSimpleName();
    private String buildDate;
    private float cost;
    private float depreciationPrice;
    private int id;
    private String picGroupId;

    public ApplyAssetFixEstateModel(Builder builder) {
        setBuildDate(builder.buildDate);
        setCost(builder.cost);
        setDepreciationPrice(builder.depreciationPrice);
    }

    public String getBuildDate() {
        return buildDate;
    }

    public void setBuildDate(String buildDate) {
        this.buildDate = buildDate;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getDepreciationPrice() {
        return depreciationPrice;
    }

    public void setDepreciationPrice(float depreciationPrice) {
        this.depreciationPrice = depreciationPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPicGroupId() {
        return picGroupId;
    }

    public void setPicGroupId(String picGroupId) {
        this.picGroupId = picGroupId;
    }

    public static final class Builder {
        private String buildDate;
        private float cost;
        private float depreciationPrice;
        private int id;

        public Builder() {
        }

        public Builder withBuildDate(String val) {
            this.buildDate = val;
            return this;
        }

        public Builder withCost(float val) {
            this.cost = val;
            return this;
        }

        public Builder withDepreciationPrice(float val) {
            this.depreciationPrice = val;
            return this;
        }

        public Builder withId(int val) {
            this.id = val;
            return this;
        }

        public ApplyAssetFixEstateModel build() {
            return new ApplyAssetFixEstateModel(this);
        }
    }
}
