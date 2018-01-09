package com.nongfenqi.controller.model.business;

import java.util.List;

/**
 * @author jiezhi
 * @version 1.0, 14/03/2017
 * @since [Sherlock/V1.0.0]
 */
public class ApplyControlRecordModel {
    private static final String TAG = ApplyControlRecordModel.class.getSimpleName();

    /**
     * addTime : 2016-11-07 10:45:39
     * addUserId : string
     * addUserName : string
     * applyId : string
     * applyItemControlRecords : [{"applyId":"string","comment":"string","id":0,"itemId":"string","itemName":"string","recordId":0,"score":0}]
     * customerId : string
     * customerName : string
     * id : 0
     * recordId : 0
     * stateId : 0
     * stateName : string
     * totalScore : 0
     */
    private String addTime;
    private String addUserId;
    private String addUserName;
    private String applyId;
    private String customerId;
    private String customerName;
    private int id;
    private int recordId;
    private int stateId;
    private String stateName;
    private int totalScore;

    /**
     * applyId : string
     * comment : string
     * id : 0
     * itemId : string
     * itemName : string
     * recordId : 0
     * score : 0
     */
    private List<ApplyItemControlRecordsEntity> applyItemControlRecords;

    private ApplyControlRecordModel(Builder builder) {
        setAddTime(builder.addTime);
        setAddUserId(builder.addUserId);
        setAddUserName(builder.addUserName);
        setApplyId(builder.applyId);
        setCustomerId(builder.customerId);
        setCustomerName(builder.customerName);
        setId(builder.id);
        setRecordId(builder.recordId);
        setStateId(builder.stateId);
        setStateName(builder.stateName);
        setTotalScore(builder.totalScore);
        setApplyItemControlRecords(builder.applyItemControlRecords);
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getAddUserId() {
        return addUserId;
    }

    public void setAddUserId(String addUserId) {
        this.addUserId = addUserId;
    }

    public String getAddUserName() {
        return addUserName;
    }

    public void setAddUserName(String addUserName) {
        this.addUserName = addUserName;
    }

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public List<ApplyItemControlRecordsEntity> getApplyItemControlRecords() {
        return applyItemControlRecords;
    }

    public void setApplyItemControlRecords(List<ApplyItemControlRecordsEntity> applyItemControlRecords) {
        this.applyItemControlRecords = applyItemControlRecords;
    }

    public static class ApplyItemControlRecordsEntity {
        private String applyId;
        private String comment;
        private int id;
        private String itemId;
        private String itemName;
        private int recordId;
        private int score;

        private ApplyItemControlRecordsEntity(Builder builder) {
            setApplyId(builder.applyId);
            setComment(builder.comment);
            setId(builder.id);
            setItemId(builder.itemId);
            setItemName(builder.itemName);
            setRecordId(builder.recordId);
            setScore(builder.score);
        }

        public String getApplyId() {
            return applyId;
        }

        public void setApplyId(String applyId) {
            this.applyId = applyId;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getItemId() {
            return itemId;
        }

        public void setItemId(String itemId) {
            this.itemId = itemId;
        }

        public String getItemName() {
            return itemName;
        }

        public void setItemName(String itemName) {
            this.itemName = itemName;
        }

        public int getRecordId() {
            return recordId;
        }

        public void setRecordId(int recordId) {
            this.recordId = recordId;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public static final class Builder {
            private String applyId;
            private String comment;
            private int id;
            private String itemId;
            private String itemName;
            private int recordId;
            private int score;

            public Builder() {
            }

            public Builder applyId(String val) {
                applyId = val;
                return this;
            }

            public Builder comment(String val) {
                comment = val;
                return this;
            }

            public Builder id(int val) {
                id = val;
                return this;
            }

            public Builder itemId(String val) {
                itemId = val;
                return this;
            }

            public Builder itemName(String val) {
                itemName = val;
                return this;
            }

            public Builder recordId(int val) {
                recordId = val;
                return this;
            }

            public Builder score(int val) {
                score = val;
                return this;
            }

            public ApplyItemControlRecordsEntity build() {
                return new ApplyItemControlRecordsEntity(this);
            }
        }
    }

    public static final class Builder {
        private String addTime;
        private String addUserId;
        private String addUserName;
        private String applyId;
        private String customerId;
        private String customerName;
        private int id;
        private int recordId;
        private int stateId;
        private String stateName;
        private int totalScore;
        private List<ApplyItemControlRecordsEntity> applyItemControlRecords;

        public Builder() {
        }

        public Builder addTime(String val) {
            addTime = val;
            return this;
        }

        public Builder addUserId(String val) {
            addUserId = val;
            return this;
        }

        public Builder addUserName(String val) {
            addUserName = val;
            return this;
        }

        public Builder applyId(String val) {
            applyId = val;
            return this;
        }

        public Builder customerId(String val) {
            customerId = val;
            return this;
        }

        public Builder customerName(String val) {
            customerName = val;
            return this;
        }

        public Builder id(int val) {
            id = val;
            return this;
        }

        public Builder recordId(int val) {
            recordId = val;
            return this;
        }

        public Builder stateId(int val) {
            stateId = val;
            return this;
        }

        public Builder stateName(String val) {
            stateName = val;
            return this;
        }

        public Builder totalScore(int val) {
            totalScore = val;
            return this;
        }

        public Builder applyItemControlRecords(List<ApplyItemControlRecordsEntity> val) {
            applyItemControlRecords = val;
            return this;
        }

        public ApplyControlRecordModel build() {
            return new ApplyControlRecordModel(this);
        }
    }
}
