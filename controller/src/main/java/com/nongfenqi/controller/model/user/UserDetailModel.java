package com.nongfenqi.controller.model.user;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.List;

import me.yokeyword.indexablerv.IndexableEntity;

/**
 * @author jiezhi
 * @version 1.0, 14/03/2017
 * @since [Sherlock/V1.0.0]
 */
public class UserDetailModel implements Serializable, Parcelable, IndexableEntity {

    /**
     * birthday : 2017-10-17 09:46:24
     * cardId : 61020119750204519X
     * deptId : 1
     * deptName : 农分期
     * deptUserId : 部门负责人编号
     * deptUserName : 部门负责人姓名
     * dingTalk : string
     * email : zhangsan@nongfenqi.com
     * empNo : 001
     * empState : 0
     * empStateDesc : 在职
     * gender : 0
     * houseAreaCode : 110101002000
     * houseDetail : 尧林仙居三单元504室
     * id : U1000000000
     * joinDate : 2017-10-17 09:46:24
     * lastChangeTime : 2017-10-17 09:46:24
     * lastLoginIp : 127.0.0.1
     * lastLoginTime : 2017-10-17 09:46:24
     * liveAreaCode : 110101001005
     * liveDetail : 玄武大道699-22号31栋
     * modifyState : {"id":0,"name":"string"}
     * name : 张三
     * nickName : 黑牛
     * passWord : hello123
     * phone : 13888888888
     * platforms : [{"id":0,"name":"string"}]
     * portrait : P101010101010101010
     * positionId : 1
     * positionName : CEO
     * regularDate : 2017-10-17 09:46:24
     * roles : [{"id":0,"name":"string"}]
     * userName : hello
     * userRoleList : [{"id":0,"name":"string"}]
     * userState : 0
     * userStateDes : 启用
     */

    private String birthday;
    private String cardId;
    private int deptId;
    private String deptName;
    private String deptUserId;
    private String deptUserName;
    private String dingTalk;
    private String email;
    private String empNo;
    private int empState;
    private String empStateDesc;
    private int gender;
    private String houseAreaCode;
    private String houseDetail;
    private String id;
    private String joinDate;
    private String lastChangeTime;
    private String lastLoginIp;
    private String lastLoginTime;
    private String liveAreaCode;
    private String liveDetail;
    private ModifyStateEntity modifyState;
    private String name;
    private String nickName;
    private String passWord;
    private String phone;
    private String portrait;
    private int positionId;
    private String positionName;
    private String regularDate;
    private String userName;
    private int userState;
    private String userStateDes;
    private List<PlatformsEntity> platforms;
    private List<RolesEntity> roles;
    private List<UserRoleListEntity> userRoleList;

    protected UserDetailModel(Parcel in) {
        birthday = in.readString();
        cardId = in.readString();
        deptId = in.readInt();
        deptName = in.readString();
        deptUserId = in.readString();
        deptUserName = in.readString();
        dingTalk = in.readString();
        email = in.readString();
        empNo = in.readString();
        empState = in.readInt();
        empStateDesc = in.readString();
        gender = in.readInt();
        houseAreaCode = in.readString();
        houseDetail = in.readString();
        id = in.readString();
        joinDate = in.readString();
        lastChangeTime = in.readString();
        lastLoginIp = in.readString();
        lastLoginTime = in.readString();
        liveAreaCode = in.readString();
        liveDetail = in.readString();
        name = in.readString();
        nickName = in.readString();
        passWord = in.readString();
        phone = in.readString();
        portrait = in.readString();
        positionId = in.readInt();
        positionName = in.readString();
        regularDate = in.readString();
        userName = in.readString();
        userState = in.readInt();
        userStateDes = in.readString();
    }

    public static final Creator<UserDetailModel> CREATOR = new Creator<UserDetailModel>() {
        @Override
        public UserDetailModel createFromParcel(Parcel in) {
            return new UserDetailModel(in);
        }

        @Override
        public UserDetailModel[] newArray(int size) {
            return new UserDetailModel[size];
        }
    };

    private UserDetailModel(Builder builder) {
        setBirthday(builder.birthday);
        setCardId(builder.cardId);
        setDeptId(builder.deptId);
        setDeptName(builder.deptName);
        setDeptUserId(builder.deptUserId);
        setDeptUserName(builder.deptUserName);
        setDingTalk(builder.dingTalk);
        setEmail(builder.email);
        setEmpNo(builder.empNo);
        setEmpState(builder.empState);
        setEmpStateDesc(builder.empStateDesc);
        setGender(builder.gender);
        setHouseAreaCode(builder.houseAreaCode);
        setHouseDetail(builder.houseDetail);
        setId(builder.id);
        setJoinDate(builder.joinDate);
        setLastChangeTime(builder.lastChangeTime);
        setLastLoginIp(builder.lastLoginIp);
        setLastLoginTime(builder.lastLoginTime);
        setLiveAreaCode(builder.liveAreaCode);
        setLiveDetail(builder.liveDetail);
        setModifyState(builder.modifyState);
        setName(builder.name);
        setNickName(builder.nickName);
        setPassWord(builder.passWord);
        setPhone(builder.phone);
        setPortrait(builder.portrait);
        setPositionId(builder.positionId);
        setPositionName(builder.positionName);
        setRegularDate(builder.regularDate);
        setUserName(builder.userName);
        setUserState(builder.userState);
        setUserStateDes(builder.userStateDes);
        setPlatforms(builder.platforms);
        setRoles(builder.roles);
        setUserRoleList(builder.userRoleList);
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void setDeptUserId(String deptUserId) {
        this.deptUserId = deptUserId;
    }

    public void setDeptUserName(String deptUserName) {
        this.deptUserName = deptUserName;
    }

    public void setDingTalk(String dingTalk) {
        this.dingTalk = dingTalk;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public void setEmpState(int empState) {
        this.empState = empState;
    }

    public void setEmpStateDesc(String empStateDesc) {
        this.empStateDesc = empStateDesc;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setHouseAreaCode(String houseAreaCode) {
        this.houseAreaCode = houseAreaCode;
    }

    public void setHouseDetail(String houseDetail) {
        this.houseDetail = houseDetail;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public void setLastChangeTime(String lastChangeTime) {
        this.lastChangeTime = lastChangeTime;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public void setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public void setLiveAreaCode(String liveAreaCode) {
        this.liveAreaCode = liveAreaCode;
    }

    public void setLiveDetail(String liveDetail) {
        this.liveDetail = liveDetail;
    }

    public void setModifyState(ModifyStateEntity modifyState) {
        this.modifyState = modifyState;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public void setRegularDate(String regularDate) {
        this.regularDate = regularDate;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserState(int userState) {
        this.userState = userState;
    }

    public void setUserStateDes(String userStateDes) {
        this.userStateDes = userStateDes;
    }

    public void setPlatforms(List<PlatformsEntity> platforms) {
        this.platforms = platforms;
    }

    public void setRoles(List<RolesEntity> roles) {
        this.roles = roles;
    }

    public void setUserRoleList(List<UserRoleListEntity> userRoleList) {
        this.userRoleList = userRoleList;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getCardId() {
        return cardId;
    }

    public int getDeptId() {
        return deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public String getDeptUserId() {
        return deptUserId;
    }

    public String getDeptUserName() {
        return deptUserName;
    }

    public String getDingTalk() {
        return dingTalk;
    }

    public String getEmail() {
        return email;
    }

    public String getEmpNo() {
        return empNo;
    }

    public int getEmpState() {
        return empState;
    }

    public String getEmpStateDesc() {
        return empStateDesc;
    }

    public int getGender() {
        return gender;
    }

    public String getHouseAreaCode() {
        return houseAreaCode;
    }

    public String getHouseDetail() {
        return houseDetail;
    }

    public String getId() {
        return id;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public String getLastChangeTime() {
        return lastChangeTime;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public String getLastLoginTime() {
        return lastLoginTime;
    }

    public String getLiveAreaCode() {
        return liveAreaCode;
    }

    public String getLiveDetail() {
        return liveDetail;
    }

    public ModifyStateEntity getModifyState() {
        return modifyState;
    }

    public String getName() {
        return name;
    }

    public String getNickName() {
        return nickName;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getPhone() {
        return phone;
    }

    public String getPortrait() {
        return portrait;
    }

    public int getPositionId() {
        return positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public String getRegularDate() {
        return regularDate;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserState() {
        return userState;
    }

    public String getUserStateDes() {
        return userStateDes;
    }

    public List<PlatformsEntity> getPlatforms() {
        return platforms;
    }

    public List<RolesEntity> getRoles() {
        return roles;
    }

    public List<UserRoleListEntity> getUserRoleList() {
        return userRoleList;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(birthday);
        dest.writeString(cardId);
        dest.writeInt(deptId);
        dest.writeString(deptName);
        dest.writeString(deptUserId);
        dest.writeString(deptUserName);
        dest.writeString(dingTalk);
        dest.writeString(email);
        dest.writeString(empNo);
        dest.writeInt(empState);
        dest.writeString(empStateDesc);
        dest.writeInt(gender);
        dest.writeString(houseAreaCode);
        dest.writeString(houseDetail);
        dest.writeString(id);
        dest.writeString(joinDate);
        dest.writeString(lastChangeTime);
        dest.writeString(lastLoginIp);
        dest.writeString(lastLoginTime);
        dest.writeString(liveAreaCode);
        dest.writeString(liveDetail);
        dest.writeString(name);
        dest.writeString(nickName);
        dest.writeString(passWord);
        dest.writeString(phone);
        dest.writeString(portrait);
        dest.writeInt(positionId);
        dest.writeString(positionName);
        dest.writeString(regularDate);
        dest.writeString(userName);
        dest.writeInt(userState);
        dest.writeString(userStateDes);
    }

    @Override
    public String getFieldIndexBy() {
        return null;
    }

    @Override
    public void setFieldIndexBy(String indexField) {

    }

    @Override
    public void setFieldPinyinIndexBy(String pinyin) {

    }

    @Override
    public String toString() {
        return "UserDetailModel{" +
                "birthday='" + birthday + '\'' +
                ", cardId='" + cardId + '\'' +
                ", deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", deptUserId='" + deptUserId + '\'' +
                ", deptUserName='" + deptUserName + '\'' +
                ", dingTalk='" + dingTalk + '\'' +
                ", email='" + email + '\'' +
                ", empNo='" + empNo + '\'' +
                ", empState=" + empState +
                ", empStateDesc='" + empStateDesc + '\'' +
                ", gender=" + gender +
                ", houseAreaCode='" + houseAreaCode + '\'' +
                ", houseDetail='" + houseDetail + '\'' +
                ", id='" + id + '\'' +
                ", joinDate='" + joinDate + '\'' +
                ", lastChangeTime='" + lastChangeTime + '\'' +
                ", lastLoginIp='" + lastLoginIp + '\'' +
                ", lastLoginTime='" + lastLoginTime + '\'' +
                ", liveAreaCode='" + liveAreaCode + '\'' +
                ", liveDetail='" + liveDetail + '\'' +
                ", modifyState=" + modifyState +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", phone='" + phone + '\'' +
                ", portrait='" + portrait + '\'' +
                ", positionId=" + positionId +
                ", positionName='" + positionName + '\'' +
                ", regularDate='" + regularDate + '\'' +
                ", userName='" + userName + '\'' +
                ", userState=" + userState +
                ", userStateDes='" + userStateDes + '\'' +
                ", platforms=" + platforms +
                ", roles=" + roles +
                ", userRoleList=" + userRoleList +
                '}';
    }

    public static class ModifyStateEntity implements Serializable {
        /**
         * id : 0
         * name : string
         */

        private int id;
        private String name;

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

    public static class PlatformsEntity implements Serializable{
        /**
         * id : 0
         * name : string
         */

        private int id;
        private String name;

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

    public static class RolesEntity implements Serializable {
        /**
         * id : 0
         * name : string
         */

        private int id;
        private String name;

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

    public static class UserRoleListEntity implements Serializable {
        /**
         * id : 0
         * name : string
         */

        private int id;
        private String name;

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

    public static final class Builder {
        private String birthday;
        private String cardId;
        private int deptId;
        private String deptName;
        private String deptUserId;
        private String deptUserName;
        private String dingTalk;
        private String email;
        private String empNo;
        private int empState;
        private String empStateDesc;
        private int gender;
        private String houseAreaCode;
        private String houseDetail;
        private String id;
        private String joinDate;
        private String lastChangeTime;
        private String lastLoginIp;
        private String lastLoginTime;
        private String liveAreaCode;
        private String liveDetail;
        private ModifyStateEntity modifyState;
        private String name;
        private String nickName;
        private String passWord;
        private String phone;
        private String portrait;
        private int positionId;
        private String positionName;
        private String regularDate;
        private String userName;
        private int userState;
        private String userStateDes;
        private List<PlatformsEntity> platforms;
        private List<RolesEntity> roles;
        private List<UserRoleListEntity> userRoleList;

        public Builder() {
        }

        public Builder birthday(String val) {
            birthday = val;
            return this;
        }

        public Builder cardId(String val) {
            cardId = val;
            return this;
        }

        public Builder deptId(int val) {
            deptId = val;
            return this;
        }

        public Builder deptName(String val) {
            deptName = val;
            return this;
        }

        public Builder deptUserId(String val) {
            deptUserId = val;
            return this;
        }

        public Builder deptUserName(String val) {
            deptUserName = val;
            return this;
        }

        public Builder dingTalk(String val) {
            dingTalk = val;
            return this;
        }

        public Builder email(String val) {
            email = val;
            return this;
        }

        public Builder empNo(String val) {
            empNo = val;
            return this;
        }

        public Builder empState(int val) {
            empState = val;
            return this;
        }

        public Builder empStateDesc(String val) {
            empStateDesc = val;
            return this;
        }

        public Builder gender(int val) {
            gender = val;
            return this;
        }

        public Builder houseAreaCode(String val) {
            houseAreaCode = val;
            return this;
        }

        public Builder houseDetail(String val) {
            houseDetail = val;
            return this;
        }

        public Builder id(String val) {
            id = val;
            return this;
        }

        public Builder joinDate(String val) {
            joinDate = val;
            return this;
        }

        public Builder lastChangeTime(String val) {
            lastChangeTime = val;
            return this;
        }

        public Builder lastLoginIp(String val) {
            lastLoginIp = val;
            return this;
        }

        public Builder lastLoginTime(String val) {
            lastLoginTime = val;
            return this;
        }

        public Builder liveAreaCode(String val) {
            liveAreaCode = val;
            return this;
        }

        public Builder liveDetail(String val) {
            liveDetail = val;
            return this;
        }

        public Builder modifyState(ModifyStateEntity val) {
            modifyState = val;
            return this;
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder nickName(String val) {
            nickName = val;
            return this;
        }

        public Builder passWord(String val) {
            passWord = val;
            return this;
        }

        public Builder phone(String val) {
            phone = val;
            return this;
        }

        public Builder portrait(String val) {
            portrait = val;
            return this;
        }

        public Builder positionId(int val) {
            positionId = val;
            return this;
        }

        public Builder positionName(String val) {
            positionName = val;
            return this;
        }

        public Builder regularDate(String val) {
            regularDate = val;
            return this;
        }

        public Builder userName(String val) {
            userName = val;
            return this;
        }

        public Builder userState(int val) {
            userState = val;
            return this;
        }

        public Builder userStateDes(String val) {
            userStateDes = val;
            return this;
        }

        public Builder platforms(List<PlatformsEntity> val) {
            platforms = val;
            return this;
        }

        public Builder roles(List<RolesEntity> val) {
            roles = val;
            return this;
        }

        public Builder userRoleList(List<UserRoleListEntity> val) {
            userRoleList = val;
            return this;
        }

        public UserDetailModel build() {
            return new UserDetailModel(this);
        }
    }
}
