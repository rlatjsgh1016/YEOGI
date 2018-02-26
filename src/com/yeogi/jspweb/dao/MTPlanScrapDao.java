package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.MTPlanScrap;

//자호
public interface MTPlanScrapDao {
	int insert(MTPlanScrap memTourPlanScrap);
	/*int update(MTPlanScrap memTourPlanScrap);*/
	int delete(String mId, String tPlanId);
	
	MTPlanScrap get(String mId, String tPlanId);
	
	/*잘모름 -> 회원이 스크랩한 것만 가져오겠다고 하면 mId만 보내면 되나? tPlanId는 필요x?*/
	List<MTPlanScrap> getList(String mId);
}
