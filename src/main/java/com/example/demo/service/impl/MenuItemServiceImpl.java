package com.example.demo.service.impl;


import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.MenuItem;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.MenuItemRepository;
import com.example.demo.service.MenuItemService;


@Service
public class MenuItemServiceImpl implements MenuItemService {
    @Autowired
    MenuItemRepository repo;
    public MenuItem createMenuItem( MenuItem item){
        return repo.save(item);
    }
    public MenuItem updateMenuItem( Long id,MenuItem ingredient){
        MenuItem exist=repo.findById(id).orElseThrow(()->new ResourceNotFoundException("id not found"));
        exist.setName(ingredient.getName());
        exist.setDescription(ingredient.getDescription());
        exist.setSellingPrice(ingredient.getSellingPrice());
        
        exist.setActive(ingredient.isActive());

        return repo.save(exist);

    }
    public MenuItem getMenuItemById(Long id){
        return repo.findById(id).orElseThrow(()->new ResourceNotFoundException("id not found"));

    }
     public List<MenuItem> getAllMenuItem(){

        return repo.findAll();
     }
     public MenuItem deActivateIngredient(Long id){
        MenuItem exist=repo.findById(id).orElseThrow(()->new ResourceNotFoundException("id not found"));
        if(exist.isActive()==true){
            exist.setActive(false);

        }
        return repo.save(exist);
     }
    
}
