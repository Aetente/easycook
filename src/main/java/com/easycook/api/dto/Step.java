package com.easycook.api.dto;

public class Step {
	private String img;
	private String description;
	public Step() {
	}
	public Step(String img, String description) {
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
