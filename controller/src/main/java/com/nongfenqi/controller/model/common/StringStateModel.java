package com.nongfenqi.controller.model.common;

import java.io.Serializable;

/**
 * @author luzhichao
 * @version 2.3, 2017/10/26
 * @since [sherlock/V2.3.5]
 */

public class StringStateModel implements Serializable {
    private String id;
    private String name;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
