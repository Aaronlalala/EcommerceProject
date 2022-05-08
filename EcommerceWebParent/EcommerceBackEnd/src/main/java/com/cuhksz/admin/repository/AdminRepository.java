package com.cuhksz.admin.repository;

import com.cuhksz.admin.entity.Admin;
import org.springframework.data.repository.CrudRepository;

public interface AdminRepository extends CrudRepository<Admin, Integer> {
}