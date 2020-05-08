package com.example.grocery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.grocery.service.GroceryServiceImpl;

@RestController
public class GroceryProductController {

	@Autowired
	private GroceryServiceImpl groceryService;

	@RequestMapping(value = "/groceryProductTest", method = RequestMethod.GET)
	public ResponseEntity<String> groceryProductTest() {

		System.out.println(groceryService.getAllProducts());
		return new ResponseEntity<String>("tested", HttpStatus.OK);
	}

}
