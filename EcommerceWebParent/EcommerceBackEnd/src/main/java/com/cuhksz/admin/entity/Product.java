package com.cuhksz.admin.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private float price;
    private float cost;
    private String type;
    private Date createdAt;
    private int shelflifeDays;
    private int product_selector;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public int getShelflifeDays() {
        return shelflifeDays;
    }

    public void setShelflifeDays(int shelflifeDays) {
        this.shelflifeDays = shelflifeDays;
    }

    public int getProduct_selector() {
        return product_selector;
    }

    public void setProduct_selector(int product_selector) {
        this.product_selector = product_selector;
    }
}