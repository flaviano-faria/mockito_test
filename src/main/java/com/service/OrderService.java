package com.service;

public class OrderService {
	
	public String createOrder() throws Exception {
		
		FraudService fraudService = new FraudService();
		if(fraudService.isFraudEligible()) {
			throw new Exception("Fraud analysis");
		}
		return "0";
	}

}
