package com.nongfenqi.controller.model.family;

import java.util.List;

/**
 * 调查表－家庭信息－侧面调查
 *
 * @author colin
 * @version 1.0, 2016-06-28 上午11:30
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class FamilyResearchModel {

    /**
     * addTime : 2016-06-30 16:13:10
     * addUserId : U1000000000
     * addUserName : 测试姓名
     * applyFamilyResearchAnswers : [{"addTime":"2016-06-30 16:13:10","answers":"家庭收入情况良好","id":1,"picGroupId":"string","voiceId":"string"}]
     * applyId : ED201601020103929
     * customerId : C1000000001
     * customerName : 测试客户
     * description : 从工资和奖金入手
     * id : 1
     * question : 家庭收入情况
     */
    private String addTime;
    private String addUserId;
    private String addUserName;
    private String applyId;
    private String customerId;
    private String customerName;
    private String description;
    private int id;
    private String question;
    private List<ApplyFamilyResearchAnswersEntity> applyFamilyResearchAnswers;

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public void setAddUserId(String addUserId) {
        this.addUserId = addUserId;
    }

    public void setAddUserName(String addUserName) {
        this.addUserName = addUserName;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setApplyFamilyResearchAnswers(List<ApplyFamilyResearchAnswersEntity> applyFamilyResearchAnswers) {
        this.applyFamilyResearchAnswers = applyFamilyResearchAnswers;
    }

    public String getAddTime() {
        return addTime;
    }

    public String getAddUserId() {
        return addUserId;
    }

    public String getAddUserName() {
        return addUserName;
    }

    public String getApplyId() {
        return applyId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public List<ApplyFamilyResearchAnswersEntity> getApplyFamilyResearchAnswers() {
        return applyFamilyResearchAnswers;
    }

    public static class ApplyFamilyResearchAnswersEntity {
        /**
         * addTime : 2016-06-30 16:13:10
         * answers : 家庭收入情况良好
         * id : 1
         * picGroupId : string
         * voiceId : string
         */

        private String addTime;
        private String answers;
        private int id;
        private String picGroupId;
        private String voiceId;

        public void setAddTime(String addTime) {
            this.addTime = addTime;
        }

        public void setAnswers(String answers) {
            this.answers = answers;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setPicGroupId(String picGroupId) {
            this.picGroupId = picGroupId;
        }

        public void setVoiceId(String voiceId) {
            this.voiceId = voiceId;
        }

        public String getAddTime() {
            return addTime;
        }

        public String getAnswers() {
            return answers;
        }

        public int getId() {
            return id;
        }

        public String getPicGroupId() {
            return picGroupId;
        }

        public String getVoiceId() {
            return voiceId;
        }
    }

}
