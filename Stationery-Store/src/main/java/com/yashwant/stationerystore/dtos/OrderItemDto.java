package com.yashwant.stationerystore.dtos;

import lombok.Data;

@Data
public class OrderItemDto {
	
	private int orderItemId;
	private int orderQuantity;
	private int totalPrice;
	private ProductDto product;


}
