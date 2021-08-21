package com.jy.strings.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	private String index() {
		return "Hello client! How are you doing?";
	}
	
	@RequestMapping("/random")
	private String random() {
		return "Spring Boot is great! So easy to just repond with strings";
	}
}
