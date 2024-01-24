 package com.yashwant.stationerystore.util;

import lombok.Data;

@Data
public class AddItemRequest {
	
	private String productId;
	private int quantity;
	
}
