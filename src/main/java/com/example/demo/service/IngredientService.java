package com.example.demo.service;

import java.util.List;



import com.example.demo.entity.IngredientEntity;

public interface IngredientService {
    public IngredientEntity createIngredient(IngredientEntity std);
    public IngredientEntity updateIngredient( Long id, IngredientEntity std);
    public IngredientEntity getIngredientById( Long id);
    public List<IngredientEntity> getAllIngredient( );
    public IngredientEntity deActivateEntity(Long id);
    
}
