package com.easycook.api.dto;

import java.util.List;

import com.easycook.entities.Step;

public class ChangeRecipeDto extends RecieptDto {
	private String email;

	
	

	public ChangeRecipeDto(String tittle, String categoryRecipes, String author, String mainImg, String mainDescription,
			double percent, double score, List<ProductDto> products, String method, List<Step> steps,
			int amountOfVoters, String email) {
		super(tittle, categoryRecipes, author, mainImg, mainDescription, percent, score, products, method, steps,
				amountOfVoters);
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
