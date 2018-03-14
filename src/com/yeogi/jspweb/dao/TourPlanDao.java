package com.yeogi.jspweb.dao;

import java.util.Date;
import java.util.List;

import com.yeogi.jspweb.entity.TourPlan;
//자호
public interface TourPlanDao {

	int insert(TourPlan tourPlan);
	int update(TourPlan tourPlan);
	int delete(String id);
	
	/*Tourplan 관련된 내용을 쓸 수 있도록 준비, get, getList*/
	TourPlan get(String id);
	List<TourPlan> getList();
	
	
	
	/*List<TourPlanView> getList();
	TourPlanView get(String id);*/
	

	/*Tourplan getTourplan(String id);
	

	List<Location> getLocation();
	List<Location> getLocation(String query);
	
	List<PlanModifyList> getModifyFriend();
	List<Post> getPost(String id);
	List<LocationList> getLocationList(int day);
	List<PostSpendList> getSpendList();*/
	
	
	
	
}
