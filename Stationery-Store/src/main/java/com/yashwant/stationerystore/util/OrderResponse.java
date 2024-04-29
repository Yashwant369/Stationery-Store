package com.yashwant.stationerystore.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class OrderResponse 
{
	private String orderId;
	private String orderStatus;
	private String paymentStatus;
	private double orderAmount;
	private String orderAddress;
	private String phoneNumber;
	private String billingName;
	private Date orderDate;
	private Date deliveryDate;
	private List<OrderItemResponse>orderItem = new ArrayList<>(); 

}
