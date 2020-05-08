package com.example.grocery.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;


@Data
@AllArgsConstructor
@Entity
@Table(name = "product")
public class GroceryProduct {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long groceryProductId;
	private String groceryProductName;

}
