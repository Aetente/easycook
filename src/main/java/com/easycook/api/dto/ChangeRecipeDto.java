package com.easycook.api.dto;

import java.util.List;

import com.easycook.entities.MethodOfRecipe;
import com.easycook.entities.Step;

public class ChangeRecipeDto extends RecieptDto {
	private String email;
	

	public ChangeRecipeDto(List<ProductDto> products, List<MethodOfRecipe> method, List<Step> steps, int amountOfVoters,
			String email) {
		super(products, method, steps, amountOfVoters);
		this.email = email;
	}

	public ChangeRecipeDto(String email) {
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
