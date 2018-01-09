package com.nongfenqi.controller.model.credit;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * 信用报告人员信息
 *
 * @author luzhichao
 * @version 1.0, 17/4/13
 * @since [sherlock/V1.0.0]
 */

public class CreditMemBerModel implements Serializable, Parcelable {
    private static final String TAG = "CreditMemBerModel";

    public static final int CUSTOMER = 0;
    public static final int CO_BORROWER = 1;
    public static final int GUARANTOR = 2;

    private String personName;
    private String cardId;
    private String personId;

    private String phone;

    private boolean hasRealName;
    private int type;
    private String applyId;

    public CreditMemBerModel() {
    }

    private CreditMemBerModel(Builder builder) {
        setPersonName(builder.personName);
        setCardId(builder.cardId);
        setPersonId(builder.personId);
        setType(builder.type);
        setApplyId(builder.applyString);
        setHasRealName(builder.hasRealName);
        setPhone(builder.phone);
    }

    protected CreditMemBerModel(Parcel in) {
        personName = in.readString();
        cardId = in.readString();
        personId = in.readString();
        hasRealName = in.readByte() != 0;
        type = in.readInt();
        applyId = in.readString();
        phone = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(personName);
        dest.writeString(cardId);
        dest.writeString(personId);
        dest.writeByte((byte) (hasRealName ? 1 : 0));
        dest.writeInt(type);
        dest.writeString(applyId);
        dest.writeString(phone);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<CreditMemBerModel> CREATOR = new Creator<CreditMemBerModel>() {
        @Override
        public CreditMemBerModel createFromParcel(Parcel in) {
            return new CreditMemBerModel(in);
        }

        @Override
        public CreditMemBerModel[] newArray(int size) {
            return new CreditMemBerModel[size];
        }
    };

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public boolean isHasRealName() {
        return hasRealName;
    }

    public void setHasRealName(boolean hasRealName) {
        this.hasRealName = hasRealName;
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

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    public static final class Builder implements Serializable {
        private String personName;
        private String cardId;
        private String personId;
        private String applyString;
        private String phone;
        private int type;
        private boolean hasRealName;

        public Builder() {
        }

        public Builder personName(String val) {
            personName = val;
            return this;
        }

        public Builder setHasRealName(boolean val) {
            hasRealName = val;
            return this;
        }

        public Builder setPhone(String val) {
            phone = val;
            return this;
        }

        public Builder cardId(String val) {
            cardId = val;
            return this;
        }

        public Builder personId(String val) {
            personId = val;
            return this;
        }

        public Builder type(int val) {
            type = val;
            return this;
        }

        public Builder applyString(String val) {
            applyString = val;
            return this;
        }

        public CreditMemBerModel build() {
            return new CreditMemBerModel(this);
        }
    }
}
