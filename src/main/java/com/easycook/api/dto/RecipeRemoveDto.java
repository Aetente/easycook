package com.easycook.api.dto;

import java.io.Serializable;

import com.easycook.entities.RecipeId;

public class RecipeRemoveDto implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//	private String user;  
	private RecipeId id;
	
	
	public RecipeRemoveDto() {
	}





	public RecipeRemoveDto( RecipeId id) {
	
		this.id = id;
	}





	public RecipeId getIdRec() {
		return id;
	}


	public void setIdRec(RecipeId id) {
		this.id = id;
	}





	@Override
	public String toString() {
		return "RecipeRemoveDto [idRec=" + id + "]";
	}


}
