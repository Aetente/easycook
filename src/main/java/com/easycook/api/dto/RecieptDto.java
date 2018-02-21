package com.easycook.api.dto;

import java.util.List;

import com.easycook.entities.Step;

public class RecieptDto extends RecieptShortDto {
	
	private  List<ProductDto> products;
	private String method;
	private List<Step> steps;//list
	private int amountOfVoters;
	
	
	public RecieptDto() {
	}


	public RecieptDto(String tittle, String categoryRecipes, String author, String mainImg, String mainDescription,
			double percent, double score, List<ProductDto> products, String method, List<Step> steps, int amountOfVoters) {
		super(tittle, categoryRecipes, author, mainImg, mainDescription, percent, score);
		this.products = products;
		this.method = method;
		this.steps = steps;
		this.amountOfVoters = amountOfVoters;
	}


	public List<ProductDto> getProducts() {
		return products;
	}


	public String getMethod() {
		return method;
	}

	public void setProducts(List<ProductDto> products) {
		this.products = products;
	}


	public void setMethod(String method) {
		this.method = method;
	}


	

	public List<Step> getSteps() {
		return steps;
	}


	public void setSteps(List<Step> steps) {
		this.steps = steps;
	}

	public int getAmountOfVoters() {
		return amountOfVoters;
	}


	public void setAmountOfVoters(int amountOfVoters) {
		this.amountOfVoters = amountOfVoters;
	}


	@Override
	public String toString() {
		return "RecieptDto [products=" + products + ", method=" + method + ", steps=" + steps + ", amountOfVoters="
				+ amountOfVoters + "]";
	}


	

	
}
