
package com.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class OrderServiceTest {
	
	
	@Test
	public void createSucessOrderTest() throws Exception {
		FraudService fraudService = mock(FraudService.class);
		OrderService orderServiceSpy = spy(new OrderService());
		
		when(fraudService.isFraudEligible(Mockito.anyDouble())).thenReturn(false);
		when(orderServiceSpy.getFraudService()).thenReturn(fraudService);
		assertEquals("Order created", orderServiceSpy.createOrder(Mockito.anyDouble()));
		
	}
	
	@Test
	public void createFraudOrderTest() throws Exception {
		FraudService fraudService = mock(FraudService.class);
		OrderService orderServiceSpy = spy(new OrderService());
		
		when(fraudService.isFraudEligible(Mockito.anyDouble())).thenReturn(true);
		when(orderServiceSpy.getFraudService()).thenReturn(fraudService);
		assertThrows(Exception.class, null);
	}

	@Test
	public void sendOrderTest() {
		OrderService orderService = mock(OrderService.class);
		doNothing().when(orderService).sendOrder();
		orderService.sendOrder();
		
		verify(orderService,times(1)).sendOrder();
	}
	
	@Test
	public void sendStaticOrderTest() throws InterruptedException {
		
		OrderService orderService = mock(OrderService.class);
		try (MockedStatic<FraudService> mockFiles = Mockito.mockStatic(FraudService.class)) {
		    mockFiles.when(() -> FraudService.analyse())
		                     .then(invocationOnMock -> null);
		}
		
		orderService.sendStaticOrder();
	}
}
