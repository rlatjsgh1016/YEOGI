package com.yeogi.jspweb.dao;

import java.sql.SQLException;
import java.util.List;

import com.yeogi.jspweb.entity.MyLoc;

public interface MyLocDao {

	MyLoc get(String id);
	List<MyLoc> getList();
	int insert(MyLoc mLoc) throws ClassNotFoundException, SQLException;
	int update(MyLoc mLoc) throws ClassNotFoundException, SQLException;
	int delete(String id);
	
}
