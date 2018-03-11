package com.yeogi.jspweb.entity;

public class TLogPostView extends TLogPost {

	private String locId;
	private int order;
	private int day;
	private String name;
	private String img;
	
	public TLogPostView() {
		
	}
	
	public TLogPostView(
			String content, 
			String tLogId, 
			String tLogLocId, 
			String trans, 
			String id,  
			String locId, 
			int order, 
			int day, 
			String name, 
			String img
			) 
	{
		super(content, tLogId, tLogLocId, trans, id);
		this.locId = locId;
		this.order = order;
		this.day = day;
		this.name = name;
		this.img = img;
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
