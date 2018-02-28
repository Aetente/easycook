package com.easycook.interfaces;

import java.util.List;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.easycook.entities.Product;
import com.easycook.entities.Recipe;
import com.easycook.entities.RecipeId;

public interface RecipeRepository extends CrudRepository<Recipe, RecipeId> {
	@Query("{'receipId.tittle':'?0'}")
	List<Recipe> findRecipeByTitle(String tittle);
	@Query("{'receipId.authorId':'?0'}")
	List<Recipe> findRecipeByAuthor(String author);
	@Query("{'products':'?0'}")
	List<Recipe> findRecipeByProducts(List<Product> products);
	@Query("{'method':'?0'}")
	List<Recipe> findRecipeByMethod(String method);
	@Query("{'category':'?0'}")
	List<Recipe> findRecipeByCategory(String category);
	
}
