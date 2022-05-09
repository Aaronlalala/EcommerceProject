package com.cuhksz.admin.entity;

import javax.persistence.*;

@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String paymentType;
    private Integer paymentInstallment;
    private float shouldPay;
    private float paymentValue;

    public Integer getId() {
        return id;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Integer getPaymentInstallment() {
        return paymentInstallment;
    }

    public void setPaymentInstallment(Integer paymentInstallment) {
        this.paymentInstallment = paymentInstallment;
    }

    public float getShouldPay() {
        return shouldPay;
    }

    public void setShouldPay(float shouldPay) {
        this.shouldPay = shouldPay;
    }

    public float getPaymentValue() {
        return paymentValue;
    }

    public void setPaymentValue(float paymentValue) {
        this.paymentValue = paymentValue;
    }
}