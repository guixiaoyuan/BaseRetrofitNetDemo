package com.nongfenqi.controller.model.balance;

import java.io.Serializable;

/**
 * 应收账款
 *
 * @author jiezhi
 * @version 1.0, 13/04/2017
 * @since [sherlock/V1.0.0]
 */
public class ApplyAssetReceivableModel implements Serializable{
    private static final String TAG = ApplyAssetReceivableModel.class.getSimpleName();

    /**
     * amount : 20000
     * content : 借给朋友陈露20000元
     * happenDate : 2017-04-13 14:17:22
     * id : 1
     * picGroupId : 0123
     * settleDate : 2017-04-13 14:17:22
     */

    private float amount;
    private String content;
    private String happenDate;
    private int id;
    private String picGroupId;
    private String settleDate;

    private ApplyAssetReceivableModel(Builder builder) {
        setAmount(builder.amount);
        setContent(builder.content);
        setHappenDate(builder.happenDate);
        setId(builder.id);
        setPicGroupId(builder.picGroupId);
        setSettleDate(builder.settleDate);
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

    public String getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate;
    }

    public static final class Builder {
        private float amount;
        private String content;
        private String happenDate;
        private int id;
        private String picGroupId;
        private String settleDate;

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

        public Builder withSettleDate(String val) {
            settleDate = val;
            return this;
        }

        public ApplyAssetReceivableModel build() {
            return new ApplyAssetReceivableModel(this);
        }
    }

    @Override
    public String toString() {
        return "ApplyAssetReceivableModel{" +
                "amount=" + amount +
                ", content='" + content + '\'' +
                ", happenDate='" + happenDate + '\'' +
                ", id=" + id +
                ", picGroupId='" + picGroupId + '\'' +
                ", settleDate='" + settleDate + '\'' +
                '}';
    }
}
