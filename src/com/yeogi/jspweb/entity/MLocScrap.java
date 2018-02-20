package com.yeogi.jspweb.entity;

import java.util.Date;

public class MLocScrap {
	private String locId;
	private String mid;
	private Date scrapDate;
	public MLocScrap(String locId, String mid, Date scrapDate) {
		super();
		this.locId = locId;
		this.mid = mid;
		this.scrapDate = scrapDate;
	}
	public String getLocId() {
		return locId;
	}
	public void setLocId(String locId) {
		this.locId = locId;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public Date getScrapDate() {
		return scrapDate;
	}
	public void setScrapDate(Date scrapDate) {
		this.scrapDate = scrapDate;
	}
	
}
