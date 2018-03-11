package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.TourLog;
import com.yeogi.jspweb.entity.TourLogView;

public interface TourLogDao {
	
	List<TourLogView> getList();
	TourLogView get(String id);
	
	String insert(TourLog tl);
	int update(TourLog tl);
	int updateLock(TourLog tl);
	int updateCover(TourLog tl);
	int delete(String id);

}
