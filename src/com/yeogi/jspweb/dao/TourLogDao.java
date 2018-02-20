package com.yeogi.jspweb.dao;

import com.yeogi.jspweb.entity.TourLog;

public interface TourLogDao {

	TourLog get(String id);

	int delete(String id);

}
