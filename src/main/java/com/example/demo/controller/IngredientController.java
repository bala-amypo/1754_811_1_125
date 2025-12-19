package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.IngredientEntity;
import com.example.demo.service.IngredientService;


@RestController
public class IngredientController {
    @Autowired
    IngredientService ser;
    @PostMapping("/createIngredient")
    public IngredientEntity createIngredient (@RequestBody IngredientEntity std){
        return ser.createIngredient(std);
    }

    @PutMapping("/updateIngredient/{id}")
    public IngredientEntity updateIngredient(@PathVariable Long  id,@RequestBody IngredientEntity std){
        return ser.updateIngredient(id,std);

    }
    @GetMapping("/getIngredientById/{id}")
    public IngredientEntity getIngredientById(@PathVariable Long id){
        return ser.getIngredientById(id);
    }
    @GetMapping("/getAllIngredient")
    public List<IngredientEntity> getAllIngredient(){
        return ser.getAllIngredient();
    }
    @PutMapping("/deActivateIngredient")
    public IngredientEntity deActivateEntity(@PathVariable Long id){
        return ser.deActivateEntity(id);
    }

    
}
