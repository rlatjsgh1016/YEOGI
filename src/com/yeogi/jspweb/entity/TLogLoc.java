package com.yeogi.jspweb.entity;

import java.sql.Date;

public class TLogLoc {
	private String locId;
	private String id;
	private String tLogId;
	private Date regDate;
	private String myLocId;
	private int order;
	public TLogLoc() {

	}
	public TLogLoc(String locId, String id, String tLogId, Date regDate, String myLocId, int order) {
		
		this.locId = locId;
		this.id = id;
		this.tLogId = tLogId;
		this.regDate = regDate;
		this.myLocId = myLocId;
		this.order = order;
	}
	public TLogLoc(String locId, String tLogId, String myLocId, int order) {
		
		this.locId = locId;
		this.tLogId = tLogId;
		this.myLocId = myLocId;
		this.order = order;
	}
	public String getLocId() {
		return locId;
	}
	public void setLocId(String locId) {
		this.locId = locId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String gettLogId() {
		return tLogId;
	}
	public void settLogId(String tLogId) {
		this.tLogId = tLogId;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getMyLocId() {
		return myLocId;
	}
	public void setMyLocId(String myLocId) {
		this.myLocId = myLocId;
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	
}
