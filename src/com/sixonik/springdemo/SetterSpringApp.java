package com.sixonik.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterSpringApp {

	public static void main(String[] args) {
		 
		//Get the configuration context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Create the bean
		Coach theCoach = context.getBean("myCricketCoach", Coach.class);
		
		// call the methods of the bean
		System.out.println(theCoach.getFullWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
