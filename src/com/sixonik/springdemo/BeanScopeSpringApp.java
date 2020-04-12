package com.sixonik.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeSpringApp {

	public static void main(String[] args) {
		//Constructor Injection main class
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach coach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		boolean isSimilar = (alphaCoach == coach);
		System.out.println(" alphaCoach == alphaCoach : " +isSimilar);
		System.out.println("\nCoach memory address is : "+ coach);
		System.out.println("\nAlphaCoach memory Address is : "+ alphaCoach );
		context.close();
		

	}

}
