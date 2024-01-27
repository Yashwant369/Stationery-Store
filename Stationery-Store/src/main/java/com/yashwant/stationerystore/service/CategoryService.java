package com.yashwant.stationerystore.service;

import com.yashwant.stationerystore.dtos.CategoryDto;
import com.yashwant.stationerystore.util.ApiResponse;
import com.yashwant.stationerystore.util.PageResponse;

public interface CategoryService {
	
	public CategoryDto saveCategory(CategoryDto categoryDto);
	public CategoryDto updateCategory(CategoryDto categoryDto, String categoryId);
	public ApiResponse deleteCategory(String categoryId);
	public CategoryDto getCategoryById(String categoryId);
	public CategoryDto getCategoryByTitle(String title);
	
	public PageResponse<CategoryDto> getAllCategory11(int pageNumber, int pageSize, String sortBy, String sortDir);
	 

}
