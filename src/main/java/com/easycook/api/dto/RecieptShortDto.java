package com.easycook.api.dto;

public class RecieptShortDto {
	private String tittle;
	private String categoryRecipes;
	private String mainImg;
	private String mainDescription;
	private double percent;
	private double score;
	public RecieptShortDto() {
		
	}
	public RecieptShortDto(String tittle, String categoryRecipes, String mainImg, String mainDescription,
			double percent, double score) {
		this.tittle = tittle;
		this.categoryRecipes = categoryRecipes;
		this.mainImg = mainImg;
		this.mainDescription = mainDescription;
		this.percent = percent;
		this.score = score;
	}
	public String getTittle() {
		return tittle;
	}
	public String getCategoryRecipes() {
		return categoryRecipes;
	}
	public String getMainImg() {
		return mainImg;
	}
	public String getMainDescription() {
		return mainDescription;
	}
	public double getPercent() {
		return percent;
	}
	public double getScore() {
		return score;
	}
	

}
