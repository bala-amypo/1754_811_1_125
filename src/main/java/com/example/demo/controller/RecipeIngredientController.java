package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.RecipeIngredientEntity;
import com.example.demo.service.RecipeIngredientService;

@RestController
public class RecipeIngredientController {

    @Autowired
    RecipeIngredientService ser;
    @PostMapping("/addrecipe")
    public RecipeIngredientEntity addrecipe (@RequestBody RecipeIngredientEntity std){
        return ser.addrecipe(std);
    }
    
}
