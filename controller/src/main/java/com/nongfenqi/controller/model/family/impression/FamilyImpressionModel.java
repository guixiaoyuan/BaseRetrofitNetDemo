package com.nongfenqi.controller.model.family.impression;

import com.nongfenqi.controller.model.survey.ImpressionModel;

import java.util.List;

/**
 * @author jiezhi
 * @version 1.0, 14/04/2017
 * @since [sherlock/V1.0.0]
 */
public class FamilyImpressionModel {
    private static final String TAG = FamilyImpressionModel.class.getSimpleName();

    // 家庭关系印象列表
    private List<ImpressionModel> characterImpressionList;
    // 嗜好印象列表
    private List<ImpressionModel> familyRelationImpressionList;
    // 人际关系印象列表
    private List<ImpressionModel> houseImpressionList;
    // 人品印象列表
    private List<ImpressionModel> lifeImpressionList;

    public List<ImpressionModel> getCharacterImpressionList() {
        return characterImpressionList;
    }

    public void setCharacterImpressionList(List<ImpressionModel> characterImpressionList) {
        this.characterImpressionList = characterImpressionList;
    }

    public List<ImpressionModel> getFamilyRelationImpressionList() {
        return familyRelationImpressionList;
    }

    public void setFamilyRelationImpressionList(List<ImpressionModel> familyRelationImpressionList) {
        this.familyRelationImpressionList = familyRelationImpressionList;
    }

    public List<ImpressionModel> getHouseImpressionList() {
        return houseImpressionList;
    }

    public void setHouseImpressionList(List<ImpressionModel> houseImpressionList) {
        this.houseImpressionList = houseImpressionList;
    }

    public List<ImpressionModel> getLifeImpressionList() {
        return lifeImpressionList;
    }

    public void setLifeImpressionList(List<ImpressionModel> lifeImpressionList) {
        this.lifeImpressionList = lifeImpressionList;
    }

    @Override
    public String toString() {
        return "FamilyImpressionModel{" +
                "characterImpressionList=" + characterImpressionList +
                ", familyRelationImpressionList=" + familyRelationImpressionList +
                ", houseImpressionList=" + houseImpressionList +
                ", lifeImpressionList=" + lifeImpressionList +
                '}';
    }
}
