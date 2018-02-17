package com.easycook.api.dto;

public class RecieptShortDto {
	private String tittle;
	private String categoryRecipes;
	private String author;
	private String mainImg;
	private String mainDescription;
	private double percent;
	private double score;
	
	public RecieptShortDto() {
	}

	public RecieptShortDto(String tittle, String categoryRecipes, String author, String mainImg, String mainDescription,
			double percent, double score) {
		this.tittle = tittle;
		this.categoryRecipes = categoryRecipes;
		this.author = author;
		this.mainImg = mainImg;
		this.mainDescription = mainDescription;
		this.percent = percent;
		this.score = score;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getCategoryRecipes() {
		return categoryRecipes;
	}

	public void setCategoryRecipes(String categoryRecipes) {
		this.categoryRecipes = categoryRecipes;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
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

	@Override
	public String toString() {
		return "RecieptShortDto [tittle=" + tittle + ", categoryRecipes=" + categoryRecipes + ", author=" + author
				+ ", mainImg=" + mainImg + ", mainDescription=" + mainDescription + ", percent=" + percent + ", score="
				+ score + "]";
	}


	
	

	

}
