package com.jy.dojo_overflow.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.dojo_overflow.models.Question;
import com.jy.dojo_overflow.models.Tag;
import com.jy.dojo_overflow.repositories.QuestionRepository;

@Service
public class QuestionService {
	
	@Autowired
	private QuestionRepository qRepo;
	
	public List<Question> allQuestions (){
		return qRepo.findAll();
	}
	
	public Question createQuestion (Question q) {
		return qRepo.save(q);
	}

	public Question findById(Long id) {
		Optional<Question> optionalQuestion = qRepo.findById(id);
		if(optionalQuestion.isPresent()) {
			return optionalQuestion.get();
		}else {
			return null;
		}
	}
	
	public void addTag(Question q, Tag t) {
		q.getTags().add(t);
	}
	
}
