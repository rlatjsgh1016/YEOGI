package com.yeogi.jspweb.dao.jdbc;

import java.util.List;

import com.yeogi.jspweb.dao.TLogPostDao;
import com.yeogi.jspweb.entity.TLogLoc;
import com.yeogi.jspweb.entity.TLogPost;
import com.yeogi.jspweb.entity.TourLog;

public class JdbcTLogPostDao implements TLogPostDao {

	@Override
	public List<TLogPost> getList(TourLog tourLog, TLogLoc tLogLoc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(TLogPost tlp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(TLogPost tlp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
