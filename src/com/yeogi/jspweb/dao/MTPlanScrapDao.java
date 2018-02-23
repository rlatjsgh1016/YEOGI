package com.yeogi.jspweb.dao;

import java.util.List;

//자호
public interface MTPlanScrapDao {
	int insert(MTPlanScrapDao memTourPlanScrap);
	int update(MTPlanScrapDao memTourPlanScrap);
	int delete(String mId, String tPlanId);
	
	MTPlanScrapDao get(String mId, String tPlanId);
	
	/*잘모름 -> 회원이 스크랩한 것만 가져오겠다고 하면 mId만 보내면 되나? tPlanId는 필요x?*/
	List<MTPlanScrapDao> getList(String mId);
}
