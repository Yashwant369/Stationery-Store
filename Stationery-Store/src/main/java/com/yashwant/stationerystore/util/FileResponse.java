package com.yashwant.stationerystore.util;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class FileResponse {
	
	String fileName;
	String message;
	boolean success;
	HttpStatus status;

}
