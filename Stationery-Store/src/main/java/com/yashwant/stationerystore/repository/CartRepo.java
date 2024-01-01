package com.yashwant.stationerystore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yashwant.stationerystore.entity.Cart;

public interface CartRepo extends JpaRepository<Cart, String> 
{
    
    @Query(value = "select * from cart where user_user_id = :userId", nativeQuery = true)
	Cart findUser(String userId);

}
