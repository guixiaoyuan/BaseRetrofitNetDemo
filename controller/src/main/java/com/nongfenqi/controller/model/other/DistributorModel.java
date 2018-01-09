package com.nongfenqi.controller.model.other;

import me.yokeyword.indexablerv.IndexableEntity;

/**
 * 经销商信息
 *
 * @author jiezhi
 * @version 1.0, 10/04/2017
 * @since [sherlock/V1.0.0]
 */
public class DistributorModel implements IndexableEntity {
    private static final String TAG = DistributorModel.class.getSimpleName();
    /**
     * actualOperator : string
     * actualOperatorTelephone : string
     * avatar : string
     * bizAddressArea : string
     * bizAddressCity : string
     * bizAddressDetail : string
     * bizAddressProvince : string
     * companyName : string
     * distributorId : string
     * legalPerson : string
     */
    private String actualOperator;
    private String actualOperatorTelephone;
    private String avatar;
    private String bizAddressArea;
    private String bizAddressCity;
    private String bizAddressDetail;
    private String bizAddressProvince;
    private String companyName;
    private String distributorId;
    private String legalPerson;

    public String getActualOperator() {
        return actualOperator;
    }

    public void setActualOperator(String actualOperator) {
        this.actualOperator = actualOperator;
    }

    public String getActualOperatorTelephone() {
        return actualOperatorTelephone;
    }

    public void setActualOperatorTelephone(String actualOperatorTelephone) {
        this.actualOperatorTelephone = actualOperatorTelephone;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getBizAddressArea() {
        return bizAddressArea;
    }

    public void setBizAddressArea(String bizAddressArea) {
        this.bizAddressArea = bizAddressArea;
    }

    public String getBizAddressCity() {
        return bizAddressCity;
    }

    public void setBizAddressCity(String bizAddressCity) {
        this.bizAddressCity = bizAddressCity;
    }

    public String getBizAddressDetail() {
        return bizAddressDetail;
    }

    public void setBizAddressDetail(String bizAddressDetail) {
        this.bizAddressDetail = bizAddressDetail;
    }

    public String getBizAddressProvince() {
        return bizAddressProvince;
    }

    public void setBizAddressProvince(String bizAddressProvince) {
        this.bizAddressProvince = bizAddressProvince;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(String distributorId) {
        this.distributorId = distributorId;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    @Override
    public String toString() {
        return "DistributorModel{" +
                "actualOperator='" + actualOperator + '\'' +
                ", actualOperatorTelephone='" + actualOperatorTelephone + '\'' +
                ", avatar='" + avatar + '\'' +
                ", bizAddressArea='" + bizAddressArea + '\'' +
                ", bizAddressCity='" + bizAddressCity + '\'' +
                ", bizAddressDetail='" + bizAddressDetail + '\'' +
                ", bizAddressProvince='" + bizAddressProvince + '\'' +
                ", companyName='" + companyName + '\'' +
                ", distributorId='" + distributorId + '\'' +
                ", legalPerson='" + legalPerson + '\'' +
                '}';
    }

    @Override
    public String getFieldIndexBy() {
        return companyName;
    }

    @Override
    public void setFieldIndexBy(String indexField) {

    }

    @Override
    public void setFieldPinyinIndexBy(String pinyin) {

    }
}
