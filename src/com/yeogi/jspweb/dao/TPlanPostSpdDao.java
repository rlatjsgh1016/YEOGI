package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.TPlanPostSpd;

public interface TPlanPostSpdDao {
	public int insert(TPlanPostSpd tplanpostspd);
	public int update(TPlanPostSpd tplanpostspd);
	public int delete(String id);
	
	public List<TPlanPostSpd> getList(); 
	public TPlanPostSpd get(String id);

}
