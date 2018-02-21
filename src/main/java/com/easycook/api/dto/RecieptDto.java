package com.easycook.api.dto;

import java.util.List;

import com.easycook.entities.MethodOfRecipe;
import com.easycook.entities.Step;

public class RecieptDto extends RecieptShortDto {
	
	private  List<ProductDto> products;
	private List<MethodOfRecipe> method;
	private List<Step> steps;//list
	private int amountOfVoters;
	
	
	public RecieptDto() {
	}


	public RecieptDto(List<ProductDto> products, List<MethodOfRecipe> method, List<Step> steps, int amountOfVoters) {
		this.products = products;
		this.method = method;
		this.steps = steps;
		this.amountOfVoters = amountOfVoters;
	}


	public List<ProductDto> getProducts() {
		return products;
	}


	public List<MethodOfRecipe> getMethod() {
		return method;
	}

	public void setProducts(List<ProductDto> products) {
		this.products = products;
	}


	public void setMethod(List<MethodOfRecipe> method) {
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


	

	@Override
	public String toString() {
		return "RecieptDto [products=" + products + ", method=" + method + ", steps=" + steps + ", amountOfVoters="
				+ amountOfVoters + "]";
	}


	

	
}
