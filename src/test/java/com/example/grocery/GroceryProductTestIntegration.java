package com.example.grocery;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.grocery.service.GroceryServiceImpl;

@WebMvcTest
public class GroceryProductTestIntegration {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private GroceryServiceImpl groceryService;
	
	@Test
	public void testGetAllProducts() throws Exception
	{
		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/groceryProductTest")).andReturn();
		assertEquals(HttpStatus.OK.value(), mvcResult.getResponse().getStatus());
	}

}
