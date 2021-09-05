package com.jy.drivers_license.controllers;

import javax.validation.Valid;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.jy.drivers_license.models.License;
import com.jy.drivers_license.models.Person;
import com.jy.drivers_license.services.LicenseService;
import com.jy.drivers_license.services.PersonService;


@Controller
public class HomeController {
	
	@Autowired
	private PersonService personService;	
	@Autowired
	private LicenseService licenseService;
	

	@GetMapping("ninja/new")
	public String newPerson(@ModelAttribute("person") Person person, Model model){
		return "new_person.jsp";
	}
	@PostMapping("person/new")
	public String createPerson(@Valid @ModelAttribute("person") Person person, BindingResult result){
		
		if (result.hasErrors()) {
            return "new_person.jsp";
        } else {
            personService.createPerson(person);
            return "redirect:/person/new";
        }

	}
	
	@GetMapping("license/new")
	public String newLicense(@ModelAttribute("license") License license, Model model){
		List<Person> persons = personService.allPersons();
		model.addAttribute("persons", persons);
		return "new_license.jsp";
	}
	@PostMapping("license/new")
	public String createLicense(@Valid @ModelAttribute("license") License license, BindingResult result){
		
		if (result.hasErrors()) {
			return "new_license.jsp";
		} else {
			licenseService.createLicense(license);
			return "redirect:/license/new";
		}
		
	}
	
	@GetMapping("person/{id}")
	public String newLicense(@PathVariable("id") Long id, Model model){
		Person person = personService.findPerson(id);
		model.addAttribute("person", person);
		return "show_person.jsp";
	}
	
}
