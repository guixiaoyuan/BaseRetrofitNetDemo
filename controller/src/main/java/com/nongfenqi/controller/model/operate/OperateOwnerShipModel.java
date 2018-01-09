package com.nongfenqi.controller.model.operate;


import com.nongfenqi.controller.model.business.AddressModel;

/**
 * Function
 *
 * @author guixy
 * @version 1.0, 20/04/2017
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */
public class OperateOwnerShipModel {
    private static final String TAG = OperateOwnerShipModel.class.getSimpleName();

    /**
     * "id": 1,
     * "picGroupId": "001123",
     * "remark": "string"
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

    public OperateOwnerShipModel(Builder builder) {
        setRationalExplain(builder.rationalExplain);
    }

    public String getPicGroupId() {
        return picGroupId;
    }

    public void setPicGroupId(String picGroupId) {
        this.picGroupId = picGroupId;
    }

    public String getRationalExplain() {
        return remark;
    }

    public void setRationalExplain(String rationalExplain) {
        this.remark = rationalExplain;
    }

    public static final class Builder {
        private AddressModel location;
        private String picGroupId;
        private String rationalExplain;

        public Builder() {
        }

        public Builder withRationalExplain(String val) {
            rationalExplain = val;
            return this;
        }

        public OperateOwnerShipModel Builder() {
            return new OperateOwnerShipModel(this);
        }
    }

    @Override
    public String toString() {
        return "OperateOwnerShipModel{" +
                "id=" + id +
                ", picGroupId='" + picGroupId + '\'' +
                ", rationalExplain='" + remark + '\'' +
                '}';
    }
}
