package com.easycook.api.dto;

import com.easycook.entities.RecipeId;

public class RecipeRemoveDto {
	private String user;
	private RecipeId idRec;
	
	
	public RecipeRemoveDto() {
	}





	public RecipeRemoveDto(String user, RecipeId idRec) {
		this.user = user;
		this.idRec = idRec;
	}





	public String getAuthor() {
		return user;
	}


	
	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public RecipeId getIdRec() {
		return idRec;
	}


	public void setIdRec(RecipeId idRec) {
		this.idRec = idRec;
	}


	@Override
	public String toString() {
		return "RecipeRemoveDto [author=" + user + ", tittle=" + idRec + "]";
	}
	
}
