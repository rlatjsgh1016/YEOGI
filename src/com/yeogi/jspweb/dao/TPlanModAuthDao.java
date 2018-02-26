package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.TPlanModAuth;

//자호
public interface TPlanModAuthDao {
	int insert(TPlanModAuth tourPlanModAuth);
	/*int update(TPlanModAuth tourPlanModAuth);*/
	int delete(String tPlanId, String friendId);
	
	TPlanModAuth get(String tPlanId, String friendId);
	/*잘모름*/
	List<TPlanModAuth> getList(String tPlanId);
}
