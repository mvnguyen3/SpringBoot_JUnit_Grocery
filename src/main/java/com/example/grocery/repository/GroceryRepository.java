package com.example.grocery.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.grocery.model.GroceryProduct;

//@Repository
//public interface GroceryRepository extends JpaRepository<GroceryProduct, Long>{
//	
////	public List<GroceryProduct> getAllProducts();
////
//	public GroceryProduct findByGroceryProductName(String groceryProductName);
//
//}

@Component
public class GroceryRepository{
	
	public List<GroceryProduct> findAll(){
		return new ArrayList<>();
	}
	
	public GroceryProduct addGroceryProduct(GroceryProduct p) {
		return new GroceryProduct(1, "");
	}

}
