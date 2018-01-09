package com.nongfenqi.controller.model.credit;

import com.nongfenqi.controller.model.coborrower.CoborrowerInfoModel;
import com.nongfenqi.controller.model.customer.CustomerInfoModel;
import com.nongfenqi.controller.model.guarantor.GuarantorModel;

import java.util.List;

/**
 * @author luzhichao
 * @version 1.0, 17/4/12
 * @since [sherlock/V1.0.0]
 */

public class CreditAllMemberModel {
    private CustomerInfoModel questCustomerModel;

    public CustomerInfoModel getQuestCustomerModel() {
        return questCustomerModel;
    }

    public void setQuestCustomerModel(CustomerInfoModel questCustomerModel) {
        this.questCustomerModel = questCustomerModel;
    }

    private List<CoborrowerInfoModel> coBorrowerModels;

    public List<CoborrowerInfoModel> getCoBorrowerModels() {
        return coBorrowerModels;
    }

    public void setCoBorrowerModels(List<CoborrowerInfoModel> coBorrowerModels) {
        this.coBorrowerModels = coBorrowerModels;
    }

    public List<GuarantorModel> getGuarantorModels() {
        return guarantorModels;
    }

    public void setGuarantorModels(List<GuarantorModel> guarantorModels) {
        this.guarantorModels = guarantorModels;
    }

    private List<GuarantorModel> guarantorModels;
}
