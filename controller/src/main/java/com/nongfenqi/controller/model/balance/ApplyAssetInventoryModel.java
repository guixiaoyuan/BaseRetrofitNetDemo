package com.nongfenqi.controller.model.balance;

import com.nongfenqi.controller.model.common.StateModel;

import java.io.Serializable;

/**
 * Function
 *
 * @author jiezhi
 * @version 1.0, 14/02/2017
 * @see [相关类/方法]
 * @since [农人帮/V1.1.2]
 */
public class ApplyAssetInventoryModel implements Serializable {

    private static final String TAG = ApplyAssetInventoryModel.class.getSimpleName();
    /**
     * cargoName : 小麦
     * id : 1
     * num : 1000
     * picGroupId : 0123
     * place : {"id":0,"name":"string"}
     * price : 1
     * unitType : 1:按重量; 2:按个数; 3:按面积;
     */

    private String cargoName;
    private int id;
    private int num;
    private String picGroupId;
    private StateModel place;
    private float price;
    private StateModel unitType;

    private ApplyAssetInventoryModel(Builder builder) {
        setCargoName(builder.cargoName);
        setId(builder.id);
        setNum(builder.num);
        setPicGroupId(builder.picGroupId);
        setPlace(builder.place);
        setPrice(builder.price);
        setUnitType(builder.unitType);
    }

    public void setCargoName(String cargoName) {
        this.cargoName = cargoName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setPicGroupId(String picGroupId) {
        this.picGroupId = picGroupId;
    }

    public void setPlace(StateModel place) {
        this.place = place;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setUnitType(StateModel unitType) {
        this.unitType = unitType;
    }

    public String getCargoName() {
        return cargoName;
    }

    public int getId() {
        return id;
    }

    public int getNum() {
        return num;
    }

    public String getPicGroupId() {
        return picGroupId;
    }

    public StateModel getPlace() {
        return place;
    }

    public float getPrice() {
        return price;
    }

    public StateModel getUnitType() {
        return unitType;
    }


    public static final class Builder {
        private String cargoName;
        private int id;
        private int num;
        private String picGroupId;
        private StateModel place;
        private float price;
        private StateModel unitType;

        public Builder() {
        }

        public Builder withCargoName(String val) {
            cargoName = val;
            return this;
        }

        public Builder withId(int val) {
            id = val;
            return this;
        }

        public Builder withNum(int val) {
            num = val;
            return this;
        }

        public Builder withPicGroupId(String val) {
            picGroupId = val;
            return this;
        }

        public Builder withPlace(StateModel val) {
            place = val;
            return this;
        }

        public Builder withPrice(float val) {
            price = val;
            return this;
        }

        public Builder withUnitType(StateModel val) {
            unitType = val;
            return this;
        }

        public ApplyAssetInventoryModel build() {
            return new ApplyAssetInventoryModel(this);
        }
    }
}
