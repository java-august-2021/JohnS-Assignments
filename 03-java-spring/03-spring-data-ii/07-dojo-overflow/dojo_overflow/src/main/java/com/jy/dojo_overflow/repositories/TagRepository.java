package com.jy.dojo_overflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jy.dojo_overflow.models.Tag;

@Repository
public interface TagRepository extends CrudRepository <Tag, Long>{

	List<Tag> findAll();
	Tag findByName(String name);
	
	boolean existsByName(String name);
	
}
