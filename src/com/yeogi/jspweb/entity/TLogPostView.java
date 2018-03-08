package com.yeogi.jspweb.entity;

public class TLogPostView extends TLogPost {
	//T_LOG_POST_ID	VARCHAR2(13)
	//T_LOG_ID	VARCHAR2(13)
	//T_LOG_LOC_ID	VARCHAR2(13)
	//POST_CONTENT	VARCHAR2(4000)
	//TRANS	VARCHAR2(12)
	
	/*
	T_LOG_POST_SPD_ID	VARCHAR2(13)
	TYPE	VARCHAR2(12)
	SPD_CONTENT	VARCHAR2(100)
	UNIT	CHAR(3)
	AMOUNT	NUMBER(9)
	TAG_ID	VARCHAR2(13)
	TAG_CONTENT	VARCHAR2(100)
	LOC_ID	VARCHAR2(13)
	ORDER	NUMBER(2)
	DAY	NUMBER(2)
	NAME	VARCHAR2(18)
	IMG	VARCHAR2(500)
	*/
	private String tLogPostSpdId;
	private String type;
	private String spdContent;
	private String unit;
	private int amount;
	private String tagId;
	private String tagContent;
	private String locId;
	private int order;
	private int day;
	private String name;
	private String img;
	
	public TLogPostView() {
		
	}
	
	
	public TLogPostView(String content, String tLogId, String tLogLocId, String trans, String id, String tLogPostSpdId, String type, String spdContent, String unit, int amount, String tagId,
			String tagContent, String locId, int order, int day, String name, String img) {
		super(content, tLogId, tLogLocId, trans, id);
		this.tLogPostSpdId = tLogPostSpdId;
		this.type = type;
		this.spdContent = spdContent;
		this.unit = unit;
		this.amount = amount;
		this.tagId = tagId;
		this.tagContent = tagContent;
		this.locId = locId;
		this.order = order;
		this.day = day;
		this.name = name;
		this.img = img;
	}
	public String gettLogPostSpdId() {
		return tLogPostSpdId;
	}
	public void settLogPostSpdId(String tLogPostSpdId) {
		this.tLogPostSpdId = tLogPostSpdId;
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
	public String getTagId() {
		return tagId;
	}
	public void setTagId(String tagId) {
		this.tagId = tagId;
	}
	public String getTagContent() {
		return tagContent;
	}
	public void setTagContent(String tagContent) {
		this.tagContent = tagContent;
	}
	public String getLocId() {
		return locId;
	}
	public void setLocId(String locId) {
		this.locId = locId;
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	
}
