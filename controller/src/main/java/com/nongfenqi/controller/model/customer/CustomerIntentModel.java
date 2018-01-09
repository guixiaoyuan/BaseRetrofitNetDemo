package com.nongfenqi.controller.model.customer;

import java.util.List;

/**
 * 客户意向
 *
 * @author luzhichao
 * @version 1.0, 17/3/21
 * @since [sherlock/V1.0.0]
 */

public class CustomerIntentModel {
    /**
     * items : [{"addTime":"2017-03-06 09:53:00","addUserId":"U00000000100","addUserName":"赵一",
     * "applyId":"ED20170302108561","areaName":"玄武区","customerId":"C00000000126","customerName":"张三",
     * "desc":"客户包了100亩地，想买农机","managerUserId":"U00000000126","managerUserName":"小明",
     * "receiveState":{"id":0,"name":"string"},"receiveTime":"2017-03-06 09:53:00","receiveUserId":"U00000000101",
     * "receiveUserName":"赵二","typeDesc":"农机手"}]
     *
     * pageSize : 0
     * totalCount : 0
     */
    private int pageSize;
    private int totalCount;
    private List<CustomerIntentDetailModel> items;

    private CustomerIntentModel(Builder builder) {
        setItems(builder.items);
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<CustomerIntentDetailModel> getItems() {
        return items;
    }

    public void setItems(List<CustomerIntentDetailModel> items) {

        this.items = items;
    }

    public static final class Builder {
        private int pageSize;
        private int totalCount;
        private List<CustomerIntentDetailModel> items;

        public Builder() {
        }

        public Builder pageSize(int val) {
            pageSize = val;
            return this;
        }

        public Builder totalCount(int val) {
            totalCount = val;
            return this;
        }

        public CustomerIntentModel build() {
            return new CustomerIntentModel(this);
        }

        public Builder items(List<CustomerIntentDetailModel> val) {
            items = val;
            return this;
        }
    }
}
