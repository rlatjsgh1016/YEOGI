package com.yeogi.jspweb.entity;

public class TPlanPostSpdView extends TPlanPostSpd{
	
	private String tourDateTime;
	private String memoTitle;
	private String memoContent; 
	
	public TPlanPostSpdView() {
		
	}

	public TPlanPostSpdView(
			String id,
			String tPlanLocId,
			String tPlanId,
			String type,
			String content,
			String unit,
			String amount,
			String tourDateTime,
			String memoTitle,
			String memoContent) {
		super(
				id,
				tPlanLocId,
				tPlanId,
				type,
				content,
				unit,
				amount);
		this.memoContent = memoContent;
		this.memoTitle = memoTitle;
		this.tourDateTime =tourDateTime;
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
