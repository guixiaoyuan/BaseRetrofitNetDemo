package com.nongfenqi.controller.model.quest;

import com.nongfenqi.controller.model.common.StateModel;

/**
 * 保证金受托模型
 *
 * @author guixiaoyuan
 * @version 2.2, 2017/10/21
 * @since [sherlock/V2.2.5]
 */
public class MarginPayeeModel {
    private float marginAmount;
    private boolean marginState;
    private StateModel payeeType;

    public float getMarginAmount() {
        return marginAmount;
    }

    public void setMarginAmount(float marginAmount) {
        this.marginAmount = marginAmount;
    }

    public boolean isMarginState() {
        return marginState;
    }

    public void setMarginState(boolean marginState) {
        this.marginState = marginState;
    }

    public StateModel getPayeeType() {
        return payeeType;
    }

    public void setPayeeType(StateModel payeeType) {
        this.payeeType = payeeType;
    }
}
