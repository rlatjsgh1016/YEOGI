package com.yeogi.jspweb.entity;

public class TLogPostSpd {
	private String type;
	private String spdContent;
	private String unit;
	private int amount;
	private String id;
	private String tLogPostId;
	public TLogPostSpd() {

	}
	public TLogPostSpd(String type, String spdContent, String unit, int amount, String id, String tLogPostId) {
		
		this.type = type;
		this.spdContent = spdContent;
		this.unit = unit;
		this.amount = amount;
		this.id = id;
		this.tLogPostId = tLogPostId;
	}
	public TLogPostSpd(String type, String spdContent, String unit, int amount, String tLogPostId) {
		
		this.type = type;
		this.spdContent = spdContent;
		this.unit = unit;
		this.amount = amount;
		this.tLogPostId = tLogPostId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSpdContent() {
		return spdContent;
	}
	public void setSpdContent(String spdContent) {
		this.spdContent = spdContent;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String gettLogPostId() {
		return tLogPostId;
	}
	public void settLogPostId(String tLogPostId) {
		this.tLogPostId = tLogPostId;
	}
	
}
