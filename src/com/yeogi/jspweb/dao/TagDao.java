package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.Tag;

public interface TagDao {

	List<Tag> getList(String tLogPostId);

	int insert(Tag tag);

	int update(Tag tag);

	int delete(String id);

}
