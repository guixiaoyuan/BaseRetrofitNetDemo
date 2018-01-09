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
public class ApplyAssetFixOtherModel implements Serializable {
    private static final String TAG = ApplyAssetFixOtherModel.class.getSimpleName();
    private String content;
    private int id;
    private String picGroupId;
    private float price;
    private float depreciationPrice;
    private String time;

    public ApplyAssetFixOtherModel(Builder builder) {
        setContent(builder.content);
        setPrice(builder.price);
        setDepreciationPrice(builder.depreciationPrice);
        setTime(builder.time);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getDepreciationPrice() {
        return depreciationPrice;
    }

    public void setDepreciationPrice(float depreciationPrice) {
        this.depreciationPrice = depreciationPrice;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public static final class Builder {
        private String content;
        private float depreciationPrice;
        private float price;
        private String time;

        public Builder() {
        }

        public Builder withContent(String val) {
            this.content = val;
            return this;
        }

        public Builder withDepreciationPrice(float val) {
            this.depreciationPrice = val;
            return this;
        }

        public Builder withPrice(float val) {
            this.price = val;
            return this;
        }

        public Builder withTime(String val) {
            this.time = val;
            return this;
        }

        public ApplyAssetFixOtherModel build() {
            return new ApplyAssetFixOtherModel(this);
        }
    }
}
