package com.yeogi.jspweb.entity;

public class MyLoc {
	private String id;
	private String addr;
	private String name;
	
	public MyLoc(){
		
	}
	
	public MyLoc(String id, String addr, String name){
		this.id = id;
		this.addr = addr;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
