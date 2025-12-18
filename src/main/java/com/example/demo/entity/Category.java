

package com.example.demo.entity;
import java.util.*;
import jakarta.persistence.*;

@Entity
public class CategoryEntity{
    private Long id;
    private String name;
    private String unit;
    private String costPerUnit;
    private boolean active;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    public void setName(String name){
        this.name=name;
    }
    public String getName(String name){
        return this.name;
    }


    public void setUnit(String unit){
        this.unit=unit;
    }
    public String getUnit(String unit){
        return  this.unit;
    }

    public void setCostPerUnit(String costPerUnit){
        this.costPerUnit=costPerUnit;
    }
    public String GetCostPerUnit(String costPerUnit){
         return this.costPerUnit;
     }


    public void setActive(boolean active){
        this.active=active;
    }
    public void setCreatedAt( LocalDateTime createdAt){
        this.createdAt=createdAt;
    }
    
    public void setUpdatedAt( LocalDateTime updatedAt){
        this.updatedAt=updatedAt;
    }
    



}