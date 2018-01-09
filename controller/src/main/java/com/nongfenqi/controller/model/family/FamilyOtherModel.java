package com.nongfenqi.controller.model.family;

import java.io.Serializable;

/**
 * 调查表－家庭信息－家庭资产－其他
 *
 * @author luzhichao
 * @version 1.0, 17/4/7
 * @since [sherlock/V1.0.0]
 */

public class FamilyOtherModel implements Serializable {

    /**
     * assetDesc : string
     * buyingPrice : 200000
     * id : 1
     * picGroupId : 0123
     * worth : 150000
     */

    private String assetDesc;
    private float buyingPrice;
    private int id;
    private String picGroupId;
    private float worth;

    public FamilyOtherModel() {

    }

    private FamilyOtherModel(Builder builder) {
        setAssetDesc(builder.assetDesc);
        setBuyingPrice(builder.buyingPrice);
        setId(builder.id);
        setPicGroupId(builder.picGroupId);
        setWorth(builder.worth);
    }

    public String getAssetDesc() {
        return assetDesc;
    }

    public void setAssetDesc(String assetDesc) {
        this.assetDesc = assetDesc;
    }

    public float getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(float buyingPrice) {
        this.buyingPrice = buyingPrice;
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

    public float getWorth() {
        return worth;
    }

    public void setWorth(float worth) {
        this.worth = worth;
    }

    public static final class Builder {
        private String assetDesc;
        private float buyingPrice;
        private int id;
        private String picGroupId;
        private float worth;

        public Builder() {
        }

        public Builder assetDesc(String val) {
            assetDesc = val;
            return this;
        }

        public Builder buyingPrice(float val) {
            buyingPrice = val;
            return this;
        }

        public Builder id(int val) {
            id = val;
            return this;
        }

        public Builder picGroupId(String val) {
            picGroupId = val;
            return this;
        }

        public Builder worth(float val) {
            worth = val;
            return this;
        }

        public FamilyOtherModel build() {
            return new FamilyOtherModel(this);
        }
    }
}
