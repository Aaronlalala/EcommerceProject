package com.cuhksz.admin.database;

import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Integer> {
}