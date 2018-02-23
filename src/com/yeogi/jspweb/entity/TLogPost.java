package com.yeogi.jspweb.entity;

public class TLogPost {
	private String content;
	private String tLogId;
	private String tLogLocId;
	private String trans;
	private String id;
	public TLogPost() {

	}
	public TLogPost(String content, String tLogId, String tLogLocId, String trans, String id) {
		
		this.content = content;
		this.tLogId = tLogId;
		this.tLogLocId = tLogLocId;
		this.trans = trans;
		this.id = id;
	}
	
	public TLogPost(String content, String tLogId, String tLogLocId, String trans) {
		
		this.content = content;
		this.tLogId = tLogId;
		this.tLogLocId = tLogLocId;
		this.trans = trans;
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
	public String gettLogLocId() {
		return tLogLocId;
	}
	public void settLogLocId(String tLogLocId) {
		this.tLogLocId = tLogLocId;
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
	
}
