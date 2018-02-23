package com.yeogi.jspweb.entity;

public class DayTLogLoc {
	private String id;
	private int day;
	private String tLogLocId;
	
	public DayTLogLoc() {
		
	}
	public DayTLogLoc(String id, int day, String tLogLocId) {
		this.id = id;
		this.day = day;
		this.tLogLocId = tLogLocId;
	}	
	public DayTLogLoc(int day, String tLogLocId) {
		this.day = day;
		this.tLogLocId = tLogLocId;
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
	public String gettLogLocId() {
		return tLogLocId;
	}
	public void settLogLocId(String tLogLocId) {
		this.tLogLocId = tLogLocId;
	}
	
	
}
