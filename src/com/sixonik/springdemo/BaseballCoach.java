package com.sixonik.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getFullWorkout( ) {
		return "5 hours batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getTodayFortune();
	}

}
