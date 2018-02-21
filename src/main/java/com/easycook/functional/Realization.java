package com.easycook.functional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.easycook.api.dto.ChangeProfilePersonDto;
import com.easycook.api.dto.PersonDto;
import com.easycook.api.dto.ProductDto;
import com.easycook.api.dto.RecieptDto;
import com.easycook.api.dto.RecieptShortDto;
import com.easycook.interfaces.IDatabaseController;
@Repository
public class Realization implements IDatabaseController{
	@PersistenceContext
	EntityManager em;

	@Override
	public boolean addPerson(PersonDto person) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PersonDto getPersonByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean editPerson(ChangeProfilePersonDto personData) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double ratingPerson(double[] marks) {
		// TODO Auto-generated method stub
		return 0;
	}

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
	public boolean changeRecipe(RecieptDto recipe) {
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
	public boolean addToFavorite(String tittle, String author, PersonDto person) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double calculatePercentageOfMatches(ProductDto[] products, RecieptDto[] recipes) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double ratingRecipes(double mark) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
