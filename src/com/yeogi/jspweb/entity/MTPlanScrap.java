package com.yeogi.jspweb.entity;

import java.sql.Date;

public class MTPlanScrap {
	private String mId;
	private String tPlanId;
	private Date scrapDate;	
	
	public MTPlanScrap() {
		// TODO Auto-generated constructor stub
	}

	public MTPlanScrap(String mId, String tPlanId, Date scrapDate) {
		super();
		this.mId = mId;
		this.tPlanId = tPlanId;
		this.scrapDate = scrapDate;
	}


	public String getmId() {
		return mId;
	}


	public void setmId(String mId) {
		this.mId = mId;
	}


	public String gettPlanId() {
		return tPlanId;
	}


	public void settPlanId(String tPlanId) {
		this.tPlanId = tPlanId;
	}

	public Date getScrapDate() {
		return scrapDate;
	}

	public void setScrapDate(Date scrapDate) {
		this.scrapDate = scrapDate;
	}
	

}
