package com.nongfenqi.controller.model.family;

import java.io.Serializable;

/**
 * 调查表－家庭信息－家庭资产－汽车
 *
 * @author colin
 * @version 1.0, 16/7/28
 * @see [相关类/方法]
 * @since [农人帮/V1.0.0]
 */
public class FamilyCarModel implements Serializable {

    /**
     * buyingPrice : 200000
     * id : 1
     * picGroupId : 0123
     * useCarType : {"id":0,"name":"string"}
     * worth : 150000
     * model:宝马
     */

    private float buyingPrice;
    private int id;
    private String picGroupId;
    private UseCarTypeEntity useCarType;
    private float worth;
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public FamilyCarModel() {
    }

    private FamilyCarModel(Builder builder) {
        setBuyingPrice(builder.buyingPrice);
        setId(builder.id);
        setPicGroupId(builder.picGroupId);
        setUseCarType(builder.useCarType);
        setWorth(builder.worth);
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

    public UseCarTypeEntity getUseCarType() {
        return useCarType;
    }

    public void setUseCarType(UseCarTypeEntity useCarType) {
        this.useCarType = useCarType;
    }

    public float getWorth() {
        return worth;
    }

    public void setWorth(float worth) {
        this.worth = worth;
    }

    public static class UseCarTypeEntity implements Serializable {
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

    public static final class Builder {
        private float buyingPrice;
        private int id;
        private String picGroupId;
        private UseCarTypeEntity useCarType;
        private float worth;
        private String model;

        public Builder() {
        }

        public Builder buyingPrice(float val) {
            buyingPrice = val;
            return this;
        }

        public Builder model(String val) {
            model = val;
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

        public Builder useCarType(UseCarTypeEntity val) {
            useCarType = val;
            return this;
        }

        public Builder worth(float val) {
            worth = val;
            return this;
        }

        public FamilyCarModel build() {
            return new FamilyCarModel(this);
        }
    }
}
