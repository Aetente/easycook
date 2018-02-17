package com.easycook.functional;

import com.easycook.api.dto.ChangeProfilePersonDto;
import com.easycook.api.dto.PersonDto;
import com.easycook.interfaces.IPerson;

public class Profile implements IPerson{

	@Override
	public boolean addPerson(PersonDto person) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PersonDto getPersonByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean editPerson(ChangeProfilePersonDto personData) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double ratingPerson(double[] marks) {
		// TODO Auto-generated method stub
		return 0;
	}

}
