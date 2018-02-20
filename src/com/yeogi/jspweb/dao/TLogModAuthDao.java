package com.yeogi.jspweb.dao;

import java.util.List;

public interface TLogModAuthDao {

	List<TLogModAuthList> getList(TourLog tourLog);

	int insert(TLogModAuthList tlmal);

	int update(TLogModAuthList tlmal);

	int delete(String id);

}
