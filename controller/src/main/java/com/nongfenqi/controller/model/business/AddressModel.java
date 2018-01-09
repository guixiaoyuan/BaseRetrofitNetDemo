package com.nongfenqi.controller.model.business;

import com.nongfenqi.controller.model.common.LocationModel;
import com.nongfenqi.controller.model.common.StateModel;

import java.io.Serializable;

/**
 * 地址
 *
 * @author jiezhi
 * @version 1.0, 01/04/2017
 * @since [sherlock/V1.0.0]
 */
public class AddressModel implements Serializable{


    /**
     * addressLabel : {"id":0,"name":"string"}
     * applyId : string
     * id : string
     * location : {"address":"雨花台铁心桥大街6号","areaCode":"110101001000","fullAreaName":"江苏省南京市雨花台区","lat":0,"lon":0}
     */

    private StateModel addressLabel;
    private String applyId;
    private String id;
    private LocationModel location;

    public AddressModel() {
    }

    private AddressModel(Builder builder) {
        setAddressLabel(builder.addressLabel);
        setApplyId(builder.applyId);
        setId(builder.id);
        setLocation(builder.location);
    }


    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StateModel getAddressLabel() {
        return addressLabel;
    }

    public void setAddressLabel(StateModel addressLabel) {
        this.addressLabel = addressLabel;
    }

    public LocationModel getLocation() {
        return location;
    }

    public void setLocation(LocationModel location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "AddressModel{" +
                "addressLabel=" + addressLabel +
                ", applyId='" + applyId + '\'' +
                ", id='" + id + '\'' +
                ", location=" + location +
                '}';
    }

    public static final class Builder {
        private StateModel addressLabel;
        private String applyId;
        private String id;
        private LocationModel location;

        public Builder() {
        }

        public Builder withAddressLabel(StateModel val) {
            addressLabel = val;
            return this;
        }

        public Builder withApplyId(String val) {
            applyId = val;
            return this;
        }

        public Builder withId(String val) {
            id = val;
            return this;
        }

        public Builder withLocation(LocationModel val) {
            location = val;
            return this;
        }

        public AddressModel build() {
            return new AddressModel(this);
        }
    }
}
