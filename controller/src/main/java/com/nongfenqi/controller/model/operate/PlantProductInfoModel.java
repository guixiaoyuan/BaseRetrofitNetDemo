package com.nongfenqi.controller.model.operate;

/**
 *
 * 种植品种
 *
 * @author guixiaoyuan
 * @version 2.2, 2017/8/16
 * @since [sherlock/V2.2.0]
 */
public class PlantProductInfoModel {
    private String growCropId;//作物编号
    private String growCropName;//作物名称
    private String growModel;//种植模型
    private String growTypeId;//类型编号
    private String growTypeName;//类型名称
    private String id;//主键编号
    private String name;//品种名称

    public String getGrowCropId() {
        return growCropId;
    }

    public void setGrowCropId(String growCropId) {
        this.growCropId = growCropId;
    }

    public String getGropCrowName() {
        return growCropName;
    }

    public void setGropCropName(String growCropName) {
        this.growCropName = growCropName;
    }

    public String getGrowModel() {
        return growModel;
    }

    public void setGrowModel(String growModel) {
        this.growModel = growModel;
    }

    public String getGrowTypeId() {
        return growTypeId;
    }

    public void setGrowTypeId(String growTypeId) {
        this.growTypeId = growTypeId;
    }

    public String getGrowTypeName() {
        return growTypeName;
    }

    public void setGrowTypeName(String growTypeName) {
        this.growTypeName = growTypeName;
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
