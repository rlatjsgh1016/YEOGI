package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.TPlanPostSpd;
import com.yeogi.jspweb.entity.TPlanPostSpdView;

public interface TPlanPostSpdDao {
	public int insert(TPlanPostSpd tplanpostspd);
	public int update(TPlanPostSpd tplanpostspd);
	public int delete(String id);
	
	public List<TPlanPostSpdView> getList(); 
	public TPlanPostSpd get(String id);

}
