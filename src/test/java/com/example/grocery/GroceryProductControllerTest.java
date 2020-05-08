package com.example.grocery;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.grocery.controller.GroceryProductController;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(MockitoJUnitRunner.class)
public class GroceryProductControllerTest {
	
	@Mock
	GroceryProductController groceryProductController;
	
	@Test
	public void testController()
	{
		Mockito.when(groceryProductController.groceryProductTest()).thenReturn(new ResponseEntity<String>("tested", HttpStatus.OK));
		ResponseEntity<String> responseEntity = groceryProductController.groceryProductTest();
		assertEquals("OK", responseEntity.getStatusCode().name());
	}

}
