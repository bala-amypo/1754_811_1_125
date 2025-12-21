package com.example.demo.controller;


import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.RecipeIngredient;
import com.example.demo.service.RecipeIngredientService;

@RestController
public class RecipeIngredientController {

    @Autowired
    RecipeIngredientService ser;
    @PostMapping("/addIngredientToRecipe")
    public RecipeIngredient addIngredientToRecipe (@PathVariable Long menuitemid,@PathVariable Long ingredientid ,@RequestParam  Double Quantity){
        return ser.addIngredientToRecipe(menuitemid,ingredientid,Quantity);
    }
     @PutMapping("/{id}")
    public RecipeIngredient updateRecipeIngredient(
            @PathVariable Long id,
            @RequestParam Double quantity) {

        return ser.updateRecipeIngredient(id, quantity);
    }
    @GetMapping("/menuItem/{menuItemId}")
    public List<RecipeIngredient> getIngredientsByMenuItem(
            @PathVariable Long menuItemId) {

        return ser.getIngredientsByMenuItem(menuItemId);
    }
     @DeleteMapping("/{id}")
    public void removeIngredientFromRecipe(@PathVariable Long id) {
        ser.removeIngredientFromRecipe(id);
    }
     @GetMapping("/ingredient/{ingredientId}/total-quantity")
    public Double getTotalQuantityOfIngredient(
            @PathVariable Long ingredientId) {

        return ser.getTotalQuantityOfIngredient(ingredientId);
    }


    
}
