package com.example.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("constructor");
    }

    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("setter");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }

    @Autowired
    public void doSomeCrazyStuff(FortuneService fortuneService) {
        System.out.println(fortuneService.getDailyFortune() + "crazy!!!");
    }

}
