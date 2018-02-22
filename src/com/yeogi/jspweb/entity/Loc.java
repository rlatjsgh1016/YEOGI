package com.yeogi.jspweb.entity;

public class Loc {
	private String id;
	private String name;
	private String nation;
	private String img;
	private String detail;
	private String address;
	private String type;
	public Loc() {

	}
	public Loc(String id, String name, String nation, String img, String detail, String address, String type) {
		
		this.id = id;
		this.name = name;
		this.nation = nation;
		this.img = img;
		this.detail = detail;
		this.address = address;
		this.type = type;
	}
	public Loc(String name, String nation, String img, String detail, String address, String type) {
		
		this.name = name;
		this.nation = nation;
		this.img = img;
		this.detail = detail;
		this.address = address;
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
