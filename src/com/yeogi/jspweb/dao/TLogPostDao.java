package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.TLogLoc;
import com.yeogi.jspweb.entity.TLogPost;
import com.yeogi.jspweb.entity.TLogPostView;
import com.yeogi.jspweb.entity.TourLog;

public interface TLogPostDao {

	List<TLogPostView> getList(TourLog tourLog);
	
	String insert(TLogPost tlp);
	int update(TLogPost tlp);
	int delete(String id);
	
}
