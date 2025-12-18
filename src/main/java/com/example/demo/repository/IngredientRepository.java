package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.IngredientEntity;


@Repository
public interface IngredientRepository extends JpaRepository<IngredientEntity,Long> {
    
}
