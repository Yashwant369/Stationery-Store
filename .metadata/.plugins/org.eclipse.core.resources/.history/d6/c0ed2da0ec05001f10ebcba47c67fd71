package com.yashwant.stationerystore.controller;

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

import com.yashwant.stationerystore.dtos.CartDto;
import com.yashwant.stationerystore.serviceImpl.CartServiceImpl;
import com.yashwant.stationerystore.util.AddItemRequest;
import com.yashwant.stationerystore.util.ApiResponse;
import com.yashwant.stationerystore.util.CartResponse;

@RestController
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	private CartServiceImpl cartService;
	
	@PostMapping("/addItem/{userId}")
	public ResponseEntity<CartResponse>addItem(@PathVariable String userId, @RequestBody AddItemRequest request)
	{
		CartResponse response = cartService.addItem(userId, request);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@DeleteMapping("/removeItem/{cartItemId}")
	public ResponseEntity<ApiResponse>removeItem(@PathVariable String cartItemId)
	{
		ApiResponse response = cartService.removeItem(cartItemId);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	@DeleteMapping("/clearCart/{userId}")
	public ResponseEntity<ApiResponse>clearCart(@PathVariable String userId)
	{
		ApiResponse response = cartService.clearCart(userId);
		return new ResponseEntity<>(response, HttpStatus.OK);
		
	}
	@GetMapping("/getCart/{userId}")
	public ResponseEntity<CartResponse>getCart(@PathVariable String userId)
	{
		CartResponse response = cartService.getCart(userId);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	@PutMapping("/updateCart/{userId}")
	public ResponseEntity<CartResponse>updateCart(@PathVariable String userId, @RequestBody AddItemRequest request)
	{
		CartResponse response = cartService.updateCart(userId, request);
		return new ResponseEntity<>(response, HttpStatus.OK);
		
	}

}
