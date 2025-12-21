package com.example.demo.entity;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
public class ProfitCalculationRecord {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY,optional=false)
    @JoinColumn(name = "menu_item_id", nullable = false)
    private MenuItem menuItem;
    private BigDecimal totalCost;
    private BigDecimal totalMargin;
    private LocalDateTime calculatedAt;
    @PrePersist
    protected void onUpdate(){
        this.calculatedAt=LocalDateTime.now();
    }
    public ProfitCalculationRecord() {
    }
    public ProfitCalculationRecord(Long id, MenuItem menuItem, BigDecimal totalCost, BigDecimal totalMargin
           ) {
        this.id = id;
        this.menuItem = menuItem;
        this.totalCost = totalCost;
        this.totalMargin = totalMargin;
        
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public MenuItem getMenuItem() {
        return menuItem;
    }
    public void setMenuItem(MenuItem menuItem) {
        this.menuItem = menuItem;
    }
    public BigDecimal getTotalCost() {
        return totalCost;
    }
    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }
    public BigDecimal getTotalMargin() {
        return totalMargin;
    }
    public void setTotalMargin(BigDecimal totalMargin) {
        this.totalMargin = totalMargin;
    }
    public LocalDateTime getCalculatedAt() {
        return calculatedAt;
    }
    



}
