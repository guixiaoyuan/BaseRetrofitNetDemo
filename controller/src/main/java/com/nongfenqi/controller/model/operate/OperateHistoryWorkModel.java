package com.nongfenqi.controller.model.operate;

/**
 * Function
 *
 * @author jiezhi
 * @version 1.0, 15/11/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */
public class OperateHistoryWorkModel {
    private static final String TAG = OperateHistoryWorkModel.class.getSimpleName();

    /**
     * beginDate : 2016-11-15 09:48:55
     * endDate : 2016-11-15 09:48:55
     * id : 1
     * income : 50000
     * manageType : {"id":0,"name":"string"}
     * operateHistoryId : 1
     * operateHistorySituationId : 1
     * profession : 粉刷
     */
    private String beginDate;
    private String endDate;
    private int id;
    private float income;
    private ManageTypeEntity manageType;
    private int operateHistoryId;
    private int operateHistorySituationId;
    private String profession;

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
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

    public float getIncome() {
        return income;
    }

    public void setIncome(float income) {
        this.income = income;
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

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
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
        return "OperateHistoryWorkModel{" +
                "beginDate='" + beginDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", id=" + id +
                ", income=" + income +
                ", manageType=" + manageType +
                ", operateHistoryId=" + operateHistoryId +
                ", operateHistorySituationId=" + operateHistorySituationId +
                ", profession='" + profession + '\'' +
                '}';
    }
}
