package com.nongfenqi.controller.model.common;

import java.io.Serializable;

/**
 * 公共地址模型
 *
 * @author jiezhi
 * @version 1.0, 01/04/2017
 * @since [sherlock/V1.0.0]
 */
public class LocationModel implements Serializable {
    /**
     * address : 雨花台铁心桥大街6号
     * areaCode : 110101001000
     * fullAreaName : 江苏省南京市雨花台区
     * lat : 0
     * lon : 0
     */

    private String address;
    private String areaCode;
    private String fullAreaName;
    private float lat;
    private float lon;

    public LocationModel() {
    }

    private LocationModel(Builder builder) {
        setAddress(builder.address);
        setAreaCode(builder.areaCode);
        setAreaName(builder.fullAreaName);
        setLat(builder.lat);
        setLon(builder.lon);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaName() {
        return fullAreaName;
    }

    public void setAreaName(String fullAreaName) {
        this.fullAreaName = fullAreaName;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    @Override
    public String toString() {
        return "LocationModel{" +
                "address='" + address + '\'' +
                ", areaCode='" + areaCode + '\'' +
                ", fullAreaName='" + fullAreaName + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                '}';
    }

    public static final class Builder {
        private String address;
        private String areaCode;
        private String fullAreaName;
        private float lat;
        private float lon;

        public Builder() {
        }

        public Builder withAddress(String val) {
            address = val;
            return this;
        }

        public Builder withAreaCode(String val) {
            areaCode = val;
            return this;
        }

        public Builder withAreaName(String val) {
            fullAreaName = val;
            return this;
        }

        public Builder withLat(float val) {
            lat = val;
            return this;
        }

        public Builder withLon(float val) {
            lon = val;
            return this;
        }

        public LocationModel build() {
            return new LocationModel(this);
        }
    }
}
