package com.yeogi.jspweb.dao;

import java.util.List;


public interface StoryRead {
	
	List<TourLog> getList();

	/*---------User info-----------------------------------------*/
	Member get(String id);
	
	int getLogCount(List<TourLog> list, String field);
	int getPlanCount(List<TourPlan> list, String field);
	int getCommuCount(List<Commu> list, String field);
	
	/*---------Story-----------------------------------------*/
	TLogLocList getLocList(String id,Number order);
	

}
