package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ProfitCalculationRecordEntity;
import com.example.demo.repository.ProfitCalculationRecordRepository;
import com.example.demo.service.ProfitCalculationRecordService;

@Service
public class ProfitCalculationRecordServiceImpl implements ProfitCalculationRecordService {
    @Autowired
    ProfitCalculationRecordRepository repo;

     public ProfitCalculationRecordEntity addprofit(ProfitCalculationRecordEntity std){
        return repo.save(std);
     }
    
}

