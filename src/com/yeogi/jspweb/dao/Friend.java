package com.yeogi.jspweb.dao;

import java.util.List;

public interface FriendDao {
	List<Friend> getList(String mId);
	int insert(Friend frd);
	int update(Friend frd);
	int delete(String id);
}
