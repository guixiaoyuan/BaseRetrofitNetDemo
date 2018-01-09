package com.nongfenqi.controller.model.quest;

import com.nongfenqi.controller.model.business.ApplyPayeeTypeModel;

/**
 * 申请用途－受托情况
 *
 * @author colin
 * @version 1.0, 16/12/6
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */

public class AcceptPayeeModel {

    /**
     * id : 0
     * name : string
     */

    private AccountTypeEntity accountType;
    /**
     * id : 0
     * name : string
     */

    private ApplyPayeeTypeModel payeeType;
    /**
     * accountType : {"id":0,"name":"string"}
     * payeeType : {"id":0,"name":"string"}
     * picGroupId : string
     */
    private String picGroupId;

    public AccountTypeEntity getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountTypeEntity accountType) {
        this.accountType = accountType;
    }

    public ApplyPayeeTypeModel getPayeeType() {
        return payeeType;
    }

    public void setPayeeType(ApplyPayeeTypeModel payeeType) {
        this.payeeType = payeeType;
    }

    public String getPicGroupId() {
        return picGroupId;
    }

    public void setPicGroupId(String picGroupId) {
        this.picGroupId = picGroupId;
    }

    public static class AccountTypeEntity {
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
