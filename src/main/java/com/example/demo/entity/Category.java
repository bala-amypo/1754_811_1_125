package com.example.demo.entity;

import jakarta.persistence.*;

@Entity

public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private boolean active=true;
    public Category() {
    }
    public Category( String name, String description, boolean active) {
        
        this.name = name;
        this.description = description;
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
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }

    

}
