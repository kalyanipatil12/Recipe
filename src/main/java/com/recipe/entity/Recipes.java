package com.recipe.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recipe")
public class Recipes {
	@Id
	@Column(name = "recipeid")
	// @GeneratedValue
	long recipeid;

	@Column(name = "recipename")
	String recipeName;

	@Column(name = "recipetype")
	String recipeType;

	@Column(name = "serving")
	String serving;


	@Column(nullable = false, name = "isvegeterian")
	boolean isVegeterian;

	@Column(name = "ingredients")
	String ingredients;

	@Column(name = "instructions")
	String instructions;

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

	public String getserving() {
		return serving;
	}

	public void setserving(String serving) {
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

	public Recipes() {
		super();

	}

	public Recipes(long recipeid, String recipeName, String recipeType, String serving, boolean isVegeterian,
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
	
	
	@Override
	public String toString() {
		return "Recipes [recipeid=" + recipeid + ", recipeName=" + recipeName + ", recipeType=" + recipeType
				+ ", serving=" + serving + ", isVegeterian=" + isVegeterian + ", ingredients=" + ingredients
				+ ", instructions=" + instructions + "]";
	}

}
