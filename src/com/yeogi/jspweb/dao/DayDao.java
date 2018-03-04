package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.Day;

public interface DayDao {

	List<Day> getList();
	List<Day> getList(int startDay);
	List<Day> getPrevList(int currDay);
	List<Day> getNextList(int currDay);

}
