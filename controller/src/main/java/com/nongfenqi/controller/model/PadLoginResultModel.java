package com.nongfenqi.controller.model;

import com.nongfenqi.controller.model.common.StringStateModel;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/**
 * 平板登录返回值
 *
 * @author luzhichao
 * @version 2.3, 2017/10/11
 * @since [sherlock/V2.3.5]
 */

public class PadLoginResultModel implements Serializable {
    /**
     * deviceState : 0
     * errorCount : 1
     * lockDate : 2017-10-11 13:56:01
     * lockState : 0
     * needCode : 0
     * successState : 0
     * token : {"accessToken":"string","expireIn":"86400000","grantTime":"86400000","refreshExpireIn":"86400000","refreshToken":"string"}
     * user : {"birthday":"2017-10-11 13:56:01","cardId":"61020119750204519X","deptId":1,"dingTalk":"string","email":"zhangsan@nongfenqi.com","empNo":"001","empState":0,"gender":0,"houseAreaCode":"110101002000","houseDetail":"尧林仙居三单元504室","id":"U1000000000","joinDate":"2017-10-11 13:56:01","lastLoginIp":"127.0.0.1","lastLoginTime":"2017-10-11 13:56:01","liveAreaCode":"110101001005","liveDetail":"玄武大道699-22号31栋","name":"张三","nickName":"黑牛","passWord":"hello123","phone":"13888888888","positionName":"客户经理","roleTypes":[0],"userName":"hello","userTypes":[0]}
     */

    private int deviceState;//新旧设备
    private int errorCount;//错误次数
    private String lockDate;//锁定时间
    private int lockState;//账号状态 0: 正常 1: 锁定
    private int needCode;//是否需要验证码 0: 不要 1: 要
    private int successState;// 是否成功 0: 失败 1: 成功
    private TokenModel token;//访问令牌
    private UserEntity user;//用户信息
    private ManagerDept managerDept;
    private HashMap<String, List<StringStateModel>> platformOperationMap;

    public void setDeviceState(int deviceState) {
        this.deviceState = deviceState;
    }

    public void setErrorCount(int errorCount) {
        this.errorCount = errorCount;
    }

    public void setLockDate(String lockDate) {
        this.lockDate = lockDate;
    }

    public void setLockState(int lockState) {
        this.lockState = lockState;
    }

    public void setNeedCode(int needCode) {
        this.needCode = needCode;
    }

    public void setSuccessState(int successState) {
        this.successState = successState;
    }

    public void setToken(TokenModel token) {
        this.token = token;
    }

    public void setPlatformOperationMap(HashMap<String, List<StringStateModel>> platformOperationMap) {
        this.platformOperationMap = platformOperationMap;
    }

    public HashMap<String, List<StringStateModel>> getPlatformOperationMap() {
        return platformOperationMap;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public ManagerDept getManagerDept() {
        return managerDept;
    }

    public void setManagerDept(ManagerDept managerDept) {
        this.managerDept = managerDept;
    }

    public int getDeviceState() {
        return deviceState;
    }

    public int getErrorCount() {
        return errorCount;
    }

    public String getLockDate() {
        return lockDate;
    }

    public int getLockState() {
        return lockState;
    }

    public int getNeedCode() {
        return needCode;
    }

    public int getSuccessState() {
        return successState;
    }

    public TokenModel getToken() {
        return token;
    }

    public UserEntity getUser() {
        return user;
    }

    public static class UserEntity implements Serializable {
        /**
         * birthday : 2017-10-11 13:56:01
         * cardId : 61020119750204519X
         * deptId : 1
         * dingTalk : string
         * email : zhangsan@nongfenqi.com
         * empNo : 001
         * empState : 0
         * gender : 0
         * houseAreaCode : 110101002000
         * houseDetail : 尧林仙居三单元504室
         * id : U1000000000
         * joinDate : 2017-10-11 13:56:01
         * lastLoginIp : 127.0.0.1
         * lastLoginTime : 2017-10-11 13:56:01
         * liveAreaCode : 110101001005
         * liveDetail : 玄武大道699-22号31栋
         * name : 张三
         * nickName : 黑牛
         * passWord : hello123
         * phone : 13888888888
         * positionName : 客户经理
         * roleTypes : [0]
         * userName : hello
         * userTypes : [0]
         */

        private String birthday;
        private String cardId;
        private int deptId;
        private String dingTalk;
        private String email;
        private String empNo;
        private int empState;
        private int gender;
        private String houseAreaCode;
        private String houseDetail;
        private String id;
        private String joinDate;
        private String lastLoginIp;
        private String lastLoginTime;
        private String liveAreaCode;
        private String liveDetail;
        private String name;
        private String nickName;
        private String passWord;
        private String phone;
        private String positionName;
        private String userName;
        private List<Integer> roleTypes;
        private List<Integer> userTypes;

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public void setCardId(String cardId) {
            this.cardId = cardId;
        }

        public void setDeptId(int deptId) {
            this.deptId = deptId;
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

        public void setPositionName(String positionName) {
            this.positionName = positionName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public void setRoleTypes(List<Integer> roleTypes) {
            this.roleTypes = roleTypes;
        }

        public void setUserTypes(List<Integer> userTypes) {
            this.userTypes = userTypes;
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

        public String getPositionName() {
            return positionName;
        }

        public String getUserName() {
            return userName;
        }

        public List<Integer> getRoleTypes() {
            return roleTypes;
        }

        public List<Integer> getUserTypes() {
            return userTypes;
        }
    }

    public class ManagerDept implements Serializable {

        /**
         * id : 0
         * name : 技术部
         * parentId : 0
         * type : 0
         */

        public int id;
        public String name;
        public int parentId;
        public int type;

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setParentId(int parentId) {
            this.parentId = parentId;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getParentId() {
            return parentId;
        }

        public int getType() {
            return type;
        }
    }
}
