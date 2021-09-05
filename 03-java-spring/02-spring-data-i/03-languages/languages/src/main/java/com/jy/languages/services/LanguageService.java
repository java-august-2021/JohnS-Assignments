package com.jy.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jy.languages.models.Language;
import com.jy.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	
	
	@Autowired
	private LanguageRepository languageRepository;
	
//	private final LanguageRepository languageRepository;
//	public LanguageService(LanguageRepository languageRepository) {
//		this.languageRepository = languageRepository;
//	}

	

	 // returns all the languages
	 public List<Language> allLangs() {
	     return languageRepository.findAll();
	 }
	
	 // creates a language
	 public Language createLang(Language l) {
	     return languageRepository.save(l);
	 }

	 // retrieves a language
	 public Language findLang(Long id) {
	     Optional<Language> optionalLang = languageRepository.findById(id);
	     if(optionalLang.isPresent()) {
	         return optionalLang.get();
	     } else {
	         return null;
	     }
	 }
	 
	 // update a language
	 public Language updateLang(Language l) {
		 return languageRepository.save(l);
	 }
	 
	 
	 //delete language by id
	 public void deleteLanguage(Long id) {
		 languageRepository.deleteById(id);
	 }

	public void deleteLang(Long id) {
		languageRepository.deleteById(id);
		
	}
}
