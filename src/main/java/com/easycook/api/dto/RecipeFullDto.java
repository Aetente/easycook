package com.easycook.api.dto;

public class RecipeFullDto {
	private String author;
	private String tittle;
	
	
	public RecipeFullDto() {
	}


	public RecipeFullDto(String author, String tittle) {
		this.author = author;
		this.tittle = tittle;
	}


	public String getAuthor() {
		return author;
	}


	public String getTittle() {
		return tittle;
	}
	
	
}
