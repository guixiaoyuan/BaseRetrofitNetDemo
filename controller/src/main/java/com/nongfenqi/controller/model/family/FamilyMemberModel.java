package com.nongfenqi.controller.model.family;


import com.nongfenqi.controller.model.common.LocationModel;

import java.io.Serializable;

/**
 * 调查表－家庭信息－家庭成员信息
 *
 * @author colin
 * @version 1.0, 16/7/27
 * @see [相关类/方法]
 * @since [农人帮/V1.0.0]
 */
public class FamilyMemberModel implements Serializable {

    /**
     * applyPersonId : AP0000000001
     * authState : {"id":0,"name":"string"}
     * cardExpiryDate : 2016-06-01 00:00:00
     * cardId : 321284199025891516
     * education : {"id":0,"name":"string"}
     * health : {"id":0,"name":"string"}
     * healthDesc : string
     * id : 1
     * maritalState : {"id":0,"name":"string"}
     * memberName : 陈永仁
     * memberRelationName : 朋友
     * memberRelationType : PR00001
     * nowLivingAddressId : string
     * nowLivingLocation : {"address":"雨花台铁心桥大街6号","areaCode":"110101001000","fullAreaName":"江苏省南京市雨花台区","lat":0,"lon":0}
     * personId : P00000000001
     * phone : 15289669879
     * picGroupId : 0123
     * workDesc : string
     * workState : {"id":0,"name":"string"}
     * workType : {"id":0,"name":"string"}
     */

    private String applyPersonId;
    private AuthStateEntity authState;
    private String cardExpiryDate;
    private String cardId;
    private EducationEntity education;
    private HealthEntity health;
    private String healthDesc;
    private int id;
    private MaritalStateEntity maritalState;
    private String memberName;
    private String memberRelationName;
    private String memberRelationType;
    private String nowLivingAddressId;
    private LocationModel nowLivingLocation;
    private String personId;
    private String phone;
    private String picGroupId;
    private String workDesc;
    private WorkStateEntity workState;
    private WorkTypeEntity workType;

    public String getApplyPersonId() {
        return applyPersonId;
    }

    public void setApplyPersonId(String applyPersonId) {
        this.applyPersonId = applyPersonId;
    }

    public AuthStateEntity getAuthState() {
        return authState;
    }

    public void setAuthState(AuthStateEntity authState) {
        this.authState = authState;
    }

    public String getCardExpiryDate() {
        return cardExpiryDate;
    }

    public void setCardExpiryDate(String cardExpiryDate) {
        this.cardExpiryDate = cardExpiryDate;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public EducationEntity getEducation() {
        return education;
    }

    public void setEducation(EducationEntity education) {
        this.education = education;
    }

    public HealthEntity getHealth() {
        return health;
    }

    public void setHealth(HealthEntity health) {
        this.health = health;
    }

    public String getHealthDesc() {
        return healthDesc;
    }

    public void setHealthDesc(String healthDesc) {
        this.healthDesc = healthDesc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MaritalStateEntity getMaritalState() {
        return maritalState;
    }

    public void setMaritalState(MaritalStateEntity maritalState) {
        this.maritalState = maritalState;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberRelationName() {
        return memberRelationName;
    }

    public void setMemberRelationName(String memberRelationName) {
        this.memberRelationName = memberRelationName;
    }

    public String getMemberRelationType() {
        return memberRelationType;
    }

    public void setMemberRelationType(String memberRelationType) {
        this.memberRelationType = memberRelationType;
    }

    public String getNowLivingAddressId() {
        return nowLivingAddressId;
    }

    public void setNowLivingAddressId(String nowLivingAddressId) {
        this.nowLivingAddressId = nowLivingAddressId;
    }

    public LocationModel getNowLivingLocation() {
        return nowLivingLocation;
    }

    public void setNowLivingLocation(LocationModel nowLivingLocation) {
        this.nowLivingLocation = nowLivingLocation;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPicGroupId() {
        return picGroupId;
    }

    public void setPicGroupId(String picGroupId) {
        this.picGroupId = picGroupId;
    }

    public String getWorkDesc() {
        return workDesc;
    }

    public void setWorkDesc(String workDesc) {
        this.workDesc = workDesc;
    }

    public WorkStateEntity getWorkState() {
        return workState;
    }

    public void setWorkState(WorkStateEntity workState) {
        this.workState = workState;
    }

    public WorkTypeEntity getWorkType() {
        return workType;
    }

    public void setWorkType(WorkTypeEntity workType) {
        this.workType = workType;
    }

    public static class AuthStateEntity implements Serializable {
        /**
         * id : 0
         * name : string
         */

        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class EducationEntity implements Serializable {
        /**
         * id : 0
         * name : string
         */

        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class HealthEntity implements Serializable {
        /**
         * id : 0
         * name : string
         */

        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class MaritalStateEntity implements Serializable {
        /**
         * id : 0
         * name : string
         */

        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class NowLivingLocationEntity implements Serializable {
        /**
         * address : 雨花台铁心桥大街6号
         * areaCode : 110101001000
         * fullAreaName : 江苏省南京市雨花台区
         * lat : 0
         * lon : 0
         */

        private String address;
        private String areaCode;
        private String fullAreaName;
        private float lat;
        private float lon;

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getAreaCode() {
            return areaCode;
        }

        public void setAreaCode(String areaCode) {
            this.areaCode = areaCode;
        }

        public String getFullAreaName() {
            return fullAreaName;
        }

        public void setFullAreaName(String fullAreaName) {
            this.fullAreaName = fullAreaName;
        }

        public float getLat() {
            return lat;
        }

        public void setLat(float lat) {
            this.lat = lat;
        }

        public float getLon() {
            return lon;
        }

        public void setLon(float lon) {
            this.lon = lon;
        }
    }

    public static class WorkStateEntity implements Serializable {
        /**
         * id : 0
         * name : string
         */

        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class WorkTypeEntity implements Serializable {
        /**
         * id : 0
         * name : string
         */

        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
