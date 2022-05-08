package com.cuhksz.admin.repository;

import com.cuhksz.admin.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}