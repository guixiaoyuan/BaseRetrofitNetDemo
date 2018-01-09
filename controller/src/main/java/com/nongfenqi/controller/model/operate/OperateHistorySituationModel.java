package com.nongfenqi.controller.model.operate;

/**
 * Function
 * 经营历史概况
 *
 * @author jiezhi
 * @version 1.0, 03/11/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */
public class OperateHistorySituationModel {
    private static final String TAG = OperateHistorySituationModel.class.getSimpleName();

    /**
     * beginDate : 2016-11-03 15:26:58
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

    public OperateHistorySituationModel(Builder builder) {
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

    public String getLargeExpenseExplain() {
        return largeExpenseExplain;
    }

    public void setLargeExpenseExplain(String largeExpenseExplain) {
        this.largeExpenseExplain = largeExpenseExplain;
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

    public static final class Builder {
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

        public OperateHistorySituationModel Builder() {
            return new OperateHistorySituationModel(this);
        }
    }


    @Override
    public String toString() {
        return "OperateHistorySituationModel{" +
                "beginDate='" + beginDate + '\'' +
                ", id=" + id +
                ", incomeExplain='" + incomeExplain + '\'' +
                ", largeExpense=" + largeExpense +
                ", largeExpenseExplain='" + largeExpenseExplain + '\'' +
                ", netIncome=" + netIncome +
                '}';
    }
}
