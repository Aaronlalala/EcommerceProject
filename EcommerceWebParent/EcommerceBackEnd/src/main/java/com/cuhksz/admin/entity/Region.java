package com.cuhksz.admin.entity;

import javax.persistence.*;

@Entity
@Table(name = "region")
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String continentName;
    private int countryCode;
    private String stateName;
    private String cityName;

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continent_name) {
        this.continentName = continent_name;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int country_code) {
        this.countryCode = country_code;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String state_name) {
        this.stateName = state_name;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String city_name) {
        this.cityName = city_name;
    }
}