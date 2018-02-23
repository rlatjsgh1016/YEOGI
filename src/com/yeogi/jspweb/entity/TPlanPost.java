package com.yeogi.jspweb.entity;

public class TPlanPost {
	private String tPlanId;
	private String tPlanLocId;
	private String tourDateTime;
	private String memoTitle;
	private String memoContent;
	
	public TPlanPost() {
		// TODO Auto-generated constructor stub
	}

	public TPlanPost(String tPlanId, String tPlanLocId, String tourDateTime, String memoTitle, String memoContent) {
		super();
		this.tPlanId = tPlanId;
		this.tPlanLocId = tPlanLocId;
		this.tourDateTime = tourDateTime;
		this.memoTitle = memoTitle;
		this.memoContent = memoContent;
	}

	public String getTPlanId() {
		return tPlanId;
	}

	public void setTPlanId(String tPlanId) {
		this.tPlanId = tPlanId;
	}

	public String getTPlanLocId() {
		return tPlanLocId;
	}

	public void setTPlanLocId(String tPlanLocId) {
		this.tPlanLocId = tPlanLocId;
	}

	public String getTourDateTime() {
		return tourDateTime;
	}

	public void setTourDateTime(String tourDateTime) {
		this.tourDateTime = tourDateTime;
	}

	public String getMemoTitle() {
		return memoTitle;
	}

	public void setMemoTitle(String memoTitle) {
		this.memoTitle = memoTitle;
	}

	public String getMemoContent() {
		return memoContent;
	}

	public void setMemoContent(String memoContent) {
		this.memoContent = memoContent;
	}
	
	
	
	
	
	
	
}
