package com.yeogi.jspweb.dao;

import java.util.List;


import com.yeogi.jspweb.entity.Commu_Post_Img;

	public interface Commu_Post_ImgDao {
		
		List<Commu_Post_Img> getList();

		int delete(String id );
		int insert(Commu_Post_Img cpi);
		int update(Commu_Post_Img cpi);
		
}