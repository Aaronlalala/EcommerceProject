package com.cuhksz.admin.repository;

import com.cuhksz.admin.entity.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Integer> {
}