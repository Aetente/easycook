package com.easycook.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.easycook.entities.Person;

public interface PersonRepository extends CrudRepository<Person, String> {
	
}
