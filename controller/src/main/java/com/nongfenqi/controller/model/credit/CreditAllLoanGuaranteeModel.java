package com.nongfenqi.controller.model.credit;

import java.util.List;

/**
 * Function
 *
 * @author jiezhi
 * @version 1.0, 17/11/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */
public class CreditAllLoanGuaranteeModel {

    /**
     * applyDate : 2017-10-27 09:39:16
     * applyId : ED20160512100000
     * applyName : 江苏南京客户客户提交了农户/农机手模板申请
     * applyState : {"id":0,"name":"string"}
     * buyBackDetails : [{"buyBackType":0,"loanId":"string","operateTime":"2017-10-27 09:39:16","operator":"string","repayPlanDetailId":"string"}]
     * contractManagerUserId : U1000000000
     * contractManagerUserName : 测试姓名
     * currentPeriod : 1
     * customerId : 1
     * customerName : string
     * extensionDetails : [{"changeType":0,"loanId":"string","operateTime":"2017-10-27 09:39:16","operator":"string","repayPlanDetailId":"string"}]
     * extensionNumber : 0
     * grossInterest : 1988
     * grossPrincipal : 100000
     * overdueNumber : 1
     * periods : 3
     * repaymentInterest : 88
     * repaymentPrincipal : 188
     * repaymentType : {"id":0,"name":"string"}
     */

    private String applyDate;
    private String applyId;
    private String applyName;
    private ApplyStateEntity applyState;
    private String contractManagerUserId;
    private String contractManagerUserName;
    private int currentPeriod;
    private String customerId;
    private String customerName;
    private int extensionNumber;
    private float grossInterest;
    private float grossPrincipal;
    private int overdueNumber;
    private int periods;
    private float repaymentInterest;
    private float repaymentPrincipal;
    private RepaymentTypeEntity repaymentType;
    private List<BuyBackDetailsEntity> buyBackDetails;
    private List<ExtensionDetailsEntity> extensionDetails;

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    public void setApplyName(String applyName) {
        this.applyName = applyName;
    }

    public void setApplyState(ApplyStateEntity applyState) {
        this.applyState = applyState;
    }

    public void setContractManagerUserId(String contractManagerUserId) {
        this.contractManagerUserId = contractManagerUserId;
    }

    public void setContractManagerUserName(String contractManagerUserName) {
        this.contractManagerUserName = contractManagerUserName;
    }

    public void setCurrentPeriod(int currentPeriod) {
        this.currentPeriod = currentPeriod;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setExtensionNumber(int extensionNumber) {
        this.extensionNumber = extensionNumber;
    }

    public void setGrossInterest(float grossInterest) {
        this.grossInterest = grossInterest;
    }

    public void setGrossPrincipal(float grossPrincipal) {
        this.grossPrincipal = grossPrincipal;
    }

    public void setOverdueNumber(int overdueNumber) {
        this.overdueNumber = overdueNumber;
    }

    public void setPeriods(int periods) {
        this.periods = periods;
    }

    public void setRepaymentInterest(float repaymentInterest) {
        this.repaymentInterest = repaymentInterest;
    }

    public void setRepaymentPrincipal(float repaymentPrincipal) {
        this.repaymentPrincipal = repaymentPrincipal;
    }

    public void setRepaymentType(RepaymentTypeEntity repaymentType) {
        this.repaymentType = repaymentType;
    }

    public void setBuyBackDetails(List<BuyBackDetailsEntity> buyBackDetails) {
        this.buyBackDetails = buyBackDetails;
    }

    public void setExtensionDetails(List<ExtensionDetailsEntity> extensionDetails) {
        this.extensionDetails = extensionDetails;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public String getApplyId() {
        return applyId;
    }

    public String getApplyName() {
        return applyName;
    }

    public ApplyStateEntity getApplyState() {
        return applyState;
    }

    public String getContractManagerUserId() {
        return contractManagerUserId;
    }

    public String getContractManagerUserName() {
        return contractManagerUserName;
    }

    public int getCurrentPeriod() {
        return currentPeriod;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getExtensionNumber() {
        return extensionNumber;
    }

    public float getGrossInterest() {
        return grossInterest;
    }

    public float getGrossPrincipal() {
        return grossPrincipal;
    }

    public int getOverdueNumber() {
        return overdueNumber;
    }

    public int getPeriods() {
        return periods;
    }

    public float getRepaymentInterest() {
        return repaymentInterest;
    }

    public float getRepaymentPrincipal() {
        return repaymentPrincipal;
    }

    public RepaymentTypeEntity getRepaymentType() {
        return repaymentType;
    }

    public List<BuyBackDetailsEntity> getBuyBackDetails() {
        return buyBackDetails;
    }

    public List<ExtensionDetailsEntity> getExtensionDetails() {
        return extensionDetails;
    }

    public static class ApplyStateEntity {
        /**
         * id : 0
         * name : string
         */

        private int id;
        private String name;

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

    public static class RepaymentTypeEntity {
        /**
         * id : 0
         * name : string
         */

        private int id;
        private String name;

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

    public static class BuyBackDetailsEntity {
        /**
         * buyBackType : 0
         * loanId : string
         * operateTime : 2017-10-27 09:39:16
         * operator : string
         * repayPlanDetailId : string
         */

        private int buyBackType;
        private String loanId;
        private String operateTime;
        private String operator;
        private String repayPlanDetailId;

        public void setBuyBackType(int buyBackType) {
            this.buyBackType = buyBackType;
        }

        public void setLoanId(String loanId) {
            this.loanId = loanId;
        }

        public void setOperateTime(String operateTime) {
            this.operateTime = operateTime;
        }

        public void setOperator(String operator) {
            this.operator = operator;
        }

        public void setRepayPlanDetailId(String repayPlanDetailId) {
            this.repayPlanDetailId = repayPlanDetailId;
        }

        public int getBuyBackType() {
            return buyBackType;
        }

        public String getLoanId() {
            return loanId;
        }

        public String getOperateTime() {
            return operateTime;
        }

        public String getOperator() {
            return operator;
        }

        public String getRepayPlanDetailId() {
            return repayPlanDetailId;
        }
    }

    public static class ExtensionDetailsEntity {
        /**
         * changeType : 0
         * loanId : string
         * operateTime : 2017-10-27 09:39:16
         * operator : string
         * repayPlanDetailId : string
         */

        private int changeType;
        private String loanId;
        private String operateTime;
        private String operator;
        private String repayPlanDetailId;

        public void setChangeType(int changeType) {
            this.changeType = changeType;
        }

        public void setLoanId(String loanId) {
            this.loanId = loanId;
        }

        public void setOperateTime(String operateTime) {
            this.operateTime = operateTime;
        }

        public void setOperator(String operator) {
            this.operator = operator;
        }

        public void setRepayPlanDetailId(String repayPlanDetailId) {
            this.repayPlanDetailId = repayPlanDetailId;
        }

        public int getChangeType() {
            return changeType;
        }

        public String getLoanId() {
            return loanId;
        }

        public String getOperateTime() {
            return operateTime;
        }

        public String getOperator() {
            return operator;
        }

        public String getRepayPlanDetailId() {
            return repayPlanDetailId;
        }
    }
}
