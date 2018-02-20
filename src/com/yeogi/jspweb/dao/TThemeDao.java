package com.yeogi.jspweb.dao;

import java.util.List;

public interface TThemeDao {

	List<TTheme> getList();

	int delete(String id);

}
