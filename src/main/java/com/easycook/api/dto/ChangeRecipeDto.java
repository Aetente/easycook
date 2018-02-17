package com.easycook.api.dto;

public class ChangeRecipeDto extends RecieptDto {
	private String email;

	public ChangeRecipeDto(String tittle, String categoryRecipes, String mainImg, String mainDescription,
			double percent, double score, String author, ProductDto[] products, String method, Step[] steps,
			String email) {
		super(tittle, categoryRecipes, mainImg, mainDescription, percent, score, author, products, method, steps);
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
