package com.nongfenqi.controller.model.CluePool;

import com.nongfenqi.controller.model.common.StateModel;

import java.io.Serializable;

/**
 * 线索池详情
 *
 * @author guixiaoyuan
 * @version 2.2, 2017/10/10
 * @since [sherlock/V2.2.5]
 */
public class CluePoolDetailModel implements Serializable {
    /**
     * addTime (string, optional): 线索创建时间 ,
     * addUserId (string, optional): 订单负责人编号 ,
     * addUserName (string, optional): 订单负责人姓名 ,
     * areaCode (string, optional): 地区编号 ,
     * areaName (string, optional): 地区名称 ,
     * customerId (string, optional): 客户编号 ,
     * customerName (string, optional): 客户名称 ,
     * id (string, optional): 信贷单号 ,
     * managerUserId (string, optional): 客户负责人编号 ,
     * managerUserName (string, optional): 客户负责人姓名 ,
     * templateId (string, optional): 模板编号 ,
     * templateName (string, optional): 模板名称
     */

    private String addTime;
    private String addUserId;
    private String addUserName;
    private String areaCode;
    private String areaName;
    private String customerId;
    private String customerName;
    private String description;
    private String id;
    private String managerUserName;
    private String managerUserId;
    private String templateId;
    private String templateName;

    private String customerTypeName;

    private boolean isSelected;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCustomerTypeName() {
        return customerTypeName;
    }

    public void setCustomerTypeName(String customerTypeName) {
        this.customerTypeName = customerTypeName;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
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

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public Boolean getIsSelected() {
        return isSelected;
    }

    public void setSelected(Boolean selected) {
        isSelected = selected;
    }
}
