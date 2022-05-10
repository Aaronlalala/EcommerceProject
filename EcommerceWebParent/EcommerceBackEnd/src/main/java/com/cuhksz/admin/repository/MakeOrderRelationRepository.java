package com.cuhksz.admin.repository;

import com.cuhksz.admin.entity.MakeOrderRelation;
import org.springframework.data.repository.CrudRepository;

import java.sql.Date;
import java.util.List;

public interface MakeOrderRelationRepository extends CrudRepository<MakeOrderRelation, Integer> {
    List<MakeOrderRelation> findAllByCreatedAtBetween(Date start, Date end);
}