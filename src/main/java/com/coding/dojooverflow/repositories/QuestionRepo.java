package com.coding.dojooverflow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coding.dojooverflow.models.Question;

@Repository
public interface QuestionRepo extends CrudRepository <Question, Long> {

}