package com.service;

public class FraudService {
	
	public boolean isFraudEligible(double amount) {
		
		if(amount>1000) {
			return true;
		}
		return false;
	}
	
	public static boolean analyse(int value){
			return value %2 == 0;
	}

}
