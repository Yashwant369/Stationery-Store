package com.yashwant.stationerystore.service;

import com.yashwant.stationerystore.dtos.ProductDto;
import com.yashwant.stationerystore.util.ApiResponse;
import com.yashwant.stationerystore.util.PageResponse;

public interface ProductService {
	
	ProductDto saveProduct(ProductDto productDto);
	ProductDto updateProduct(ProductDto productDto, String productId);
	ApiResponse deleteProduct(String productId);
	ProductDto getById(String productId);
	PageResponse<ProductDto>getAllProduct(int pageNumber, int pageSize, String sortBy, String sortDir);
	ProductDto getByTitle(String title);
	ProductDto saveProductWithCategory(ProductDto productDto, String categoryId);
	PageResponse<ProductDto>getproductByCategory(String categoryId, int pageNumber, int pageSize, String sortBy, String sortDir);
	
}
