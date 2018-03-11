package com.yeogi.jspweb.dao;

import java.util.List;

import com.yeogi.jspweb.entity.Tag;
import com.yeogi.jspweb.entity.TagView;

public interface TagDao {

	List<TagView> getList(String tLogId);

	int insert(Tag tag);

	int update(Tag tag);

	int delete(String id);

}
