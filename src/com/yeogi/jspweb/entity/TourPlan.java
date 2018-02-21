package com.yeogi.jspweb.entity;

import java.util.Date;

public class TourPlan {
	private String id;
	private String title;
	private Date startDate;
	private Date endDate;
	private int companion; 
	private int period;
	private Date regDate;
	private String lastModDate;
	private String mId;
	private String tTheme;
	
	public TourPlan() {
		// TODO Auto-generated constructor stub
	}
	
	public TourPlan(String id, String title, Date startDate, Date endDate, int companion, int period, Date regDate,
			String lastModDate, String mId, String tTheme) {
		super();
		this.id = id;
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
		this.companion = companion;
		this.period = period;
		this.regDate = regDate;
		this.lastModDate = lastModDate;
		this.mId = mId;
		this.tTheme = tTheme;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getCompanion() {
		return companion;
	}

	public void setCompanion(int companion) {
		this.companion = companion;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getLastModDate() {
		return lastModDate;
	}

	public void setLastModDate(String lastModDate) {
		this.lastModDate = lastModDate;
	}

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String gettTheme() {
		return tTheme;
	}

	public void settTheme(String tTheme) {
		this.tTheme = tTheme;
	}
	
	
	
	
}
