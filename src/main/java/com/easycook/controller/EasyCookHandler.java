package com.easycook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.easycook.api.dto.ChangeProfilePersonDto;
import com.easycook.api.dto.ChangeRecipeDto;
import com.easycook.api.dto.PersonDto;
import com.easycook.api.dto.ProductDto;
import com.easycook.api.dto.RecieptDto;
import com.easycook.api.dto.RecieptShortDto;
import com.easycook.api.dto.RecipeRemoveDto;
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
	public boolean removeRecipe(@RequestBody RecipeRemoveDto recipe) {
		return dbController.removeRecipe(recipe.getTittle(), recipe.getAuthor());
	}
	@PutMapping({IRecipesConstans.CHANGE_RECIPE})
	boolean changeRecipe(ChangeRecipeDto recipe) {
		return dbController.changeRecipe(recipe);
	}
	
	@GetMapping({IRecipesConstans.RECIPES})
	Iterable<RecieptShortDto> getAllRecipes(){
		return dbController.getAllRecipes();
	}
	

	@GetMapping({IRecipesConstans.RECIPE+"/title/{tittle}"})
	public Iterable<RecieptShortDto> getRecipeByTittle(@PathVariable String tittle) {
		return dbController.getRecipeByTittle(tittle);
	}
	
	@GetMapping({IRecipesConstans.RECIPE+"/author/{author}"})
	public Iterable<RecieptShortDto> getRecipeByAuthor(@PathVariable String author) {
		
		return dbController.getRecipeByAuthor(author);
	}

	@PostMapping({IRecipesConstans.RECIPE+"/products"})
	public Iterable<RecieptShortDto> getRecipeByProducts(@RequestBody ProductDto[] products) {
		
		return dbController.getRecipeByProducts(products);
	}

	@GetMapping({IRecipesConstans.RECIPE+"/{method}"})
	public Iterable<RecieptShortDto> getRecipeByMethod(@PathVariable String method) {
		
		return dbController.getRecipeByMethod(method);
	}

	@GetMapping({IRecipesConstans.RECIPE+"/{category}"})
	public Iterable<RecieptShortDto> getRecipeByCategory(@PathVariable String category) {
	
		return dbController.getRecipeByCategory(category);
	}
	
	@GetMapping({IRecipesConstans.RECIPE+"/{title}/{author}"})
	RecieptDto getFullRecipe(@PathVariable String title, @PathVariable String author) {
		return dbController.getFullRecipe(title, author);
	}
	
	@PostMapping({IRecipesConstans.FAVORITES+"/{title}/{author}"})
	boolean addToFavorite(@PathVariable String title, @PathVariable String author, @RequestBody PersonDto person) {
		return dbController.addToFavorite(title,author, person);
	}
	
	@PostMapping({IRecipesConstans.PROFILE})
	boolean addPerson(@RequestBody PersonDto person) {
		return dbController.addPerson(person);
	}
	
	@GetMapping({IRecipesConstans.PROFILE+"/{login}"})
	PersonDto getPersonByName(@PathVariable String login) {
		return dbController.getPersonByName(login);
	}
	
	@PutMapping({IRecipesConstans.CHANGE_PERSON})
	boolean editPerson(ChangeProfilePersonDto personData) {
		return dbController.editPerson(personData);
	}
	
	@PostMapping({IRecipesConstans.PRODUCT})
	boolean addNewProduct(@RequestBody ProductDto product) {
		return dbController.addNewProduct(product);
		
	}
	@GetMapping({IRecipesConstans.PRODUCT+"/{name}"})
	Iterable<ProductDto> getProduct(@PathVariable String name){
		return dbController.getProduct(name);
	}
	}
	
	
	
