package com.jy.dojo_overflow.validators;


import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.jy.dojo_overflow.models.Question;


@Component
public class QuestionValidator {
	

	public boolean supports(Class<?> clazz) {
        return Question.class.equals(clazz);
    }
	
	public void validate(Object target, Errors errors) {
		Question question = (Question) target;
		
		String[] addedTags = question.getAddTags().split(",");
		
		if(addedTags.length > 3) {
			errors.rejectValue("addTags", "Amount", "No more than three tags allowed");
		}
				
	}

}
