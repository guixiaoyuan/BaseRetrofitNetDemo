package com.nongfenqi.controller.model.business;

import java.io.Serializable;

/**
 * @author yuanfei
 * @version 1.0, 2017/4/20
 * @since [sherlock/V1.0.0]
 */

public class PersonNameConfirmModel implements Serializable {

    /**
     * cardId : 110101201003054652
     * personId : P00000000001
     * personName : 张三
     */

    private String cardId;
    private String personId;
    private String personName;
    private String applyPersonId;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getApplyPersonId(){
        return applyPersonId;
    }
    public void setApplyPersonId(String applyPersonId){
        this.applyPersonId = applyPersonId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }
}
