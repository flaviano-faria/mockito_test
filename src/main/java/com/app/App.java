package com.app;

import com.service.OrderService;

public class App {
	
	public static void main(String[] args) throws Exception {
		OrderService orderService = getOrderService();
		String orderResult = orderService.createOrder(999);
		System.out.println(orderResult);
	}
	
	
	public String execOrderService() throws Exception{
		OrderService orderService = App.getOrderService();
		String orderResult = orderService.createOrder(999);
		return orderResult;
	}
	
	public static OrderService getOrderService() {
		return new OrderService();
	}

}
