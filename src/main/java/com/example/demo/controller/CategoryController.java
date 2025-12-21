package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Category;
import com.example.demo.service.CategoryService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class CategoryController {
    @Autowired
    CategoryService ser;
    
    
    @PostMapping("/createCategory")
    public Category createCategory(@RequestBody Category category){
        return ser.createCategory(category);

    }
    @PutMapping("/updateCategory/{id}")
    public Category updateCategory(@PathVariable Long id,@RequestBody Category category){
        return ser.updateCategory(id,category);
    }
    @GetMapping("/getCategoryById/{id}")
    public Category getCategoryById(@PathVariable Long id){
        return  ser.getCategoryById(id);

    }
    @GetMapping("/getAllCategories")
    public List<Category> getAllCategories(){
        return ser.getAllCategories();
    }
    @PutMapping("/deActiveCategory/{id}")
    public Category deActiveCategory(@PathVariable Long id){
        return  ser.deActiveCategory(id);

    }
    

    
}
