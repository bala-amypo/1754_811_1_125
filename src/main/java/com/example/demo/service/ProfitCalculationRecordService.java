package com.example.demo.service;





import java.util.List;

import com.example.demo.entity.ProfitCalculationRecord;

public interface ProfitCalculationRecordService {
    public ProfitCalculationRecord calculateProfit( Long id);
   
    public ProfitCalculationRecord getCalculationById(Long id);

    public List<ProfitCalculationRecord> getCalculationForMenuItem(Long id);

    public List<ProfitCalculationRecord> getAllCalculation();
    
}
