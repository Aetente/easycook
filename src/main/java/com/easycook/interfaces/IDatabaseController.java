package com.easycook.interfaces;

import java.util.List;

import com.easycook.api.dto.ChangeProfilePersonDto;
import com.easycook.api.dto.PersonDto;
import com.easycook.api.dto.ProductDto;
import com.easycook.api.dto.RecieptDto;
import com.easycook.entities.Person;
import com.easycook.entities.Product;
import com.easycook.entities.Recipe;
import com.easycook.entities.RecipeId;

public interface IDatabaseController {
	boolean addPerson(PersonDto person);
	PersonDto getPersonByName(String name);
	boolean editPerson(ChangeProfilePersonDto personData, String email); //TODO
	double ratingPerson(double[] marks);

	Iterable<ProductDto> getProduct(String name);
	boolean addRecipe(RecieptDto recipe); 
	boolean removeRecipe(RecipeId tittle, String email);  //TODO
	boolean changeRecipe(RecieptDto recipe,String email);   //TODO
	Iterable<RecieptDto> getAllRecipes();
	Iterable<RecieptDto> getRecipeByTittle(String tittle);
	Iterable<RecieptDto> getRecipeByAuthor(String author);
	Iterable<RecieptDto> getRecipeByProducts(List<ProductDto> products);
	Iterable<RecieptDto> getRecipeByMethod(String method);
	Iterable<RecieptDto> getRecipeByCategory(String category);
	RecieptDto getFullRecipeById(RecipeId idRec);
	boolean addToFavorite(RecipeId idRec, PersonDto person); 
	double calculatePercentageOfMatches(List<ProductDto> products, List<RecieptDto> recipes);
	double ratingRecipes(double mark);
	Recipe mappingRecipeToEnt(RecieptDto recipe);
	Person mappingPersonToEnt(PersonDto person);
	Product mappingProductToEnt(ProductDto product);
	RecieptDto mappingRecipeToDto(Recipe recipe);
	PersonDto mappingPersonToDto(Person person);
	ProductDto mappingProductToDto(Product product);
}
