package com.nongfenqi.controller.model.business;

/**
 * 发起业务
 *
 * @author luzhichao
 * @version 1.0, 17/3/29
 * @since [sherlock/V1.0.0]
 */

public class ApplyOrderStartModel {
    /**
     * customerId : C1000000001
     * customerIntentId : CI20170101100000
     * firstUserId : U1000000001
     * name : 江苏省南京市张三买农机
     * secondUserId : U1000000018
     * templateId : AT10000
     */

    private String customerId;
    private String customerIntentId;
    private String firstUserId;
    private String name;
    private String secondUserId;
    private String templateId;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerIntentId() {
        return customerIntentId;
    }

    public void setCustomerIntentId(String customerIntentId) {
        this.customerIntentId = customerIntentId;
    }

    public String getFirstUserId() {
        return firstUserId;
    }

    public void setFirstUserId(String firstUserId) {
        this.firstUserId = firstUserId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondUserId() {
        return secondUserId;
    }

    public void setSecondUserId(String secondUserId) {
        this.secondUserId = secondUserId;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }
}
