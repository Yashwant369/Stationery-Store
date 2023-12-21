package com.yashwant.stationerystore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {
	
	@Id
	private String userId;
	private String userName;
	private String userGender;
	@Column(unique = true)
	private String userEmail;
	private String userPassword;
	private String userImage;

}
