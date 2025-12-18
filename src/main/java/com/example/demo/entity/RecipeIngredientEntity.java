package com.example.Demo.entity;

import jakarta.persistence.*;

@Entity
public class RecipeIngredientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private MenuItemEntity menuitem;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private IngredientEntity ingredient;
    private Double quantityRequired;
    public RecipeIngredientEntity(Long id, MenuItemEntity menuitem, IngredientEntity ingredient,
            Double quantityRequired) {
        this.id = id;
        this.menuitem = menuitem;
        this.ingredient = ingredient;
        this.quantityRequired = quantityRequired;
    }
    public RecipeIngredientEntity() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public MenuItemEntity getMenuitem() {
        return menuitem;
    }
    public void setMenuitem(MenuItemEntity menuitem) {
        this.menuitem = menuitem;
    }
    public IngredientEntity getIngredient() {
        return ingredient;
    }
    public void setIngredient(IngredientEntity ingredient) {
        this.ingredient = ingredient;
    }
    public Double getQuantityRequired() {
        return quantityRequired;
    }
    public void setQuantityRequired(Double quantityRequired) {
        this.quantityRequired = quantityRequired;
    }


    



    
}
