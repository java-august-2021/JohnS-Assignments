package com.jy.drivers_license.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.drivers_license.models.License;
import com.jy.drivers_license.repositories.LicenseRepository;

@Service
public class LicenseService {

	@Autowired
	private LicenseRepository lRepo;
	
	 // returns all the Licenses
	 public List<License> allLicenses() {
	     return lRepo.findAll();
	 }
	 
	 
	 // Create new person
	 public License createLicense(License l) {
		return lRepo.save(l);
		
	}

}
