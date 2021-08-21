package com.jy.routing.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {
	@RequestMapping("")
	private String index() {
		return "Hello Coding Dojo!";
	}
	
	@RequestMapping("/python")
	private String python() {
		return "Python/Django was awesome!";
	}
	
	@RequestMapping("/java")
	private String java() {
		return "Java/Spring is better!";
	}
}
