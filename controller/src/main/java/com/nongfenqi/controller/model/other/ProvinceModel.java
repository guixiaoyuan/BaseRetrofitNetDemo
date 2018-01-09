package com.nongfenqi.controller.model.other;

import java.util.List;

public class ProvinceModel {
    private String name;
    private String zipCode;
    private List<CityModel> cityList;

    public ProvinceModel() {
        super();
    }

    public ProvinceModel(String name, String zipCode, List<CityModel> cityList) {
        super();
        this.name = name;
        this.zipCode = zipCode;
        this.cityList = cityList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public List<CityModel> getCityList() {
        return cityList;
    }

    public void setCityList(List<CityModel> cityList) {
        this.cityList = cityList;
    }

    @Override
    public String toString() {
        return "ProvinceModel [name=" + name + ", cityList=" + cityList + "]";
    }

}
