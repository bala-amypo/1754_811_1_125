package com.example.demo.service;




import java.util.List;



import com.example.demo.entity.CategoryEntity;

public interface CategoryService {
     public CategoryEntity createCategory( CategoryEntity category);
     public CategoryEntity updateCategory( Long id, CategoryEntity category);
     public CategoryEntity getCategoryById( Long id);
     public List<CategoryEntity> getAllCategories();
     public CategoryEntity deActiveCategory(Long id);
    
}
