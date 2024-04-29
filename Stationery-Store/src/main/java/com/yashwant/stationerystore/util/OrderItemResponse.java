package com.yashwant.stationerystore.util;

import lombok.Data;

@Data
public class OrderItemResponse 
{
	
	private String orderItemId;
	private int orderQuantity;
	private double totalPrice;
	private String productId;
	private String productTitle;
	
}
	



