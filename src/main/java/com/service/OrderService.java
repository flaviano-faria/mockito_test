package com.service;

public class OrderService {
	
	public String createOrder() throws Exception {
		
		FraudService fraudService = getFraudService();
		if(fraudService.isFraudEligible()) {
			throw new Exception("Fraud analysis");
		}
		return "0";
	}

	protected FraudService getFraudService() {
		return new FraudService();
	}

}
