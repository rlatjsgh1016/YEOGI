package com.yeogi.jspweb.entity;

public class TLogPostSpdView extends TLogPostSpd {
	private String tLogId;
	private int sum;
	
	public TLogPostSpdView() {

	}
	public TLogPostSpdView(
			String type, 
			String spdContent, 
			String unit, 
			int amount, 
			String id, 
			String tLogPostId, 
			String tLogId
			) 
	{
		super(type, spdContent, unit, amount, id, tLogPostId);
		this.tLogId = tLogId;
	}
	public TLogPostSpdView(String tLogId, String type, int sum) {
		super.setType(type);
		this.tLogId = tLogId;
		this.sum = sum;
	}
	
	public String gettLogId() {
		return tLogId;
	}
	public void settLogId(String tLogId) {
		this.tLogId = tLogId;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	
}
