package com.yeogi.jspweb.dao;


import java.sql.SQLException;
import java.util.List;

import com.yeogi.jspweb.entity.Friend;


import java.util.List;

import com.yeogi.jspweb.entity.Friend;

public interface FriendDao {
	List<Friend> getList(String mId);
	int insert(Friend friend);
	int update(Friend friend);
	int delete(String id);

}
