package com.yashwant.stationerystore.service;

import java.util.List;

import com.yashwant.stationerystore.dtos.OrderDto;
import com.yashwant.stationerystore.util.ApiResponse;
import com.yashwant.stationerystore.util.OrderRequest;
import com.yashwant.stationerystore.util.OrderResponse;

public interface OrderService {
	
	OrderResponse createOrder(OrderRequest request);
	ApiResponse removeOrder(String orderId);
	List<OrderResponse>getUserOrder(String userId);
	List<OrderResponse>getAllOrder();
	OrderResponse updateOrder(String orderId);

}
