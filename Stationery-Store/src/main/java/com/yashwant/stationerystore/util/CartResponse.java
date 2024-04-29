package com.yashwant.stationerystore.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class CartResponse {
	
	private String cartId;
	private Date createdDate;
	private String userId;
	private String userName;
	private List<CartItemResponse>cartItems = new ArrayList<>();

}
