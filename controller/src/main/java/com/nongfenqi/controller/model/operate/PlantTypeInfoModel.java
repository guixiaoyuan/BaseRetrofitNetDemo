package com.nongfenqi.controller.model.operate;

/**
 *
 * 种植类型
 *
 * @author guixiaoyuan
 * @version 2.2, 2017/8/16
 * @since [sherlock/V2.2.0]
 */
public class PlantTypeInfoModel {
    private String id;//主键编号
    private String name;//类型名称

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
