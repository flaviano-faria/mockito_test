package com.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import com.app.App;

public class AppTest {
	
	@InjectMocks
	App app = new App();
	
	
	@Test
	public void testSucessOSApp() throws Exception{
		OrderService orderService = mock(OrderService.class);
		when(orderService.createOrder(anyDouble())).thenThrow(Exception.class);
		try (MockedStatic<App> utilities = Mockito.mockStatic(App.class)) {
			utilities.when(App::getOrderService).thenReturn(orderService);
			when(orderService.createOrder(anyDouble())).thenThrow(Exception.class);
		} catch (Exception e) {
			assertThrows(Exception.class, null);
		}
		
		
	}
	
	@Test
	public void testFruadOSApp() throws Exception{
		OrderService orderService = mock(OrderService.class);
		when(orderService.createOrder(anyDouble())).thenThrow(Exception.class);
		try (MockedStatic<App> utilities = Mockito.mockStatic(App.class)) {
			utilities.when(App::getOrderService).thenReturn(orderService);
			when(orderService.createOrder(anyDouble())).thenReturn("Order created");
		} catch (Exception e) {
			assertThrows(Exception.class, null);
		}
		assertEquals("Order created", app.execOrderService());
		
	}

}
