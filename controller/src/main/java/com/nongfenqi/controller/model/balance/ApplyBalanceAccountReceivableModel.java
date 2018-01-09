package com.nongfenqi.controller.model.balance;

import com.nongfenqi.controller.model.common.StateModel;

import java.io.Serializable;

/**
 * @author guixy
 * @version 1.0, 16/04/17
 * @see [相关类/方法]
 * @since [蜂盾/V1.0.0]
 */
public class ApplyBalanceAccountReceivableModel implements Serializable {
    private static final String TAG = ApplyBalanceAccountReceivableModel.class.getSimpleName();

    private float amount;
    private String content;
    private String happenDate;
    private int id;
    private StateModel liabilityType;

    private ApplyBalanceAccountReceivableModel(Builder builder) {
        setAmount(builder.amount);
        setContent(builder.content);
        setHappenDate(builder.happenDate);
        setId(builder.id);
        setLiabilityType(builder.liabilityType);
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


    public StateModel getLiabilityType() {
        return liabilityType;
    }

    public void setLiabilityType(StateModel liabilityType) {
        this.liabilityType = liabilityType;
    }

    public static final class Builder {
        private float amount;
        private String content;
        private String happenDate;
        private int id;
        private StateModel liabilityType;

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

        public Builder withLiabilityType(StateModel val) {
            liabilityType = val;
            return this;
        }

        public ApplyBalanceAccountReceivableModel build() {
            return new ApplyBalanceAccountReceivableModel(this);
        }
    }
}
