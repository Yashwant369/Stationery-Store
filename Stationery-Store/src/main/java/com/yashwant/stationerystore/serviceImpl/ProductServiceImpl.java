package com.yashwant.stationerystore.serviceImpl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.yashwant.stationerystore.dtos.CategoryDto;
import com.yashwant.stationerystore.dtos.ProductDto;
import com.yashwant.stationerystore.entity.Product;
import com.yashwant.stationerystore.exceptions.ResourceNotFoundException;
import com.yashwant.stationerystore.repository.ProductRepo;
import com.yashwant.stationerystore.service.ProductService;
import com.yashwant.stationerystore.util.ApiResponse;
import com.yashwant.stationerystore.util.PageResponse;

import org.springframework.data.domain.Pageable;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo productRepo;
	
	@Autowired
	private ModelMapper mapper;
	
	private String path = "Images/Product/";
	
	@Autowired
	private CategoryServiceImpl categoryService;
	
	@Override
	public ProductDto saveProduct(ProductDto productDto) {
		// TODO Auto-generated method stub
		Date date = new Date();
		productDto.setProductAddedDate(date);
		String productId = UUID.randomUUID().toString();
		productDto.setProductId(productId);
		Product product  = mapper.map(productDto, Product.class);
		Product newProduct = productRepo.save(product);
		return mapper.map(newProduct, ProductDto.class);
	}

	@Override
	public ProductDto updateProduct(ProductDto productDto, String productId) {
		// TODO Auto-generated method stub
		Product product = productRepo.findById(productId).orElseThrow(()-> 
		new ResourceNotFoundException("Resource not found for given id : " + productId));
		product.setProductDescription(productDto.getProductDescription());
		product.setProductDiscountPrice(productDto.getProductDiscountPrice());
		product.setProductImage(productDto.getProductImage());
		//product.setProductLive(productDto.get);
		product.setProductPrice(productDto.getProductPrice());
		product.setProductQuantity(productDto.getProductQuantity());
		product.setProductTitle(productDto.getProductTitle());
		product.setProductStock(productDto.isProductStock());
		product.setProductLive(productDto.isProductLive());
		
		Product updatedProduct = productRepo.save(product);
		return mapper.map(updatedProduct, ProductDto.class);
	}

	@Override
	public ApiResponse deleteProduct(String productId) {
		// TODO Auto-generated method stub
		Product product = productRepo.findById(productId).orElseThrow(()-> 
		new ResourceNotFoundException("Resource not found for given id : " + productId));
		String fullPath = path + product.getProductImage();
		Path path = Paths.get(fullPath);
		try {
			Files.delete(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		productRepo.delete(product);
		ApiResponse response = new ApiResponse();
		response.setMessage("Product deleted for given id : " + productId);
		response.setSuccess(true);
		response.setStatus(HttpStatus.OK);
		return response;
	}

	@Override
	public ProductDto getById(String productId) {
		// TODO Auto-generated method stub
		Product product = productRepo.findById(productId).orElseThrow(()-> 
		new ResourceNotFoundException("Resource not found for given id : " + productId));
		return mapper.map(product, ProductDto.class);
	}

	@Override
	public PageResponse<ProductDto> getAllProduct(int pageNumber, int pageSize, String sortBy, String sortDir) {
		// TODO Auto-generated method stub
		Sort sort = null;
		if(sortDir.equals("asc"))
		{
			sort = Sort.by(sortBy).ascending();
		}
		else 
		{
			sort = Sort.by(sortBy).descending();
			
		}
		Pageable pageable = PageRequest.of(pageNumber, pageSize, sort);
		Page<Product>page = productRepo.findAll(pageable);
		List<Product>products = page.getContent();
		if(products.size() == 0)
		{
			throw new ResourceNotFoundException("Resource not found");
		}
		List<ProductDto>list = new ArrayList<>();
		for(Product p : products)
		{
			ProductDto pDto = mapper.map(p, ProductDto.class);
			list.add(pDto);
		}
		PageResponse<ProductDto> response = new PageResponse<>();
		response.setContent(list);
		response.setLastPage(page.isLast());
		response.setPageNumber(response.getPageNumber());
		response.setPageSize(page.getSize());
		response.setTotalElement((int) page.getTotalElements());
		response.setTotalPages(page.getTotalPages());
		return response;
		
	}

	@Override
	public ProductDto getByTitle(String title) {
		// TODO Auto-generated method stub
		Product product = productRepo.getProductByTitle(title);
		return mapper.map(product, ProductDto.class);
	}

	@Override
	public ProductDto saveProductWithCategory(ProductDto productDto, String categoryId) {
		// TODO Auto-generated method stub
		
		CategoryDto categoryDto = categoryService.getCategoryById(categoryId);
		//Category category = mapper.map(categoryDto, Category.class);
		String productId = UUID.randomUUID().toString();
		productDto.setProductId(productId);
		productDto.setProductAddedDate(new Date());
		productDto.setCategory(categoryDto);	
		Product product = mapper.map(productDto, Product.class);
		Product newProduct = productRepo.save(product);
		return mapper.map(newProduct, ProductDto.class);
	}

	@Override
	public PageResponse<ProductDto> getproductByCategory(String categoryId, int pageNumber, int pageSize, String sortBy,
			String sortDir) {
		// TODO Auto-generated method stub
		
		Sort sort = null;
		if(sortDir.equalsIgnoreCase("asc"))
		{
			sort = Sort.by(sortBy).ascending();
			
		}
		else 
		{
			sort = Sort.by(sortBy).descending();
		}
		
		Pageable pageable = PageRequest.of(pageNumber, pageSize, sort);
		Page<Product>page = productRepo.findByCategoryId(categoryId, pageable);
		List<Product>product = page.getContent();
		if(product.size() == 0)
		{
			throw new ResourceNotFoundException("Resource not found");
		}
		List<ProductDto>list = new ArrayList<>();
		for(Product p : product)
		{
			ProductDto pDto = mapper.map(p, ProductDto.class);
			list.add(pDto);
		}
		PageResponse<ProductDto> response = new PageResponse<>();
		response.setContent(list);
		response.setLastPage(page.isLast());
		response.setPageNumber(response.getPageNumber());
		response.setPageSize(page.getSize());
		response.setTotalElement((int) page.getTotalElements());
		response.setTotalPages(page.getTotalPages());
		return response;
	}

	

	

}
