package com.yashwant.stationerystore.service;

import com.yashwant.stationerystore.util.AddItemRequest;
import com.yashwant.stationerystore.util.ApiResponse;
import com.yashwant.stationerystore.util.CartResponse;

public interface CartService 
{
	CartResponse addItem(String userId, AddItemRequest request);
	
	ApiResponse removeItem(String cartItemId);
	
	ApiResponse clearCart(String userId);
	
	CartResponse getCart(String userId);
	
	CartResponse updateCart(String userId, AddItemRequest request);
	

}
