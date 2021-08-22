package com.jy.display_date.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	private String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	private String date(Model model) {
		Date date = new Date();
		model.addAttribute("date",new SimpleDateFormat("EEEEEE, 'the' dd 'of' MMMMM, yyyy").format(date));
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	private String time(Model model) {
		Date time = new Date();
		model.addAttribute("time",new SimpleDateFormat("hh:mm a").format(time));
		return "time.jsp";
	}

}
