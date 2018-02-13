package com.easycook.api.dto;

import java.util.Arrays;

public class PersonDto {
	private String image;
	private String name;
	private double scorePerson;
	private RecieptShortDto[] myRecipes;
	private RecieptShortDto[] favoriteRecipes;
	
	
	public PersonDto() {
	}
	public PersonDto(String image, String name, double scorePerson, RecieptShortDto[] myRecipes,
			RecieptShortDto[] favoriteRecipes) {
		this.image = image;
		this.name = name;
		this.scorePerson = scorePerson;
		this.myRecipes = myRecipes;
		this.favoriteRecipes = favoriteRecipes;
	}
	public String getImage() {
		return image;
	}
	public String getName() {
		return name;
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
	@Override
	public String toString() {
		return "PersonDto [image=" + image + ", name=" + name + ", scorePerson=" + scorePerson + ", myRecipes="
				+ Arrays.toString(myRecipes) + ", favoriteRecipes=" + Arrays.toString(favoriteRecipes) + "]";
	}
	
}
