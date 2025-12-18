package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CategoryEntity;
import com.example.demo.service.CategoryService;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class CategoryController {
    @Autowired
    CategoryService ser;
    
    
    @PostMapping("/addcategory")
    public CategoryEntity addcategory(@RequestBody CategoryEntity std){
        return ser.addcategory(std);
    }
}
