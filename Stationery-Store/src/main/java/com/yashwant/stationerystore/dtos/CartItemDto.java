package com.yashwant.stationerystore.dtos;

import lombok.Data;

@Data
public class CartItemDto {
	
	private String cartItemId;
	//private ProductDto product;
	private int quantity;
	private double totalPrice;


}
