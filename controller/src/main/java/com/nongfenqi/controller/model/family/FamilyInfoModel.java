package com.nongfenqi.controller.model.family;


import com.nongfenqi.controller.model.business.AddressModel;

/**
 * 调查表－家庭信息－获取家庭信息返回实体
 *
 * @author colin
 * @version 1.0, 2016-06-27 上午9:42
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class FamilyInfoModel {


    private transient int httpMethod;
    private String checkInDate;
    private Integer id;
    /**
     * address : 雨花台铁心桥大街6号
     * areaCode : 110101001000
     * lat : 0
     * lon : 0
     */

    private AddressModel location;
    /**
     * id : 0
     * name : string
     */

    private MaritalStateEntity maritalState;
    private String reasonExplain;

    public int getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(int httpMethod) {
        this.httpMethod = httpMethod;
    }

    /**
     * id : 0
     * name : string
     */


    private ResideTypeEntity resideType;

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MaritalStateEntity getMaritalState() {
        return maritalState;
    }

    public void setMaritalState(MaritalStateEntity maritalState) {
        this.maritalState = maritalState;
    }

    public String getReasonExplain() {
        return reasonExplain;
    }

    public void setReasonExplain(String reasonExplain) {
        this.reasonExplain = reasonExplain;
    }

    public ResideTypeEntity getResideType() {
        return resideType;
    }

    public void setResideType(ResideTypeEntity resideType) {
        this.resideType = resideType;
    }

    public AddressModel getLocation() {
        return location;
    }

    public void setLocation(AddressModel location) {
        this.location = location;
    }

    public static class MaritalStateEntity {
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

    public static class ResideTypeEntity {
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

    @Override
    public String toString() {
        return "FamilyInfo{" +
                "httpMethod=" + httpMethod +
                ", checkInDate='" + checkInDate + '\'' +
                ", id=" + id +
                ", location=" + location +
                ", maritalState=" + maritalState +
                ", reasonExplain='" + reasonExplain + '\'' +
                ", RESIDE_TYPE=" + resideType +
                '}';
    }
}
