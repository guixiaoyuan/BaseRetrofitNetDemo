package com.nongfenqi.controller.model.borrow;

/**
 * 共借人信息
 *
 * @author luzhichao
 * @version 1.0, 17/4/12
 * @since [sherlock/V1.0.0]
 */

public class CoBorrowerModel {
    /**
     * applyPersonId : AP00000000001
     * businessDesc : string
     * cardExpiryDate : 2017-04-12 22:41:09
     * cardId : 321284199001231655
     * education : {"id":0,"name":"string"}
     * id : 1
     * maritalState : {"id":0,"name":"string"}
     * borrowerRelationName : 朋友
     * borrowerRelationType : PR00001
     * nowLivingLocation : {"address":"雨花台铁心桥大街6号","areaCode":"110101001000","fullAreaName":"江苏省南京市雨花台区","lat":0,"lon":0}
     * personId : P00000000001
     * personName : 陈国富
     * phone : 15289669879
     * picGroupId : string
     * workSituation : {"id":0,"name":"string"}
     * workType : {"id":0,"name":"string"}
     */

    private String applyPersonId;
    private String businessDesc;
    private String cardExpiryDate;
    private String cardId;
    private EducationEntity education;
    private int id;
    private MaritalStateEntity maritalState;
    private String borrowerRelationName;
    private String borrowerRelationType;
    private NowLivingLocationEntity nowLivingLocation;
    private String personId;
    private String personName;
    private String phone;
    private String picGroupId;
    private WorkSituationEntity workSituation;
    private WorkTypeEntity workType;

    public String getApplyPersonId() {
        return applyPersonId;
    }

    public void setApplyPersonId(String applyPersonId) {
        this.applyPersonId = applyPersonId;
    }

    public String getBusinessDesc() {
        return businessDesc;
    }

    public void setBusinessDesc(String businessDesc) {
        this.businessDesc = businessDesc;
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

    public String getBorrowerRelationName() {
        return borrowerRelationName;
    }

    public void setBorrowerRelationName(String borrowerRelationName) {
        this.borrowerRelationName = borrowerRelationName;
    }

    public String getBorrowerRelationType() {
        return borrowerRelationType;
    }

    public void setBorrowerRelationType(String borrowerRelationType) {
        this.borrowerRelationType = borrowerRelationType;
    }

    public NowLivingLocationEntity getNowLivingLocation() {
        return nowLivingLocation;
    }

    public void setNowLivingLocation(NowLivingLocationEntity nowLivingLocation) {
        this.nowLivingLocation = nowLivingLocation;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
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

    public WorkSituationEntity getWorkSituation() {
        return workSituation;
    }

    public void setWorkSituation(WorkSituationEntity workSituation) {
        this.workSituation = workSituation;
    }

    public WorkTypeEntity getWorkType() {
        return workType;
    }

    public void setWorkType(WorkTypeEntity workType) {
        this.workType = workType;
    }

    public static class EducationEntity {
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

    public static class MaritalStateEntity {
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

    public static class NowLivingLocationEntity {
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
        private int lat;
        private int lon;

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

        public int getLat() {
            return lat;
        }

        public void setLat(int lat) {
            this.lat = lat;
        }

        public int getLon() {
            return lon;
        }

        public void setLon(int lon) {
            this.lon = lon;
        }
    }

    public static class WorkSituationEntity {
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

    public static class WorkTypeEntity {
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
