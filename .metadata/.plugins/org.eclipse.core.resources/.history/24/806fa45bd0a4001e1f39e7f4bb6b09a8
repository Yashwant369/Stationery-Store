package com.yashwant.stationerystore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yashwant.stationerystore.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, String>{

	@Query(value = "select * from Category where category_title = :title", nativeQuery = true)
	Category getCategoryByTitle(String title);

}
