package com.easycook.interfaces;

import com.easycook.api.dto.ProductDto;

public interface IProducts {
 
	boolean addNewProduct(ProductDto product);
	Iterable<ProductDto> getProduct(String name);
}
