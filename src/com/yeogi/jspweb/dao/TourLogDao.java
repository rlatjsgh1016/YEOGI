package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.TourLog;

public interface TourLogDao {
	
	List<TourLog> getList();
	TourLog get(String id);
	int insert(String id);
	int update(String id);
	int delete(String id);

}
