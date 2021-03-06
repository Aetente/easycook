package com.easycook.entities;

import java.io.Serializable;
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
	private RecipeId id;
	private String categoryRecipes;
	private String mainImg;
	private String mainDescription;
	private double percent;
	private double score;
	List<ProductDto> products;
	private List<String> method;
	private int amountOfVoters; 
	List<Step> steps;

	

	public Recipe() {
	}

	public Recipe(RecieptDto recipe) {
		this.id=recipe.getId();
		this.categoryRecipes=recipe.getCategoryRecipes();
		this.mainImg=recipe.getMainImg();
		this.mainDescription=recipe.getMainDescription();
		this.percent=recipe.getPercent();
		this.score=recipe.getScore();
		this.products=recipe.getProducts();
		this.method=recipe.getMethod();
		this.amountOfVoters=recipe.getAmountOfVoters();
		this.steps=recipe.getSteps();
	}

	
	public Recipe(RecipeId id, String categoryRecipes, String mainImg, String mainDescription, double percent,
			double score, List<ProductDto> products, List<String> methods, int amountOfVoters, List<Step> steps) {
		this.id = id;
		this.categoryRecipes = categoryRecipes;
		this.mainImg = mainImg;
		this.mainDescription = mainDescription;
		this.percent = percent;
		this.score = score;
		this.products = products;
		this.method = methods;
		this.amountOfVoters = amountOfVoters;
		this.steps = steps;
	}

	public RecipeId getId() {
		return id;
	}

	public void setId(RecipeId id) {
		this.id = id;
	}

	public String getCategoryRecipes() {
		return categoryRecipes;
	}

	public void setCategoryRecipes(String categoryRecipes) {
		this.categoryRecipes = categoryRecipes;
	}

	public String getMainImg() {
		return mainImg;
	}

	public void setMainImg(String mainImg) {
		this.mainImg = mainImg;
	}

	public String getMainDescription() {
		return mainDescription;
	}

	public void setMainDescription(String mainDescription) {
		this.mainDescription = mainDescription;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public List<ProductDto> getProducts() {
		return products;
	}

	public void setProducts(List<ProductDto> products) {
		this.products = products;
	}

	public List<String> getMethods() {
		return method;
	}

	public void setMethods(List<String> methods) {
		this.method = methods;
	}

	public List<Step> getSteps() {
		return steps;
	}

	public void setSteps(List<Step> steps) {
		this.steps = steps;
	}

	public RecipeId getReceipId() {
		
		return id;
	}

	public int getAmountOfVoters() {
		
		return amountOfVoters;
	}

	public void setAmountOfVoters(int amountOfVoters) {
		this.amountOfVoters = amountOfVoters;
	}

	@Override
	public String toString() {
		return "Recipe [id=" + id + ", categoryRecipes=" + categoryRecipes + ", mainImg=" + mainImg
				+ ", mainDescription=" + mainDescription + ", percent=" + percent + ", score=" + score + ", products="
				+ products + ", methods=" + method + ", amountOfVoters=" + amountOfVoters + ", steps=" + steps + "]";
	}
	
	
	
	
	/*public Recipe(RecieptDto recipe) {
		this.amountOfVoters = recipe.getAmountOfVoters();
		this.receipId = recipe.getRecipeId();
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
		*/
	
	

	

	
	
}
