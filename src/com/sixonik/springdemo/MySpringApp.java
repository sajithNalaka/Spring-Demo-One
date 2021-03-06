package com.sixonik.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {
		//Constructor Injection main class
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("myCoach", Coach.class);
		System.out.println(coach.getFullWorkout());
		System.out.println(coach.getDailyFortune());
		context.close();
		

	}

}
