package com.yashwant.stationerystore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yashwant.stationerystore.dtos.CategoryDto;
import com.yashwant.stationerystore.dtos.ProductDto;
import com.yashwant.stationerystore.serviceImpl.CategoryServiceImpl;
import com.yashwant.stationerystore.serviceImpl.ProductServiceImpl;
import com.yashwant.stationerystore.util.ApiResponse;
import com.yashwant.stationerystore.util.PageResponse;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	private CategoryServiceImpl categoryService;
	
	@Autowired
	private ProductServiceImpl productService;
	
	@PostMapping("/saveCategory")
	public ResponseEntity<CategoryDto>saveCategory(@RequestBody CategoryDto categoryDto)
	{
		CategoryDto category = categoryService.saveCategory(categoryDto);
		return new ResponseEntity<>(category, HttpStatus.OK);
	}
	@PutMapping("/updateCategory/{categoryId}")
	public ResponseEntity<CategoryDto>updateCategory(@RequestBody CategoryDto categoryDto, @PathVariable String categoryId)
	{
		CategoryDto category = categoryService.updateCategory(categoryDto, categoryId);
		return new ResponseEntity<>(category, HttpStatus.OK);
	}
	@DeleteMapping("/deleteCategory/{categoryId}")
	public ResponseEntity<ApiResponse>deleteCategory(@PathVariable String categoryId)
	{
		ApiResponse response = categoryService.deleteCategory(categoryId);
		return new ResponseEntity<>(response, HttpStatus.OK);
		
	}
	@GetMapping("/getCategoryById/{categoryId}")
	public ResponseEntity<CategoryDto>getCategoryById(@PathVariable String categoryId)
	{
		CategoryDto category = categoryService.getCategoryById(categoryId);
		return new ResponseEntity<>(category,HttpStatus.OK);
	}
	@GetMapping("/getCategoryByTitle/{title}")
	public ResponseEntity<CategoryDto>getCategoryByTitle(@PathVariable String title)
	{
		CategoryDto category = categoryService.getCategoryByTitle(title);
		return new ResponseEntity<>(category,HttpStatus.OK);
		
	}
	@GetMapping("/getAllCategory")
	public ResponseEntity<PageResponse<CategoryDto>>getAllCategory(
	@RequestParam(value = "pageNumber", defaultValue = "0", required = false)int pageNumber,
	@RequestParam(value = "pageSize", defaultValue = "2", required = false)int pageSize,
	@RequestParam(value = "sortBy", defaultValue ="categoryTitle", required = false)String sortBy,
	@RequestParam(value = "sortDir",defaultValue = "asc", required = false)String sortDir)
	{
		PageResponse<CategoryDto> response = categoryService.getAllCategory11(pageNumber, pageSize, sortBy, sortDir);
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	
	
	
	@GetMapping("/getAllProduct/{categoryId}")
	public ResponseEntity<PageResponse<ProductDto>>getAllProduct(@PathVariable String categoryId,
			@RequestParam(value = "pageNumber", defaultValue = "0", required = false)int pageNumber,
			@RequestParam(value = "pageSize", defaultValue = "2", required = false)int pageSize,
			@RequestParam(value = "sortBy", defaultValue ="product_title", required = false)String sortBy,
			@RequestParam(value = "sortDir",defaultValue = "asc", required = false)String sortDir)
	{
		PageResponse<ProductDto>response = productService.getproductByCategory(categoryId, pageNumber, pageSize, sortBy, sortDir);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	
	

}
