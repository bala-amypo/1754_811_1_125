package com.example.demo.controller;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ProfitCalculationRecord;
import com.example.demo.service.ProfitCalculationRecordService;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class ProfitCalculationRecordController {

    @Autowired
    ProfitCalculationRecordService ser;

    @PostMapping("/calculateProfit/{id}")
    public ProfitCalculationRecord calculateProfit(@PathVariable Long id){
        return ser.calculateProfit(id);
    }
    @GetMapping("getCalculationById/{id}")
    public ProfitCalculationRecord getCalculationById(@PathVariable Long id){
        return ser.getCalculationById(id);

    }

    @GetMapping("getCalculationForMenuItem/{id}")
    public List<ProfitCalculationRecord> getCalculationForMenuItem(@PathVariable Long id){
        return ser.getCalculationForMenuItem(id);
    }

    @GetMapping("getAllCalculation")
    public List<ProfitCalculationRecord> getAllCalculation (){
        return ser.getAllCalculation();
    }
    
    
}
