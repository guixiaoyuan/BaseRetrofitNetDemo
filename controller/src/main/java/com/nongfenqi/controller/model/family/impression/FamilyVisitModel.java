package com.nongfenqi.controller.model.family.impression;

/**
 * @author jiezhi
 * @version 1.0, 14/04/2017
 * @since [sherlock/V1.0.0]
 */
public class FamilyVisitModel {
    private static final String TAG = FamilyVisitModel.class.getSimpleName();

    /**
     * id : 1
     * picGroupId : string
     * remark : string
     */

    private int id;
    private String picGroupId;
    private String remark;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "FamilyVisitModel{" +
                "id=" + id +
                ", picGroupId='" + picGroupId + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
