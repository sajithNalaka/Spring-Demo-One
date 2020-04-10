package com.sixonik.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// Injecting literal values from setter injection
	private String emailAddress;
	private String team;
	
	// no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach - Inside no-arg constructor");
	}

	// Setter method to setter injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach - Inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
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

