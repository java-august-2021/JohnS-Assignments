package com.jy.the_code.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	@RequestMapping("/")
	private String index() {
		return "index.jsp";
	}
	@RequestMapping(path="/code",method=RequestMethod.POST)
	private String code(@RequestParam(value="code") String code) {
		System.out.println(code);
		if(code.equalsIgnoreCase("bushido")) {
			return "redirect:/correct";
		}
		else {
			return "redirect:/incorrect";
		}
	}
	@RequestMapping("/correct")
	private String correct() {
		return "code.jsp";
	}
	@RequestMapping("/incorrect")
	private String incorrect(RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("errors", "You must train harder!");
		return "redirect:/";
	}
}
