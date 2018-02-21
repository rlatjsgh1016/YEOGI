package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.COMMU_POST;


public class COMMU_POSTDao {

	public interface COMMU_POST  {

		List<COMMU_POST> getList();
	
		int delete(String ID );
		int insert(String POST_TYPE );
		int update( TITLE CONTENT HIT REG_DATE);
		
}
}