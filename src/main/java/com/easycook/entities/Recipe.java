package com.easycook.entities;

import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.easycook.api.dto.RecieptDto;

public class Recipe {
	private String tittle;
	private String mainImage;
	private String mainDescription;
	private double persent;
	private double score;
	private int amountOfVoters;
	private String author;
	@ManyToMany
	ArrayList<Product> products;
	private String method;
	@OneToMany
	Step[] steps;
	private String categoryRecipes;
	
	
	
	public Recipe(int amountOfVoters, RecieptDto recipe) {
		this.amountOfVoters = amountOfVoters;
		this.tittle = recipe.getTittle();
		this.mainImage = recipe.getMainImg();
		this.mainDescription = recipe.getMainDescription();
		this.persent=recipe.getPercent();
		this.score=recipe.getScore();
		this.author=recipe.getAuthor();
		this.method=recipe.getMethod();
		this.categoryRecipes=recipe.getCategoryRecipes();
	}
		
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public String getMainImage() {
		return mainImage;
	}
	public void setMainImage(String mainImage) {
		this.mainImage = mainImage;
	}
	public String getMainDescription() {
		return mainDescription;
	}
	public void setMainDescription(String mainDescription) {
		this.mainDescription = mainDescription;
	}
	public double getPersent() {
		return persent;
	}
	public void setPersent(double persent) {
		this.persent = persent;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public ArrayList<Product> getProducts() {
		return products;
	}
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public Step[] getSteps() {
		return steps;
	}
	public void setSteps(Step[] steps) {
		this.steps = steps;
	}
	public String getCategoryRecipes() {
		return categoryRecipes;
	}
	public void setCategoryRecipes(String categoryRecipes) {
		this.categoryRecipes = categoryRecipes;
	}
	@Override
	public String toString() {
		return "Recipe [tittle=" + tittle + ", mainImage=" + mainImage + ", mainDescription=" + mainDescription
				+ ", persent=" + persent + ", score=" + score + ", author=" + author + ", products=" + products
				+ ", method=" + method + ", steps=" + Arrays.toString(steps) + ", categoryRecipes=" + categoryRecipes
				+ "]";
	}

	public int getAmountOfVoters() {
		return amountOfVoters;
	}

	public void setAmountOfVoters(int amountOfVoters) {
		this.amountOfVoters = amountOfVoters;
	}
	
	
}
