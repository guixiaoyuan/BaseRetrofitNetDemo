package com.nongfenqi.controller.model.guarantor;


import android.os.Parcel;
import android.os.Parcelable;

import com.nongfenqi.controller.model.common.LocationModel;

import java.io.Serializable;

/**
 * Function
 * 担保人
 *
 * @author Jiezhi
 * @version 1.0, 16/01/2017
 */
public class GuarantorModel implements Serializable,Parcelable {
    private static final String TAG = GuarantorModel.class.getSimpleName();

    /**
     * applyPersonId : AP20170405100001
     * authState : {"id":0,"name":"string"}
     * cardExpiryDate : 2016-06-01 00:00:00
     * cardId : 320101201607118150
     * education : {"id":0,"name":"string"}
     * guarantorName : 菜菜
     * guarantorRelationName : 朋友
     * guarantorRelationType : PR00001
     * health : {"id":0,"name":"string"}
     * healthDesc : string
     * id : G00000000001
     * maritalState : {"id":0,"name":"string"}
     * nowLivingAddressId : AA20170405100002
     * nowLivingLocation : {"address":"雨花台铁心桥大街6号","areaCode":"110101001000","fullAreaName":"江苏省南京市雨花台区","lat":0,"lon":0}
     * operateContent : 写一写经营情况
     * personId : P00000000001
     * phone : 13110103294
     * picGroupId : 0123
     */

    private String applyPersonId;
    private AuthStateEntity authState;
    private String cardExpiryDate;
    private String cardId;
    private EducationEntity education;
    private String guarantorName;
    private String guarantorRelationName;
    private String guarantorRelationType;
    private HealthEntity health;
    private String healthDesc;
    private String id;
    private MaritalStateEntity maritalState;
    private String nowLivingAddressId;
    private LocationModel nowLivingLocation;
    private String operateContent;
    private String personId;
    private String phone;
    private String picGroupId;

    public GuarantorModel(){}

    protected GuarantorModel(Parcel in) {
        applyPersonId = in.readString();
        cardExpiryDate = in.readString();
        cardId = in.readString();
        guarantorName = in.readString();
        guarantorRelationName = in.readString();
        guarantorRelationType = in.readString();
        healthDesc = in.readString();
        id = in.readString();
        nowLivingAddressId = in.readString();
        operateContent = in.readString();
        personId = in.readString();
        phone = in.readString();
        picGroupId = in.readString();
    }

    public static final Creator<GuarantorModel> CREATOR = new Creator<GuarantorModel>() {
        @Override
        public GuarantorModel createFromParcel(Parcel in) {
            return new GuarantorModel(in);
        }

        @Override
        public GuarantorModel[] newArray(int size) {
            return new GuarantorModel[size];
        }
    };

    public String getApplyPersonId() {
        return applyPersonId;
    }

    public void setApplyPersonId(String applyPersonId) {
        this.applyPersonId = applyPersonId;
    }

    public AuthStateEntity getAuthState() {
        return authState;
    }

    public void setAuthState(AuthStateEntity authState) {
        this.authState = authState;
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

    public EducationEntity getEducation() {
        return education;
    }

    public void setEducation(EducationEntity education) {
        this.education = education;
    }

    public String getGuarantorName() {
        return guarantorName;
    }

    public void setGuarantorName(String guarantorName) {
        this.guarantorName = guarantorName;
    }

    public String getGuarantorRelationName() {
        return guarantorRelationName;
    }

    public void setGuarantorRelationName(String guarantorRelationName) {
        this.guarantorRelationName = guarantorRelationName;
    }

    public String getGuarantorRelationType() {
        return guarantorRelationType;
    }

    public void setGuarantorRelationType(String guarantorRelationType) {
        this.guarantorRelationType = guarantorRelationType;
    }

    public HealthEntity getHealth() {
        return health;
    }

    public void setHealth(HealthEntity health) {
        this.health = health;
    }

    public String getHealthDesc() {
        return healthDesc;
    }

    public void setHealthDesc(String healthDesc) {
        this.healthDesc = healthDesc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MaritalStateEntity getMaritalState() {
        return maritalState;
    }

    public void setMaritalState(MaritalStateEntity maritalState) {
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

    public String getOperateContent() {
        return operateContent;
    }

    public void setOperateContent(String operateContent) {
        this.operateContent = operateContent;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(applyPersonId);
        dest.writeString(cardExpiryDate);
        dest.writeString(cardId);
        dest.writeString(guarantorName);
        dest.writeString(guarantorRelationName);
        dest.writeString(guarantorRelationType);
        dest.writeString(healthDesc);
        dest.writeString(id);
        dest.writeString(nowLivingAddressId);
        dest.writeString(operateContent);
        dest.writeString(personId);
        dest.writeString(phone);
        dest.writeString(picGroupId);
    }

    public static class AuthStateEntity {
        /**
         * id : 0
         * name : string
         */

        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class EducationEntity {
        /**
         * id : 0
         * name : string
         */

        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class HealthEntity {
        /**
         * id : 0
         * name : string
         */

        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class MaritalStateEntity {
        /**
         * id : 0
         * name : string
         */

        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
