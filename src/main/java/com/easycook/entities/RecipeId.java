package com.easycook.entities;

import javax.persistence.Embeddable;

@Embeddable
public class RecipeId {
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
}
