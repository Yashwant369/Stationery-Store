package com.yashwant.stationerystore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yashwant.stationerystore.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, String>{

}
