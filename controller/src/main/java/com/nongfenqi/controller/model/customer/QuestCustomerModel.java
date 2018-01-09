package com.nongfenqi.controller.model.customer;

import com.nongfenqi.controller.model.common.LocationModel;
import com.nongfenqi.controller.model.common.StateModel;

import java.io.Serializable;

/**
 * @author yuanfei
 * @version 1.0, 2017/4/11
 * @since [sherlock/V1.0.0]
 */

public class QuestCustomerModel implements Serializable {

    /**
     * applyId : ED201601020103929
     * applyPersonId : AP20160102010000
     * businessAddressId : AA20170405100003
     * businessLocation : {"address":"雨花台铁心桥大街6号","areaCode":"110101001000","fullAreaName":"江苏省南京市雨花台区","lat":0,"lon":0}
     * cardExpiryDate : 2017-04-11 12:32:58
     * cardId : 321284199025891516
     * customerId : C1000000001
     * customerName : 测试客户
     * customerType : {"id":0,"name":"string"}
     * education : {"id":0,"name":"string"}
     * id : 1
     * maritalState : {"id":0,"name":"string"}
     * nowLivingAddressId : AA20170405100002
     * nowLivingLocation : {"address":"雨花台铁心桥大街6号","areaCode":"110101001000","fullAreaName":"江苏省南京市雨花台区","lat":0,"lon":0}
     * phone : 15289669879
     * picGroupId : 123
     * remark : 客户介绍
     * residenceAddressId : AA20170405100001
     * residenceLocation : {"address":"雨花台铁心桥大街6号","areaCode":"110101001000","fullAreaName":"江苏省南京市雨花台区","lat":0,"lon":0}
     */

    private String applyId;
    private String applyPersonId;
    private String businessAddressId;
    private LocationModel businessLocation;
    private String cardExpiryDate;
    private String cardId;
    private String customerId;
    private String customerName;
    private StateModel customerType;
    private StateModel education;
    private int id;
    private StateModel maritalState;
    private String nowLivingAddressId;
    private LocationModel nowLivingLocation;
    private String phone;
    private String picGroupId;
    private String remark;
    private String residenceAddressId;
    private LocationModel residenceLocation;

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    public String getApplyPersonId() {
        return applyPersonId;
    }

    public void setApplyPersonId(String applyPersonId) {
        this.applyPersonId = applyPersonId;
    }

    public String getBusinessAddressId() {
        return businessAddressId;
    }

    public void setBusinessAddressId(String businessAddressId) {
        this.businessAddressId = businessAddressId;
    }

    public LocationModel getBusinessLocation() {
        return businessLocation;
    }

    public void setBusinessLocation(LocationModel businessLocation) {
        this.businessLocation = businessLocation;
    }

    public String getCardExpiryDate() {
        return cardExpiryDate;
    }

    public void setCardExpiryDate(String cardExpiryDate) {
        this.cardExpiryDate = cardExpiryDate;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
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

    public StateModel getCustomerType() {
        return customerType;
    }

    public void setCustomerType(StateModel customerType) {
        this.customerType = customerType;
    }

    public StateModel getEducation() {
        return education;
    }

    public void setEducation(StateModel education) {
        this.education = education;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StateModel getMaritalState() {
        return maritalState;
    }

    public void setMaritalState(StateModel maritalState) {
        this.maritalState = maritalState;
    }

    public String getNowLivingAddressId() {
        return nowLivingAddressId;
    }

    public void setNowLivingAddressId(String nowLivingAddressId) {
        this.nowLivingAddressId = nowLivingAddressId;
    }

    public LocationModel getNowLivingLocation() {
        return nowLivingLocation;
    }

    public void setNowLivingLocation(LocationModel nowLivingLocation) {
        this.nowLivingLocation = nowLivingLocation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPicGroupId() {
        return picGroupId;
    }

    public void setPicGroupId(String picGroupId) {
        this.picGroupId = picGroupId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getResidenceAddressId() {
        return residenceAddressId;
    }

    public void setResidenceAddressId(String residenceAddressId) {
        this.residenceAddressId = residenceAddressId;
    }

    public LocationModel getResidenceLocation() {
        return residenceLocation;
    }

    public void setResidenceLocation(LocationModel residenceLocation) {
        this.residenceLocation = residenceLocation;
    }


}
