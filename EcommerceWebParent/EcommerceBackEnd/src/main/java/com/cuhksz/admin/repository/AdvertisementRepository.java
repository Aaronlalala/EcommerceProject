package com.cuhksz.admin.repository;

import com.cuhksz.admin.entity.Advertisement;
import org.springframework.data.repository.CrudRepository;

public interface AdvertisementRepository extends CrudRepository<Advertisement, Integer> {
}