package com.easycook.api.dto;

public class ChangeProfilePersonDto {
	private String image;
	private String name;
	private String password;
	private String email;
	
	
	public ChangeProfilePersonDto() {
	}


	public ChangeProfilePersonDto(String image, String name, String password, String email) {
		this.image = image;
		this.name = name;
		this.password = password;
		this.email = email;
	}


	public String getImage() {
		return image;
	}


	public String getName() {
		return name;
	}


	public String getPassword() {
		return password;
	}


	public String getEmail() {
		return email;
	}
	
}
