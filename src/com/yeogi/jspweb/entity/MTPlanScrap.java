package com.yeogi.jspweb.entity;

public class MTPlanScrap {
	private String MId;
	private String TPlanId;
	private char ScrapDate;
	public MTPlanScrap(String mId, String tPlanId, char scrapDate) {
		super();
		MId = mId;
		TPlanId = tPlanId;
		ScrapDate = scrapDate;
	}
	public String getMId() {
		return MId;
	}
	public void setMId(String mId) {
		MId = mId;
	}
	public String getTPlanId() {
		return TPlanId;
	}
	public void setTPlanId(String tPlanId) {
		TPlanId = tPlanId;
	}
	public char getScrapDate() {
		return ScrapDate;
	}
	public void setScrapDate(char scrapDate) {
		ScrapDate = scrapDate;
	}
	
	

}
