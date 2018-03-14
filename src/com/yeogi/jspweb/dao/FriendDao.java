package com.yeogi.jspweb.dao;


import java.sql.SQLException;
import java.util.List;

import com.yeogi.jspweb.entity.Friend;


import java.util.List;

import com.yeogi.jspweb.entity.Friend;

public interface FriendDao {
	List<Friend> getList(String mId);
	List<Friend> getList2(String mId);
	int insert(Friend friend) throws ClassNotFoundException, SQLException;
	int update(Friend friend) throws ClassNotFoundException, SQLException;
	int delete(String id);
	Friend get(String id);
	List<Friend> getList();
	int accept(String fid) throws ClassNotFoundException, SQLException;

}
