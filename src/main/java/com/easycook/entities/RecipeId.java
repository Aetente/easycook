package com.easycook.entities;

import java.io.Serializable;


public class RecipeId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String title;
	String authorId;

	public RecipeId() {
	}

	public RecipeId(String title, String authorId) {
		this.title = title;
		this.authorId = authorId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorId() {
		return authorId;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	@Override
	public String toString() {
		return "RecipeId [title=" + title + ", authorId=" + authorId + "]";
	}

}
