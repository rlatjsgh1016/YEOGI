package com.yeogi.jspweb.dao;

import java.util.List;

public interface TLogLocDao {

	List<TLogLocList> getList(TourLog tourLog);

	int insert(TLocLocList tlll);

	int update(TLocLocList tlll);

	int delete(String id);

}
