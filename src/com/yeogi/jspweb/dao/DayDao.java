package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.Day;

public interface DayDao {

	List<Day> getList();
	List<Day> getPrevList(int day);
	List<Day> getNextList(int day);

}
