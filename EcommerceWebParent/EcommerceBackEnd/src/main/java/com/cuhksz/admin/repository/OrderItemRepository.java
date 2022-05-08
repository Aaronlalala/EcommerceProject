package com.cuhksz.admin.repository;

import com.cuhksz.admin.entity.OrderItem;
import org.springframework.data.repository.CrudRepository;

public interface OrderItemRepository extends CrudRepository<OrderItem, Integer> {
}