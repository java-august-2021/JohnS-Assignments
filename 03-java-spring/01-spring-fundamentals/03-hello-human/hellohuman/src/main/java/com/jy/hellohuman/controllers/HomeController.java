package com.jy.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	private String index(@RequestParam(value="fName", required=false, defaultValue="Human") String fName, @RequestParam(value="lName", required=false) String lName, Model model) {
		model.addAttribute("fName", fName);
		model.addAttribute("lName", lName);
		return "index.jsp";
	}
}
