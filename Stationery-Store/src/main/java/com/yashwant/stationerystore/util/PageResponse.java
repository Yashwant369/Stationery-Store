package com.yashwant.stationerystore.util;

import java.util.List;

import lombok.Data;

@Data
public class PageResponse<T> {
	
	private List<T>content;
	private int pageNumber;
	private int pageSize;
	private int totalElement;
	private int totalPages;
	private boolean lastPage;
	

}
