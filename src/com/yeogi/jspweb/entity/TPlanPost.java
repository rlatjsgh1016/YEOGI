package com.yeogi.jspweb.entity;

public class TPlanPost {
	private String TPlanId;
	private String TPlanLocId;
	private String TourDate;
	private String MemoTitle;
	private String MemoContent;
	public TPlanPost(String tPlanId, String tPlanLocId, String tourDate, String memoTitle, String memoContent) {
		super();
		TPlanId = tPlanId;
		TPlanLocId = tPlanLocId;
		TourDate = tourDate;
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
	public String getTourDate() {
		return TourDate;
	}
	public void setTourDate(String tourDate) {
		TourDate = tourDate;
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
