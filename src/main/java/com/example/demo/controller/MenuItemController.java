package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.MenuItemEntity;
import com.example.demo.service.MenuItemService;

@RestController
public class MenuItemController {
    @Autowired
    MenuItemService  ser;
   @PostMapping("/createMenuItem")
   public MenuItemEntity createMenuItem(@RequestBody MenuItemEntity item){
    return ser.createMenuItem(item);
   }
   @PutMapping("/updateMenuItem/{id}")
   public MenuItemEntity updateMenuItem(@PathVariable Long id,@RequestBody MenuItemEntity ingredient){
    return ser.updateMenuItem(id,ingredient);
   }
   @GetMapping("/getMenuById/{id}")
   public MenuItemEntity getMenuItemById(@PathVariable Long id){
     return ser.getMenuItemById(id);
   }
   @GetMapping("/getAllIngredient")
   public List<MenuItemEntity> getAllIngredient(){
     return ser.getAllIngredient();
   }
   @PutMapping("/deActivateIngredient/{id}")
   public MenuItemEntity deActivateIngredient(@PathVariable Long id){
    return ser.deActivateIngredient(id);
   }
    
}
