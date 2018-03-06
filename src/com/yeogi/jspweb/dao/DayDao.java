package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.Day;

public interface DayDao {

	List<Day> getList();
	List<Day> getList(int lastDay);
	List<Day> getPrevList(int startDay);
	List<Day> getNextList(int lastDay);
}
