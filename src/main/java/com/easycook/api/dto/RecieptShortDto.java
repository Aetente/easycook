package com.easycook.api.dto;

import java.io.Serializable;

import com.easycook.entities.Recipe;
import com.easycook.entities.RecipeId;

public class RecieptShortDto implements Serializable{
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

	public RecieptShortDto() {
	}

	public RecieptShortDto(Recipe recipe) {
		this.id = recipe.getReceipId();

		this.categoryRecipes = recipe.getCategoryRecipes();

		this.mainImg = recipe.getMainImg();
		this.mainDescription = recipe.getMainDescription();
		this.percent = recipe.getPercent();
		this.score = recipe.getScore();
	}

	public RecieptShortDto(RecipeId recipeId, String categoryRecipes, String mainImg, String mainDescription,
			double percent, double score) {
		this.id = recipeId;

		this.categoryRecipes = categoryRecipes;

		this.mainImg = mainImg;
		this.mainDescription = mainDescription;
		this.percent = percent;
		this.score = score;
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


	public RecipeId getRecipeId() {
		return id;
	}

	public void setRecipeId(RecipeId recipeId) {
		this.id = recipeId;
	}

}
