package com.easycook.api.dto;

public class StepDto {
	private String img;
	private String description;
	public StepDto() {
	}
	public StepDto(String img, String description) {
		this.img = img;
		this.description = description;
	}
	public String getImg() {
		return img;
	}
	public String getDescription() {
		return description;
	}
	@Override
	public String toString() {
		return "StepDto [img=" + img + ", description=" + description + "]";
	}
	
	
}
