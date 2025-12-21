package com.example.demo.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    private String name;

    private String unit;

    private BigDecimal costPerUnit;

    private boolean active=true;

   
    private LocalDateTime createdAt;

    
    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate(){
        this.createdAt=LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate(){
        this.updatedAt=LocalDateTime.now();
    }


    public Ingredient() {
    }


    public Ingredient( String name, String unit, BigDecimal costPerUnit, boolean active) {
        
        this.name = name;
        this.unit = unit;
        this.costPerUnit = costPerUnit;
        this.active = active;
        
    }


    public Long getId() {
        return id;
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


    public BigDecimal getCostPerUnit() {
        return costPerUnit;
    }


    public void setCostPerUnit(BigDecimal costPerUnit) {
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


   


    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }


   

}
