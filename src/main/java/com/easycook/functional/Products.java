package com.easycook.functional;

import com.easycook.api.dto.ProductDto;
import com.easycook.interfaces.IProducts;

public class Products implements IProducts {

	@Override
	public boolean addNewProduct(ProductDto product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<ProductDto> getProduct(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
