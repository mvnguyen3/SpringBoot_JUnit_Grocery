package com.example.grocery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.grocery.model.GroceryProduct;
import com.example.grocery.repository.GroceryRepository;

@Service
public class GroceryServiceImpl implements GroceryService {
	
	@Autowired
	private GroceryRepository groceryRepository;


	@Override
	public List<GroceryProduct> getAllProducts() {
		groceryRepository.findAll();
		return groceryRepository.findAll();
	}


	@Override
	public GroceryProduct addGroceryProduct(long productId) {
		GroceryProduct p = new GroceryProduct(101, "product " + productId);
		return groceryRepository.addGroceryProduct(p);
	}
	
	

}
