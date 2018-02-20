package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.Day;
import com.yeogi.jspweb.entity.DayTLogLoc;

public interface DayTLogLocDao {

	List<DayTLogLoc> getList(Day day);

	int insert(DayTLogLoc dtll);

	int update(DayTLogLoc dtll);

	int delete(String id);

}
