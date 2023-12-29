package com.yashwant.stationerystore.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yashwant.stationerystore.entity.Product;

public interface ProductRepo extends JpaRepository<Product, String>{

	@Query(value = "select * from product where product_title = :title", nativeQuery = true)
	Product getProductByTitle(String title);

	@Query(value= "select * from product where category_category_id = :categoryId" , nativeQuery = true)
	Page<Product> findByCategoryId(String categoryId, Pageable pageable);

}
