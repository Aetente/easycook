package com.easycook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.easycook.api.dto.PersonDto;
import com.easycook.api.dto.ProductDto;
import com.easycook.api.dto.RecieptDto;
import com.easycook.api.dto.RecieptShortDto;
import com.easycook.api.dto.RecipeRemoveDto;
import com.easycook.interfaces.IPerson;
import com.easycook.interfaces.IProducts;
import com.easycook.interfaces.IReciepts;
import com.easycook.interfaces.IRecipesConstans;
@RestController
@CrossOrigin
public class EasyCookHandler{
	@Autowired
   IReciepts recipets;
	IPerson persons;
	IProducts products;

	@PostMapping({IRecipesConstans.RECIPE})
	public boolean addRecipe(@RequestBody RecieptDto recipe) {
		
		return recipets.addRecipe(recipe);
	}

	@DeleteMapping({IRecipesConstans.RECIPE})
	public boolean removeRecipe(@RequestBody RecipeRemoveDto recipe) {
		return recipets.removeRecipe(recipe.getTittle(), recipe.getAuthor());
	}

	@GetMapping({IRecipesConstans.RECIPE+"/{tittle}"})
	public Iterable<RecieptDto> getRecipeByTittle(@PathVariable String tittle) {
		return recipets.getRecipeByTittle(tittle);
	}

	@GetMapping({IRecipesConstans.RECIPE+"/{author}"})
	public Iterable<RecieptDto> getRecipeByAuthor(@PathVariable String author) {
		
		return recipets.getRecipeByAuthor(author);
	}

	@GetMapping({IRecipesConstans.RECIPE+"/{products}"})
	public Iterable<RecieptDto> getRecipeByProducts(@PathVariable ProductDto[] products) {
		
		return recipets.getRecipeByProducts(products);
	}

	@GetMapping({IRecipesConstans.RECIPE+"/{method}"})
	public Iterable<RecieptDto> getRecipeByMethod(@PathVariable String method) {
		
		return recipets.getRecipeByMethod(method);
	}

	@GetMapping({IRecipesConstans.RECIPE+"/{category}"})
	public Iterable<RecieptDto> getRecipeByCategory(@PathVariable String category) {
	
		return recipets.getRecipeByCategory(category);
	}
	
	@PostMapping({IRecipesConstans.PROFILE})
	boolean addPerson(@RequestBody PersonDto person) {
		return persons.addPerson(person);
	}
	
	@GetMapping({IRecipesConstans.PROFILE+"/{name}"})
	PersonDto getPersonByName(@PathVariable String name) {
		return persons.getPersonByName(name);
	}
	@PostMapping({IRecipesConstans.PRODUCT})
	boolean addNewProduct(@RequestBody ProductDto product) {
		return products.addNewProduct(product);
		
	}
	@GetMapping({IRecipesConstans.PRODUCT+"/{name}"})
	Iterable<ProductDto> getProduct(@PathVariable String name){
		return products.getProduct(name);
	}
	}
	
	
	
