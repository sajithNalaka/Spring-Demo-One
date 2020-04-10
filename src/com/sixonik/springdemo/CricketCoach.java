package com.sixonik.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach - Inside no-arg constructor");
	}

	// Setter method to setter injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach - Inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getFullWorkout() {
		
		return "Practice fast bawling 15 mins per day";
	}
	
	@Override
	public String getDailyFortune() {
		
		return fortuneService.getTodayFortune();
	}	
	
}

