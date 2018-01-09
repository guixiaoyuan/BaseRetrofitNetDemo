package com.nongfenqi.controller.model.operate;

import java.io.Serializable;
import java.util.List;

/**
 * Function
 * 经营历史概况
 *
 * @author jiezhi
 * @version 1.0, 02/11/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */
public class OperateHistoryModel implements Serializable {
    private static final String TAG = OperateHistoryModel.class.getSimpleName();

    /**
     * applyOperateHisLargeExpenseDetails : [{"beginDate":"2016-11-19 17:10:56","expenseAmount":30000,"expenseContent":"购买二手农机","id":1,"operateHistorySituationId":1}]
     * applyOperateHistoryItems : [{"beginDate":"2016-11-19 17:10:56","endDate":"2016-11-19 17:10:56","id":0,"manageType":{"id":0,"name":"string"},"operateHistoryId":0,"operateHistorySituationId":0}]
     * beginDate : 2016-11-19 17:10:56
     * id : 1
     * incomeExplain : 修车10000，卖猪20000
     * largeExpense : 50000
     * largeExpenseExplain : 买了辆小轿车花了50000
     * netIncome : 30000
     */

    private String beginDate;
    private int id;
    private String incomeExplain;
    private float largeExpense;
    private String largeExpenseExplain;
    private float netIncome;
    private List<OperateHistoryExpenseModel> applyOperateHisLargeExpenseDetails;
    private List<OperateHistoryIncomeModel> applyOperateHistoryItems;

    public OperateHistoryModel(Builder builder) {
        setBeginDate(builder.beginDate);
        setNetIncome(builder.netIncome);
        setLargeExpense(builder.largeExpense);
        setIncomeExplain(builder.incomeExpelain);
        setLargeExpenseExplain(builder.largeExpenseExplain);
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIncomeExplain() {
        return incomeExplain;
    }

    public void setIncomeExplain(String incomeExplain) {
        this.incomeExplain = incomeExplain;
    }

    public float getLargeExpense() {
        return largeExpense;
    }

    public void setLargeExpense(float largeExpense) {
        this.largeExpense = largeExpense;
    }

    public float getNetIncome() {
        return netIncome;
    }

    public void setNetIncome(float netIncome) {
        this.netIncome = netIncome;
    }

    public void setLargeExpense(int largeExpense) {
        this.largeExpense = largeExpense;
    }

    public String getLargeExpenseExplain() {
        return largeExpenseExplain;
    }

    public void setLargeExpenseExplain(String largeExpenseExplain) {
        this.largeExpenseExplain = largeExpenseExplain;
    }

    public void setNetIncome(int netIncome) {
        this.netIncome = netIncome;
    }

    public List<OperateHistoryExpenseModel> getApplyOperateHisLargeExpenseDetails() {
        return applyOperateHisLargeExpenseDetails;
    }

    public void setApplyOperateHisLargeExpenseDetails(List<OperateHistoryExpenseModel> applyOperateHisLargeExpenseDetails) {
        this.applyOperateHisLargeExpenseDetails = applyOperateHisLargeExpenseDetails;
    }

    public List<OperateHistoryIncomeModel> getApplyOperateHistoryItems() {
        return applyOperateHistoryItems;
    }

    public void setApplyOperateHistoryItems(List<OperateHistoryIncomeModel> applyOperateHistoryItems) {
        this.applyOperateHistoryItems = applyOperateHistoryItems;
    }

    public static final class Builder implements Serializable{
        private float netIncome;
        private float largeExpense;
        private String incomeExpelain;
        private String largeExpenseExplain;
        private String beginDate;

        public Builder() {
        }

        public Builder withBeginDate(String val) {
            beginDate = val;
            return this;
        }

        public Builder withNetIncome(float val) {
            netIncome = val;
            return this;
        }

        public Builder withIncomeExpelain(String val) {
            incomeExpelain = val;
            return this;
        }

        public Builder withLargeExpense(float val) {
            largeExpense = val;
            return this;
        }

        public Builder withLargeExpenseExplain(String val) {
            largeExpenseExplain = val;
            return this;
        }

        public OperateHistoryModel Builder() {
            return new OperateHistoryModel(this);
        }
    }

    @Override
    public String toString() {
        return "OperateHistoryModel{" +
                "beginDate='" + beginDate + '\'' +
                ", id=" + id +
                ", incomeExplain='" + incomeExplain + '\'' +
                ", largeExpense=" + largeExpense +
                ", largeExpenseExplain='" + largeExpenseExplain + '\'' +
                ", netIncome=" + netIncome +
                ", applyOperateHisLargeExpenseDetails=" + applyOperateHisLargeExpenseDetails +
                ", applyOperateHistoryItems=" + applyOperateHistoryItems +
                '}';
    }
}
