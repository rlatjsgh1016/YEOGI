package com.yeogi.jspweb.entity;

import java.sql.Date;

public class TLogLoc {
	private String locId;
	private String id;
	private String tLogId;
	private Date regDate;
	public TLogLoc() {

	}
	public TLogLoc(String locId, String id, String tLogId, Date regDate) {
		
		this.locId = locId;
		this.id = id;
		this.tLogId = tLogId;
		this.regDate = regDate;
	}
	public TLogLoc(String locId, String tLogId) {
		
		this.locId = locId;
		this.tLogId = tLogId;
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
	
}
