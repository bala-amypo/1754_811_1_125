package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.CategoryEntity;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository repo;
    public CategoryEntity createCategory( CategoryEntity category){
        return repo.save(category);
    }
    public CategoryEntity updateCategory( Long id, CategoryEntity category){
        CategoryEntity newval=repo.findById(id).orElseThrow(()->new ResourceNotFoundException("no new id is found"));
        newval.setName(category.getName());
        newval.setDescription(category.getDescription());
        newval.setActive(category.isActive());
        return repo.save(newval);

    }
    public CategoryEntity getCategoryById( Long id){
        return repo.findById(id).orElseThrow(()-> new ResourceNotFoundException( "no new id is found"));
    
    }
    public List<CategoryEntity> getAllCategories(){
        return repo.findAll();
    }
     public CategoryEntity deActiveCategory(Long id){
        CategoryEntity category=repo.findById(id).orElseThrow(()->new ResourceNotFoundException("no id is found"));
        if(category.isActive()==true){
            category.setActive(false);
        }
        return repo.save(category);

     }

    
}
