package com.yeogi.jspweb.entity;

public class TPlanPost {
	private String TPlanId;
	private String TPlanLocId;
	private String TourDateTime;
	private String MemoTitle;
	private String MemoContent;
	
	public TPlanPost() {
		// TODO Auto-generated constructor stub
	}
	public TPlanPost(String tPlanId, String tPlanLocId, String tourDateTime, String memoTitle, String memoContent) {
		super();
		TPlanId = tPlanId;
		TPlanLocId = tPlanLocId;
		TourDateTime = tourDateTime;
		MemoTitle = memoTitle;
		MemoContent = memoContent;
	}
	public String getTPlanId() {
		return TPlanId;
	}
	public void setTPlanId(String tPlanId) {
		TPlanId = tPlanId;
	}
	public String getTPlanLocId() {
		return TPlanLocId;
	}
	public void setTPlanLocId(String tPlanLocId) {
		TPlanLocId = tPlanLocId;
	}
	public String getTourDateTime() {
		return TourDateTime;
	}
	public void setTourDateTime(String tourDateTime) {
		TourDateTime = tourDateTime;
	}
	public String getMemoTitle() {
		return MemoTitle;
	}
	public void setMemoTitle(String memoTitle) {
		MemoTitle = memoTitle;
	}
	public String getMemoContent() {
		return MemoContent;
	}
	public void setMemoContent(String memoContent) {
		MemoContent = memoContent;
	}
	
	
	
	
	
	
}
