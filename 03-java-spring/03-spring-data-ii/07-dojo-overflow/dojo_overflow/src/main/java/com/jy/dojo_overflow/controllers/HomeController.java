package com.jy.dojo_overflow.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jy.dojo_overflow.models.Answer;
import com.jy.dojo_overflow.models.Question;
import com.jy.dojo_overflow.services.AnswerService;
import com.jy.dojo_overflow.services.QuestionService;
import com.jy.dojo_overflow.services.TagService;
import com.jy.dojo_overflow.validators.QuestionValidator;

@Controller
public class HomeController {
	
	@Autowired
	private QuestionService qService;
	
	@Autowired
	private AnswerService aService;
	
	@Autowired
	private QuestionValidator qValidator;
	
	@Autowired
	private TagService tService;

	@RequestMapping ("/questions")
	public String questions(Model model) {
		model.addAttribute("questions", qService.allQuestions());
		return "questions.jsp";
	}

	@GetMapping ("/questions/new")
	public String questionNew(@ModelAttribute("question") Question question) {
		return "questionNew.jsp";
	}

	@PostMapping ("/questions/new")
	public String questionCreate(@Valid @ModelAttribute("question") Question question, BindingResult result) {
		qValidator.validate(question, result);
		if (result.hasErrors()) {
			return "questionNew.jsp";
		} else {
			String[] addedTags = question.getAddTags().split(",");
			Question newQuestion = qService.createQuestion(question);
			tService.createTag(addedTags, newQuestion);
			
			return "redirect:/questions";
		}
		
	}
	
	@GetMapping ("/questions/{id}")
	public String questionShow(@ModelAttribute("answer") Answer answer, Model viewModel, @PathVariable("id") Long id) {
		viewModel.addAttribute("thisQuestion", qService.findById(id));
		return "questionShow.jsp";
	}
	
	
	@PostMapping ("/questions/{id}/answer")
	public String answerCreate(@Valid @ModelAttribute("answer") Answer answer, BindingResult result, @PathVariable("id") Long id, Model viewModel) {
		if (result.hasErrors()) {
			viewModel.addAttribute("thisQuestion", qService.findById(id));
			return "questionShow.jsp";
		} else {
			Answer newAnswer = new Answer();
			newAnswer.setContent(answer.getContent());
			newAnswer.setQuestion(answer.getQuestion());
			aService.createAnswer(newAnswer);
			return "redirect:/questions";
		}
		
	}
	
}
