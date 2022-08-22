package com.recipe.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.recipe.dto.RecipesDTO;
import com.recipe.entity.Recipes;
import com.recipe.repository.RecipesRepository;




@Service
public class RecipesService  {
	Logger logger =LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired
	private RecipesRepository recipesRepository;
	
	
	//add recipe
	public Recipes addRecipe(Recipes recipe) {
		return recipesRepository.save(recipe);
		
	}

	//fetch all recipes details 
	public List<RecipesDTO> getRecipes(){
		
		List<Recipes> recipes =recipesRepository.findAll();
		List<RecipesDTO> recipesDTO =new ArrayList<>();
		
		for(Recipes recipe:recipes) {
			recipesDTO.add(RecipesDTO.valueOf(recipe));
			
		}
		return recipesDTO;
	}

	//recipes by id
	public Recipes getRecipeById(long recipeId) {
		return recipesRepository.findById(recipeId).get();
		
	}
	
	//updates recipe
	
	public void updaterecipe(Recipes recipe) {
		//check if the recipe with passed id exists or not
		Recipes recipeA = recipesRepository.findById(recipe.getRecipeid()).orElseThrow();
		//if recipe exists then updated
		recipesRepository.save(recipe);
		
	}
	
	//delete recipe
	
	public void deleteRecipeById(long recipeId) {
		try {
			recipesRepository.deleteById(recipeId);
			
		}
		catch(DataAccessException ex) {
			throw new RuntimeException(ex.getMessage());
		}
	}
	
	
	
	
	
	
	
	
	/*@Override
	public Recipes saveRecipe(Recipes recipe) {
		return recipeRepository.save(recipe);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Recipes updateRecipe(Recipes recipe) {
		return recipeRepository.save(recipe);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Recipes> getRecipes() {
		return(List<Recipes>) recipeRepository.findAll();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRecipe(int recipeId) {
		recipeRepository.deleteById(recipeId);
		// TODO Auto-generated method stub
		
	}*/
}
	


