package com.yashwant.stationerystore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class OrderItem {
	
	@Id
	private String orderItemId;
	private int orderQuantity;
	private double totalPrice;
	@OneToOne
	private Product product;
	@ManyToOne
	private Orders order;
	

}
