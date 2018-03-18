package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.MyLoc;

public interface MyLocDao {

	MyLoc get(String id);
	List<MyLoc> getList();

	int insert(MyLoc myLoc);
	int update(MyLoc myLoc);

	int delete(String id);
	
}
