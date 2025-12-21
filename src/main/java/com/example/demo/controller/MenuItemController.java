package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.MenuItem;
import com.example.demo.service.MenuItemService;

@RestController
public class MenuItemController {
    @Autowired
    MenuItemService  ser;
   @PostMapping("/createMenuItem")
   public MenuItem createMenuItem(@RequestBody MenuItem item){
    return ser.createMenuItem(item);
   }
   @PutMapping("/updateMenuItem/{id}")
   public MenuItem updateMenuItem(@PathVariable Long id,@RequestBody MenuItem ingredient){
    return ser.updateMenuItem(id,ingredient);
   }
   @GetMapping("/getMenuItemById/{id}")
   public MenuItem getMenuItemById(@PathVariable Long id){
     return ser.getMenuItemById(id);
   }
   @GetMapping("/getAllMenuItem")
   public List<MenuItem> getAllMenuItem(){
     return ser.getAllMenuItem();
   }
   @PutMapping("/deActivateIngredient/{id}")
   public MenuItem deActivateIngredient(@PathVariable Long id){
    return ser.deActivateIngredient(id);
   }
    
}
