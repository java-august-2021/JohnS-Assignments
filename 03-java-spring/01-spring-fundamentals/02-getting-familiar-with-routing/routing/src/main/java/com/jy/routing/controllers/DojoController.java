package com.jy.routing.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dojo")
public class DojoController {
	@RequestMapping("")
		private String index() {
		return "The dojo is awesome!";
		}
	@RequestMapping("/burbank")
	private String burbank() {
		return "Burbank Dojo is located in Southern California";
	}
	@RequestMapping("/san-jose")
	private String sanJose() {
		return "SJ dojo is the headquarters";
	}
	
}
