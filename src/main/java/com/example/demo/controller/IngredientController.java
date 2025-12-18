package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.IngredientEntity;
import com.example.demo.service.IngredientService;


@RestController
public class IngredientController {
    @Autowired
    IngredientService ser;
    @PostMapping("/addingredient")
    public IngredientEntity addingredient (@RequestBody IngredientEntity std){
        return ser.addingredient(std);
    }

    
}
