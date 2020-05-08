package com.example.grocery;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.grocery.model.GroceryProduct;
import com.example.grocery.repository.GroceryRepository;
import com.example.grocery.service.GroceryServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class GroceryServiceTest {

	@InjectMocks
	GroceryServiceImpl groceryService;

	@Mock
	GroceryRepository groceryRepository;

	@Test
	public void testGetAllProducts() {
		List<GroceryProduct> products = new ArrayList<>();
		products.add(new GroceryProduct(1, "milk"));
		products.add(new GroceryProduct(2, "bread"));
		Mockito.when(groceryRepository.findAll()).thenReturn(products);
		List<GroceryProduct> groceryProducts = groceryService.getAllProducts();
		//System.out.println(groceryProducts.size());
		assertTrue(groceryProducts.size() == 2);
		Mockito.verify(groceryRepository, Mockito.times(2)).findAll();
	}
	
	@Test
	public void testArgumentCaptor() {
		ArgumentCaptor<GroceryProduct> groceryArgumentCaptor = ArgumentCaptor.forClass(GroceryProduct.class);
		
		long groceryProductId = 1;
		groceryService.addGroceryProduct(groceryProductId);
		Mockito.verify(groceryRepository, Mockito.times(1)).addGroceryProduct(groceryArgumentCaptor.capture());
		
		GroceryProduct groceryProduct = groceryArgumentCaptor.getValue();
		assertEquals(groceryProduct.getGroceryProductId(), groceryProductId);
				
	}

}






