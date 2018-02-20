package com.yeogi.jspweb.dao;

import com.yeogi.jspweb.entity.Member;

public interface MemberDao {

	Member get(String id);

	int delete(String id);

}
