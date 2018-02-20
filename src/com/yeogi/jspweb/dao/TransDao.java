package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.Transport;

public interface TransDao {

	List<Transport> getList();

	int delete(String id);

}
