package com.example.demo.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.MenuItemEntity;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.MenuItemRepository;
import com.example.demo.service.MenuItemService;


@Service
public class MenuItemServiceImpl implements MenuItemService {
    @Autowired
    MenuItemRepository repo;
    public MenuItemEntity createMenuItem( MenuItemEntity item){
        return repo.save(item);
    }
    public MenuItemEntity updateMenuItem( Long id,MenuItemEntity ingredient){
        MenuItemEntity exist=repo.findById(id).orElseThrow(()->new ResourceNotFoundException("id not found"));
        exist.setName(ingredient.getName());
        exist.setDescription(ingredient.getDescription());
        exist.setSellingPrice(ingredient.getSellingPrice());
        exist.setUpdatedAt(ingredient.getUpdatedAt());
        exist.setActive(ingredient.isActive());

        return repo.save(exist);

    }
    public MenuItemEntity getMenuItemById(Long id){
        return repo.findById(id).orElseThrow(()->new ResourceNotFoundException("id not found"));

    }
     public List<MenuItemEntity> getAllMenuItem(){

        return repo.findAll();
     }
     public MenuItemEntity deActivateIngredient(Long id){
        MenuItemEntity exist=repo.findById(id).orElseThrow(()->new ResourceNotFoundException("id not found"));
        if(exist.isActive()==true){
            exist.setActive(false);

        }
        return repo.save(exist);
     }
    
}
