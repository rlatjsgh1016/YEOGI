package com.yeogi.jspweb.entity;

public class TLogPostSpd {
	private String type;
	private String content;
	private char unit;
	private int amount;
	private String id;
	private String tLogPostId;
	public TLogPostSpd(String type, String content, char unit, int amount, String id, String tLogPostId) {
		super();
		this.type = type;
		this.content = content;
		this.unit = unit;
		this.amount = amount;
		this.id = id;
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
	public char getUnit() {
		return unit;
	}
	public void setUnit(char unit) {
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
