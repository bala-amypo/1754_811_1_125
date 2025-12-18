package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.CategoryEntity;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.service.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository repo;
    public CategoryEntity addcategory (CategoryEntity std){
        return repo.save(std);
    }
    
}
