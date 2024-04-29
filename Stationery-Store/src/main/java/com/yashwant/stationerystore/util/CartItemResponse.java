package com.yashwant.stationerystore.util;

import lombok.Data;

@Data
public class CartItemResponse {
	
	
	private String cartItemId;
	private String productId;
	private String productName;
	private int quantity;
	private double totalPrice;

}
