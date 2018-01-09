package com.nongfenqi.controller.model.business;

/**
 * @author jiezhi
 * @version 1.0, 14/03/2017
 * @since [Sherlock/V1.0.0]
 */
public class ApplyOrderRecordModel {
    private static final String TAG = ApplyOrderRecordModel.class.getSimpleName();

    /**
     * applyId : string
     * recordId : 0
     * remark : string
     * stateId : 0:待提交, 1:已提交, 16:粉控待审核, 17:风控审核通过, 18:风控审核不通过, 19:风控终止, 32:平台预审, 33:平台预审通过, 34:平台预审不通过, 48:合同已提交, 49:合同审核通过, 50:合同审核不通过, 64:下款中, 65:已下款, 66:下款失败
     * stateName : string
     * time : 2016-11-07 10:45:39
     * userId : string
     * userName : string
     */

    private String applyId;
    private int recordId;
    private String remark;
    private int stateId;
    private String stateName;
    private String time;
    private String userId;
    private String userName;

    private ApplyOrderRecordModel(Builder builder) {
        setRecordId(builder.recordId);
        setRemark(builder.remark);
        setStateId(builder.stateId);
        setStateName(builder.stateName);
        setTime(builder.time);
        setUserId(builder.userId);
        setUserName(builder.userName);
    }

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "ApplyOrderRecordModel{" +
                "applyId='" + applyId + '\'' +
                ", recordId=" + recordId +
                ", remark='" + remark + '\'' +
                ", stateId=" + stateId +
                ", stateName='" + stateName + '\'' +
                ", time='" + time + '\'' +
                ", userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }

    public static final class Builder {
        private int recordId;
        private String remark;
        private int stateId;
        private String stateName;
        private String time;
        private String userId;
        private String userName;

        public Builder() {
        }

        public Builder recordId(int val) {
            recordId = val;
            return this;
        }

        public Builder remark(String val) {
            remark = val;
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

        public Builder time(String val) {
            time = val;
            return this;
        }

        public Builder userId(String val) {
            userId = val;
            return this;
        }

        public Builder userName(String val) {
            userName = val;
            return this;
        }

        public ApplyOrderRecordModel build() {
            return new ApplyOrderRecordModel(this);
        }
    }
}
