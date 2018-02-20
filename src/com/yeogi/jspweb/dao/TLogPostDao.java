package com.yeogi.jspweb.dao;

import java.util.List;

public interface TLogPostDao {

	List<TLogPost> getList(TourLog tourLog, TLogLocList tLogLocList);
	int insert(TLogPost tlp);
	int update(TLogPost tlp);
	int delete(String id);
	
}
