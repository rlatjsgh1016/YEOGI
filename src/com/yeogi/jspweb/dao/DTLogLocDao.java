package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.Day;

public interface DTLogLocDao {

	List<DTLogLoc> getList(Day day);

	int insert(DTLogLoc dtlll);

	int update(DTLogLoc dtlll);

	int delete(String id);

}
