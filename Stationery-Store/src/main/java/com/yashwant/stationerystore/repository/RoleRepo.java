package com.yashwant.stationerystore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yashwant.stationerystore.entity.Role;

public interface RoleRepo extends JpaRepository<Role, String>{

}
