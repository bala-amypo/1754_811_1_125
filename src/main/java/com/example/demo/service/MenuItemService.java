package com.example.demo.service;
import java.util.*;




import com.example.demo.entity.MenuItem;

public interface MenuItemService {
    public MenuItem createMenuItem( MenuItem item);
    public MenuItem updateMenuItem( Long id,MenuItem ingredient);
    public MenuItem getMenuItemById(Long id);
    public List<MenuItem> getAllMenuItem();
    public MenuItem deActivateIngredient(Long id);
    
}
