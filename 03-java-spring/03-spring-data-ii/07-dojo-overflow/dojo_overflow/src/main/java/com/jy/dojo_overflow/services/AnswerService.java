package com.jy.dojo_overflow.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.dojo_overflow.models.Answer;
import com.jy.dojo_overflow.repositories.AnswerRepository;

@Service
public class AnswerService {

	@Autowired
	private AnswerRepository aRepo;

	public Answer createAnswer(Answer answer) {
		return aRepo.save(answer);
		
	}
	
}
