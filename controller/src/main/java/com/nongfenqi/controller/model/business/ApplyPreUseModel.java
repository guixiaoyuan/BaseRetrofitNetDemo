package com.nongfenqi.controller.model.business;

/**
 * 预申请
 *
 * @author jiezhi
 * @version 1.0, 14/03/2017
 * @since [Sherlock/V1.0.0]
 */
public class ApplyPreUseModel {
    private static final String TAG = ApplyPreUseModel.class.getSimpleName();

    /**
     * accountType : {"id":0,"name":"string"}
     * applyAmount : 30000
     * dealerId : JX1000
     * dealerName : 马鞍山农机经销商
     * downPayment : 10000
     * machineCode : M100000
     * payeeType : {"id":0,"name":"string"}
     * price : 40000
     * type : 收割机-久保田-PRO-GH688Q
     * useType : 1
     */
    private AccountTypeEntity accountType;
    private float applyAmount;
    private String dealerId;
    private String dealerName;
    private float downPayment;
    private String machineCode;
    private ApplyPayeeTypeModel payeeType;
    private int price;
    private String type;
    private int useType;

    private ApplyPreUseModel(Builder builder) {
        setAccountType(builder.accountType);
        setApplyAmount(builder.applyAmount);
        setDealerId(builder.dealerId);
        setDealerName(builder.dealerName);
        setDownPayment(builder.downPayment);
        setMachineCode(builder.machineCode);
        setPayeeType(builder.payeeType);
        setPrice(builder.price);
        setType(builder.type);
        setUseType(builder.useType);
    }

    public AccountTypeEntity getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountTypeEntity accountType) {
        this.accountType = accountType;
    }

    public float getApplyAmount() {
        return applyAmount;
    }

    public void setApplyAmount(float applyAmount) {
        this.applyAmount = applyAmount;
    }

    public String getDealerId() {
        return dealerId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public float getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(float downPayment) {
        this.downPayment = downPayment;
    }

    public String getMachineCode() {
        return machineCode;
    }

    public void setMachineCode(String machineCode) {
        this.machineCode = machineCode;
    }

    public ApplyPayeeTypeModel getPayeeType() {
        return payeeType;
    }

    public void setPayeeType(ApplyPayeeTypeModel payeeType) {
        this.payeeType = payeeType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getUseType() {
        return useType;
    }

    public void setUseType(int useType) {
        this.useType = useType;
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

    public static final class Builder {
        private AccountTypeEntity accountType;
        private float applyAmount;
        private String dealerId;
        private String dealerName;
        private float downPayment;
        private String machineCode;
        private ApplyPayeeTypeModel payeeType;
        private int price;
        private String type;
        private int useType;

        public Builder() {
        }

        public Builder accountType(AccountTypeEntity val) {
            accountType = val;
            return this;
        }

        public Builder applyAmount(float val) {
            applyAmount = val;
            return this;
        }

        public Builder dealerId(String val) {
            dealerId = val;
            return this;
        }

        public Builder dealerName(String val) {
            dealerName = val;
            return this;
        }

        public Builder downPayment(float val) {
            downPayment = val;
            return this;
        }

        public Builder machineCode(String val) {
            machineCode = val;
            return this;
        }

        public Builder payeeType(ApplyPayeeTypeModel val) {
            payeeType = val;
            return this;
        }

        public Builder price(int val) {
            price = val;
            return this;
        }

        public Builder type(String val) {
            type = val;
            return this;
        }

        public Builder useType(int val) {
            useType = val;
            return this;
        }

        public ApplyPreUseModel build() {
            return new ApplyPreUseModel(this);
        }
    }
}
