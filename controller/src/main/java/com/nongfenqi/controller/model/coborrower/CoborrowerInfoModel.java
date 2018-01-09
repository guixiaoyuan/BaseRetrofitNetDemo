package com.nongfenqi.controller.model.coborrower;

import android.os.Parcel;
import android.os.Parcelable;

import com.nongfenqi.controller.model.common.LocationModel;
import com.nongfenqi.controller.model.common.StateModel;

import java.io.Serializable;

/**
 * 共借人
 *
 * @author yuanfei
 * @version 1.0, 2017/4/12
 * @since [sherlock/V1.0.0]
 */

public class CoborrowerInfoModel implements Serializable, Parcelable {
    /**
     * applyPersonId : AP00000000001
     * applyAddressId: 0
     * workDesc : string
     * cardExpiryDate : 2017-04-12 14:36:39
     * cardId : 321284199001231655
     * education : {"id":0,"name":"string"}
     * id : 1
     * maritalState : {"id":0,"name":"string"}
     * borrowerRelationName : 朋友
     * borrowerRelationType : PR00001
     * nowLivingLocation : {"address":"雨花台铁心桥大街6号","areaCode":"110101001000","fullAreaName":"江苏省南京市雨花台区","lat":0,"lon":0}
     * personId : P00000000001
     * personName : 陈国富
     * phone : 15289669879
     * picGroupId : string
     * workSituation : {"id":0,"name":"string"}
     * workType : {"id":0,"name":"string"}
     */

    private String applyPersonId;
    private String workDesc;
    private String cardExpiryDate;
    private String cardId;
    private StateModel education;
    private int id;
    private StateModel maritalState;
    private String borrowerRelationName;
    private String borrowerRelationType;
    private LocationModel nowLivingLocation;
    private String personId;
    private String personName;
    private String phone;
    private String picGroupId;
    private StateModel workSituation;
    private StateModel workType;
    private String applyAddressId;
    private StateModel authState;

    public CoborrowerInfoModel() {
    }

    private CoborrowerInfoModel(Builder builder) {
        setApplyPersonId(builder.applyPersonId);
        setWorkDesc(builder.workDesc);
        setCardExpiryDate(builder.cardExpiryDate);
        setCardId(builder.cardId);
        setEducation(builder.education);
        setId(builder.id);
        setMaritalState(builder.maritalState);
        setBorrowerRelationName(builder.borrowerRelationName);
        setBorrowerRelationType(builder.borrowerRelationType);
        setNowLivingLocation(builder.nowLivingLocation);
        setPersonId(builder.personId);
        setPersonName(builder.personName);
        setPhone(builder.phone);
        setPicGroupId(builder.picGroupId);
        setWorkSituation(builder.workSituation);
        setWorkType(builder.workType);
        setApplyAddressId(builder.applyAddressId);
        setAuthState(builder.authState);
    }

    protected CoborrowerInfoModel(Parcel in) {
        applyPersonId = in.readString();
        workDesc = in.readString();
        cardExpiryDate = in.readString();
        cardId = in.readString();
        id = in.readInt();
        borrowerRelationName = in.readString();
        borrowerRelationType = in.readString();
        personId = in.readString();
        personName = in.readString();
        phone = in.readString();
        picGroupId = in.readString();
        applyAddressId = in.readString();
    }

    public static final Creator<CoborrowerInfoModel> CREATOR = new Creator<CoborrowerInfoModel>() {
        @Override
        public CoborrowerInfoModel createFromParcel(Parcel in) {
            return new CoborrowerInfoModel(in);
        }

        @Override
        public CoborrowerInfoModel[] newArray(int size) {
            return new CoborrowerInfoModel[size];
        }
    };

    public String getApplyPersonId() {
        return applyPersonId;
    }

    public void setApplyPersonId(String applyPersonId) {
        this.applyPersonId = applyPersonId;
    }

    public String getWorkDesc() {
        return workDesc;
    }

    public void setWorkDesc(String workDesc) {
        this.workDesc = workDesc;
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


    public String getBorrowerRelationName() {
        return borrowerRelationName;
    }

    public void setBorrowerRelationName(String borrowerRelationName) {
        this.borrowerRelationName = borrowerRelationName;
    }

    public String getBorrowerRelationType() {
        return borrowerRelationType;
    }

    public void setBorrowerRelationType(String borrowerRelationType) {
        this.borrowerRelationType = borrowerRelationType;
    }

    public LocationModel getNowLivingLocation() {
        return nowLivingLocation;
    }

    public void setNowLivingLocation(LocationModel nowLivingLocation) {
        this.nowLivingLocation = nowLivingLocation;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
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

    public StateModel getWorkSituation() {
        return workSituation;
    }

    public void setWorkSituation(StateModel workSituation) {
        this.workSituation = workSituation;
    }

    public StateModel getWorkType() {
        return workType;
    }

    public void setWorkType(StateModel workType) {
        this.workType = workType;
    }

    public String getApplyAddressId() {
        return applyAddressId;
    }

    public void setApplyAddressId(String applyAddressId) {
        this.applyAddressId = applyAddressId;
    }

    public StateModel getAuthState() {
        return authState;
    }

    public void setAuthState(StateModel authState) {
        this.authState = authState;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(applyPersonId);
        dest.writeString(workDesc);
        dest.writeString(cardExpiryDate);
        dest.writeString(cardId);
        dest.writeInt(id);
        dest.writeString(borrowerRelationName);
        dest.writeString(borrowerRelationType);
        dest.writeString(personId);
        dest.writeString(personName);
        dest.writeString(phone);
        dest.writeString(picGroupId);
        dest.writeString(applyAddressId);
    }


    @Override
    public String toString() {
        return "CoborrowerInfoModel{" +
                "applyPersonId='" + applyPersonId + '\'' +
                ", workDesc='" + workDesc + '\'' +
                ", cardExpiryDate='" + cardExpiryDate + '\'' +
                ", cardId='" + cardId + '\'' +
                ", education=" + education +
                ", id=" + id +
                ", maritalState=" + maritalState +
                ", borrowerRelationName='" + borrowerRelationName + '\'' +
                ", borrowerRelationType='" + borrowerRelationType + '\'' +
                ", nowLivingLocation=" + nowLivingLocation +
                ", personId='" + personId + '\'' +
                ", personName='" + personName + '\'' +
                ", phone='" + phone + '\'' +
                ", picGroupId='" + picGroupId + '\'' +
                ", workSituation=" + workSituation +
                ", workType=" + workType +
                '}';
    }

    public static final class Builder {
        private String applyPersonId;
        private String workDesc;
        private String cardExpiryDate;
        private String cardId;
        private StateModel education;
        private int id;
        private StateModel maritalState;
        private String borrowerRelationName;
        private String borrowerRelationType;
        private LocationModel nowLivingLocation;
        private String personId;
        private String personName;
        private String phone;
        private String picGroupId;
        private StateModel workSituation;
        private StateModel workType;
        private String applyAddressId;
        private StateModel authState;

        public Builder() {
        }

        public Builder withApplyPersonId(String val) {
            applyPersonId = val;
            return this;
        }

        public Builder withWorkDesc(String val) {
            workDesc = val;
            return this;
        }

        public Builder withCardExpiryDate(String val) {
            cardExpiryDate = val;
            return this;
        }

        public Builder withCardId(String val) {
            cardId = val;
            return this;
        }

        public Builder withEducation(StateModel val) {
            education = val;
            return this;
        }

        public Builder withId(int val) {
            id = val;
            return this;
        }

        public Builder withMaritalState(StateModel val) {
            maritalState = val;
            return this;
        }

        public Builder withBorrowerRelationName(String val) {
            borrowerRelationName = val;
            return this;
        }

        public Builder withBorrowerRelationType(String val) {
            borrowerRelationType = val;
            return this;
        }

        public Builder withNowLivingLocation(LocationModel val) {
            nowLivingLocation = val;
            return this;
        }

        public Builder withPersonId(String val) {
            personId = val;
            return this;
        }

        public Builder withPersonName(String val) {
            personName = val;
            return this;
        }

        public Builder withPhone(String val) {
            phone = val;
            return this;
        }

        public Builder withPicGroupId(String val) {
            picGroupId = val;
            return this;
        }

        public Builder withWorkSituation(StateModel val) {
            workSituation = val;
            return this;
        }

        public Builder withWorkType(StateModel val) {
            workType = val;
            return this;
        }

        public Builder withApplyAddressId(String val) {
            applyAddressId = val;
            return this;
        }

        public Builder withAuthState(StateModel val) {
            authState = val;
            return this;
        }

        public CoborrowerInfoModel build() {
            return new CoborrowerInfoModel(this);
        }
    }
}

