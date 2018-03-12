package com.yeogi.jspweb.entity;

public class TLogPost {
	private String content;
	private String tLogId;
	private String locId;
	private String trans;
	private String id;
	private int day;
	public TLogPost() {

	}
	public TLogPost(String content, String tLogId, String locId, String trans, String id, int day) {
		
		this.content = content;
		this.tLogId = tLogId;
		this.locId = locId;
		this.trans = trans;
		this.id = id;
		this.day = day;
	}
	
	public TLogPost(String content, String tLogId, String locId, String trans, int day) {
		
		this.content = content;
		this.tLogId = tLogId;
		this.locId = locId;
		this.trans = trans;
		this.day = day;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String gettLogId() {
		return tLogId;
	}
	public void settLogId(String tLogId) {
		this.tLogId = tLogId;
	}
	public String getLocId() {
		return locId;
	}
	public void setLocId(String locId) {
		this.locId = locId;
	}
	public String getTrans() {
		return trans;
	}
	public void setTrans(String trans) {
		this.trans = trans;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
}
