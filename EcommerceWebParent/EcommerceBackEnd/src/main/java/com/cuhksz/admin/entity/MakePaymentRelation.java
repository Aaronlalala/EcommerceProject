package com.cuhksz.admin.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;

class MakePaymentRelationId implements Serializable {
    private Integer paymentId;
    private Integer orderId;
}

@Entity
@IdClass(MakePaymentRelationId.class)
@Table(name = "make_payment_relation")
public class MakePaymentRelation {
    @Id
    private Integer paymentId;

    @Id
    private Integer orderId;

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}