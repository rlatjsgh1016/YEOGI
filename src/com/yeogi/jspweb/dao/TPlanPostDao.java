package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.TPlanPost;

public interface TPlanPostDao {
	public int insert(TPlanPost tplanpost);
	public int update(TPlanPost tplanpost);
	public int delete(String id);
	
	public List<TPlanPost> getList();
	public TPlanPost get(String id);

}
