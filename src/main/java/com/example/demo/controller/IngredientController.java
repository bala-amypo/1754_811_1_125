package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Ingredient;
import com.example.demo.service.IngredientService;


@RestController
public class IngredientController {
    @Autowired
    IngredientService ser;
    @PostMapping("/createIngredient")
    public Ingredient createIngredient (@RequestBody Ingredient std){
        return ser.createIngredient(std);
    }

    @PutMapping("/updateIngredient/{id}")
    public Ingredient updateIngredient(@PathVariable Long  id,@RequestBody Ingredient std){
        return ser.updateIngredient(id,std);

    }
    @GetMapping("/getIngredientById/{id}")
    public Ingredient getIngredientById(@PathVariable Long id){
        return ser.getIngredientById(id);
    }
    @GetMapping("/getAllIngredient")
    public List<Ingredient> getAllIngredient(){
        return ser.getAllIngredient();
    }
    @PutMapping("/deActivateIngredient")
    public Ingredient deActivateIngredient(@PathVariable Long id){
        return ser.deActivateIngredient(id);
    }

    
}
