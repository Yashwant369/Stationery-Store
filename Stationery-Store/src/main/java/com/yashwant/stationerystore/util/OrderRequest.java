package com.yashwant.stationerystore.util;

import lombok.Data;

@Data
public class OrderRequest {
	
	private String userId;
	private String orderStatus = "Pending";
	private String paymentStatus = "Pending";
	private String orderAddress;
	private String phoneNumber;
	private String billingName;
	
	

}
