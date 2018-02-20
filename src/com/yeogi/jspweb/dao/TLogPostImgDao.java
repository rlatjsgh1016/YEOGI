package com.yeogi.jspweb.dao;

import java.util.List;

public interface TLogPostImgDao {

	List<TLogPostImgList> getList(String tLogPostId);

	int insert(TLogPostImgList tlpil);

	int update(TLogPostImgList tlpil);

	int delete(String id);

}
