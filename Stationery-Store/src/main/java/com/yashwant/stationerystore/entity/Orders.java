package com.yashwant.stationerystore.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Orders {
	
	@Id
	private String orderId;
	private String orderStatus;
	private String paymentStatus;
	private double orderAmount;
	private String orderAddress;
	private String phoneNumber;
	private String billingName;
	private Date orderDate;
	private Date deliveryDate;
	@ManyToOne
	private User user;
	@OneToMany(mappedBy = "order", fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private List<OrderItem>orderItems = new ArrayList<>();
	

}
