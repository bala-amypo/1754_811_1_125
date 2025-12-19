package com.example.demo.service.impl;
import com.example.demo.exception.ResourceNotFoundException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.IngredientEntity;
import com.example.demo.repository.IngredientRepository;
import com.example.demo.service.IngredientService;


@Service
public class IngredientServiceImpl implements IngredientService {
    @Autowired
    IngredientRepository repo;
    public IngredientEntity createIngredient(IngredientEntity ingredient){
        return repo.save(ingredient);
    }
    public IngredientEntity updateIngredient( Long id,IngredientEntity ingredient){
        IngredientEntity  newval=repo.findById(id).orElseThrow(()->new ResourceNotFoundException("no id is found"));
        newval.setName(ingredient.getName());
        newval.setActive(ingredient.isActive());
        newval.setCostPerUnit(ingredient.getCostPerUnit());
        newval.setUnit(ingredient.getUnit());
        newval.setUpdatedAt(ingredient.getUpdatedAt());
        return repo.save(newval);
       

    }
     public IngredientEntity getIngredientById( Long id){
        return repo.findById(id).orElseThrow(()->new ResourceNotFoundException("the id is not found "));
     }
     public List<IngredientEntity> getAllIngredient(){
        return repo.findAll();
     }

     public IngredientEntity deActivateEntity(Long id){
        IngredientEntity change=repo.findById(id).orElseThrow(()->new ResourceNotFoundException("the id is not found "));
        if(change.isActive()){
            change.setActive(false);

        }
        return repo.save(change);
     }
    
    
}
