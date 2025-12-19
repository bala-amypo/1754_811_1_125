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
    public CategoryEntity createCategory(@RequestBody CategoryEntity category){
        return ser.createCategory(category);

    }
    @PutMapping("/updateCategory/{id}")
    public CategoryEntity updateCategory(@PathVariable Long id,@RequestBody CategoryEntity category){
        return ser.updateCategory(id,category);
    }
    @GetMapping("/getCategoryById/{id}")
    public CategoryEntity getCategoryById(@PathVariable Long id){
        return  ser.getCategoryById(id);

    }
    @GetMapping("/getAllCategories")
    public List<CategoryEntity> getAllCategories(){
        return ser.getAllCategories();
    }
    @PutMapping("/deActiveCategory/{id}")
    public CategoryEntity deActiveCategory(@PathVariable Long id){
        return  ser.deActiveCategory(id);

    }
    

    
}
