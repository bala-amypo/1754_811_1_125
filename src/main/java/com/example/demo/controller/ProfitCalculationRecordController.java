package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ProfitCalculationRecordEntity;
import com.example.demo.service.ProfitCalculationRecordService;

@RestController
public class ProfitCalculationRecordController {

    @Autowired
    ProfitCalculationRecordService ser;
    @PostMapping("/add")
    public ProfitCalculationRecordEntity addprofit(@RequestBody ProfitCalculationRecordEntity std){
        return ser.addprofit(std);
    }
    
}
