package com.yeogi.jspweb.entity;

import java.util.Date;

public class TourPlan {
	private String Id;
	private String Title;
	private Date StartDate;
	private Date EndDate;
	private int Companion;
	private int Period;
	private Date RegDate;
	private String LastModDate;
	private String MId;
	private String TTheme;
	
	public TourPlan(String id, String title, Date startDate, Date endDate, int companion, int period, Date regDate,
			String lastModDate, String mId, String tTheme) {
		super();
		Id = id;
		Title = title;
		StartDate = startDate;
		EndDate = endDate;
		Companion = companion;
		Period = period;
		RegDate = regDate;
		LastModDate = lastModDate;
		MId = mId;
		TTheme = tTheme;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	public Date getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}

	public int getCompanion() {
		return Companion;
	}

	public void setCompanion(int companion) {
		Companion = companion;
	}

	public int getPeriod() {
		return Period;
	}

	public void setPeriod(int period) {
		Period = period;
	}

	public Date getRegDate() {
		return RegDate;
	}

	public void setRegDate(Date regDate) {
		RegDate = regDate;
	}

	public String getLastModDate() {
		return LastModDate;
	}

	public void setLastModDate(String lastModDate) {
		LastModDate = lastModDate;
	}

	public String getMId() {
		return MId;
	}

	public void setMId(String mId) {
		MId = mId;
	}

	public String getTTheme() {
		return TTheme;
	}

	public void setTTheme(String tTheme) {
		TTheme = tTheme;
	}
	
	
	
	
	
}
