package com.yeogi.jspweb.dao;

import java.util.List;

public interface TLogPostSpdListDao {

	List<TLogPostSpdList> getList(String tLogPostId);
	int insert(TLogPostSpdList tlpsl);
	int update(TLogPostSpdList tlpsl);
	int delete(String id);
	
}
