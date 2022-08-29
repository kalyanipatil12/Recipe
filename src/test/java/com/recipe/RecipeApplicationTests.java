package com.recipe;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.recipe.dto.RecipesDTO;
import com.recipe.entity.Recipes;
import com.recipe.repository.RecipesRepository;
import com.recipe.service.RecipesService;

@SpringBootTest
@RunWith(SpringRunner.class)

public class RecipeApplicationTests {

	@Mock
	RecipesRepository recipesRepository;

	@InjectMocks
	RecipesService recipesService = new RecipesService();

	@Test
	public void getRecipesTest() throws Exception {

		List<Recipes> recipeList = new ArrayList<Recipes>();
		Recipes recipeEntity = new Recipes();
		recipeEntity.setRecipeid(104);
		recipeEntity.setserving("4people");
		recipeEntity.setRecipeName("misalpav");
		recipeEntity.setRecipeType("curry");
		recipeEntity.setIngredients("potatoes,chilli");
		recipeEntity.setIsVegeterian(true);
		recipeEntity.setInstructions("with oven");
		recipeList.add(recipeEntity);

		Optional opt = Optional.of(recipeEntity);
		// Optional opt1 = Optional.empty();

		Mockito.when(recipesRepository.findAll()).thenReturn(recipeList);
		List<RecipesDTO> recipe1 = recipesService.getRecipes();
		Assertions.assertEquals(recipe1.isEmpty(), recipeList.isEmpty());
	}

	@Test
	public void addRecipeTest() {
		Recipes recipes1 = new Recipes(100, "misal", "curry", "2people", true, "potatoes,chilli", "with oven");
		when(recipesRepository.save(recipes1)).thenReturn(recipes1);
		assertEquals(recipes1, recipesService.addRecipe(recipes1));
	}

}
