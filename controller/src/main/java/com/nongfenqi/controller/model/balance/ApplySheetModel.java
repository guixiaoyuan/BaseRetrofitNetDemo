package com.nongfenqi.controller.model.balance;

import java.io.Serializable;

/**
 * 应收账款
 *
 * @author jiezhi
 * @version 1.0, 13/04/2017
 * @since [sherlock/V1.0.0]
 */
public class ApplySheetModel implements Serializable {
    private static final String TAG = ApplySheetModel.class.getSimpleName();

    /**
     * amount : 20000
     * content : 借给朋友陈露20000元
     * happenDate : 2017-04-13 14:17:22
     * id : 1
     */

    private float amount;
    private String content;
    private String happenDate;
    private int id;

    private ApplySheetModel(Builder builder) {
        setAmount(builder.amount);
        setContent(builder.content);
        setHappenDate(builder.happenDate);
        setId(builder.id);
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

    public static final class Builder {
        private float amount;
        private String content;
        private String happenDate;
        private int id;

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

        public ApplySheetModel build() {
            return new ApplySheetModel(this);
        }
    }

    @Override
    public String toString() {
        return "ApplyAssetReceivableModel{" +
                "amount=" + amount +
                ", content='" + content + '\'' +
                ", happenDate='" + happenDate + '\'' +
                ", id=" + id +
                '}';
    }
}
