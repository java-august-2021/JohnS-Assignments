package com.jy.dojo_survey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	@RequestMapping("/")
	private String index(HttpSession session) {
		session.invalidate();
		return "index.jsp";
	}
	@RequestMapping(path="/submit", method=RequestMethod.POST)
	
	private String submit(HttpSession session, 
			RedirectAttributes redirectAttributes, 
			@RequestParam(value="name", required=false) String name, 
			@RequestParam(value="location") String location, 
			@RequestParam(value="language") String language, 
			@RequestParam(value="comment", required=false) String comment) {
		
		if(name.equals("")) {
			redirectAttributes.addFlashAttribute("nameError", "Name is required");
			return "redirect:/";
		}else {
			session.setAttribute("name", name);
			session.setAttribute("location", location);
			session.setAttribute("language", language);
			session.setAttribute("comment", comment);
			return "redirect:/result";
		}
		
	}
	@RequestMapping("/result")
	private String result() {
		return "result.jsp";
	}
}
