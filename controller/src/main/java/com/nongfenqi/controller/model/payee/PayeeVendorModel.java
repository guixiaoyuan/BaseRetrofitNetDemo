package com.nongfenqi.controller.model.payee;

/**
 * Function
 * 农机厂家代理收款信息
 *
 * @author jiezhi
 * @version 1.0, 07/02/2017
 * @see [相关类/方法]
 * @since [农人帮/V1.1.2]
 */
public class PayeeVendorModel {
    private static final String TAG = PayeeVendorModel.class.getSimpleName();


    /**
     * bankBranchId : 中国农业银行苏州新市支行
     * bankBranchName : 103305055528
     * bankIcon : 123
     * bankId : 103
     * bankName : 中国农业银行
     * companyName : 常州富达农机贸易有限公司
     * distributorId : T8080
     * licenseNumber : 532501100006302
     * payeeBankCard : 6228480402564890018
     * payeeName : 常州富达农机贸易有限公司
     * remark : 我是备注
     */
    private String bankBranchId;
    private String bankBranchName;
    private String bankIcon;
    private String bankId;
    private String bankName;
    private String companyName;
    private String distributorId;
    private String licenseNumber;
    private String payeeBankCard;
    private String payeeName;
    private String remark;

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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(String distributorId) {
        this.distributorId = distributorId;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
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
}
