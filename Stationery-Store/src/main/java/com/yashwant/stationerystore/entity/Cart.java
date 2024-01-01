package com.yashwant.stationerystore.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Cart {
	
	@Id
	private String cartId;	
	private Date createdDate;
	@OneToOne
	private User user;
	@OneToMany(mappedBy = "cart", cascade = CascadeType.ALL,orphanRemoval = true)
	private List<CartItem>cartItems = new ArrayList<>();
	
	

}
