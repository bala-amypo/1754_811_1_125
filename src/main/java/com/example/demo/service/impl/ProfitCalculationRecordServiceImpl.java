package com.example.demo.service.impl;

import java.math.BigDecimal;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.MenuItem;
import com.example.demo.entity.ProfitCalculationRecord;
import com.example.demo.entity.RecipeIngredient;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.MenuItemRepository;
import com.example.demo.repository.ProfitCalculationRecordRepository;
import com.example.demo.repository.RecipeIngredientRepository;
import com.example.demo.service.ProfitCalculationRecordService;

@Service
public class ProfitCalculationRecordServiceImpl implements ProfitCalculationRecordService {
    @Autowired
    ProfitCalculationRecordRepository repo;
    @Autowired
   MenuItemRepository  MenuItemRepository;
   @Autowired
   RecipeIngredientRepository  RecipeIngredientRepository;
  
     public ProfitCalculationRecord calculateProfit( Long id){
     
        MenuItem menuitem=MenuItemRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("cant find in it"));

        List<RecipeIngredient> ingredients=RecipeIngredientRepository.findByMenuitemId(id);
        if(ingredients.isEmpty()){
         throw new ResourceNotFoundException("no ingredient found for the dish");
        }

        BigDecimal totalcost=BigDecimal.ZERO;

        for(RecipeIngredient ri:ingredients){
           BigDecimal costperunit=ri.getIngredient().getCostPerUnit();
           BigDecimal quantity=BigDecimal.valueOf(ri.getQuantityRequired());

           totalcost=totalcost.add(costperunit.multiply(quantity));

        }

        BigDecimal sp=menuitem.getSellingPrice();

        BigDecimal margin=sp.subtract(totalcost);

        ProfitCalculationRecord newval= new ProfitCalculationRecord();
        newval.setMenuItem(menuitem);
        newval.setTotalCost(totalcost);
        newval.setTotalMargin(margin);
       

        return repo.save(newval);
     }

    public ProfitCalculationRecord getCalculationById(Long id){

       ProfitCalculationRecord  result=repo.findById(id).orElseThrow(()->new ResourceNotFoundException("id not found"));
       return result;

    }
    public List<ProfitCalculationRecord> getCalculationForMenuItem(Long id){

      List<ProfitCalculationRecord> record=repo.findByMenuitemId(id);
      if(record.isEmpty()){
         throw new ResourceNotFoundException("no history found");

      }
      return record;
    }
    public List<ProfitCalculationRecord> getAllCalculation(){
       List<ProfitCalculationRecord> record=repo.findAll();
       return record;

    }
 
}
