package com.jy.dojos_and_ninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jy.dojos_and_ninjas.models.Dojo;

@Repository
public interface DojoRepository extends CrudRepository <Dojo, Long> {

	List<Dojo> findAll();

	
}
