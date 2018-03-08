package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.TLogPostSpd;

public interface TLogPostSpdDao {

	List<TLogPostSpd> getList(String tLogPostId);
	int insert(TLogPostSpd tlps);
	int insertNonAmount(TLogPostSpd tlps);
	int update(TLogPostSpd tlps);
	int delete(String id);
	
}
