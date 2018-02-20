package com.yeogi.jspweb.dao;

public interface MemberDao {

	Member get(String id);

	int delete(String id);

}
