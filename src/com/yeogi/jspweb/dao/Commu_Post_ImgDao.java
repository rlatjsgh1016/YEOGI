package com.yeogi.jspweb.dao;

import java.util.List;


import com.yeogi.jspweb.entity.Commu_Post_Img;

	public interface Commu_Post_ImgDao {
		
		List<Commu_Post_Img> getList();

		public int delete(String id );
		public int insert(Commu_Post_Img cpi);
		public int update(Commu_Post_Img cpi);
		
}