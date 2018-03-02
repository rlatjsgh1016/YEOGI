package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.TourLog;

public interface TourLogDao {
	
	List<TourLog> getList();
	TourLog get(String id);
	
	String insert(TourLog tl);
	int update(TourLog tl);
	int delete(String id);

}
