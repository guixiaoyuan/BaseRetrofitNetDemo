package com.nongfenqi.controller.model.operate;

import java.io.Serializable;

/**
 * Function
 * 大额支出
 *
 * @author jiezhi
 * @version 1.0, 09/11/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */
public class OperateHistoryExpenseModel implements Serializable{
    private static final String TAG = OperateHistoryExpenseModel.class.getSimpleName();


    /**
     * beginDate : 2016-11-09 09:03:10
     * expenseAmount : 30000
     * expenseContent : 购买二手农机
     * id : 1
     * operateHistorySituationId : 1
     */

    private String beginDate;
    private float expenseAmount;
    private String expenseContent;
    private int id;
    private int operateHistorySituationId;

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public void setExpenseAmount(int expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    public String getExpenseContent() {
        return expenseContent;
    }

    public void setExpenseContent(String expenseContent) {
        this.expenseContent = expenseContent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOperateHistorySituationId() {
        return operateHistorySituationId;
    }

    /**
     * @param operateHistorySituationId
     */
    public void setOperateHistorySituationId(int operateHistorySituationId) {
        this.operateHistorySituationId = operateHistorySituationId;
    }

    public float getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(float expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    @Override
    public String toString() {
        return "OperateHistoryExpenseModel{" +
                "beginDate='" + beginDate + '\'' +
                ", expenseAmount=" + expenseAmount +
                ", expenseContent='" + expenseContent + '\'' +
                ", id=" + id +
                ", operateHistorySituationId=" + operateHistorySituationId +
                '}';
    }
}
