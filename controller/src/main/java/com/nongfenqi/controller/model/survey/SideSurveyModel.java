package com.nongfenqi.controller.model.survey;

import java.io.Serializable;

/**
 * 侧面调查
 *
 * @author jiezhi
 * @version 1.0, 14/04/2017
 * @since [sherlock/V1.0.0]
 */
public class SideSurveyModel implements Serializable {
    private static final String TAG = SideSurveyModel.class.getSimpleName();

    /**
     * id : 1
     * remark : string
     * surveyTargetName : 村口王大爷
     * voiceGroupId : 0123
     */

    private int id;
    private String remark;
    private String surveyTargetName;
    private String voiceGroupId;

    public SideSurveyModel() {

    }

    private SideSurveyModel(Builder builder) {
        setId(builder.id);
        setRemark(builder.remark);
        setSurveyTargetName(builder.surveyTargetName);
        setVoiceGroupId(builder.voiceGroupId);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSurveyTargetName() {
        return surveyTargetName;
    }

    public void setSurveyTargetName(String surveyTargetName) {
        this.surveyTargetName = surveyTargetName;
    }

    public String getVoiceGroupId() {
        return voiceGroupId;
    }

    public void setVoiceGroupId(String voiceGroupId) {
        this.voiceGroupId = voiceGroupId;
    }

    public static final class Builder {
        private int id;
        private String remark;
        private String surveyTargetName;
        private String voiceGroupId;

        public Builder() {
        }

        public Builder withId(int val) {
            id = val;
            return this;
        }

        public Builder withRemark(String val) {
            remark = val;
            return this;
        }

        public Builder withSurveyTargetName(String val) {
            surveyTargetName = val;
            return this;
        }

        public Builder withVoiceGroupId(String val) {
            voiceGroupId = val;
            return this;
        }

        public SideSurveyModel build() {
            return new SideSurveyModel(this);
        }
    }

    @Override
    public String toString() {
        return "SideSurveyModel{" +
                "id=" + id +
                ", remark='" + remark + '\'' +
                ", surveyTargetName='" + surveyTargetName + '\'' +
                ", voiceGroupId='" + voiceGroupId + '\'' +
                '}';
    }
}
