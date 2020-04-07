package com.sixonik.springdemo;

public class BaseballCoach implements Coach {
	
	@Override
	public String getFullWorkout( ) {
		return "5 hours batting practice";
	}

}
