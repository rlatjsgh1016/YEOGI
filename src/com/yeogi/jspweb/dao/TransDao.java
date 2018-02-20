package com.yeogi.jspweb.dao;

import java.util.List;

public interface TransDao {

	List<Trans> getList();

	int delete(String id);

}
