package com.nongfenqi.controller.model.balance;

import java.io.Serializable;

/**
 * Function
 * 预付款项
 * @author jiezhi
 * @version 1.0, 15/02/2017
 * @see [相关类/方法]
 * @since [农人帮/V1.1.2]
 */
public class ApplyAssetPrepaymentModel implements Serializable{
    private static final String TAG = ApplyAssetPrepaymentModel.class.getSimpleName();

    /**
     * amount : 20000
     * content : 需要买车预付了4S店20000元
     * happenDate : 2017-02-15 09:38:22
     * id : 1
     * picGroupId : 0123
     */
    private float amount;
    private String content;
    private String happenDate;
    private int id;
    private String picGroupId;

    private ApplyAssetPrepaymentModel(Builder builder) {
        setAmount(builder.amount);
        setContent(builder.content);
        setHappenDate(builder.happenDate);
        setId(builder.id);
        setPicGroupId(builder.picGroupId);
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHappenDate() {
        return happenDate;
    }

    public void setHappenDate(String happenDate) {
        this.happenDate = happenDate;
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
        private float amount;
        private String content;
        private String happenDate;
        private int id;
        private String picGroupId;

        public Builder() {
        }

        public Builder withAmount(float val) {
            amount = val;
            return this;
        }

        public Builder withContent(String val) {
            content = val;
            return this;
        }

        public Builder withHappenDate(String val) {
            happenDate = val;
            return this;
        }

        public Builder withId(int val) {
            id = val;
            return this;
        }

        public Builder withPicGroupId(String val) {
            picGroupId = val;
            return this;
        }

        public ApplyAssetPrepaymentModel build() {
            return new ApplyAssetPrepaymentModel(this);
        }
    }
}
