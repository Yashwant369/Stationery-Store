package com.yashwant.stationerystore.dtos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.yashwant.stationerystore.entity.CartItem;
import lombok.Data;

@Data
public class CartDto {
	private String cartId;	
	private Date createdDate;
	private UserDto user;
	private List<CartItemDto>cartItems = new ArrayList<>();

}
