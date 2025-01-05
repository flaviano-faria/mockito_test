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
	
	public void sendOrder() {
		int x = 0;
		int y=5;
		int sum = x+y;
		System.out.println("Order sent");
	}
	
	
	public void sendStaticOrder() throws InterruptedException {
		
		int x = 0;
		int y=5;
		int sum = x+y;
		System.out.println("Order analyse is starting");
		FraudService.analyse();
		System.out.println("Order analyse is finishing");
	}
	
	
	

}
