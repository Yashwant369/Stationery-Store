package com.yashwant.stationerystore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yashwant.stationerystore.dtos.OrderDto;
import com.yashwant.stationerystore.serviceImpl.OrderServiceImpl;
import com.yashwant.stationerystore.util.ApiResponse;
import com.yashwant.stationerystore.util.OrderRequest;
import com.yashwant.stationerystore.util.OrderResponse;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderServiceImpl orderService;
	
	@PostMapping("/createOrder")
	public ResponseEntity<OrderResponse>createOrder(@RequestBody OrderRequest request)
	{
		OrderResponse response = orderService.createOrder(request);
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	@DeleteMapping("/deleteOrder/{orderId}")
	public ResponseEntity<ApiResponse>deleteOrder(@PathVariable String orderId)
	{
		ApiResponse response = orderService.removeOrder(orderId);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	@GetMapping("/getUserOrder/{userId}")
	public ResponseEntity<List<OrderResponse>>getUserOrder(@PathVariable String userId)
	{
		List<OrderResponse>list = orderService.getUserOrder(userId);
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	@GetMapping("/getAllOrder")
	public ResponseEntity<List<OrderResponse>>getAllOrder()
	{
		List<OrderResponse>list = orderService.getAllOrder();
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	@PutMapping("/updateOrder/{orderId}")
	public ResponseEntity<OrderResponse>updateOrder(@PathVariable String orderId)
	{
		OrderResponse response = orderService.updateOrder(orderId);
		return new ResponseEntity<>(response,HttpStatus.OK);
	}

}
