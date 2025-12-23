package com.example.demo.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalHandleException {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> handleError(ResourceNotFoundException ex){
        return ResponseEntity.status(404).body(ex.getMessage());
       
    }

    
}
