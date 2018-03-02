package com.easycook.api.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.easycook.entities.MethodOfRecipe;
import com.easycook.entities.Product;
import com.easycook.entities.Recipe;
import com.easycook.entities.RecipeId;
import com.easycook.entities.Step;

public class RecieptDto  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private RecipeId id;

	private String categoryRecipes;

	private String mainImg;
	private String mainDescription;
	private double percent;
	private double score;
	private  List<ProductDto> products;
	private List<String> method;
	private List<Step> steps;//list
	private int amountOfVoters;
	
	
	public RecieptDto() {
	}
	
	
	public RecieptDto(Recipe recipe) {
		this.id = recipe.getReceipId();
		this.categoryRecipes = recipe.getCategoryRecipes();
		this.mainImg = recipe.getMainImg();
		this.mainDescription = recipe.getMainDescription();
		this.percent = recipe.getPercent();
		this.score = recipe.getScore();
		this.products = new ArrayList<>();
		for(ProductDto product : recipe.getProducts()) {
			ProductDto pr = new ProductDto(product);
			this.products.add(pr);
		}
		this.method = recipe.getMethods();
		this.steps = recipe.getSteps();
		this.amountOfVoters = recipe.getAmountOfVoters();
	}
	public RecieptDto(RecipeId id, String categoryRecipes, String mainImg, String mainDescription, double percent,
			double score, List<ProductDto> products, List<String> method, List<Step> steps,
			int amountOfVoters) {
		this.id = id;
		this.categoryRecipes = categoryRecipes;
		this.mainImg = mainImg;
		this.mainDescription = mainDescription;
		this.percent = percent;
		this.score = score;
		this.products = products;
		this.method = method;
		this.steps = steps;
		this.amountOfVoters = amountOfVoters;
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


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public void setAmountOfVoters(int amountOfVoters) {
		this.amountOfVoters = amountOfVoters;
	}


	


	public List<ProductDto> getProducts() {
		return products;
	}


	public List<String> getMethod() {
		return method;
	}

	public void setProducts(List<ProductDto> products) {
		this.products = products;
	}


	public void setMethod(List<String> method) {
		this.method = method;
	}


	

	public List<Step> getSteps() {
		return steps;
	}


	public void setSteps(List<Step> steps) {
		this.steps = steps;
	}

	public int getAmountOfVoters() {
		return amountOfVoters;
	}


	

	@Override
	public String toString() {
		return "RecieptDto [products=" + products + ", method=" + method + ", steps=" + steps + ", amountOfVoters="
				+ amountOfVoters + "]";
	}


	public RecipeId getRecipeId() {
		
		return id;
	}


	

	
}
