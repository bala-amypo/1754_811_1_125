package com.example.demo.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ProfitCalculationRecord;


@Repository
public interface ProfitCalculationRecordRepository extends JpaRepository<ProfitCalculationRecord,Long> {

    List<ProfitCalculationRecord> findByReferenceId(Long id);
    
    
   


    
}
