package com.yeogi.jspweb.dao;

import java.util.List;

public interface NationDao {

	List<Nation> getList();

	int delete(String id);

}
