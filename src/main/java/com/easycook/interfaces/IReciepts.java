package com.easycook.interfaces;

import com.easycook.api.dto.ProductDto;
import com.easycook.api.dto.RecieptDto;
import com.easycook.api.dto.RecieptShortDto;

public interface IReciepts {
	boolean addRecipe(RecieptDto recipe);
	boolean removeRecipe(String tittle, String user);
	Iterable<RecieptDto> getRecipeByTittle(String tittle);
	Iterable<RecieptDto> getRecipeByAuthor(String author);
	Iterable<RecieptDto> getRecipeByProducts(ProductDto[] products);
	Iterable<RecieptDto> getRecipeByMethod(String method);
	Iterable<RecieptDto> getRecipeByCategory(String category);
	double calculatePercentageOfMatches(ProductDto[] products, RecieptShortDto[] recipes);
	double reitingRecipes(double mark);
}
