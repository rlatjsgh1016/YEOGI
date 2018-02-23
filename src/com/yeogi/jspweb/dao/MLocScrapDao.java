package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.MLocScrap;

public interface MLocScrapDao {
	List<MLocScrap> getList(String mId);

	int insert(MLocScrap mls);

	int update(MLocScrap mls);

	int delete(String id);
}
