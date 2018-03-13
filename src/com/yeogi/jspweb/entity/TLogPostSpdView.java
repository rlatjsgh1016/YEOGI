package com.yeogi.jspweb.entity;

public class TLogPostSpdView extends TLogPostSpd {
	private String tLogId;
	public TLogPostSpdView() {

	}
	public TLogPostSpdView(
			String type, 
			String content, 
			String unit, 
			int amount, 
			String id, 
			String tLogPostId, 
			String tLogId
			) 
	{
		super(type, content, unit, amount, id, tLogPostId);
		this.tLogId = tLogId;
	}
	public String gettLogId() {
		return tLogId;
	}
	public void settLogId(String tLogId) {
		this.tLogId = tLogId;
	}
	
}
