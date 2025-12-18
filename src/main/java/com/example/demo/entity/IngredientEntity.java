package com.example.Demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
public class IngredientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    private String name;

    private String unit;

    private String costPerUnit;

    private boolean active;

   
    private LocalDateTime createdAt;

    
    private LocalDateTime updatedAt;


    public IngredientEntity() {
    }


    public IngredientEntity(Long id, String name, String unit, String costPerUnit, boolean active,
            LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.costPerUnit = costPerUnit;
        this.active = active;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getUnit() {
        return unit;
    }


    public void setUnit(String unit) {
        this.unit = unit;
    }


    public String getCostPerUnit() {
        return costPerUnit;
    }


    public void setCostPerUnit(String costPerUnit) {
        this.costPerUnit = costPerUnit;
    }


    public boolean isActive() {
        return active;
    }


    public void setActive(boolean active) {
        this.active = active;
    }


    public LocalDateTime getCreatedAt() {
        return createdAt;
    }


    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }


    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }


    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

}
