package com.yashwant.stationerystore.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.yashwant.stationerystore.dtos.CategoryDto;
import com.yashwant.stationerystore.dtos.ProductDto;
import com.yashwant.stationerystore.serviceImpl.CategoryServiceImpl;
import com.yashwant.stationerystore.serviceImpl.FileServiceImpl;
import com.yashwant.stationerystore.serviceImpl.ProductServiceImpl;
import com.yashwant.stationerystore.util.ApiResponse;
import com.yashwant.stationerystore.util.FileResponse;
import com.yashwant.stationerystore.util.PageResponse;

import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductServiceImpl productService;
	
	private String path = "Images/Product/";
	
	@Autowired
	private FileServiceImpl fileService;
	
	@Autowired
	private CategoryServiceImpl categoryService;
	
	@PostMapping("/saveProduct/{categoryId}")
	public ResponseEntity<ProductDto>saveproduct(@RequestBody ProductDto producDto, @PathVariable String categoryId)
	{
		ProductDto product = productService.saveProductWithCategory(producDto, categoryId);
		return new ResponseEntity<>(product, HttpStatus.OK);
		
	}
		
	@PostMapping("/saveProduct")
	public ResponseEntity<ProductDto>saveProduct(@RequestBody ProductDto productDto)
	{
		ProductDto productDto1 = productService.saveProduct(productDto);
		return new ResponseEntity<>(productDto1, HttpStatus.OK);
	}
	@PutMapping("/updateProduct/{productId}")
	public ResponseEntity<ProductDto>updateProduct(@RequestBody ProductDto productDto, @PathVariable String productId)
	{
		ProductDto productDto1 = productService.updateProduct(productDto, productId);
		return new ResponseEntity<>(productDto1,HttpStatus.OK);
	}
	@DeleteMapping("/deleteProduct/{productId}")
	public ResponseEntity<ApiResponse>deleteProduct(@PathVariable String productId)
	{
		ApiResponse response = productService.deleteProduct(productId);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	@GetMapping("/getById/{productId}")
	public ResponseEntity<ProductDto>getProductById(@PathVariable String productId)
	{
		ProductDto product = productService.getById(productId);
		return new ResponseEntity<>(product, HttpStatus.OK);
	}
	@GetMapping("/getAllProduct")
	public ResponseEntity<PageResponse<ProductDto>>getAllProduct(
			@RequestParam(value = "pageNumber", defaultValue = "0",required = false) int pageNumber,
			@RequestParam(value = "pageSize", defaultValue = "5", required = false)int pageSize,
			@RequestParam(value = "sortBy", defaultValue = "productTitle", required = false)String sortBy,
			@RequestParam(value = "sortDir", defaultValue = "asc", required = false)String sortDir)
	{
		PageResponse<ProductDto>response = productService.getAllProduct(pageNumber, pageSize, sortBy, sortDir);
		return new ResponseEntity<>(response, HttpStatus.OK); 
	}
	@PostMapping("/uploadImage/{productId}")
	public ResponseEntity<FileResponse>uploadImage(@RequestParam("productImage")MultipartFile file,
			@PathVariable String productId)
	{
		FileResponse response = fileService.uploadImage(file, path);
		ProductDto product = productService.getById(productId);
		product.setProductImage(response.getFileName());
		ProductDto pDto = productService.updateProduct(product, productId);
		return new ResponseEntity<>(response, HttpStatus.OK);
		
	}
	@GetMapping("/getFile/{productId}")
	public void getFile(@PathVariable String productId, HttpServletResponse response)
	{
		ProductDto product = productService.getById(productId);
		InputStream resource = fileService.getFile(path, product.getProductImage());
		response.setContentType(MediaType.IMAGE_JPEG_VALUE);
		try {
			StreamUtils.copy(resource, response.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@PutMapping("/updateCategory/{productId}/{categoryId}")
	public ResponseEntity<ProductDto>updateCategory(@PathVariable String productId, @PathVariable String categoryId)
	{
		ProductDto product = productService.getById(productId);
		CategoryDto category = categoryService.getCategoryById(categoryId);		
		product.setCategory(category);
		ProductDto updatedProduct = productService.updateProduct(product, productId);
		return new ResponseEntity<>(updatedProduct,HttpStatus.OK);
		
	}
	
	
	

}
