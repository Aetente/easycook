package com.easycook.functional;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.easycook.api.dto.ChangeProfilePersonDto;
import com.easycook.api.dto.PersonDto;
import com.easycook.api.dto.ProductDto;
import com.easycook.api.dto.RecieptDto;
import com.easycook.entities.Person;
import com.easycook.entities.Product;
import com.easycook.entities.Recipe;
import com.easycook.entities.RecipeId;
import com.easycook.interfaces.IDatabaseController;
import com.easycook.interfaces.PersonRepository;
import com.easycook.interfaces.RecipeRepository;


@Repository
public class Realization implements IDatabaseController {

	@Autowired
	RecipeRepository recipeRep;
	@Autowired
	PersonRepository personRep;

	public Realization() {
	}

	@Override
	public boolean addPerson(PersonDto person) {
		if (getPersonByName(person.getEmail()) != null) {
			return false;
		}
		if (person.getEmail() != null && person.getLastName() != null && person.getName() != null
				&& person.getPassword() != null) {
			personRep.save(mappingPersonToEnt(person));
			return true;
		}
		return false;
	}

	@Override
	public PersonDto getPersonByName(String email) {

		return mappingPersonToDto(personRep.findOne(email));
	}

	@Override
	public boolean editPerson(ChangeProfilePersonDto personData, String email) {
		// TODO Auto-generated method stub

		return false;
	}

	@Override
	public double ratingPerson(double[] marks) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterable<ProductDto> getProduct(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override  //work
	public boolean addRecipe(RecieptDto recipe) {

		if (getFullRecipeById(recipe.getRecipeId()) != null) {
			return false; // you can`t add recipe if combination consist
		}
		if (recipe.getRecipeId() != null && recipe.getMainImg() != null && recipe.getMainDescription() != null
				&& recipe.getProducts() != null && recipe.getMethod() != null && recipe.getSteps() != null
				&& recipe.getCategoryRecipes() != null) {
			recipeRep.save(mappingRecipeToEnt(recipe));
			return true;
		} else {

			return false;// check field on null
		}

	}

	@Override

	public boolean removeRecipe(RecipeId idRec, String email) {
		Recipe recipe = mappingRecipeToEnt(getFullRecipeById(idRec));
		if(recipe == null) {
			return false;
		}
		if (recipe.getId().getAuthorId() != email ) {
			return false;
		}
		recipeRep.delete(recipe);
		return true;
		
	}

	@Override
	public boolean changeRecipe(RecieptDto recipe, String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override //work
	public Iterable<RecieptDto> getAllRecipes() {
		
		Iterable<Recipe> recipes=recipeRep.findAll();
		List<RecieptDto> list = new ArrayList<>();
		for(Recipe recipe: recipes) {
			list.add(mappingRecipeToDto(recipe));
		}
			
		return list;
	}

	/*private Iterable<RecieptShortDto> mappingRecipeToDto(Iterable<Recipe> reciepts) {
		List<RecieptShortDto> res = new ArrayList<>();
		for (Recipe recipe : reciepts) {
			res.add(new RecieptShortDto(recipe));
		}
		return res;
	}
*/
	@Override
	public Iterable<RecieptDto> getRecipeByTittle(String tittle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<RecieptDto> getRecipeByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<RecieptDto> getRecipeByProducts(List<ProductDto> products) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<RecieptDto> getRecipeByMethod(String method) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<RecieptDto> getRecipeByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RecieptDto getFullRecipeById(RecipeId idRec) {
		Recipe res = recipeRep.findOne(idRec);
		if (res == null) {
			return null;
		} else {
			return mappingRecipeToDto(res);
		}

	}

	@Override
	public boolean addToFavorite(RecipeId idRec, PersonDto person) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double calculatePercentageOfMatches(List<ProductDto> products, List<RecieptDto> recipes) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double ratingRecipes(double mark) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Recipe mappingRecipeToEnt(RecieptDto recipe) {
		Recipe recipeEntity = new Recipe(recipe);
		return recipeEntity;
	}

	@Override
	public Person mappingPersonToEnt(PersonDto person) {
		Person personEntity = new Person(person);
		return personEntity;
	}

	@Override
	public Product mappingProductToEnt(ProductDto product) {
		Product productEntity = new Product(product);
		return productEntity;
	}

	@Override
	public RecieptDto mappingRecipeToDto(Recipe recipe) {
		RecieptDto recipeDto = new RecieptDto(recipe);
		return recipeDto;
	}

	@Override
	public PersonDto mappingPersonToDto(Person person) {
		PersonDto personDto = new PersonDto(person);
		return personDto;
	}

	@Override
	public ProductDto mappingProductToDto(Product product) {
		ProductDto productDto = new ProductDto(product);
		return productDto;
	}

}
