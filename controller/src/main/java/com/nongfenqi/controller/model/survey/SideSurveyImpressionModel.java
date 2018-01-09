package com.nongfenqi.controller.model.survey;

import java.util.List;

/**
 * 侧调
 *
 * @author jiezhi
 * @version 1.0, 14/04/2017
 * @since [sherlock/V1.0.0]
 */
public class SideSurveyImpressionModel {
    private static final String TAG = SideSurveyImpressionModel.class.getSimpleName();

    // 家庭关系印象列表
    private List<ImpressionModel> familyRelationImpressionList;
    // 嗜好印象列表
    private List<ImpressionModel> indulgenceImpressionList;
    // 人际关系印象列表
    private List<ImpressionModel> personRelationImpressionList;
    // 人品印象列表
    private List<ImpressionModel> personalityImpressionList;

    public List<ImpressionModel> getFamilyRelationImpressionList() {
        return familyRelationImpressionList;
    }

    public void setFamilyRelationImpressionList(List<ImpressionModel> familyRelationImpressionList) {
        this.familyRelationImpressionList = familyRelationImpressionList;
    }

    public List<ImpressionModel> getIndulgenceImpressionList() {
        return indulgenceImpressionList;
    }

    public void setIndulgenceImpressionList(List<ImpressionModel> indulgenceImpressionList) {
        this.indulgenceImpressionList = indulgenceImpressionList;
    }

    public List<ImpressionModel> getPersonRelationImpressionList() {
        return personRelationImpressionList;
    }

    public void setPersonRelationImpressionList(List<ImpressionModel> personRelationImpressionList) {
        this.personRelationImpressionList = personRelationImpressionList;
    }

    public List<ImpressionModel> getPersonalityImpressionList() {
        return personalityImpressionList;
    }

    public void setPersonalityImpressionList(List<ImpressionModel> personalityImpressionList) {
        this.personalityImpressionList = personalityImpressionList;
    }

    @Override
    public String toString() {
        return "SideSurveyImpressionModel{" +
                "familyRelationImpressionList=" + familyRelationImpressionList +
                ", indulgenceImpressionList=" + indulgenceImpressionList +
                ", personRelationImpressionList=" + personRelationImpressionList +
                ", personalityImpressionList=" + personalityImpressionList +
                '}';
    }
}
