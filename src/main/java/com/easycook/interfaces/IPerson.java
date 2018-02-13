package com.easycook.interfaces;

import com.easycook.api.dto.PersonDto;

public interface IPerson {
	boolean addPerson(PersonDto person);
	PersonDto getPersonByName(String name);
}
