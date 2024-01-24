package com.yashwant.stationerystore.dtos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class OrderDto {
	
	private String orderId;
	private String orderStatus = "Pending";
	private String paymentStatus = "Pending";
	private double orderAmount;
	private String orderAddress;
	private String phoneNumber;
	private String billingName;
	private Date orderDate = new Date();
	private Date deliveryDate;
	private List<OrderItemDto>orderItems = new ArrayList<>();

}
