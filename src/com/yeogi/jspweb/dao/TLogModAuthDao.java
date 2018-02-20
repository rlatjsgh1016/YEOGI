package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.TLogModAuth;
import com.yeogi.jspweb.entity.TourLog;

public interface TLogModAuthDao {

	List<TLogModAuth> getList(TourLog tourLog);

	int insert(TLogModAuth tlma);

	int update(TLogModAuth tlma);

	int delete(String id);

}
