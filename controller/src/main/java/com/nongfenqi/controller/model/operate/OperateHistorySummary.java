package com.nongfenqi.controller.model.operate;

import java.util.List;

/**
 * Function
 *
 * @author jiezhi
 * @version 1.0, 16/11/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */
public class OperateHistorySummary {
    private static final String TAG = OperateHistorySummary.class.getSimpleName();

    private List<OperateHistoryModel> operateHistoryModelList;
    private OperateSituationModel operateSituationModel;

    public List<OperateHistoryModel> getOperateHistoryModelList() {
        return operateHistoryModelList;
    }

    public void setOperateHistoryModelList(List<OperateHistoryModel> operateHistoryModelList) {
        this.operateHistoryModelList = operateHistoryModelList;
    }

    public OperateSituationModel getOperateSituationModel() {
        return operateSituationModel;
    }

    public void setOperateSituationModel(OperateSituationModel operateSituationModel) {
        this.operateSituationModel = operateSituationModel;
    }

    @Override
    public String toString() {
        return "OperateHistorySummary{" +
                "operateHistoryModelList=" + operateHistoryModelList +
                ", operateSituationModel=" + operateSituationModel +
                '}';
    }
}
