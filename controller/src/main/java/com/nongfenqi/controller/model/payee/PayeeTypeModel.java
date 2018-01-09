package com.nongfenqi.controller.model.payee;

/**
 * Function
 *
 * @author jiezhi
 * @version 1.0, 07/02/2017
 * @see [相关类/方法]
 * @since [农人帮/V1.1.2]
 */
public class PayeeTypeModel {
    private static final String TAG = PayeeTypeModel.class.getSimpleName();

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
