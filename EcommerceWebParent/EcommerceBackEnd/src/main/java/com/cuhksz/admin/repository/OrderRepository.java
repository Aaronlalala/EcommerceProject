package com.cuhksz.admin.repository;

import com.cuhksz.admin.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Integer> {
}