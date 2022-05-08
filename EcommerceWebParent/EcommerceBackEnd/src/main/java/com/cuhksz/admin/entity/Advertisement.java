package com.cuhksz.admin.entity;

import javax.persistence.*;

@Entity
@Table(name = "advertisement")
public class Advertisement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private int optimizer;
    private int deliverCompany;
    private float cost;

    public int getOptimizer() {
        return optimizer;
    }

    public void setOptimizer(int optimizer) {
        this.optimizer = optimizer;
    }

    public int getDeliverCompany() {
        return deliverCompany;
    }

    public void setDeliverCompany(int deliverCompany) {
        this.deliverCompany = deliverCompany;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}