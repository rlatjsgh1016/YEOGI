package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.Loc;

public interface LocDao {

	List<Loc> getList();

	int insert(Loc loc);

	int update(Loc loc);

	int delete(String id);

}
