package com.coding.dojooverflow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coding.dojooverflow.models.Answer;

@Repository
public interface AnswerRepo extends CrudRepository <Answer, Long> {

}