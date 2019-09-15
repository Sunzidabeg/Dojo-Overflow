package com.coding.dojooverflow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coding.dojooverflow.models.Tag;

@Repository
public interface TagRepo extends CrudRepository <Tag, Long> {

}