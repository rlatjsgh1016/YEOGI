package com.yeogi.jspweb.dao;

import java.util.List;

//자호
public interface TPlanModAuthDao {
	int insert(TPlanModAuthDao tourPlanModAuth);
	int update(TPlanModAuthDao tourPlanModAuth);
	int delete(String tPlanId, String friendId);
	
	TPlanModAuthDao get(String tPlanId, String friendId);
	/*잘모름*/
	List<TPlanModAuthDao> getList(String tPlanId);
}
