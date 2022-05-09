package com.cuhksz.admin.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;

class MakeAdvertisementRelationId implements Serializable {
    private Integer adId;
    private Integer adminId;
    private Integer productId;
}

@Entity
@IdClass(MakeAdvertisementRelationId.class)
@Table(name = "make_advertisement_relation")
public class MakeAdvertisementRelation {
    @Id
    private Integer adId;

    @Id
    private Integer adminId;

    @Id
    private Integer productId;

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}