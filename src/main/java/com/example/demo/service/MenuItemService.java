package com.example.demo.service;
import java.util.*;




import com.example.demo.entity.MenuItemEntity;

public interface MenuItemService {
    public MenuItemEntity createMenuItem( MenuItemEntity item);
    public MenuItemEntity updateMenuItem( Long id,MenuItemEntity ingredient);
    public MenuItemEntity getIngredientById(Long id);
    public List<MenuItemEntity> getAllIngredient();
    public MenuItemEntity deActivateIngredient(Long id);
    
}
