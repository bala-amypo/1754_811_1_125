package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Category;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository repo;
    public Category createCategory( Category category){
        return repo.save(category);
    }
    public Category updateCategory( Long id, Category category){
        Category newval=repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Category not found with id: " + id
));
        newval.setName(category.getName());
        newval.setDescription(category.getDescription());
        newval.setActive(category.isActive());
        return repo.save(newval);

    }
    public Category getCategoryById( Long id){
        return repo.findById(id).orElseThrow(()-> new ResourceNotFoundException( "Category not found with id: " + id));
    
    }
    public List<Category> getAllCategories(){
        return repo.findAll();
    }
     public Category deActiveCategory(Long id){
        Category category=repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Category not found with id: "+id));
        if(category.isActive()){
            category.setActive(false);
        }
        return repo.save(category);

     }

    
}
