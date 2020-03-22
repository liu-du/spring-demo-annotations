package com.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
        // read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from container
        TennisCoach coach = context.getBean("tennisCoach", TennisCoach.class);

        // call methods
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        // close context
        context.close();
    }
}
