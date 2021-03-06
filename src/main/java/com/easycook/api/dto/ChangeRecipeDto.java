package com.easycook.api.dto;

import java.util.List;

import com.easycook.entities.RecipeId;
import com.easycook.entities.Step;

public class ChangeRecipeDto extends RecieptDto {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String email;
	
	

	/*public ChangeRecipeDto(List<ProductDto> products, List<MethodOfRecipe> method, List<Step> steps, int amountOfVoters,
			String email) {
		super(products, method, steps, amountOfVoters);
		this.email = email;
	}*/



	



	public ChangeRecipeDto() {
	}

	public ChangeRecipeDto(String email) {
		this.email = email;
	}

	public ChangeRecipeDto(RecipeId id, String categoryRecipes, String mainImg, String mainDescription, double percent,
			double score, List<ProductDto> products, List<String> method, List<Step> steps, int amountOfVoters,
			String email) {
		super(id, categoryRecipes, mainImg, mainDescription, percent, score, products, method, steps, amountOfVoters);
		this.email = email;
	}



	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "ChangeRecipeDto [email=" + email + "]";
	}

}
