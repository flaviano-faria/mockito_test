package com.service;

public class FraudService {
	
	public boolean isFraudEligible(double amount) {
		
		if(amount>1000) {
			return true;
		}
		return false;
	}
	
	public static void analyse() throws InterruptedException {
		Thread.sleep(200000);
	}

}
