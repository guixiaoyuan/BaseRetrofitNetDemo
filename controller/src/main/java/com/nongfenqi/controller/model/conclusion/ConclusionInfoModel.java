package com.nongfenqi.controller.model.conclusion;

import com.nongfenqi.controller.model.common.StateModel;

/**
 * 调查表－调查结论实体
 *
 * @author colin
 * @version 1.0, 16/12/7
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */

public class ConclusionInfoModel {

    /**
     * adviceLoanAmount : 0
     * advicePayWay : {"id":0,"name":"string"}
     * advicePeriods : 12
     * conclusion : string
     * id : 1
     */

    private double adviceLoanAmount;
    /**
     * id : 0
     * name : string
     */

    private StateModel advicePayWay;
    private int advicePeriods;
    private String conclusion;
    private int id;

    private ConclusionInfoModel(Builder builder) {
        setAdviceLoanAmount(builder.adviceLoanAmount);
        setAdvicePayWay(builder.advicePayWay);
        setAdvicePeriods(builder.advicePeriods);
        setConclusion(builder.conclusion);
        setId(builder.id);
    }

    public ConclusionInfoModel() {
    }

    public double getAdviceLoanAmount() {
        return adviceLoanAmount;
    }

    public void setAdviceLoanAmount(double adviceLoanAmount) {
        this.adviceLoanAmount = adviceLoanAmount;
    }


    public StateModel getAdvicePayWay() {
        return advicePayWay;
    }

    public void setAdvicePayWay(StateModel advicePayWay) {
        this.advicePayWay = advicePayWay;
    }

    public int getAdvicePeriods() {
        return advicePeriods;
    }

    public void setAdvicePeriods(int advicePeriods) {
        this.advicePeriods = advicePeriods;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ConclusionInfoModel{" +
                "adviceLoanAmount=" + adviceLoanAmount +
                ", advicePayWay=" + advicePayWay +
                ", advicePeriods=" + advicePeriods +
                ", conclusion='" + conclusion + '\'' +
                ", id=" + id +
                '}';
    }

    public static final class Builder {
        private double adviceLoanAmount;
        private StateModel advicePayWay;
        private int advicePeriods;
        private String conclusion;
        private int id;

        public Builder() {
        }

        public Builder withAdviceLoanAmount(double val) {
            adviceLoanAmount = val;
            return this;
        }

        public Builder withAdvicePayWay(StateModel val) {
            advicePayWay = val;
            return this;
        }

        public Builder withAdvicePeriods(int val) {
            advicePeriods = val;
            return this;
        }

        public Builder withConclusion(String val) {
            conclusion = val;
            return this;
        }

        public Builder withId(int val) {
            id = val;
            return this;
        }

        public ConclusionInfoModel build() {
            return new ConclusionInfoModel(this);
        }
    }
}
