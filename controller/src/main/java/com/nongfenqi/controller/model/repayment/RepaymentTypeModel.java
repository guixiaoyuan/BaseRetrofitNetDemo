package com.nongfenqi.controller.model.repayment;

/**
 * Function
 *
 * @author jiezhi
 * @version 1.0, 13/12/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */
public class RepaymentTypeModel {
    private static final String TAG = RepaymentTypeModel.class.getSimpleName();

    /**
     * id : 0
     * name : string
     */
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
