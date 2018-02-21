package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.TPlanLoc;

public interface TPlanLocDao {
	public int insert(TPlanLocDao tplanlocdao);
	public int update(TPlanLocDao tplanlocdao);
	public int delete(String id);
	
	public List<TPlanLoc> getList();
	public TPlanLoc get(String id);
	
	
}
