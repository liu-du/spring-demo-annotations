package com.example.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {
        // read spring config file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportJavaConfig.class);

        // get the bean from container
        SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);

        // call methods
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        // close context
        context.close();
    }
}
