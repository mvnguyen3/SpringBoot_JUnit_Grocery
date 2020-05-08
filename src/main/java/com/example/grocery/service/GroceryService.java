package com.example.grocery.service;

import java.util.List;

import com.example.grocery.model.GroceryProduct;

public interface GroceryService {
	
	public List<GroceryProduct> getAllProducts();
	
	GroceryProduct addGroceryProduct(long productId); 

}
