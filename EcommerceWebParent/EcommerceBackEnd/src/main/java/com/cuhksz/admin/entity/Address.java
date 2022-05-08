package com.cuhksz.admin.entity;

import javax.persistence.*;

@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer userId;
    private Integer regionId;
    private String streetName;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer user_id) {
        this.userId = user_id;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer region_id) {
        this.regionId = region_id;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String street_name) {
        this.streetName = street_name;
    }
}