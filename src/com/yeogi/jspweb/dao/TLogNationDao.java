package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.TLogNation;
import com.yeogi.jspweb.entity.TourLog;

public interface TLogNationDao {

	List<TLogNation> getList(TourLog tourLog);
	
	TLogNation get(String id);

	int insert(TLogNation tln);

	int update(TLogNation tln);

	int delete(String id);
}
