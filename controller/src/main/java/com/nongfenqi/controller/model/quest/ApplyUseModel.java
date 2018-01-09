package com.nongfenqi.controller.model.quest;

import java.io.Serializable;
import java.util.List;

/**
 * Function
 *
 * @author jiezhi
 * @version 1.0, 06/12/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */
public final class ApplyUseModel implements Serializable {

    private List<ApplyUseMachineModel> applyUseAgrMachineList;
    private List<ApplyUseMaterialModel> applyUseAgrMaterialsList;
    private List<ApplyUseLandModel> applyUseLandList;
    private List<ApplyUseOtherModel> applyUseOtherList;

    public List<ApplyUseMachineModel> getApplyUseAgrMachineList() {
        return applyUseAgrMachineList;
    }

    public void setApplyUseAgrMachineList(List<ApplyUseMachineModel> applyUseAgrMachineList) {
        this.applyUseAgrMachineList = applyUseAgrMachineList;
    }

    public List<ApplyUseMaterialModel> getApplyUseAgrMaterialsList() {
        return applyUseAgrMaterialsList;
    }

    public void setApplyUseAgrMaterialsList(List<ApplyUseMaterialModel> applyUseAgrMaterialsList) {
        this.applyUseAgrMaterialsList = applyUseAgrMaterialsList;
    }

    public List<ApplyUseLandModel> getApplyUseLandList() {
        return applyUseLandList;
    }

    public void setApplyUseLandList(List<ApplyUseLandModel> applyUseLandList) {
        this.applyUseLandList = applyUseLandList;
    }

    public List<ApplyUseOtherModel> getApplyUseOtherList() {
        return applyUseOtherList;
    }

    public void setApplyUseOtherList(List<ApplyUseOtherModel> applyUseOtherList) {
        this.applyUseOtherList = applyUseOtherList;
    }
}
