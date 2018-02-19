package com.easycook.entities;

import com.easycook.api.dto.ProductDto;

public class Product {
	private String name;
	private double quantity;
	private String unit;
	public Product(ProductDto product) {
		this.name = product.getName();
		this.quantity = product.getQuantity();
		this.unit = product.getUnit();
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getName() {
		return name;
	}
	public double getQuantity() {
		return quantity;
	}
	public String getUnit() {
		return unit;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", quantity=" + quantity + ", unit=" + unit + "]";
	}
	
	
}
