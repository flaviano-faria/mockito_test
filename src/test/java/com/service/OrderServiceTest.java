
package com.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class OrderServiceTest {
	
	
	@Test
	public void createOrderTest() throws Exception {
		FraudService fraudService = mock(FraudService.class);
		OrderService orderServiceSpy = spy(new OrderService());
		when(fraudService.isFraudEligible()).thenReturn(false);
		doReturn(false).when(fraudService.isFraudEligible());
		assertEquals("0", orderServiceSpy.createOrder());
		
	}

}
