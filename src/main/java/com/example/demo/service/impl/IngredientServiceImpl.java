package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.IngredientEntity;
import com.example.demo.repository.IngredientRepository;
import com.example.demo.service.IngredientService;

public class IngredientServiceImpl implements IngredientService {
    @Autowired
    IngredientRepository repo;
    public IngredientEntity addingredient(IngredientEntity std){
        return repo.save(std);
    }
    
    
}
