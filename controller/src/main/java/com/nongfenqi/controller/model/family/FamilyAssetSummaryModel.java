package com.nongfenqi.controller.model.family;

import java.util.List;

/**
 * Function: 家庭信息接口封装
 *
 * @author jiezhi
 * @version 1.0, 18/10/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.0.0]
 */
public class FamilyAssetSummaryModel {
    private static final String TAG = FamilyAssetSummaryModel.class.getSimpleName();
    // 车辆信息
    private List<FamilyCarModel> familyCarModelList;
    // 房产信息
    private List<FamilyHouseModel> familyHouseModelList;
    //其他信息
    private List<FamilyOtherModel>familyOtherModelList;

    public List<FamilyCarModel> getFamilyCarModelList() {
        return familyCarModelList;
    }

    public void setFamilyCarModelList(List<FamilyCarModel> familyCarModelList) {
        this.familyCarModelList = familyCarModelList;
    }

    public List<FamilyHouseModel> getFamilyHouseModelList() {
        return familyHouseModelList;
    }

    public void setFamilyHouseModelList(List<FamilyHouseModel> familyHouseModelList) {
        this.familyHouseModelList = familyHouseModelList;
    }

    public List<FamilyOtherModel> getFamilyOtherModelList() {
        return familyOtherModelList;
    }

    public void setFamilyOtherModelList(List<FamilyOtherModel> familyOtherModelList) {
        this.familyOtherModelList = familyOtherModelList;
    }
}
