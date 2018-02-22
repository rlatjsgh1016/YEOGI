package com.yeogi.jspweb.dao;

import java.util.List;


import com.yeogi.jspweb.entity.Commu_Post_Cmt;

	public interface Commu_Post_CmtDao {
		
		List<Commu_Post_Cmt> getList();

		public int delete(String id );
		public int insert(Commu_Post_Cmt cpc);
		public int update(Commu_Post_Cmt cpc);
		
}