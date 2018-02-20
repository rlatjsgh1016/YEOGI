package com.yeogi.jspweb.dao;

import java.util.List;

public interface MyLocDao {

	List<MyLoc> getList();
	int insert(MyLoc mLoc);
	int update(MyLoc mLoc);
	int delete(String id);
	int delete(String id);
	
}
