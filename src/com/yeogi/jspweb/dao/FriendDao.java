package com.yeogi.jspweb.dao;

import java.sql.SQLException;
import java.util.List;

import com.yeogi.jspweb.entity.Friend;

public interface FriendDao {
	//친구 추가, 수정, 삭제, 전체목록, 친구 단일
	
	int insert(Friend friend) throws ClassNotFoundException, SQLException;
	int update(Friend friend) throws ClassNotFoundException, SQLException;
	int delete(String id);
	
	Friend get(String id);
	List<Friend> getList();
	
	
	
}
