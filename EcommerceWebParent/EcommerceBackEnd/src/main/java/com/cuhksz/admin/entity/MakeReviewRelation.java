package com.cuhksz.admin.entity;

import javax.persistence.*;
import java.io.Serializable;

class MakeReviewRelationId implements Serializable {
    private Integer reviewId;
    private Integer orderId;
}

@Entity
@IdClass(MakeReviewRelationId.class)
@Table(name = "make_review_relation")
public class MakeReviewRelation {
    @Id
    private Integer reviewId;

    @Id
    private Integer orderId;

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public Integer getReviewId() {
        return reviewId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}