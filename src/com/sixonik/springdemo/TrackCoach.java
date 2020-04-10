package com.sixonik.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;

	public TrackCoach() {
	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getFullWorkout() {
		
		return "Run hard 5Km";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it : "+ fortuneService.getTodayFortune();
	}

}
