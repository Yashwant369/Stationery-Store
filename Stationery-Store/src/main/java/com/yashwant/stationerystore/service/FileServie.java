package com.yashwant.stationerystore.service;

import java.io.InputStream;

import org.springframework.web.multipart.MultipartFile;

import com.yashwant.stationerystore.util.FileResponse;

public interface FileServie {
	
	public FileResponse uploadImage(MultipartFile file, String path);
	public InputStream getFile(String path, String fileName);
	

}
