package com.nongfenqi.controller.model.business;

import com.nongfenqi.controller.model.common.StateModel;

import java.io.Serializable;

/**
 * 关系人
 *
 * @author jiezhi
 * @version 1.0, 01/04/2017
 * @since [sherlock/V1.0.0]
 */
public class PersonModel implements Serializable {


    /**
     * applyId : string
     * authState : {"id":0,"name":"string"}
     * cardExpiryDate : 2017-04-07 09:10:50
     * cardId : string
     * education : {"id":0,"name":"string"}
     * id : string
     * maritalState : {"id":0,"name":"string"}
     * personId : string
     * personLabel : {"id":0,"name":"string"}
     * personName : string
     * phone : string
     */

    private String applyId;
    private StateModel authState;
    private String cardExpiryDate;
    private String cardId;
    private StateModel education;
    private String id;
    private StateModel maritalState;
    private String personId;
    private StateModel personLabel;
    private String personName;
    private String phone;

    public PersonModel() {
    }

    private PersonModel(Builder builder) {
        setApplyId(builder.applyId);
        setAuthState(builder.authState);
        setCardExpiryDate(builder.cardExpiryDate);
        setCardId(builder.cardId);
        setEducation(builder.education);
        setId(builder.id);
        setMaritalState(builder.maritalState);
        setPersonId(builder.personId);
        setPersonLabel(builder.personLabel);
        setPersonName(builder.personName);
        setPhone(builder.phone);
    }

    public StateModel getAuthState() {
        return authState;
    }

    public void setAuthState(StateModel authState) {
        this.authState = authState;
    }

    public StateModel getEducation() {
        return education;
    }

    public void setEducation(StateModel education) {
        this.education = education;
    }

    public StateModel getMaritalState() {
        return maritalState;
    }

    public void setMaritalState(StateModel maritalState) {
        this.maritalState = maritalState;
    }

    public StateModel getPersonLabel() {
        return personLabel;
    }

    public void setPersonLabel(StateModel personLabel) {
        this.personLabel = personLabel;
    }

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
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


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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


    @Override
    public String toString() {
        return "PersonModel{" +
                "applyId='" + applyId + '\'' +
                ", authState=" + authState +
                ", cardExpiryDate='" + cardExpiryDate + '\'' +
                ", cardId='" + cardId + '\'' +
                ", education=" + education +
                ", id='" + id + '\'' +
                ", maritalState=" + maritalState +
                ", personId='" + personId + '\'' +
                ", personLabel=" + personLabel +
                ", personName='" + personName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static final class Builder {
        private String applyId;
        private StateModel authState;
        private String cardExpiryDate;
        private String cardId;
        private StateModel education;
        private String id;
        private StateModel maritalState;
        private String personId;
        private StateModel personLabel;
        private String personName;
        private String phone;

        public Builder() {
        }

        public Builder withApplyId(String val) {
            applyId = val;
            return this;
        }

        public Builder withAuthState(StateModel val) {
            authState = val;
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

        public Builder withId(String val) {
            id = val;
            return this;
        }

        public Builder withMaritalState(StateModel val) {
            maritalState = val;
            return this;
        }

        public Builder withPersonId(String val) {
            personId = val;
            return this;
        }

        public Builder withPersonLabel(StateModel val) {
            personLabel = val;
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

        public PersonModel build() {
            return new PersonModel(this);
        }
    }
}

