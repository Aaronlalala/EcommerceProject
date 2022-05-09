package com.cuhksz.admin.repository;

import com.cuhksz.admin.entity.Review;
import org.springframework.data.repository.CrudRepository;

public interface ReviewRepository extends CrudRepository<Review, Integer> {
}