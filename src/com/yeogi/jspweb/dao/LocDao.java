package com.yeogi.jspweb.dao;

import java.util.List;

public interface LocDao {

	List<Loc> getList();

	int insert(Loc loc);

	int update(Loc loc);

	int delete(String id);

}
