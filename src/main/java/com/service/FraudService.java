package com.service;

public class FraudService {
	
	public boolean isFraudEligible(double amount) {
		
		if(amount>1000) {
			return true;
		}
		return false;
	}

}
