package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.TLogPostImg;

public interface TLogPostImgDao {

	List<TLogPostImg> getList(String tLogPostId);

	int insert(TLogPostImg tlpi);

	int update(TLogPostImg tlpi);

	int delete(String id);

}
