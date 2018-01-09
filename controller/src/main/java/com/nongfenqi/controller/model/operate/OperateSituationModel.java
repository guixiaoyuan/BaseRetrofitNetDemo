package com.nongfenqi.controller.model.operate;


import com.nongfenqi.controller.model.business.AddressModel;

/**
 * Function
 *
 * @author jiezhi
 * @version 1.0, 15/11/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */
public class OperateSituationModel {
    private static final String TAG = OperateSituationModel.class.getSimpleName();

    /**
     * location : {"address":"雨花台铁心桥大街6号","areaCode":"110101001000","fullAreaName":"江苏省南京市雨花台区","lat":0,"lon":0}
     * picGroupId : 090f4089c20f
     * rationalExplain : 随便说说经营合理性解释
     */
    private AddressModel location;
    private String picGroupId;
    private String rationalExplain;

    public OperateSituationModel(Builder builder) {
        setRationalExplain(builder.rationalExplain);
    }

    public String getPicGroupId() {
        return picGroupId;
    }

    public void setPicGroupId(String picGroupId) {
        this.picGroupId = picGroupId;
    }

    public String getRationalExplain() {
        return rationalExplain;
    }

    public void setRationalExplain(String rationalExplain) {
        this.rationalExplain = rationalExplain;
    }

    public AddressModel getLocation() {
        return location;
    }

    public void setLocation(AddressModel location) {
        this.location = location;
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

        public OperateSituationModel Builder() {
            return new OperateSituationModel(this);
        }
    }

    @Override
    public String toString() {
        return "OperateSituationModel{" +
                ", location=" + location +
                ", picGroupId='" + picGroupId + '\'' +
                ", rationalExplain='" + rationalExplain + '\'' +
                '}';
    }
}
