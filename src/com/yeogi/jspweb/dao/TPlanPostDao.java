package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.TPlanPost;

public interface TPlanPostDao {
	int insert(TPlanPost tplanpost);
	int update(TPlanPost tplanpost);
	int delete(String idtPlanId,String tPlanLocId);
	
	List<TPlanPost> getList();
	TPlanPost get(String tourDateTime, String tPlanId,String tPlanLocId);
	
	//일정 카운트를 위한 
	int getCount();

}
