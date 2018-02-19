package com.easycook.api.dto;

import java.util.Arrays;

public class PersonDto {
	private String image;
	private String name;
	private String lastName;
	private String email;
	private String password;
	private double scorePerson;
	private RecieptShortDto[] myRecipes;
	private RecieptShortDto[] favoriteRecipes;
	
	
	public PersonDto() {
	}


	public PersonDto(String image, String name, String lastName, String email, String password, double scorePerson,
			RecieptShortDto[] myRecipes, RecieptShortDto[] favoriteRecipes) {
		this.image = image;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.scorePerson = scorePerson;
		this.myRecipes = myRecipes;
		this.favoriteRecipes = favoriteRecipes;
	}




	public String getLastName() {
		return lastName;
	}


	public String getEmail() {
		return email;
	}




	public String getImage() {
		return image;
	}


	public String getName() {
		return name;
	}


	public String getPassword() {
		return password;
	}


	public double getScorePerson() {
		return scorePerson;
	}


	public RecieptShortDto[] getMyRecipes() {
		return myRecipes;
	}


	public RecieptShortDto[] getFavoriteRecipes() {
		return favoriteRecipes;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void setScorePerson(double scorePerson) {
		this.scorePerson = scorePerson;
	}


	public void setMyRecipes(RecieptShortDto[] myRecipes) {
		this.myRecipes = myRecipes;
	}


	public void setFavoriteRecipes(RecieptShortDto[] favoriteRecipes) {
		this.favoriteRecipes = favoriteRecipes;
	}


	@Override
	public String toString() {
		return "PersonDto [image=" + image + ", name=" + name + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", scorePerson=" + scorePerson + ", myRecipes="
				+ Arrays.toString(myRecipes) + ", favoriteRecipes=" + Arrays.toString(favoriteRecipes) + "]";
	}










	
}
