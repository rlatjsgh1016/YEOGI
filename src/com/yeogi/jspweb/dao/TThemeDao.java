package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.TTheme;

public interface TThemeDao {

	List<TTheme> getList();

	int delete(String id);

}
