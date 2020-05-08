//package com.example.grocery;
//
//
//
//import static org.junit.Assert.assertEquals;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//
//import com.example.grocery.model.GroceryProduct;
//import com.example.grocery.repository.GroceryRepository;
//
//@WebAppConfiguration
//@RunWith(SpringRunner.class)
//@DataJpaTest
//public class GroceryPersistentTest {
//	
//	@Autowired
//	GroceryRepository groceryRepository;
//	
//	@Autowired
//	private TestEntityManager entityManager;
//	
//	@Test
//	public void groceryRepositoryTest() {
//		GroceryProduct productDTO = new GroceryProduct(1, "Apple");
//		
//		entityManager.persist(productDTO);
//		entityManager.flush();
//		
//		GroceryProduct found = groceryRepository.findByGroceryProductName(productDTO.getGroceryProductName());
//		assertEquals(found.getGroceryProductName(), productDTO.getGroceryProductName());
//	}
//	
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
