package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.Commu_Post;

	public interface Commu_PostDao {
		
		List<Commu_Post> getList();

		int delete(String id );
		int insert(Commu_Post cp);
		int update(Commu_Post cp);
		
}
