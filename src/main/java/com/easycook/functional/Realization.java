package com.easycook.functional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.easycook.api.dto.ChangeProfilePersonDto;
import com.easycook.api.dto.PersonDto;
import com.easycook.api.dto.ProductDto;
import com.easycook.api.dto.RecieptDto;
import com.easycook.api.dto.RecieptShortDto;
import com.easycook.entities.Person;
import com.easycook.entities.Product;
import com.easycook.entities.Recipe;
import com.easycook.entities.RecipeId;
import com.easycook.interfaces.IDatabaseController;

@Repository
public class Realization implements IDatabaseController {

	@PersistenceContext
	EntityManager em;

	@Transactional
	@Override
	public boolean addPerson(PersonDto person) {
		if (getPersonByName(person.getEmail()) != null) {
			return false;
		}
		if(person.getEmail()!=null&&person.getLastName()!=null&&person.getName()!=null&&person.getPassword()!=null) {
			em.persist(mappingPersonToEnt(person));
		}
		return true;
	}

	@Override
	public PersonDto getPersonByName(String email) {
		return mappingPersonToDto(em.find(Person.class, email));
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
	@Transactional
	public boolean addNewProduct(ProductDto product) {
		if (getProduct(product.getName()) != null) {
			return false;
		}
		em.persist(mappingProductToEnt(product));
		return true;
	}

	@Override
	public Iterable<ProductDto> getProduct(String name) {
		Query query = em.createQuery("");
		query.setParameter(1, name);
		return query.getResultList();
	}

	@Override
	@Transactional
	public boolean addRecipe(RecieptDto recipe) {

		if (getFullRecipeById(recipe.getRecipeId()) != null) {
			return false; // you can`t add recipe if combination consist
		} else if (recipe.getRecipeId() != null && recipe.getMainImg() != null && recipe.getMainDescription() != null
				&& recipe.getProducts() != null && recipe.getMethod() != null && recipe.getSteps() != null
				&& recipe.getCategoryRecipes() != null) {
			em.persist(mappingRecipeToEnt(recipe));
		} // check field on null

		return true;
	}

	@Override
	@Transactional
	public boolean removeRecipe(RecipeId tittle, String email) {
		Recipe recipe = mappingRecipeToEnt(getFullRecipeById(tittle));
		if (tittle.getAuthorId() != email && recipe == null) {
			return false;
		}
		em.remove(recipe);
		return true;
	}

	@Override
	public boolean changeRecipe(RecieptDto recipe, String email) {
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
		Query query = em.createQuery("");
		query.setParameter(1, tittle);
		return query.getResultList();
	}

	@Override
	public Iterable<RecieptShortDto> getRecipeByAuthor(String author) {
		Query query = em.createQuery("");
		query.setParameter(1, author);
		return query.getResultList();
	}

	@Override
	public Iterable<RecieptShortDto> getRecipeByProducts(ProductDto[] products) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<RecieptShortDto> getRecipeByMethod(String method) {
		Query query = em.createQuery("");
		query.setParameter(1, method);
		return query.getResultList();
	}

	@Override
	public Iterable<RecieptShortDto> getRecipeByCategory(String category) {
		Query query = em.createQuery("");
		query.setParameter(1, category);
		return query.getResultList();
	}

	@Override
	public RecieptDto getFullRecipeById(RecipeId idRec) {

		return mappingRecipeToDto(em.find(Recipe.class, idRec));
		
		
	}

	@Override
	@Transactional //??
	public boolean addToFavorite(RecipeId idRec, PersonDto person) {
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
