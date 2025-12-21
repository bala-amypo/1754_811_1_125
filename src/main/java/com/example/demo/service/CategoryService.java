package com.example.demo.service;




import java.util.List;



import com.example.demo.entity.Category;

public interface CategoryService {
     public Category createCategory( Category category);
     public Category updateCategory( Long id, Category category);
     public Category getCategoryById( Long id);
     public List<Category> getAllCategories();
     public Category deActiveCategory(Long id);
    
}
