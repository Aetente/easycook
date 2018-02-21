package com.easycook.interfaces;

import com.easycook.api.dto.ChangeProfilePersonDto;
import com.easycook.api.dto.PersonDto;
import com.easycook.api.dto.ProductDto;
import com.easycook.api.dto.RecieptDto;
import com.easycook.api.dto.RecieptShortDto;
import com.easycook.entities.Person;
import com.easycook.entities.Recipe;
import com.easycook.entities.RecipeId;

public interface IDatabaseController {
	boolean addPerson(PersonDto person);
	PersonDto getPersonByName(String name);
	boolean editPerson(ChangeProfilePersonDto personData, String email); //TODO
	double ratingPerson(double[] marks);
	boolean addNewProduct(ProductDto product);
	Iterable<ProductDto> getProduct(String name);
	boolean addRecipe(RecieptDto recipe); 
	boolean removeRecipe(RecipeId tittle, String email);  //TODO
	boolean changeRecipe(RecieptDto recipe,String email);   //TODO
	Iterable<RecieptShortDto> getAllRecipes();
	Iterable<RecieptShortDto> getRecipeByTittle(String tittle);
	Iterable<RecieptShortDto> getRecipeByAuthor(String author);
	Iterable<RecieptShortDto> getRecipeByProducts(ProductDto[] products);
	Iterable<RecieptShortDto> getRecipeByMethod(String method);
	Iterable<RecieptShortDto> getRecipeByCategory(String category);
	RecieptDto getFullRecipeById(RecipeId idRec);
	boolean addToFavorite(RecipeId idRec, PersonDto person); 
	double calculatePercentageOfMatches(ProductDto[] products, RecieptDto[] recipes);
	double ratingRecipes(double mark);
	Recipe mappingRecipe(RecieptDto recipe);
	Person mappingPerson(PersonDto person);
}
