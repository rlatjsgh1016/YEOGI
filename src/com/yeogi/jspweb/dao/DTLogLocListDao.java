package com.yeogi.jspweb.dao;

import java.util.List;

public interface DTLogLocListDao {

	List<DTLogLocList> getList(Day day);

	int insert(DTLogLocList dtlll);

	int update(DTLogLocList dtlll);

	int delete(String id);

}
