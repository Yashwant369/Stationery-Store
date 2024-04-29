package com.yashwant.stationerystore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class CartItem {
	
	@Id
	private String cartItemId;
	@OneToOne 
	private Product product;
	private int quantity;
	private double totalPrice;
	@ManyToOne
	private Cart cart;
	
	
	

}
