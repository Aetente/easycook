package com.easycook.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

import com.easycook.api.dto.ProductDto;
import com.easycook.api.dto.RecieptDto;

public class Recipe implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private RecipeId receipId;
	private String mainImage;
	private String mainDescription;
	private double persent;
	private double score;
	private int amountOfVoters;
	
	List<Product> products;
	private List<MethodOfRecipe> methods;
	
	List<Step> steps;
	private String categoryRecipes;
	
	
	
	public Recipe(RecieptDto recipe) {
		this.amountOfVoters = recipe.getAmountOfVoters();
		this.receipId = new RecipeId(recipe.getTittle(), recipe.getAuthor());
		this.mainImage = recipe.getMainImg();
		this.mainDescription = recipe.getMainDescription();
		this.persent=recipe.getPercent();
		this.score=recipe.getScore();
		this.methods=recipe.getMethod();
		this.categoryRecipes=recipe.getCategoryRecipes();
		this.products = new ArrayList<>();
		for (ProductDto product : recipe.getProducts()) {
			Product pr = new Product(product); 
			this.products.add(pr);
		}
		this.steps=recipe.getSteps();
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
	
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
	public List<MethodOfRecipe> getMethods() {
		return methods;
	}



	public void setMethods(List<MethodOfRecipe> methods) {
		this.methods = methods;
	}



	public RecipeId getReceipId() {
		return receipId;
	}



	public void setReceipId(RecipeId receipId) {
		this.receipId = receipId;
	}



	public List<Step> getSteps() {
		return steps;
	}



	public void setSteps(List<Step> steps) {
		this.steps = steps;
	}



	public String getCategoryRecipes() {
		return categoryRecipes;
	}
	public void setCategoryRecipes(String categoryRecipes) {
		this.categoryRecipes = categoryRecipes;
	}
	

	public int getAmountOfVoters() {
		return amountOfVoters;
	}

	
	
}
