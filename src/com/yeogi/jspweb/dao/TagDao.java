package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.Tag;
import com.yeogi.jspweb.entity.TagView;

public interface TagDao {

	List<TagView> getList(String tLogId);
	List<TagView> getPostIdList(String tLogPostId);

	int insert(Tag tag);

	int delete(String id);

}
