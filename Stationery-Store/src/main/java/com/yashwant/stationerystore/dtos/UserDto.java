package com.yashwant.stationerystore.dtos;

import java.util.HashSet;
import java.util.Set;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserDto {
	
	private String userId;
	@NotBlank(message = "Please Enter User Name")
	private String userName;
	@Size(min = 4, max = 6, message = "Please Enter Appropriate Gender")
	private String userGender;
	
	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Please Enter Valid Email")
	@Email
	private String userEmail;
	@NotBlank(message = "Please Enter Password")
	private String userPassword;
	private String userImage;
	private Set<RoleDto>roles = new HashSet<>();

}
