package com.yeogi.jspweb.dao;

import java.util.List;

public interface TLogNationDao {

	List<TLogNationList> getList(TourLog tourLog);

	int insert(TLogNationList tlnl);

	int update(TLogNationList tlnl);

	int delete(String id);
}
