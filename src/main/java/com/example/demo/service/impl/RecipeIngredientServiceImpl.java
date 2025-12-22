package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Ingredient;
import com.example.demo.entity.MenuItem;
import com.example.demo.entity.RecipeIngredient;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.IngredientRepository;
import com.example.demo.repository.MenuItemRepository;
import com.example.demo.repository.RecipeIngredientRepository;
import com.example.demo.service.RecipeIngredientService;

@Service
public class RecipeIngredientServiceImpl implements RecipeIngredientService {

    private final RecipeIngredientRepository recipeIngredientRepository;
    private final MenuItemRepository menuItemRepository;
    private final IngredientRepository ingredientRepository;

    public RecipeIngredientServiceImpl(
            RecipeIngredientRepository recipeIngredientRepository,
            MenuItemRepository menuItemRepository,
            IngredientRepository ingredientRepository) {

        this.recipeIngredientRepository = recipeIngredientRepository;
        this.menuItemRepository = menuItemRepository;
        this.ingredientRepository = ingredientRepository;
    }

 
    @Override
    public RecipeIngredient addIngredientToRecipe(
            Long menuItemId,
            Long ingredientId,
            Double quantity) {

        if (quantity == null || quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than zero");
        }

        MenuItem menuitem = menuItemRepository.findById(menuItemId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Menu item not found"));

        Ingredient ingredient = ingredientRepository.findById(ingredientId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Ingredient not found"));

        RecipeIngredient recipeIngredient = new RecipeIngredient();
        recipeIngredient.setMenuitem(menuitem); 
        recipeIngredient.setIngredient(ingredient);
        recipeIngredient.setQuantityRequired(quantity);

        return recipeIngredientRepository.save(recipeIngredient);
    }

  
    @Override
    public RecipeIngredient updateRecipeIngredient(
            Long id,
            Double quantity) {

        if (quantity == null || quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than zero");
        }

        RecipeIngredient recipeIngredient =
                recipeIngredientRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Recipe ingredient not found"));

        recipeIngredient.setQuantityRequired(quantity);
        return recipeIngredientRepository.save(recipeIngredient);
    }

    
    @Override
    public List<RecipeIngredient> getIngredientsByMenuItem(
            Long menuItemId) {

        List<RecipeIngredient> list =
                recipeIngredientRepository.findByMenuitemId(menuItemId);

        if (list.isEmpty()) {
            throw new ResourceNotFoundException(
                    "No ingredients found for menu item");
        }

        return list;
    }

   
    @Override
    public void removeIngredientFromRecipe(Long id) {

        RecipeIngredient recipeIngredient =
                recipeIngredientRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Recipe ingredient not found"));

        recipeIngredientRepository.delete(recipeIngredient);
    }

   
    @Override
    public Double getTotalQuantityOfIngredient(Long ingredientId) {

        List<RecipeIngredient> list =
                recipeIngredientRepository.findByIngredientId(ingredientId);

        if (list.isEmpty()) {
            throw new ResourceNotFoundException(
                    "Ingredient not used in any recipe");
        }
        double total = 0;
        for (RecipeIngredient ingredient : list) {
         total += ingredient.getQuantityRequired();
        }
        return total;


       
    }
}
