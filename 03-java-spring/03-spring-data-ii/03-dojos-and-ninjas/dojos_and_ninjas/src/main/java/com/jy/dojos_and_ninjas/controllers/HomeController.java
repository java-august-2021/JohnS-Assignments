package com.jy.dojos_and_ninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.jy.dojos_and_ninjas.models.Dojo;
import com.jy.dojos_and_ninjas.models.Ninja;
import com.jy.dojos_and_ninjas.services.DojoService;
import com.jy.dojos_and_ninjas.services.NinjaService;


@Controller
public class HomeController {
	
	@Autowired
	private NinjaService ninjaService;	
	@Autowired
	private DojoService dojoService;
	

	@GetMapping("ninja/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model){
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		return "new_ninja.jsp";
	}
	@PostMapping("ninja/new")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model){
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		if (result.hasErrors()) {
            return "new_ninja.jsp";
        } else {
            ninjaService.createNinja(ninja);
            return "redirect:/ninja/new";
        }

	}
	
	@GetMapping("dojo/new")
	public String newLicense(@ModelAttribute("dojo") Dojo dojo, Model model){
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		return "new_dojo.jsp";
	}
	@PostMapping("dojo/new")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result, Model model){
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		if (result.hasErrors()) {
			return "new_dojo.jsp";
		} else {
			dojoService.createDojo(dojo);
			return "redirect:/dojo/new";
		}
		
	}
	
	@GetMapping("dojo/{id}")
	public String newLicense(@PathVariable("id") Long id, Model model){
		Dojo dojo = dojoService.findDojo(id);
		model.addAttribute("dojo", dojo);
		return "show_dojo.jsp";
	}
	
}
