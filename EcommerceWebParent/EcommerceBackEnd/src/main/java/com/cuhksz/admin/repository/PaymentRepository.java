package com.cuhksz.admin.repository;

import com.cuhksz.admin.entity.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {
}