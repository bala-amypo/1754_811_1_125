package com.example.demo.service;

import java.util.List;



import com.example.demo.entity.Ingredient;

public interface IngredientService {
    public Ingredient createIngredient(Ingredient std);
    public Ingredient updateIngredient( Long id, Ingredient std);
    public Ingredient getIngredientById( Long id);
    public List<Ingredient> getAllIngredient( );
    public Ingredient deActivateIngredient(Long id);
    
}
