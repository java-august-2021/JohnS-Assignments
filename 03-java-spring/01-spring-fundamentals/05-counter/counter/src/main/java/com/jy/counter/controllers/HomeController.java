package com.jy.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	private String index(HttpSession session) {
		if(session.getAttribute("count") == null){
				session.setAttribute("count", 1);
		}
		else {
			int visits = (int) session.getAttribute("count") + 1;
			session.setAttribute("count", visits);
		}
		return "index.jsp";
	}
	@RequestMapping("/plustwo")
	private String plustwo(HttpSession session) {
		if(session.getAttribute("count") == null){
			session.setAttribute("count", 2);
		}
		else {
			int visits = (int) session.getAttribute("count") + 2;
			session.setAttribute("count", visits);
		}
		return "plustwo.jsp";
	}
	@RequestMapping("/counter")
	private String counter(HttpSession session, Model model) {
		int visits;
		if(session.getAttribute("count") == null){
			visits = 0;
		}
		else {
			visits = (int) session.getAttribute("count");			
		}
		model.addAttribute("visits", visits);
		return "counter.jsp";
	}
	@RequestMapping("/reset")
	private String reset(HttpSession session, Model model) {
		session.setAttribute("count", 0);
		model.addAttribute("visits", (int) session.getAttribute("count"));
		return "counter.jsp";
	}
	
}
