package com.recipe.dto;

import com.recipe.entity.Recipes;

public class RecipesDTO {
	long recipeid;
	String recipeName;
	String recipeType;
	Integer serving;
	boolean isVegeterian;
	String ingredients;
	String instructions;

	public RecipesDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RecipesDTO(long recipeid, String recipeName, String recipeType, Integer serving, boolean isVegeterian,
			String ingredients, String instructions) {
		super();
		this.recipeid = recipeid;
		this.recipeName = recipeName;
		this.recipeType = recipeType;
		this.serving = serving;
		this.isVegeterian = isVegeterian;
		this.ingredients = ingredients;
		this.instructions = instructions;
	}

	public long getRecipeid() {
		return recipeid;
	}

	public void setRecipeid(long recipeid) {
		this.recipeid = recipeid;
	}

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public String getRecipeType() {
		return recipeType;
	}

	public void setRecipeType(String recipeType) {
		this.recipeType = recipeType;
	}

	public Integer getserving() {
		return serving;
	}

	public void setserving(Integer serving) {
		this.serving = serving;
	}

	public boolean getIsVegeterian() {
		return isVegeterian;
	}

	public void setIsVegeterian(boolean isVegeterian) {
		this.isVegeterian = isVegeterian;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	// converts entity into DTO
	public static RecipesDTO valueOf(Recipes recipes) {
		RecipesDTO recipesDTO = new RecipesDTO();
		recipesDTO.setRecipeid(recipes.getRecipeid());
		recipesDTO.setRecipeName(recipes.getRecipeName());
		recipesDTO.setRecipeType(recipes.getRecipeType());
		recipesDTO.setserving(recipes.getserving());
		recipesDTO.setIsVegeterian(recipes.getIsVegeterian());
		recipesDTO.setIngredients(recipes.getIngredients());
		recipesDTO.setInstructions(recipes.getInstructions());
		return recipesDTO;

	}

	@Override
	public String toString() {
		return "RecipesDTO [recipeid=" + recipeid + ", recipeName=" + recipeName + ", recipeType=" + recipeType
				+ ", recipeQuantity=" + serving + ", isVegeterian=" + isVegeterian + ", ingredients=" + ingredients
				+ ", instructions=" + instructions + "]";
	}

}
