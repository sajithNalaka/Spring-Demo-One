package com.sixonik.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getTodayFortune() {
		
		return "Today is your lucky day.. ";
	}

}
