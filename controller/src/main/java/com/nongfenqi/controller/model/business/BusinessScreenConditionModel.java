package com.nongfenqi.controller.model.business;

/**
 * 业务列表筛选条件
 *
 * @author luzhichao
 * @version 1.0, 17/3/31
 * @since [sherlock/V1.0.0]
 */

public class BusinessScreenConditionModel {
    private int businessStateInt;
    private int screenInt;
    private String firstUserId;
    private String secondUserId;
    private String firstUserStr;
    private String secondUserStr;

    public int getBusinessStateInt() {
        return businessStateInt;
    }

    public void setBusinessStateInt(int businessStateInt) {
        this.businessStateInt = businessStateInt;
    }

    public int getScreenInt() {
        return screenInt;
    }

    public void setScreenInt(int screenInt) {
        this.screenInt = screenInt;
    }


    public String getFirstUserId() {
        return firstUserId;
    }

    public void setFirstUserId(String firstUserId) {
        this.firstUserId = firstUserId;
    }

    public String getSecondUserId() {
        return secondUserId;
    }

    public void setSecondUserId(String secondUserId) {
        this.secondUserId = secondUserId;
    }

    public String getFirstUserStr() {
        return firstUserStr;
    }

    public void setFirstUserStr(String firstUserStr) {
        this.firstUserStr = firstUserStr;
    }

    public String getSecondUserStr() {
        return secondUserStr;
    }

    public void setSecondUserStr(String secondUserStr) {
        this.secondUserStr = secondUserStr;
    }

    public BusinessScreenConditionModel() {
    }

    private BusinessScreenConditionModel(Builder builder) {
        businessStateInt = builder.businessStateInt;
        screenInt = builder.screenInt;
        firstUserId = builder.firstUserId;
        secondUserId = builder.secondUserId;
        firstUserStr = builder.firstUserStr;
        secondUserStr = builder.secondUserStr;
    }


    public static final class Builder {
        private int businessStateInt;
        private int screenInt;
        private String firstUserId;
        private String secondUserId;
        private String firstUserStr;
        private String secondUserStr;

        public Builder() {
        }

        public Builder businessStateInt(int val) {
            businessStateInt = val;
            return this;
        }

        public Builder screenInt(int val) {
            screenInt = val;
            return this;
        }

        public Builder firstUserId(String val) {
            firstUserId = val;
            return this;
        }

        public Builder secondUserId(String val) {
            secondUserId = val;
            return this;
        }

        public Builder firstUserStr(String val) {
            firstUserStr = val;
            return this;
        }

        public Builder secondUserStr(String val) {
            secondUserStr = val;
            return this;
        }

        public BusinessScreenConditionModel build() {
            return new BusinessScreenConditionModel(this);
        }
    }
}
