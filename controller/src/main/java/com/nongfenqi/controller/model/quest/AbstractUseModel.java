package com.nongfenqi.controller.model.quest;

import com.nongfenqi.controller.model.business.ApplyPayeeTypeModel;

/**
 * Function
 * 4种申请用途的父类
 *
 * @author jiezhi
 * @version 1.0, 17/02/2017
 * @see [相关类/方法]
 * @since [农人帮/V1.1.2]
 */
public abstract class AbstractUseModel {
    private ApplyPayeeTypeModel payeeType;

    public ApplyPayeeTypeModel getPayeeType() {
        return payeeType;
    }

    public void setPayeeType(ApplyPayeeTypeModel payeeType) {
        this.payeeType = payeeType;
    }
}
