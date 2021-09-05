package com.jy.dojos_and_ninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.dojos_and_ninjas.models.Ninja;
import com.jy.dojos_and_ninjas.repositories.NinjaRepository;


@Service
public class NinjaService {

	@Autowired
	private NinjaRepository nRepo;
	
	 // returns all the ninjas
	 public List<Ninja> allNinjas() {
	     return nRepo.findAll();
	 }
	 
	 
	 // Create new person
	 public Ninja createNinja(Ninja n) {
		return nRepo.save(n);
		
	}


	 public Ninja findNinja(Long id) {
	     Optional<Ninja> optionalNinja = nRepo.findById(id);
	     if(optionalNinja.isPresent()) {
	         return optionalNinja.get();
	     } else {
	         return null;
	     }
	 }

	
	
}
