package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.Member;
import com.yeogi.jspweb.entity.TLogCmt;

public interface TLogCmtDao {
	
	List<TLogCmt> getList(TLogCmt tLogCmt);

	int insert(Member id);

	int update(Member id);

	int delete(String id);

}
