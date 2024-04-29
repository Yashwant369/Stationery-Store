package com.yashwant.stationerystore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yashwant.stationerystore.entity.OrderItem;

public interface OrderItemRepo extends JpaRepository<OrderItem,String> {

}
