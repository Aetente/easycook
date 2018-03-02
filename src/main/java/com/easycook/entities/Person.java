package com.easycook.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

import com.easycook.api.dto.PersonDto;

public class Person implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String email;
	
	private String name;
	private String lastName;
	private String password;
	private String nickname;
	
	private String image;
	private double scorePerson;
	
	List<RecipeId>myRecipes;
	
	List<RecipeId>favoriteRecipes;
	
	
	public Person() {
	}

	public Person(PersonDto person) {
		this.name = person.getName();
		this.lastName = person.getLastName();
		this.password = person.getPassword();
		this.nickname=person.getLogin();
		this.email = person.getEmail();
		this.image = person.getImage();
		this.scorePerson = person.getScorePerson();
		this.myRecipes=new ArrayList<>();
		for(RecipeId recipeMy: person.getMyRecipes()) {
			
			myRecipes.add(recipeMy);
		}
		for(RecipeId recipeFav: person.getMyRecipes()) {
		
			favoriteRecipes.add(recipeFav);
		}
		
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
		return nickname;
	}


	public void setLogin(String login) {
		this.nickname = login;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", lastName=" + lastName + ", password=" + password + ", login=" + nickname
				+ ", email=" + email + ", image=" + image + ", scorePerson=" + scorePerson + ", myRecipes=" + myRecipes
				+ ", favoriteRecipes=" + favoriteRecipes + "]";
	}
	
	
}
