package com.nongfenqi.controller.model.credit;

/**
 * 申请报告需要信息
 *
 * @author luzhichao
 * @version 2.1, 17/6/2
 * @since [sherlock/V2.1.0]
 */

public class ReportInfoModel {
    /**
     * name : string
     * cardId : string
     * mobile : string
     * bankCard : string
     * loanAmount : 0
     * loanTerm : 0
     * loanDate : 2017-06-02 15:23:11
     * flowId : string
     */

    private String name;
    private String cardId;
    private String mobile;
    private String bankCard;
    private int loanAmount;
    private int loanTerm;
    private String loanDate;
    private String flowId;

    public ReportInfoModel() {
    }

    private ReportInfoModel(Builder builder) {
        setName(builder.name);
        setCardId(builder.cardId);
        setMobile(builder.mobile);
        setBankCard(builder.bankCard);
        setLoanAmount(builder.loanAmount);
        setLoanTerm(builder.loanTerm);
        setLoanDate(builder.loanDate);
        setFlowId(builder.flowId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
    }

    public String getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;
    }

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    public static final class Builder {
        private String name;
        private String cardId;
        private String mobile;
        private String bankCard;
        private int loanAmount;
        private int loanTerm;
        private String loanDate;
        private String flowId;

        public Builder() {
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder cardId(String val) {
            cardId = val;
            return this;
        }

        public Builder mobile(String val) {
            mobile = val;
            return this;
        }

        public Builder bankCard(String val) {
            bankCard = val;
            return this;
        }

        public Builder loanAmount(int val) {
            loanAmount = val;
            return this;
        }

        public Builder loanTerm(int val) {
            loanTerm = val;
            return this;
        }

        public Builder loanDate(String val) {
            loanDate = val;
            return this;
        }

        public Builder flowId(String val) {
            flowId = val;
            return this;
        }

        public ReportInfoModel build() {
            return new ReportInfoModel(this);
        }
    }
}
