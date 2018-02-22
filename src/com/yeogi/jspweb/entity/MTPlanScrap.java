package com.yeogi.jspweb.entity;

public class MTPlanScrap {
	private String mId;
	private String tPlanId;
	private String scrapDate;	
	
	
	public MTPlanScrap() {
		// TODO Auto-generated constructor stub
	}

	
	public MTPlanScrap(String mId, String tPlanId, String scrapDate) {
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


	public String getScrapDate() {
		return scrapDate;
	}


	public void setScrapDate(String scrapDate) {
		this.scrapDate = scrapDate;
	}
	
	

}
