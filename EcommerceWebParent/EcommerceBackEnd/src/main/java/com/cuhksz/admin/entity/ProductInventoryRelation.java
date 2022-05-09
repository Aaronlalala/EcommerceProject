package com.cuhksz.admin.entity;

import javax.persistence.*;
import java.io.Serializable;

class ProductInventoryRelationId implements Serializable {
    private Integer warehouseId;
    private Integer productId;
}

@Entity
@IdClass(ProductInventoryRelationId.class)
@Table(name = "product_inventory_relation")
public class ProductInventoryRelation {
    @Id
    private Integer warehouseId;

    @Id
    private Integer productId;

    private Integer shelflifeDays;
    private Integer quantity;

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getShelflifeDays() {
        return shelflifeDays;
    }

    public void setShelflifeDays(Integer shelflife) {
        this.shelflifeDays = shelflife;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}