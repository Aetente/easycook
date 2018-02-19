package com.easycook.entities;

import java.util.Arrays;

import javax.persistence.OneToMany;

import org.springframework.data.annotation.Id;

import com.easycook.api.dto.PersonDto;

public class Person {
	
	private String name;
	private String lastName;
	private String password;
	@Id
	private String email;
	private String image;
	private double scorePerson;
	@OneToMany
	Recipe[] myRecipes;
	@OneToMany
	Recipe[] favoriteRecipes;
	
	
	public Person(PersonDto person) {
		this.name = person.getName();
		this.lastName = person.getLastName();
		this.password = person.getPassword();
		this.email = person.getEmail();
		this.image = person.getImage();
		this.scorePerson = person.getScorePerson();
		
	}
	
	
	public void setPassword(String password) {
		this.password = password;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public void setScorePerson(double scorePerson) {
		this.scorePerson = scorePerson;
	}


	public void setMyRecipes(Recipe[] myRecipes) {
		this.myRecipes = myRecipes;
	}


	public void setFavoriteRecipes(Recipe[] favoriteRecipes) {
		this.favoriteRecipes = favoriteRecipes;
	}


	public String getName() {
		return name;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public String getImage() {
		return image;
	}
	public double getScorePerson() {
		return scorePerson;
	}
	public Recipe[] getMyRecipes() {
		return myRecipes;
	}
	public Recipe[] getFavoriteRecipes() {
		return favoriteRecipes;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", lastName=" + lastName + ", password=" + password + ", email=" + email
				+ ", image=" + image + ", scorePerson=" + scorePerson + ", myRecipes=" + Arrays.toString(myRecipes)
				+ ", favoriteRecipes=" + Arrays.toString(favoriteRecipes) + "]";
	}
	
}
