package com.easycook.api.dto;

public class RecipeRemoveDto {
	private String author;
	private String tittle;
	
	
	public RecipeRemoveDto() {
	}


	public RecipeRemoveDto(String author, String tittle) {
		this.author = author;
		this.tittle = tittle;
	}


	public String getAuthor() {
		return author;
	}


	public String getTittle() {
		return tittle;
	}


	@Override
	public String toString() {
		return "RecipeRemoveDto [author=" + author + ", tittle=" + tittle + "]";
	}
	
}
