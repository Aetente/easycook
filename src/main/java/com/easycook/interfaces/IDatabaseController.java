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
	boolean addPerson(PersonDto person); //works
	PersonDto getPersonByName(String name); //TODO ??
	boolean editPerson(ChangeProfilePersonDto personData, String email); //TODO !!
	double ratingPerson(double[] marks); //TODO
	Iterable<ProductDto> getProduct(String name); //TODO
	boolean addRecipe(RecieptDto recipe); //works
	boolean removeRecipe(RecipeId tittle, String email);  //TODO !!
	boolean changeRecipe(RecieptDto recipe,String email);   //TODO !!
	Iterable<RecieptDto> getAllRecipes();  //works
	Iterable<RecieptDto> getRecipeByTittle(String tittle); //works
	Iterable<RecieptDto> getRecipeByAuthor(String author);  //works (query need sent with "/" in end)
	Iterable<RecieptDto> getRecipeByProducts(List<ProductDto> products); //TODO
	Iterable<RecieptDto> getRecipeByMethod(String method); //TODO
	Iterable<RecieptDto> getRecipeByCategory(String category); //works
	RecieptDto getFullRecipeById(RecipeId idRec); //works (query need sent with "/" in end)
	boolean addToFavorite(RecipeId idRec, PersonDto person);  //TODO
	double calculatePercentageOfMatches(List<ProductDto> products, List<RecieptDto> recipes); //TODO
	double ratingRecipes(double mark);  //TODO
	Recipe mappingRecipeToEnt(RecieptDto recipe); //works
	Person mappingPersonToEnt(PersonDto person); //works
	Product mappingProductToEnt(ProductDto product); //works
	RecieptDto mappingRecipeToDto(Recipe recipe); //works
	PersonDto mappingPersonToDto(Person person); //works
	ProductDto mappingProductToDto(Product product); //works
}
