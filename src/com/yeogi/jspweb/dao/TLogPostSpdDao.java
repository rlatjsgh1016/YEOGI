package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.TLogPostSpd;
import com.yeogi.jspweb.entity.TLogPostSpdView;

public interface TLogPostSpdDao {

	List<TLogPostSpdView> getList(String tLogId);
	List<TLogPostSpdView> getSum(String tLogId);
	List<TLogPostSpdView> getPostIdList(String tLogPostId);
	
	int insert(TLogPostSpd tlps);
	int update(TLogPostSpd tlps);
	int delete(String id);
	
}
