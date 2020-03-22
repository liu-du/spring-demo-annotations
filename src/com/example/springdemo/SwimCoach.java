package com.example.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
    @Value("${foo.email}")
    private String email;
    @Value("${foo.team}")
    private String team;
    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return team + ": Swim 1000 meters as a warm up. send email to: " + email + " after you finish.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }
}
