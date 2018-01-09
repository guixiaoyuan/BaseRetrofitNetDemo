package com.nongfenqi.controller.model.payee;

/**
 * Function
 * 个人代理收款信息
 *
 * @author jiezhi
 * @version 1.0, 07/02/2017
 * @see [相关类/方法]
 * @since [农人帮/V1.1.2]
 */
public class PayeePersonalModel {
    private static final String TAG = PayeePersonalModel.class.getSimpleName();


    /**
     * bankBranchId : 中国农业银行苏州新市支行
     * bankBranchName : 103305055528
     * bankIcon : 123
     * bankId : 103
     * bankName : 中国农业银行
     * idCard : 320503197109018398
     * payeeBankCard : 6222610200021928321
     * payeeName : 张三
     * remark : 我是备注
     * reservedPhone : 18649392012
     */
    private String bankBranchId;
    private String bankBranchName;
    private String bankIcon;
    private String bankId;
    private String bankName;
    private String idCard;
    private String payeeBankCard;
    private String payeeName;
    private String remark;
    private String reservedPhone;

    public String getBankBranchId() {
        return bankBranchId;
    }

    public void setBankBranchId(String bankBranchId) {
        this.bankBranchId = bankBranchId;
    }

    public String getBankBranchName() {
        return bankBranchName;
    }

    public void setBankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName;
    }

    public String getBankIcon() {
        return bankIcon;
    }

    public void setBankIcon(String bankIcon) {
        this.bankIcon = bankIcon;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPayeeBankCard() {
        return payeeBankCard;
    }

    public void setPayeeBankCard(String payeeBankCard) {
        this.payeeBankCard = payeeBankCard;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getReservedPhone() {
        return reservedPhone;
    }

    public void setReservedPhone(String reservedPhone) {
        this.reservedPhone = reservedPhone;
    }
}
