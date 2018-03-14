package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.Member;
import com.yeogi.jspweb.entity.TLogCmt;
import com.yeogi.jspweb.entity.TLogCmtView;
import com.yeogi.jspweb.entity.TourLog;

public interface TLogCmtDao {
	
	List<TLogCmtView> getList(String tourLogId);
	
	TLogCmtView get(String id);

	int insert(TLogCmt tlc);

	int update(TLogCmt tlc);

	int delete(String id);
	
	int updateLock(TLogCmt tlc);

}
