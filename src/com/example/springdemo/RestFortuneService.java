package com.example.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService {
    @Override
    public String getDailyFortune() {
        return null;
    }
}
