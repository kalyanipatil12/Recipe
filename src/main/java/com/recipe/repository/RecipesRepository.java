package com.recipe.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.recipe.entity.Recipes;

@Repository
public interface RecipesRepository extends JpaRepository<Recipes, Long> {

}
