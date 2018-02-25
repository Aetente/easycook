package com.easycook.api.dto;

import java.util.List;

import com.easycook.entities.Person;
import com.easycook.entities.RecipeId;

public class PersonDto {
	private String image;
	private String name;
	private String lastName;
	private String login;
	private String email;
	private String password;
	private double scorePerson;
	private List<RecipeId> myRecipes;
	private List<RecipeId> favoriteRecipes;

	public PersonDto() {
	}

	public PersonDto(Person person) {
		this.image = person.getImage();
		this.name = person.getName();
		this.lastName = person.getLastName();
		this.login = person.getLogin();
		this.email = person.getEmail();
		this.password = person.getPassword();
		this.scorePerson = person.getScorePerson();
		this.myRecipes = person.getMyRecipes();
		this.favoriteRecipes = person.getFavoriteRecipes();
	}

	public PersonDto(String image, String name, String lastName, String login, String email, String password,
			double scorePerson, List<RecipeId> myRecipes, List<RecipeId> favoriteRecipes) {
		this.image = image;
		this.name = name;
		this.lastName = lastName;
		this.login = login;
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

	public List<RecipeId> getMyRecipes() {
		return myRecipes;
	}

	public void setMyRecipes(List<RecipeId> myRecipes) {
		this.myRecipes = myRecipes;
	}

	public List<RecipeId> getFavoriteRecipes() {
		return favoriteRecipes;
	}

	public void setFavoriteRecipes(List<RecipeId> favoriteRecipes) {
		this.favoriteRecipes = favoriteRecipes;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Override
	public String toString() {
		return "PersonDto [image=" + image + ", name=" + name + ", lastName=" + lastName + ", login=" + login
				+ ", email=" + email + ", password=" + password + ", scorePerson=" + scorePerson + ", myRecipes="
				+ myRecipes + ", favoriteRecipes=" + favoriteRecipes + "]";
	}

}
