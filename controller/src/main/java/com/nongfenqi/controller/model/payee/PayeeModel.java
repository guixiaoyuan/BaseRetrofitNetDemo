package com.nongfenqi.controller.model.payee;

/**
 * Function
 * 收款方查询
 *
 * @author jiezhi
 * @version 1.0, 07/02/2017
 * @see [相关类/方法]
 * @since [农人帮/V1.1.2]
 */
public class PayeeModel {
    private static final String TAG = PayeeModel.class.getSimpleName();


    /**
     * accountType : {"id":0,"name":"string"}
     * payeeType : {"id":0,"name":"string"}
     * picGroupId : string
     */
    private AccountTypeEntity accountType;
    private PayeeTypeEntity payeeType;
    private String picGroupId;

    public AccountTypeEntity getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountTypeEntity accountType) {
        this.accountType = accountType;
    }

    public PayeeTypeEntity getPayeeType() {
        return payeeType;
    }

    public void setPayeeType(PayeeTypeEntity payeeType) {
        this.payeeType = payeeType;
    }

    public String getPicGroupId() {
        return picGroupId;
    }

    public void setPicGroupId(String picGroupId) {
        this.picGroupId = picGroupId;
    }

    public static class AccountTypeEntity {
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

    public static class PayeeTypeEntity {
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
