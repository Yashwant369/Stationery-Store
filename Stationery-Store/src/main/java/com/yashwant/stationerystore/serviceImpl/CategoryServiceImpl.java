package com.yashwant.stationerystore.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.yashwant.stationerystore.dtos.CategoryDto;
import com.yashwant.stationerystore.entity.Category;
import com.yashwant.stationerystore.exceptions.ResourceNotFoundException;
import com.yashwant.stationerystore.repository.CategoryRepo;
import com.yashwant.stationerystore.service.CategoryService;
import com.yashwant.stationerystore.util.ApiResponse;
import com.yashwant.stationerystore.util.PageResponse;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepo categoryRepo;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public CategoryDto saveCategory(CategoryDto categoryDto) {
		// TODO Auto-generated method stub
		String categoryId = UUID.randomUUID().toString();
		categoryDto.setCategoryId(categoryId);
		Category category = mapper.map(categoryDto, Category.class);
		Category newCategory = categoryRepo.save(category);
		CategoryDto newCategoryDto = mapper.map(newCategory, CategoryDto.class);
		return newCategoryDto;
	}

	@Override
	public CategoryDto updateCategory(CategoryDto categoryDto, String categoryId) {
		// TODO Auto-generated method stub
		Category category = categoryRepo.findById(categoryId).orElseThrow(()-> 
		new ResourceNotFoundException("Resource not found for given id : " + categoryId));
		category.setCategoryDescription(categoryDto.getCategoryDescription());
		category.setCategoryTitle(categoryDto.getCategoryTitle());
		Category updatedCategory = categoryRepo.save(category);
		return mapper.map(updatedCategory, CategoryDto.class);
	}

	@Override
	public ApiResponse deleteCategory(String categoryId) {
		// TODO Auto-generated method stub
		Category category = categoryRepo.findById(categoryId).orElseThrow(()-> new 
				ResourceNotFoundException("Resource not found for given id : " + categoryId));
		ApiResponse response = new ApiResponse();
		response.setSuccess(true);
		response.setMessage("Category Deleted");
		response.setStatus(HttpStatus.OK);
		categoryRepo.delete(category);
		return response;
	}

	@Override
	public CategoryDto getCategoryById(String categoryId) {
		// TODO Auto-generated method stub
		Category category = categoryRepo.findById(categoryId).orElseThrow(()-> new 
				ResourceNotFoundException("Resource not found for given id : " + categoryId));
		return mapper.map(category, CategoryDto.class);
	}

	@Override
	public PageResponse<CategoryDto> getAllCategory11(int pageNumber, int pageSize, String sortBy, String sortDir) {
		// TODO Auto-generated method stub
		Sort sort = null;
		if(sortDir.equalsIgnoreCase("asc"))
		{
			sort = Sort.by(sortBy).ascending();
		}
		else if(sortDir.equalsIgnoreCase("desc"))
		{
			sort = Sort.by(sortBy).descending();
		}
		Pageable pageable = PageRequest.of(pageNumber, pageSize, sort);
		
		Page<Category>page = categoryRepo.findAll(pageable);
		
		List<Category>categories = page.getContent();
		if(categories.size() == 0)
		{
			throw new ResourceNotFoundException("No Resource Found");
		}
		List<CategoryDto>list = new ArrayList<>();
		for(Category c : categories)
		{
			CategoryDto cDto = mapper.map(c, CategoryDto.class);
			list.add(cDto);
		}
		PageResponse<CategoryDto> response = new PageResponse<>();
		response.setContent(list);
		response.setLastPage(page.isLast());
		response.setPageNumber(page.getNumber());
		response.setPageSize(page.getSize());
		response.setTotalElement((int) page.getTotalElements());
		response.setTotalPages(page.getTotalPages());
		
		return response;
	}

	@Override
	public CategoryDto getCategoryByTitle(String title) {
		// TODO Auto-generated method stub
		Category category = categoryRepo.getCategoryByTitle(title);
		if(category == null)
		{
			throw new ResourceNotFoundException("Resource not found for given title : " + title);
		}
		return mapper.map(category, CategoryDto.class);
	}
	

}
