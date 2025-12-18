package com.example.demo.entity;


import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
public class ProfitCalculationRecordEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY,optional=false)
    private MenuItemEntity menuItem;
    private float totalCost;
    private float totalMargin;
    private LocalDateTime calculatedAt;
    public ProfitCalculationRecordEntity() {
    }
    public ProfitCalculationRecordEntity(Long id, MenuItemEntity menuItem, float totalCost, float totalMargin,
            LocalDateTime calculatedAt) {
        this.id = id;
        this.menuItem = menuItem;
        this.totalCost = totalCost;
        this.totalMargin = totalMargin;
        this.calculatedAt = calculatedAt;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public MenuItemEntity getMenuItem() {
        return menuItem;
    }
    public void setMenuItem(MenuItemEntity menuItem) {
        this.menuItem = menuItem;
    }
    public float getTotalCost() {
        return totalCost;
    }
    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }
    public float getTotalMargin() {
        return totalMargin;
    }
    public void setTotalMargin(float totalMargin) {
        this.totalMargin = totalMargin;
    }
    public LocalDateTime getCalculatedAt() {
        return calculatedAt;
    }
    public void setCalculatedAt(LocalDateTime calculatedAt) {
        this.calculatedAt = calculatedAt;
    }



}
