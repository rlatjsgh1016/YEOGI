package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.TLogLoc;
import com.yeogi.jspweb.entity.TourLog;

public interface TLogLocDao {

	List<TLogLoc> getList(TourLog tourLog);

	int insert(TLogLoc tll);

	int update(TLogLoc tll);

	int delete(String id);

}
