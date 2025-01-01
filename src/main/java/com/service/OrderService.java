package com.service;

public class OrderService {
	
	public String createOrder(double amount) throws Exception {
		
		FraudService fraudService = getFraudService();
		if(fraudService.isFraudEligible(amount)) {
			throw new Exception("Fraud analysis");
		}
		return "Order created";
	}

	protected FraudService getFraudService() {
		return new FraudService();
	}

}
