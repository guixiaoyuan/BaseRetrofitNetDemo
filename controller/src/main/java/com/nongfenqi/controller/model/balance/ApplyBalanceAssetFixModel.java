package com.nongfenqi.controller.model.balance;

import java.util.List;

/**
 * Function
 *
 * @author jiezhi
 * @version 1.0, 13/02/2017
 * @see [相关类/方法]
 * @since [农人帮/V1.1.2]
 */
public class ApplyBalanceAssetFixModel {
    private static final String TAG = ApplyBalanceAssetFixModel.class.getSimpleName();

    /**
     * buildDate : 2016-07-21 15:11:42
     * cost : 24000
     * id : 1
     * picGroupId : string
     */
    private List<ApplyAssetFixEstateModel> applyBalanceAssetFixEstateDos;
    /**
     * buyingPrice : 24000
     * customerMachineId : 1
     * id : 1
     * issuedTime : 2016-07-21 15:11:42
     * machineCode : M100000
     * machineName : 收割机-久保田-PRO-GH688Q
     * mileage : 1000
     * picGroupId : string
     * registeredTime : 2016-07-21 15:11:42
     * workingTime : 10
     */

    private List<ApplyAssetFixMachineModel> applyBalanceAssetFixMachines;
    /**
     * content : 运输
     * id : 1
     * picGroupId : string
     * price : 24000
     * time : 2016-07-21 15:11:42
     */

    private List<ApplyAssetFixOtherModel> applyBalanceAssetFixOtherDos;

    public List<ApplyAssetFixEstateModel> getApplyBalanceAssetFixEstateDos() {
        return applyBalanceAssetFixEstateDos;
    }

    public void setApplyBalanceAssetFixEstateDos(List<ApplyAssetFixEstateModel> applyBalanceAssetFixEstateDos) {
        this.applyBalanceAssetFixEstateDos = applyBalanceAssetFixEstateDos;
    }

    public List<ApplyAssetFixMachineModel> getApplyBalanceAssetFixMachines() {
        return applyBalanceAssetFixMachines;
    }

    public void setApplyBalanceAssetFixMachines(List<ApplyAssetFixMachineModel> applyBalanceAssetFixMachines) {
        this.applyBalanceAssetFixMachines = applyBalanceAssetFixMachines;
    }

    public List<ApplyAssetFixOtherModel> getApplyBalanceAssetFixOtherDos() {
        return applyBalanceAssetFixOtherDos;
    }

    public void setApplyBalanceAssetFixOtherDos(List<ApplyAssetFixOtherModel> applyBalanceAssetFixOtherDos) {
        this.applyBalanceAssetFixOtherDos = applyBalanceAssetFixOtherDos;
    }

    public boolean isEmpty() {
        return !(applyBalanceAssetFixOtherDos != null && applyBalanceAssetFixOtherDos.size() > 0) && !(applyBalanceAssetFixMachines != null && applyBalanceAssetFixMachines.size() > 0) && !(applyBalanceAssetFixEstateDos != null && applyBalanceAssetFixEstateDos.size() > 0);
    }
}
