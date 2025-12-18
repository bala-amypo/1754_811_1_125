package com.example.demo.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.MenuItemEntity;
import com.example.demo.repository.MenuItemRepository;
import com.example.demo.service.MenuItemService;


@Service
public class MenuItemServiceImpl implements MenuItemService {
    @Autowired
    MenuItemRepository repo;
    public MenuItemEntity addmenuitem( MenuItemEntity std){
        return repo.save(std);
    }
    
}
