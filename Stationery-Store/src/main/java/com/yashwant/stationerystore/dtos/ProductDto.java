package com.yashwant.stationerystore.dtos;

import java.util.Date;

import lombok.Data;

@Data
public class ProductDto {
	
	private String productId;
	private String productTitle;
	private String productDescription;
	private double productPrice;
	private double productDiscountPrice;
	private Integer productQuantity;
	private Date productAddedDate;
	private boolean productLive;
	private boolean productStock;
	private String productImage;
	private CategoryDto category;

}
