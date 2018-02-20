package com.yeogi.jspweb.entity;

public class MyLoc {
	private String id;
	private String address;
	private String name;
	public MyLoc(String id, String address, String name) {
		super();
		this.id = id;
		this.address = address;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
