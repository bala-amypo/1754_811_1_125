package com.example.demo.service.impl;
import com.example.demo.exception.ResourceNotFoundException;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Ingredient;
import com.example.demo.repository.IngredientRepository;
import com.example.demo.service.IngredientService;


@Service
public class IngredientServiceImpl implements IngredientService {
    @Autowired
    IngredientRepository repo;
    public Ingredient createIngredient(Ingredient ingredient){
        return repo.save(ingredient);
    }
    public Ingredient updateIngredient( Long id,Ingredient ingredient){
        Ingredient  newval=repo.findById(id).orElseThrow(()->new ResourceNotFoundException("no id is found"));
        newval.setName(ingredient.getName());
        newval.setActive(ingredient.isActive());
        newval.setCostPerUnit(ingredient.getCostPerUnit());
        newval.setUnit(ingredient.getUnit());
        
        return repo.save(newval);
       

    }
     public Ingredient getIngredientById( Long id){
        return repo.findById(id).orElseThrow(()->new ResourceNotFoundException("the id is not found "));
     }
     public List<Ingredient> getAllIngredient(){
        return repo.findAll();
     }

     public Ingredient deActivateIngredient(Long id){
        Ingredient change=repo.findById(id).orElseThrow(()->new ResourceNotFoundException("the id is not found "));
        if(change.isActive()){
            change.setActive(false);

        }
        return repo.save(change);
     }
    
    
}
