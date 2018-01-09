package com.nongfenqi.controller.model.customer;

import com.nongfenqi.controller.model.common.StateModel;

import java.io.Serializable;

/**
 * 客户意向详情
 *
 * @author luzhichao
 * @version 1.0, 17/3/21
 * @since [sherlock/V1.0.0]
 */

public class CustomerIntentDetailModel implements Serializable {
    /**
     * id : CI20170302100000
     * applyId : ED20170302108561
     * customerId : C00000000126
     * customerName : 张三
     * customerTypeName : 农机手
     * areaName : 玄武区
     * managerUserId : U00000000126
     * managerUserName : 小明
     * addUserId : U00000000100
     * addUserName : 赵一
     * addTime : 2017-03-06 17:00:42
     * intentDesc : 客户包了100亩地，想买农机
     * receiveUserId : U00000000101
     * receiveUserName : 赵二
     * receiveTime : 2017-03-06 17:00:42
     * receiveState : {"id":0,"name":"未领取"}
     */

    private String id;
    private String applyId;
    private String customerId;
    private String customerName;
    private String customerTypeName;
    private String areaName;
    private String managerUserId;
    private String managerUserName;
    private String addUserId;
    private String addUserName;
    private String addTime;
    private String intentDesc;
    private String receiveUserId;
    private String receiveUserName;
    private String receiveTime;
    private StateModel receiveState;
    private boolean isSelected;

    private CustomerIntentDetailModel(Builder builder) {
        setId(builder.id);
        setApplyId(builder.applyId);
        setCustomerId(builder.customerId);
        setCustomerName(builder.customerName);
        setCustomerTypeName(builder.customerTypeName);
        setAreaName(builder.areaName);
        setManagerUserId(builder.managerUserId);
        setManagerUserName(builder.managerUserName);
        setAddUserId(builder.addUserId);
        setAddUserName(builder.addUserName);
        setAddTime(builder.addTime);
        setIntentDesc(builder.intentDesc);
        setReceiveUserId(builder.receiveUserId);
        setReceiveUserName(builder.receiveUserName);
        setReceiveTime(builder.receiveTime);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerTypeName() {
        return customerTypeName;
    }

    public void setCustomerTypeName(String customerTypeName) {
        this.customerTypeName = customerTypeName;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getManagerUserId() {
        return managerUserId;
    }

    public void setManagerUserId(String managerUserId) {
        this.managerUserId = managerUserId;
    }

    public String getManagerUserName() {
        return managerUserName;
    }

    public void setManagerUserName(String managerUserName) {
        this.managerUserName = managerUserName;
    }

    public String getAddUserId() {
        return addUserId;
    }

    public void setAddUserId(String addUserId) {
        this.addUserId = addUserId;
    }

    public String getAddUserName() {
        return addUserName;
    }

    public void setAddUserName(String addUserName) {
        this.addUserName = addUserName;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getIntentDesc() {
        return intentDesc;
    }

    public void setIntentDesc(String intentDesc) {
        this.intentDesc = intentDesc;
    }

    public String getReceiveUserId() {
        return receiveUserId;
    }

    public void setReceiveUserId(String receiveUserId) {
        this.receiveUserId = receiveUserId;
    }

    public String getReceiveUserName() {
        return receiveUserName;
    }

    public void setReceiveUserName(String receiveUserName) {
        this.receiveUserName = receiveUserName;
    }

    public String getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(String receiveTime) {
        this.receiveTime = receiveTime;
    }

    public StateModel getReceiveState() {
        return receiveState;
    }

    public void setReceiveState(StateModel receiveState) {
        this.receiveState = receiveState;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public boolean getIsSelected() {
        return isSelected;
    }


    public static final class Builder {
        private String id;
        private String applyId;
        private String customerId;
        private String customerName;
        private String customerTypeName;
        private String areaName;
        private String managerUserId;
        private String managerUserName;
        private String addUserId;
        private String addUserName;
        private String addTime;
        private String intentDesc;
        private String receiveUserId;
        private String receiveUserName;
        private String receiveTime;

        public Builder() {
        }

        public Builder id(String val) {
            id = val;
            return this;
        }

        public Builder applyId(String val) {
            applyId = val;
            return this;
        }

        public Builder customerId(String val) {
            customerId = val;
            return this;
        }

        public Builder customerName(String val) {
            customerName = val;
            return this;
        }

        public Builder customerTypeName(String val) {
            customerTypeName = val;
            return this;
        }

        public Builder areaName(String val) {
            areaName = val;
            return this;
        }

        public Builder managerUserId(String val) {
            managerUserId = val;
            return this;
        }

        public Builder managerUserName(String val) {
            managerUserName = val;
            return this;
        }

        public Builder addUserId(String val) {
            addUserId = val;
            return this;
        }

        public Builder addUserName(String val) {
            addUserName = val;
            return this;
        }

        public Builder addTime(String val) {
            addTime = val;
            return this;
        }

        public Builder intentDesc(String val) {
            intentDesc = val;
            return this;
        }

        public Builder receiveUserId(String val) {
            receiveUserId = val;
            return this;
        }

        public Builder receiveUserName(String val) {
            receiveUserName = val;
            return this;
        }

        public Builder receiveTime(String val) {
            receiveTime = val;
            return this;
        }

        public CustomerIntentDetailModel build() {
            return new CustomerIntentDetailModel(this);
        }
    }
}
