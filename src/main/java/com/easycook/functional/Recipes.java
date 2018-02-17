package com.easycook.functional;

import com.easycook.api.dto.ChangeRecipeDto;
import com.easycook.api.dto.PersonDto;
import com.easycook.api.dto.ProductDto;
import com.easycook.api.dto.RecieptDto;
import com.easycook.api.dto.RecieptShortDto;
import com.easycook.api.dto.RecipeFullDto;
import com.easycook.interfaces.IReciepts;

public class Recipes implements IReciepts{

	@Override
	public boolean addRecipe(RecieptDto recipe) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeRecipe(String tittle, String user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean changeRecipe(ChangeRecipeDto recipe) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<RecieptShortDto> getAllRecipes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<RecieptShortDto> getRecipeByTittle(String tittle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<RecieptShortDto> getRecipeByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<RecieptShortDto> getRecipeByProducts(ProductDto[] products) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<RecieptShortDto> getRecipeByMethod(String method) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<RecieptShortDto> getRecipeByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RecieptDto getFullRecipe(String tittle, String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addToFavorite(RecipeFullDto recipeId, PersonDto person) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double calculatePercentageOfMatches(ProductDto[] products, RecieptShortDto[] recipes) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double ratingRecipes(double mark) {
		// TODO Auto-generated method stub
		return 0;
	}

}
