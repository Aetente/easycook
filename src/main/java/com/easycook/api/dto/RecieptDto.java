package com.easycook.api.dto;

import java.util.Arrays;

public class RecieptDto extends RecieptShortDto {
	private String author;
	private ProductDto[] products;
	private String method;
	private StepDto[] steps;
	
	
	public RecieptDto() {
	}


	public RecieptDto(String author, ProductDto[] products, String method, StepDto[] steps) {
		this.author = author;
		this.products = products;
		this.method = method;
		this.steps = steps;
	}


	public String getAuthor() {
		return author;
	}


	public ProductDto[] getProducts() {
		return products;
	}


	public String getMethod() {
		return method;
	}


	public StepDto[] getSteps() {
		return steps;
	}


	@Override
	public String toString() {
		return "RecieptDto [author=" + author + ", products=" + Arrays.toString(products) + ", method=" + method
				+ ", steps=" + Arrays.toString(steps) + "]";
	}
	
	
}
