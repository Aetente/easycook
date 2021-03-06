package com.easycook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.easycook.api.dto.ChangeProfilePersonDto;
import com.easycook.api.dto.ChangeRecipeDto;
import com.easycook.api.dto.PersonDto;
import com.easycook.api.dto.ProductDto;
import com.easycook.api.dto.RecieptDto;
import com.easycook.api.dto.RecipeRemoveDto;
import com.easycook.entities.RecipeId;
import com.easycook.interfaces.IDatabaseController;
import com.easycook.interfaces.IRecipesConstans;
@RestController
@CrossOrigin
public class EasyCookHandler{
	@Autowired
   IDatabaseController dbController;

	@PostMapping({IRecipesConstans.RECIPE})
	public boolean addRecipe(@RequestBody RecieptDto recipe) {
		
		return dbController.addRecipe(recipe);
	}

	@DeleteMapping({IRecipesConstans.RECIPE})
	public boolean removeRecipe(@RequestBody RecipeRemoveDto recipe,@RequestHeader("Authorization") String email) {
		return dbController.removeRecipe(recipe.getIdRec(), email);
		//TODO
	}
	@PutMapping({IRecipesConstans.CHANGE_RECIPE}) //TODO 
	boolean changeRecipe(@RequestBody ChangeRecipeDto recipe, @RequestHeader("Authorization") String email) {
		//token get email
		return dbController.changeRecipe(recipe,email);
	}
	
	@GetMapping({IRecipesConstans.RECIPES})
	Iterable<RecieptDto> getAllRecipes(){
		return dbController.getAllRecipes();
	}
	

	@GetMapping({IRecipesConstans.RECIPE+"/title/{tittle}"})
	public Iterable<RecieptDto> getRecipeByTittle(@PathVariable String tittle) {
		return dbController.getRecipeByTittle(tittle);
	}
	
	@GetMapping({IRecipesConstans.RECIPE+"/author/{author}"})
	public Iterable<RecieptDto> getRecipeByAuthor(@PathVariable String author) {
		
		return dbController.getRecipeByAuthor(author);
	}

	@PostMapping({IRecipesConstans.RECIPE+"/products"})
	public Iterable<RecieptDto> getRecipeByProducts(@RequestBody List<ProductDto> products) {
		
		return dbController.getRecipeByProducts(products);
	}

	@GetMapping({IRecipesConstans.RECIPE+"/method/{method}"})
	public Iterable<RecieptDto> getRecipeByMethod(@PathVariable String method) {
		
		return dbController.getRecipeByMethod(method);
	}

	@GetMapping({IRecipesConstans.RECIPE+"/category/{category}"})
	public Iterable<RecieptDto> getRecipeByCategory(@PathVariable String category) {
	
		return dbController.getRecipeByCategory(category);
	}
	
	@GetMapping({IRecipesConstans.RECIPE+"/{title}/{author}"})
	RecieptDto getFullRecipeById(@PathVariable String title, @PathVariable String author) {
		return dbController.getFullRecipeById(new RecipeId(title,author));
	}
	
	@PostMapping({IRecipesConstans.FAVORITES+"/{title}/{author}"})
	boolean addToFavorite(@PathVariable String title, @PathVariable String author, @RequestBody PersonDto person) {
		return dbController.addToFavorite(new RecipeId(title,author), person);
	}
	
	@PostMapping({IRecipesConstans.PROFILE})
	boolean addPerson(@RequestBody PersonDto person) {
		return dbController.addPerson(person);
	}
	
	@GetMapping({IRecipesConstans.PROFILE+"/{login}"})
	PersonDto getPersonByName(@PathVariable String login) {
		return dbController.getPersonByName(login);
	}
	
	@PutMapping({IRecipesConstans.CHANGE_PERSON}) //TODO
	boolean editPerson(@RequestBody ChangeProfilePersonDto personData,@RequestHeader("Authorization") String user) {
		return dbController.editPerson(personData,user);
	}
	
	
	@GetMapping({IRecipesConstans.PRODUCT+"/{name}"})
	Iterable<ProductDto> getProduct(@PathVariable String name){
		return dbController.getProduct(name);
	}
	}
	
	
	
