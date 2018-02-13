package com.yeogi.jspweb.dao;

import java.util.List;

import com.newlecture.jspweb.entity.Notice;

public interface SH {

	
	/* -- main page -------------------------------------*/
	
	List<loc> getLocList(int rank);
	List<Tour_log> getLogList (int rank);
	
	/* -- story page -------------------------------------*/
	
		// main
	
		List<Tour_log> getLogList (int rank);
		List<Tour_plan> getPlanList (int rank);
		
		// log 
		
		List<Tour_log> getLogList();
		List<Tour_log> getLogList(int page);
		List<Tour_log> getLogList(int page, String field);
		
		
		// plan
	
		List<Tour_plan> getPlanList();
		List<Tour_plan> getPlanList(int page);
		List<Tour_plan> getPlanList(int page, String field);	
		
	/* -- my page -------------------------------------*/
		
		// main
		List<Tour_plan> getPlanList(String field); //내 지도
		List<Tour_log> getLogList (int rank); //내 기록
		List<Tour_plan> getPlanList (int rank); //내 계획
		
		// log 
		
		List<Tour_log> getLogList();
		List<Tour_log> getLogList(int page);
		List<Tour_log> getLogList(int page, String field);
				
				
		// plan
			
		List<Tour_plan> getPlanList();
		List<Tour_plan> getPlanList(int page);
		List<Tour_plan> getPlanList(int page, String field);
		
		// friends
		
		List<Friend> getFriendList();
		List<Friend> getFriendList(int page);
		List<Friend> getFriendList(int page, String field, String query);	
		
		//scrap 
		
			//loc
			
			List<Loc> getLocList();
			List<Loc> getLocList(int page);
			
			//log 동일
			
			//plan 동일
}
