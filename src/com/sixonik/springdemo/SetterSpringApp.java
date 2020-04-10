package com.sixonik.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterSpringApp {

	public static void main(String[] args) {
		 
		//Get the configuration context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Create the bean
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// call the methods of the bean
		System.out.println(theCoach.getFullWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//Get values - setter injection literal values
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		// close the context
		context.close();
	}

}
