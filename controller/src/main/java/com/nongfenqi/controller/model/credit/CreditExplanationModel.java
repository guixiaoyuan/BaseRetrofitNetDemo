package com.nongfenqi.controller.model.credit;

/**
 * Function
 *
 * @author jiezhi
 * @version 1.0, 16/11/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */
public class CreditExplanationModel {
    private static final String TAG = CreditExplanationModel.class.getSimpleName();

    /**
     * guaranteeExplain : 对外担保说明
     * id : 1
     * liabilityExplain : 自身负债说明
     * overdueExplain : 逾期说明
     * personId : 人员编号 ,
     * picGroupId : P1234
     */
    private String guaranteeExplain;
    private int id;
    private String liabilityExplain;
    private String overdueExplain;
    private String picGroupId;
    private String personId;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getGuaranteeExplain() {
        return guaranteeExplain;
    }

    public void setGuaranteeExplain(String guaranteeExplain) {
        this.guaranteeExplain = guaranteeExplain;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLiabilityExplain() {
        return liabilityExplain;
    }

    public void setLiabilityExplain(String liabilityExplain) {
        this.liabilityExplain = liabilityExplain;
    }

    public String getOverdueExplain() {
        return overdueExplain;
    }

    public void setOverdueExplain(String overdueExplain) {
        this.overdueExplain = overdueExplain;
    }

    public String getPicGroupId() {
        return picGroupId;
    }

    public void setPicGroupId(String picGroupId) {
        this.picGroupId = picGroupId;
    }

    @Override
    public String toString() {
        return "CreditExplanationModel{" +
                "guaranteeExplain='" + guaranteeExplain + '\'' +
                ", id=" + id +
                ", liabilityExplain='" + liabilityExplain + '\'' +
                ", overdueExplain='" + overdueExplain + '\'' +
                ", picGroupId='" + picGroupId + '\'' +
                '}';
    }
}
