package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.Day;

public interface DayDao {

	List<Day> getList();

	int delete(String id);

}
