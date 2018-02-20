package com.yeogi.jspweb.entity;

public class TLogNation {
	private String tLogId;
	private String nation;
	public TLogNation(String tLogId, String nation) {
		super();
		this.tLogId = tLogId;
		this.nation = nation;
	}
	public String gettLogId() {
		return tLogId;
	}
	public void settLogId(String tLogId) {
		this.tLogId = tLogId;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	
}
