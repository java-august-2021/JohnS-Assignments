package com.jy.dojo_overflow.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jy.dojo_overflow.models.Answer;

@Repository
public interface AnswerRepository extends CrudRepository <Answer, Long> {

	List<Answer> findAll();
	
	
}
