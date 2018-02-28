package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.Commu_Post;
import com.yeogi.jspweb.entity.Commu_Post_Img;

	public interface Commu_PostDao {
		
		List<Commu_Post> getList();

		public int delete(String id );
		public int insert(Commu_Post cp);
		public int update(Commu_Post cp);

		
		
}