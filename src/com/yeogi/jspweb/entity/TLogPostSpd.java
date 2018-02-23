package com.yeogi.jspweb.entity;

public class TLogPostSpd {
	private String type;
	private String content;
	private String unit;
	private int amount;
	private String id;
	private String tLogPostId;
	public TLogPostSpd() {

	}
	public TLogPostSpd(String type, String content, String unit, int amount, String id, String tLogPostId) {
		
		this.type = type;
		this.content = content;
		this.unit = unit;
		this.amount = amount;
		this.id = id;
		this.tLogPostId = tLogPostId;
	}
	public TLogPostSpd(String type, String content, String unit, int amount, String tLogPostId) {
		
		this.type = type;
		this.content = content;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
