package com.jy.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jy.languages.models.Language;
import com.jy.languages.services.LanguageService;

@Controller
public class HomeController {
	private final LanguageService languageService;
	
	public HomeController(LanguageService languageService ) {
		this.languageService = languageService;
	}
	
	@RequestMapping("/languages")
	public String index(Model model, @ModelAttribute("language") Language language) {
		List<Language> langauges = languageService.allLangs();
		model.addAttribute("languages", langauges);
		return "index.jsp";
	}
	
	@PostMapping("/languages")
    // @RequestMapping(value="/languages", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("language") Language language, BindingResult result, Model model) {
    	List<Language> langauges = languageService.allLangs();
		model.addAttribute("languages", langauges);
        if (result.hasErrors()) {
            return "index.jsp";
        } else {
            languageService.createLang(language);
            return "redirect:/languages";
        }
    }
	
	
	@RequestMapping("/languages/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
    	Language lang = languageService.findLang(id);
    	model.addAttribute("lang", lang);
    	return "show.jsp";
    }
	
	@RequestMapping("/languages/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model model) {
    	Language language = languageService.findLang(id);
    	model.addAttribute("language", language);
		return "edit.jsp";
	}
	
    @RequestMapping(value="/languages/{id}", method=RequestMethod.PUT)
    public String update(@Valid @ModelAttribute("language") Language language, BindingResult result) {
        if (result.hasErrors()) {
            return "edit.jsp";
        } else {
            languageService.updateLang(language);
            return "redirect:/languages";
        }
    }
    
    @RequestMapping(value="/languages/{id}", method=RequestMethod.DELETE)
    public String destroy(@PathVariable("id") Long id) {
        languageService.deleteLang(id);
        return "redirect:/languages";
    }

}
