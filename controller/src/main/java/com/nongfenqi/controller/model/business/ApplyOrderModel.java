package com.nongfenqi.controller.model.business;

import android.os.Parcel;
import android.os.Parcelable;

import com.nongfenqi.controller.model.common.StateModel;
import com.nongfenqi.controller.model.user.UserDetailModel;

import java.io.Serializable;
import java.util.List;

/**
 * @author jiezhi
 * @version 1.0, 14/03/2017
 * @since [Sherlock/V1.0.0]
 */
public class ApplyOrderModel implements Serializable, Parcelable {
    private static final String TAG = "ApplyOrderModel";

    /**
     * -----  applyAmount : 0
     * applyId : ED201601020103929
     * ----- applyLabels : ["string"]
     * ----- applyName : 江苏省南京市张三买农机
     * -----  applyUse : string
     * -----  applyUseType : string
     * ----- areaCode : 320102003002
     * ----- areaName : 江苏南京玄武新街口长江路
     * ----- codeFileId : string
     * ----- contractTypeId : 0
     * ----- contractTypeName : string
     * createdTime : 2017-04-19 16:24:20
     * ----- customerId : C100000000001
     * -----  customerManager : string
     * customerName : 张三
     * ----- customerPhone : string
     * ----- dealerName : string
     * -----  finishedItemCount : 8
     * firstUser : {"birthday":"2017-04-19 16:24:20","cardId":"61020119750204519X","deptId":1,"deptName":"农分期","dingTalk":"string","email":"zhangsan@nongfenqi.com","empNo":"001","empState":0,"empStateDesc":"在职","gender":0,"houseAreaCode":"110101002000","houseDetail":"尧林仙居三单元504室","id":"U1000000000","joinDate":"2017-04-19 16:24:20","lastLoginIp":"127.0.0.1","lastLoginTime":"2017-04-19 16:24:20","liveAreaCode":"110101001005","liveDetail":"玄武大道699-22号31栋","name":"张三","nickName":"黑牛","passWord":"hello123","phone":"13888888888","portrait":"P101010101010101010","positionId":1,"positionName":"CEO","regularDate":"2017-04-19 16:24:20","userName":"hello","userState":0,"userStateDes":"启用"}
     * ----- funderName : string
     * ----- idleDay : 0
     * ----- intentAddTime : 2017-04-19 16:24:20
     * ----- intentAddUserName : string
     * ----- intentDesc : string
     * padFinishedItemCount: 0
     * padTotalItemCount: 0
     * secondUser : {"birthday":"2017-04-19 16:24:20","cardId":"61020119750204519X","deptId":1,"deptName":"农分期","dingTalk":"string","email":"zhangsan@nongfenqi.com","empNo":"001","empState":0,"empStateDesc":"在职","gender":0,"houseAreaCode":"110101002000","houseDetail":"尧林仙居三单元504室","id":"U1000000000","joinDate":"2017-04-19 16:24:20","lastLoginIp":"127.0.0.1","lastLoginTime":"2017-04-19 16:24:20","liveAreaCode":"110101001005","liveDetail":"玄武大道699-22号31栋","name":"张三","nickName":"黑牛","passWord":"hello123","phone":"13888888888","portrait":"P101010101010101010","positionId":1,"positionName":"CEO","regularDate":"2017-04-19 16:24:20","userName":"hello","userState":0,"userStateDes":"启用"}
     * state : {"id":0,"name":"string"}
     * templateId : string
     * templateName : 农户模板
     * -----   totalItemCount : 11
     * -----   updateTime : 2017-04-19 16:24:20
     * -----   allowAmount: 80000,批复金额
     * -----   allowMonth: 12,建议期限
     */
    private float allowAmount;
    private int allowMonth;

    private float applyAmount;
    private String applyId;
    private String applyName;
    private String applyUse;
    private String applyUseType;
    private String areaCode;
    private String areaName;
    private String codeFileId;
    private int contractTypeId;
    private String contractTypeName;
    private String createdTime;
    private String customerId;
    private String customerManager;
    private String customerName;
    private String customerPhone;
    private String dealerName;
    private String desc;
    private int finishedItemCount;
    private int padFinishedItemCount;
    private int padTotalItemCount;
    private UserDetailModel firstUser;
    private String funderName;
    private int idleDay;
    private String intentAddTime;
    private String intentAddUserName;
    private String intentDesc;
    private UserDetailModel secondUser;
    private StateModel state;
    private String templateId;
    private String templateName;
    private int totalItemCount;
    private String updateTime;
    private boolean isSelected = true;

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    private List<String> applyLabels;

    protected ApplyOrderModel(Parcel in) {
        applyAmount = in.readFloat();
        applyId = in.readString();
        applyName = in.readString();
        applyUse = in.readString();
        applyUseType = in.readString();
        areaCode = in.readString();
        areaName = in.readString();
        codeFileId = in.readString();
        contractTypeId = in.readInt();
        contractTypeName = in.readString();
        createdTime = in.readString();
        customerId = in.readString();
        customerManager = in.readString();
        customerName = in.readString();
        customerPhone = in.readString();
        dealerName = in.readString();
        finishedItemCount = in.readInt();
        funderName = in.readString();
        idleDay = in.readInt();
        padFinishedItemCount = in.readInt();
        padTotalItemCount = in.readInt();
        intentAddTime = in.readString();
        intentAddUserName = in.readString();
        intentDesc = in.readString();
        templateId = in.readString();
        templateName = in.readString();
        totalItemCount = in.readInt();
        updateTime = in.readString();
        applyLabels = in.createStringArrayList();
        allowAmount = in.readFloat();
        allowMonth = in.readInt();
        desc = in.readString();
    }

    public static final Creator<ApplyOrderModel> CREATOR = new Creator<ApplyOrderModel>() {
        @Override
        public ApplyOrderModel createFromParcel(Parcel in) {
            return new ApplyOrderModel(in);
        }

        @Override
        public ApplyOrderModel[] newArray(int size) {
            return new ApplyOrderModel[size];
        }
    };

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getApplyAmount() {
        return applyAmount;
    }

    public void setApplyAmount(float applyAmount) {
        this.applyAmount = applyAmount;
    }

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    public String getApplyName() {
        return applyName;
    }

    public void setApplyName(String applyName) {
        this.applyName = applyName;
    }

    public String getApplyUse() {
        return applyUse;
    }

    public void setPadFinishedItemCount(int padFinishedItemCount) {
        this.padFinishedItemCount = padFinishedItemCount;
    }

    public int getPadFinishedItemCount() {
        return padFinishedItemCount;
    }

    public void setPadTotalItemCount(int padTotalItemCount) {
        this.padTotalItemCount = padTotalItemCount;
    }

    public int getPadTotalItemCount() {
        return padTotalItemCount;
    }

    public void setApplyUse(String applyUse) {
        this.applyUse = applyUse;
    }

    public String getApplyUseType() {
        return applyUseType;
    }

    public void setApplyUseType(String applyUseType) {
        this.applyUseType = applyUseType;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getCodeFileId() {
        return codeFileId;
    }

    public void setCodeFileId(String codeFileId) {
        this.codeFileId = codeFileId;
    }

    public int getContractTypeId() {
        return contractTypeId;
    }

    public void setContractTypeId(int contractTypeId) {
        this.contractTypeId = contractTypeId;
    }

    public String getContractTypeName() {
        return contractTypeName;
    }

    public void setContractTypeName(String contractTypeName) {
        this.contractTypeName = contractTypeName;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerManager() {
        return customerManager;
    }

    public void setCustomerManager(String customerManager) {
        this.customerManager = customerManager;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public int getFinishedItemCount() {
        return finishedItemCount;
    }

    public void setFinishedItemCount(int finishedItemCount) {
        this.finishedItemCount = finishedItemCount;
    }

    public String getFunderName() {
        return funderName;
    }

    public void setFunderName(String funderName) {
        this.funderName = funderName;
    }

    public int getIdleDay() {
        return idleDay;
    }

    public void setIdleDay(int idleDay) {
        this.idleDay = idleDay;
    }

    public String getIntentAddTime() {
        return intentAddTime;
    }

    public void setIntentAddTime(String intentAddTime) {
        this.intentAddTime = intentAddTime;
    }

    public String getIntentAddUserName() {
        return intentAddUserName;
    }

    public void setIntentAddUserName(String intentAddUserName) {
        this.intentAddUserName = intentAddUserName;
    }

    public String getIntentDesc() {
        return intentDesc;
    }

    public void setIntentDesc(String intentDesc) {
        this.intentDesc = intentDesc;
    }

    public UserDetailModel getFirstUser() {
        return firstUser;
    }

    public void setFirstUser(UserDetailModel firstUser) {
        this.firstUser = firstUser;
    }

    public UserDetailModel getSecondUser() {
        return secondUser;
    }

    public void setSecondUser(UserDetailModel secondUser) {
        this.secondUser = secondUser;
    }

    public StateModel getState() {
        return state;
    }

    public void setState(StateModel state) {
        this.state = state;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public int getTotalItemCount() {
        return totalItemCount;
    }

    public void setTotalItemCount(int totalItemCount) {
        this.totalItemCount = totalItemCount;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public List<String> getApplyLabels() {
        return applyLabels;
    }

    public void setApplyLabels(List<String> applyLabels) {
        this.applyLabels = applyLabels;
    }

    public float getAllowAmount() {
        return allowAmount;
    }

    public void setAllowAmount(float allowAmount) {
        this.allowAmount = allowAmount;
    }

    public int getAllowMonth() {
        return allowMonth;
    }

    public void setAllowMonth(int allowMonth) {
        this.allowMonth = allowMonth;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(applyAmount);
        parcel.writeString(applyId);
        parcel.writeString(applyName);
        parcel.writeString(applyUse);
        parcel.writeString(applyUseType);
        parcel.writeString(areaCode);
        parcel.writeString(areaName);
        parcel.writeString(codeFileId);
        parcel.writeInt(padFinishedItemCount);
        parcel.writeInt(padTotalItemCount);
        parcel.writeInt(contractTypeId);
        parcel.writeString(contractTypeName);
        parcel.writeString(createdTime);
        parcel.writeString(customerId);
        parcel.writeString(customerManager);
        parcel.writeString(customerName);
        parcel.writeString(customerPhone);
        parcel.writeString(dealerName);
        parcel.writeInt(finishedItemCount);
        parcel.writeString(funderName);
        parcel.writeInt(idleDay);
        parcel.writeString(intentAddTime);
        parcel.writeString(intentAddUserName);
        parcel.writeString(intentDesc);
        parcel.writeString(templateId);
        parcel.writeString(templateName);
        parcel.writeInt(totalItemCount);
        parcel.writeString(updateTime);
        parcel.writeStringList(applyLabels);
        parcel.writeFloat(allowAmount);
        parcel.writeInt(allowMonth);
        parcel.writeString(desc);
    }


    @Override
    public String toString() {
        return "ApplyOrderModel{" +
                "allowAmount=" + allowAmount +
                ", allowMonth=" + allowMonth +
                ", applyAmount=" + applyAmount +
                ", applyId='" + applyId + '\'' +
                ", applyName='" + applyName + '\'' +
                ", applyUse='" + applyUse + '\'' +
                ", applyUseType='" + applyUseType + '\'' +
                ", areaCode='" + areaCode + '\'' +
                ", areaName='" + areaName + '\'' +
                ", codeFileId='" + codeFileId + '\'' +
                ", contractTypeId=" + contractTypeId +
                ", contractTypeName='" + contractTypeName + '\'' +
                ", createdTime='" + createdTime + '\'' +
                ", customerId='" + customerId + '\'' +
                ", customerManager='" + customerManager + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", dealerName='" + dealerName + '\'' +
                ", desc = " + desc + '\'' +
                ", finishedItemCount=" + finishedItemCount +
                ", padFinishedItemCount=" + padFinishedItemCount +
                ", padTotalItemCount=" + padTotalItemCount +
                ", firstUser=" + firstUser +
                ", funderName='" + funderName + '\'' +
                ", idleDay=" + idleDay +
                ", intentAddTime='" + intentAddTime + '\'' +
                ", intentAddUserName='" + intentAddUserName + '\'' +
                ", intentDesc='" + intentDesc + '\'' +
                ", secondUser=" + secondUser +
                ", state=" + state +
                ", templateId='" + templateId + '\'' +
                ", templateName='" + templateName + '\'' +
                ", totalItemCount=" + totalItemCount +
                ", updateTime='" + updateTime + '\'' +
                ", isSelected=" + isSelected +
                ", applyLabels=" + applyLabels +
                '}';
    }
}
