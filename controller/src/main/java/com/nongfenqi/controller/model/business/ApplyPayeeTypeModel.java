package com.nongfenqi.controller.model.business;

import java.io.Serializable;

/**
 * 受托支付－收款方类型
 *
 * @author jiezhi
 * @version 1.0, 14/03/2017
 * @since [Sherlock/V1.0.0]
 */
public class ApplyPayeeTypeModel implements Serializable {
    private static final String TAG = ApplyPayeeTypeModel.class.getSimpleName();

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
