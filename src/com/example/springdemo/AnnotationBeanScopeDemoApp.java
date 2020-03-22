package com.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TennisCoach coach = context.getBean("tennisCoach", TennisCoach.class);
        TennisCoach alphaCoach = context.getBean("tennisCoach", TennisCoach.class);
        System.out.println(coach);
        System.out.println(alphaCoach);
        System.out.println(coach == alphaCoach);
        context.close();
    }
}
