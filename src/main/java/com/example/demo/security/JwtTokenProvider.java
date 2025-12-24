package com.example.demo.security;

import com.example.demo.entity.User;
import org.springframework.stereotype.Component;

@Component
public class JwtTokenProvider {

    public String generateToken(String email, User user) {
        // Simplified token generation (tests mock this)
        return "dummy-jwt-token";
    }
}
