package com.nongfenqi.controller.model.operate;

/**
 * Function
 *
 * @author jiezhi
 * @version 1.0, 15/11/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */
public class OperateHistoryOtherModel {
    private static final String TAG = OperateHistoryOtherModel.class.getSimpleName();

    /**
     * beginDate : 2016-11-15 09:48:55
     * content : 写点经营内容吧
     * cost : 2000
     * endDate : 2016-11-15 09:48:55
     * id : 1
     * income : 10000
     * manageType : {"id":0,"name":"string"}
     * operateHistoryId : 1
     * operateHistorySituationId : 1
     */

    private String beginDate;
    private String content;
    private float cost;
    private String endDate;
    private int id;
    private float income;
    private ManageTypeEntity manageType;
    private int operateHistoryId;
    private int operateHistorySituationId;

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getIncome() {
        return income;
    }

    public void setIncome(float income) {
        this.income = income;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ManageTypeEntity getManageType() {
        return manageType;
    }

    public void setManageType(ManageTypeEntity manageType) {
        this.manageType = manageType;
    }

    public int getOperateHistoryId() {
        return operateHistoryId;
    }

    public void setOperateHistoryId(int operateHistoryId) {
        this.operateHistoryId = operateHistoryId;
    }

    public int getOperateHistorySituationId() {
        return operateHistorySituationId;
    }

    public void setOperateHistorySituationId(int operateHistorySituationId) {
        this.operateHistorySituationId = operateHistorySituationId;
    }

    public static class ManageTypeEntity {
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

    @Override
    public String toString() {
        return "OperateHistoryOtherModel{" +
                "beginDate='" + beginDate + '\'' +
                ", content='" + content + '\'' +
                ", cost=" + cost +
                ", endDate='" + endDate + '\'' +
                ", id=" + id +
                ", income=" + income +
                ", manageType=" + manageType +
                ", operateHistoryId=" + operateHistoryId +
                ", operateHistorySituationId=" + operateHistorySituationId +
                '}';
    }
}
