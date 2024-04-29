package com.yashwant.stationerystore.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JwtResponse {
	
	private String jwtToken;
	private UserDto user;

}
