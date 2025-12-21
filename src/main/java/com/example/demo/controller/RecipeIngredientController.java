package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class RecipeIngredient {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private MenuItem menuitem;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Ingredient ingredient;
    private Double quantityRequired;
    public RecipeIngredient(Long id, MenuItem menuitem, Ingredient ingredient,
            Double quantityRequired) {
        this.id = id;
        this.menuitem = menuitem;
        this.ingredient = ingredient;
        this.quantityRequired = quantityRequired;
    }
    public RecipeIngredient() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public MenuItem getMenuitem() {
        return menuitem;
    }
    public void setMenuitem(MenuItem menuitem) {
        this.menuitem = menuitem;
    }
    public Ingredient getIngredient() {
        return ingredient;
    }
    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
    public Double getQuantityRequired() {
        return quantityRequired;
    }
    public void setQuantityRequired(Double quantityRequired) {
        this.quantityRequired = quantityRequired;
    }


    



    
}
