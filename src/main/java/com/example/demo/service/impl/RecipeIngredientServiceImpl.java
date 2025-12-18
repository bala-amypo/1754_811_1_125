package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.RecipeIngredientEntity;
import com.example.demo.repository.RecipeIngredientRepository;
import com.example.demo.service.RecipeIngredientService;

public class RecipeIngredientServiceImpl implements RecipeIngredientService {
    @Autowired
    RecipeIngredientRepository repo;
     public RecipeIngredientEntity addrecipe ( RecipeIngredientEntity std){
        return repo.save(std);
     }
    
}
