package com.yashwant.stationerystore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yashwant.stationerystore.entity.Orders;
import com.yashwant.stationerystore.entity.User;

public interface OrderRepo extends JpaRepository<Orders, String> {

	List<Orders> findByUser(User user);

}
