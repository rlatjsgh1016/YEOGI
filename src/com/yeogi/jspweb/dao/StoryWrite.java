package com.yeogi.jspweb.dao;

import java.util.List;

public interface StoryWrite {
	List<Friend> getList(String mId);
	int insert(Friend frd);
	int update(Friend frd);
	
	List<MLocScrap> getList(String mId);
	int insert(MLocScrap mls);
	int update(MLocScrap mls);
	
	List<Loc> getList();
	int insert(Loc loc);
	int update(Loc loc);
	
	List<MyLoc> getList();
	int insert(MyLoc mLoc);
	int update(MyLoc mLoc);
	
	List<TLogLocList> getList(TourLog tourLog);
	int insert(TLocLocList tlll);
	int update(TLocLocList tlll);
	
	List<TLogModAuthList> getList(TourLog tourLog);
	int insert(TLogModAuthList tlmal);
	int update(TLogModAuthList tlmal);
	
	List<TLogNationList> getList(TourLog tourLog);
	int insert(TLogNationList tlnl);
	int update(TLogNationList tlnl);
	
	List<DTLogLocList> getList(Day day);
	int insert(DTLogLocList dtlll);
	int update(DTLogLocList dtlll);
		
	List<TLogPost> getList(TourLog tourLog, TLogLocList tLogLocList);
	int insert(TLogPost tlp);
	int update(TLogPost tlp);
	
	List<Tag> getList(String tLogPostId);
	int insert(Tag tag);
	int update(Tag tag);
	
	List<TLogPostImgList> getList(String tLogPostId);
	int insert(TLogPostImgList tlpil);
	int update(TLogPostImgList tlpil);
	
	List<TLogPostSpdList> getList(String tLogPostId);
	int insert(TLogPostSpdList tlpsl);
	int update(TLogPostSpdList tlpsl);
	
	List<Trans> getList();
	List<TTheme> getList();
	List<Day> getList();
	List<Nation> getList();
	
	Member get(String id);
	TourLog get(String id);
	
	int delete(String id);
}
