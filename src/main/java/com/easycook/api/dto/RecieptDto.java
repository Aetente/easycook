package com.easycook.api.dto;

import java.util.Arrays;

public class RecieptDto extends RecieptShortDto {
	
	private ProductDto[] products;
	private String method;
	private Step[] steps;
	
	
	public RecieptDto() {
	}


	public RecieptDto(String tittle, String categoryRecipes, String mainImg, String mainDescription, double percent,
			double score, String author, ProductDto[] products, String method, Step[] steps) {
		super(tittle, categoryRecipes, mainImg, mainDescription, author, percent, score);
		
		this.products = products;
		this.method = method;
		this.steps = steps;
	}


	


	public ProductDto[] getProducts() {
		return products;
	}


	public String getMethod() {
		return method;
	}


	public Step[] getSteps() {
		return steps;
	}


	


	public void setProducts(ProductDto[] products) {
		this.products = products;
	}


	public void setMethod(String method) {
		this.method = method;
	}


	public void setSteps(Step[] steps) {
		this.steps = steps;
	}


	@Override
	public String toString() {
		return "RecieptDto [" +" products=" + Arrays.toString(products) + ", method=" + method
				+ ", steps=" + Arrays.toString(steps) + "]";
	}
	
	
}
