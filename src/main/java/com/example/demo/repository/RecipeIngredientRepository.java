package com.example.demo.repository;
import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.RecipeIngredient;


@Repository
public interface RecipeIngredientRepository extends JpaRepository<RecipeIngredient,Long> {
    List<RecipeIngredient> findByMenuitemId(Long id);
     List<RecipeIngredient> findByIngredientId(Long ingredientId);

    
} 
