package com.recipe.controller;

import java.util.List;
import java.util.NoSuchElementException;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.recipe.dto.RecipesDTO;
import com.recipe.entity.Recipes;
import com.recipe.service.RecipesService;

@CrossOrigin
@RestController
@Transactional
public class RecipeController {

	@Autowired
	private RecipesService recipesService;

//add recipe
	@PostMapping(value = "recipes")
	@ResponseStatus(HttpStatus.CREATED)
	public Recipes addRecipe(@RequestBody Recipes recipes) {
		return recipesService.addRecipe(recipes);
	}

//fetch recipe details
	@GetMapping(value = "/recipes", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<RecipesDTO> getRecipes() {
		return recipesService.getRecipes();

	}

//get recipe by id
	@GetMapping("{id}")
	public Recipes getRecipeById(@PathVariable("id") long recipeId) {
		return recipesService.getRecipeById(recipeId);
	}

//update record
	@PutMapping("/updaterecipe")
	public ResponseEntity<String> updateRecipe(@RequestBody Recipes recipe) {
		try {
			recipesService.updateRecipe(recipe);
			return new ResponseEntity<String>(HttpStatus.OK);

		} catch (NoSuchElementException ex) {
			System.out.println(ex.getMessage());
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}

	}

//delete recipe record
	@DeleteMapping("/recipe/{recipeid}")
	public ResponseEntity<String> deleteRecipe(@PathVariable long recipeid) {
		try {
			recipesService.deleteRecipeById(recipeid);
			return new ResponseEntity<String>(HttpStatus.OK);
		} catch (RuntimeException ex) {
			System.out.println(ex.getMessage());
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
	}

}
