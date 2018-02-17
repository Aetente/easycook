package com.easycook.interfaces;

import com.easycook.api.dto.ChangeProfilePersonDto;
import com.easycook.api.dto.PersonDto;

public interface IPerson {
	boolean addPerson(PersonDto person);
	PersonDto getPersonByName(String name);
	boolean editPerson(ChangeProfilePersonDto personData);
	double ratingPerson(double[] marks);
}
