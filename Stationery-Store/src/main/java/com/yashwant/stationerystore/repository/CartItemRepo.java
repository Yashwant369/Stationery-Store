package com.yashwant.stationerystore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yashwant.stationerystore.entity.CartItem;

public interface CartItemRepo extends JpaRepository<CartItem,String> {

}
