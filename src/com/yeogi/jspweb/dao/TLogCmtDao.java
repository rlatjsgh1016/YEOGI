package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.Member;
import com.yeogi.jspweb.entity.TLogCmt;

public interface TLogCmtDao {
	
	List<TLogCmt> getList(String tourLogId);

	int insert(TLogCmt id);

	int update(TLogCmt id);

	int delete(String id);

}
