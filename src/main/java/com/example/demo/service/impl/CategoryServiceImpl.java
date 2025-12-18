package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.CategoryEntity;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository repo;
    public CategoryEntity addcategory (CategoryEntity std){
        return repo.save(std);
    }
    
}
