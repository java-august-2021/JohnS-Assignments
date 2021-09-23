package com.jy.dojo_overflow.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.dojo_overflow.models.Question;
import com.jy.dojo_overflow.models.Tag;
import com.jy.dojo_overflow.repositories.TagRepository;


@Service
public class TagService {

	@Autowired
	private TagRepository tRepo;
	
	public Tag findTagByName(String name) {
		return tRepo.findByName(name);
	}


	public boolean existsByName(String name){
		return tRepo.existsByName(name);
	}
	
	public void createTag(String[] addedTags, Question question) {
		ArrayList<Question> newTagQuestion = new ArrayList<Question>();
		newTagQuestion.add(question);
		for(int i = 0; i < addedTags.length; i++) {
			if (tRepo.existsByName(addedTags[i])){
				Tag existingTag = tRepo.findByName(addedTags[i]);
				existingTag.getQuestions().add(question);
				tRepo.save(existingTag);
			} else {
				Tag tagToAdd = new Tag();
				tagToAdd.setQuestions(newTagQuestion);
				tagToAdd.setName(addedTags[i]);
				tRepo.save(tagToAdd);
				
			}
		}
		
	}
	
}
