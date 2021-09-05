package com.jy.drivers_license.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.drivers_license.models.Person;
import com.jy.drivers_license.repositories.PersonRepository;


@Service
public class PersonService {

	@Autowired
	private PersonRepository pRepo;
	
	 // returns all the persons
	 public List<Person> allPersons() {
	     return pRepo.findAll();
	 }
	 
	 
	 // Create new person
	 public Person createPerson(Person p) {
		return pRepo.save(p);
		
	}


	 public Person findPerson(Long id) {
	     Optional<Person> optionalPerson = pRepo.findById(id);
	     if(optionalPerson.isPresent()) {
	         return optionalPerson.get();
	     } else {
	         return null;
	     }
	 }

	
	
}
