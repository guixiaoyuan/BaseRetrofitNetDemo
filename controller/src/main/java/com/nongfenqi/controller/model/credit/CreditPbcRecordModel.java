package com.nongfenqi.controller.model.credit;

import java.io.Serializable;

/**
 * Function
 *
 * @author jiezhi
 * @version 1.0, 16/11/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */
public class CreditPbcRecordModel implements Serializable {
    private static final String TAG = CreditPbcRecordModel.class.getSimpleName();

    /**
     * addTime : 2017-04-21 10:18:10
     * expireDate : 2017-04-21 10:18:10
     * finishDate : 2017-04-21 10:18:10
     * id : 1
     * loanDate : 2017-04-21 10:18:10
     * loanPrincipal : 150000
     * loanSource : 中国农业银行
     * overdueExplain : 说明
     * personId : P000001
     * remainPrincipal : 80000
     * state : false
     * type : 1
     */

    private String addTime;
    private String expireDate;
    private String finishDate;
    private int id;
    private String loanDate;
    private float loanPrincipal;
    private String loanSource;
    private String overdueExplain;
    private String personId;
    private float remainPrincipal;
    private boolean state;
    private int type;

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;
    }

    public float getLoanPrincipal() {
        return loanPrincipal;
    }

    public void setLoanPrincipal(float loanPrincipal) {
        this.loanPrincipal = loanPrincipal;
    }

    public String getLoanSource() {
        return loanSource;
    }

    public void setLoanSource(String loanSource) {
        this.loanSource = loanSource;
    }

    public String getOverdueExplain() {
        return overdueExplain;
    }

    public void setOverdueExplain(String overdueExplain) {
        this.overdueExplain = overdueExplain;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public float getRemainPrincipal() {
        return remainPrincipal;
    }

    public void setRemainPrincipal(float remainPrincipal) {
        this.remainPrincipal = remainPrincipal;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
