package com.cuhksz.admin.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "shipping_relation")
public class ShippingRelation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer orderId;
    private Integer addressId;
    private float cost;
    private String company;
    private String type;
    private Date shippingLimitDate;

    public Integer getId() {
        return id;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Date getShippingLimitDate() {
        return shippingLimitDate;
    }

    public void setShippingLimitDate(Date shippingLimitDate) {
        this.shippingLimitDate = shippingLimitDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}