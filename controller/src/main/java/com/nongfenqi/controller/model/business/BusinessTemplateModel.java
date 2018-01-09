package com.nongfenqi.controller.model.business;

/**
 * 申请单模板
 *
 * @author luzhichao
 * @version 1.0, 17/4/14
 * @since [sherlock/V1.0.0]
 */

public class BusinessTemplateModel {
    /**
     * description : C100000000001
     * id : AT10000
     * name : 农户模板
     */

    private String description;
    private String id;
    private String name;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
