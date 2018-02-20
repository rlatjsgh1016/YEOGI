package com.yeogi.jspweb.dao;

import java.util.List;

public interface TLogLocListDao {

	List<TLogLocList> getList(TourLog tourLog);

	int insert(TLocLocList tlll);

	int update(TLocLocList tlll);

	int delete(String id);

}
