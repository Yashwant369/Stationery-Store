package com.yashwant.stationerystore.dtos;

import lombok.Data;

@Data
public class OrderItemDto {
	
	private String orderItemId;
	private int orderQuantity;
	private int totalPrice;
	private ProductDto product;


}
