package com.yashwant.stationerystore.dtos;

import lombok.Data;

@Data
public class OrderPayment {
	
	private double price;
	private String currency;
	private String method;
	private String intent;
	private String description;

}
