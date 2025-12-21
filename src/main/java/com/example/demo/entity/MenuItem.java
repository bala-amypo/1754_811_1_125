package com.example.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;


@Entity

public class MenuItemEntity {
    @Id
    private Long id;
    private String name;
    private String description;
    private float sellingPrice;
    private boolean active;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    public MenuItemEntity() {
    }
    public MenuItemEntity(Long id, String name, String description, float sellingPrice, boolean active,
            LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.sellingPrice = sellingPrice;
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
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public float getSellingPrice() {
        return sellingPrice;
    }
    public void setSellingPrice(float sellingPrice) {
        this.sellingPrice = sellingPrice;
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
