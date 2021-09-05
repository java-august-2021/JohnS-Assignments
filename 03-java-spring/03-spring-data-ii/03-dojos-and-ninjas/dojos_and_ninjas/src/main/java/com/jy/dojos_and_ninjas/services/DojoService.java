package com.jy.dojos_and_ninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.dojos_and_ninjas.models.Dojo;
import com.jy.dojos_and_ninjas.repositories.DojoRepository;

@Service
public class DojoService {

	@Autowired
	private DojoRepository dRepo;
	
	 // returns all the Dojos
	 public List<Dojo> allDojos() {
	     return dRepo.findAll();
	 }
	 
	 
	 // Create new person
	 public Dojo createDojo(Dojo d) {
		return dRepo.save(d);
		
	}
	
	 // retrieves a language
	 public Dojo findDojo(Long id) {
	     Optional<Dojo> optionalDojo = dRepo.findById(id);
	     if(optionalDojo.isPresent()) {
	         return optionalDojo.get();
	     } else {
	         return null;
	     }
	 }
}
