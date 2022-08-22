package com.recipe.dto;

import com.recipe.entity.Recipes;

public class RecipesDTO {
	long recipeid;
	String recipeName;
	String recipeType;
	String recipeQuantity;
	boolean isVegeterian;
	String ingredients;
	String instructions;


	public RecipesDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public RecipesDTO(long recipeid, String recipeName, String recipeType, String recipeQuantity, boolean isVegeterian,
			String ingredients, String instructions) {
		super();
		this.recipeid = recipeid;
		this.recipeName = recipeName;
		this.recipeType = recipeType;
		this.recipeQuantity = recipeQuantity;
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



	public String getRecipeQuantity() {
		return recipeQuantity;
	}



	public void setRecipeQuantity(String recipeQuantity) {
		this.recipeQuantity = recipeQuantity;
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
	
	//converts entity into DTO
	public static RecipesDTO valueOf(Recipes recipes) {
		RecipesDTO recipesDTO= new RecipesDTO();
		recipesDTO.setRecipeid(recipes.getRecipeid());
		recipesDTO.setRecipeName(recipes.getRecipeName());
		recipesDTO.setRecipeType(recipes.getRecipeType());
		recipesDTO.setRecipeQuantity(recipes.getRecipeQuantity());
		recipesDTO.setIsVegeterian(recipes.getIsVegeterian());
		recipesDTO.setIngredients(recipes.getIngredients());
		recipesDTO.setInstructions(recipes.getInstructions());
		return recipesDTO;
		
		
	}

	@Override
	public String toString() {
		return "RecipesDTO [recipeid=" + recipeid + ", recipeName=" + recipeName + ", recipeType=" + recipeType
				+ ", recipeQuantity=" + recipeQuantity + ", isVegeterian=" + isVegeterian + ", ingredients="
				+ ingredients + ", instructions=" + instructions + "]";
	}

	
	
}
