package com.nongfenqi.controller.model.credit;

import java.io.Serializable;

/**
 * Function
 *
 * @author jiezhi
 * @version 1.0, 16/11/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */
public class CreditPbcModel implements Serializable {

    /**
     * creditAccount : abc123
     * creditPassword : 123456
     * id : 1
     * personId : P000001
     * remark : 备注
     */

    private String creditAccount;
    private String creditPassword;
    private int id;
    private String personId;
    private String remark;

    public String getCreditAccount() {
        return creditAccount;
    }

    public void setCreditAccount(String creditAccount) {
        this.creditAccount = creditAccount;
    }

    public String getCreditPassword() {
        return creditPassword;
    }

    public void setCreditPassword(String creditPassword) {
        this.creditPassword = creditPassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
