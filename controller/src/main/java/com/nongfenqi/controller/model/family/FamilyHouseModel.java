package com.nongfenqi.controller.model.family;


import java.io.Serializable;

/**
 * 调查表－家庭信息－家庭资产－房屋
 *
 * @author colin
 * @version 1.0, 16/7/28
 * @see [相关类/方法]
 * @since [农人帮/V1.0.0]
 */
public class FamilyHouseModel implements Serializable {

    /**
     * id : 1
     * picGroupId : 0123
     * type : {"id":0,"name":"string"}
     * worth : 79
     * years : 70
     */

    private int id;
    private String picGroupId;
    private TypeEntity type;
    private float worth;
    private int years;

    public FamilyHouseModel() {

    }

    private FamilyHouseModel(Builder builder) {
        setId(builder.id);
        setPicGroupId(builder.picGroupId);
        setType(builder.type);
        setWorth(builder.worth);
        setYears(builder.years);
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

    public TypeEntity getType() {
        return type;
    }

    public void setType(TypeEntity type) {
        this.type = type;
    }

    public float getWorth() {
        return worth;
    }

    public void setWorth(float worth) {
        this.worth = worth;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public static class TypeEntity implements Serializable {
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
        private int id;
        private String picGroupId;
        private TypeEntity type;
        private float worth;
        private int years;

        public Builder() {
        }

        public Builder id(int val) {
            id = val;
            return this;
        }

        public Builder picGroupId(String val) {
            picGroupId = val;
            return this;
        }

        public Builder type(TypeEntity val) {
            type = val;
            return this;
        }

        public Builder worth(float val) {
            worth = val;
            return this;
        }

        public Builder years(int val) {
            years = val;
            return this;
        }

        public FamilyHouseModel build() {
            return new FamilyHouseModel(this);
        }
    }
}
