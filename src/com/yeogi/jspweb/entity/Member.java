package com.yeogi.jspweb.entity;

import java.util.Date;

public class Member {
	private String id;
	private String name;
	private String email;
	private String pwd;
	private String phone;
	private String birth;
	private String adminYn;

	public Member() {
		
	}
	
	public Member(String id, String name, String email, String pwd, String phone, String birth, String admin) {
		// TODO Auto-generated constructor stub
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.pwd = pwd;
		this.phone = phone;
		this.birth = birth;
		this.adminYn = admin;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getAdminYn() {
		return adminYn;
	}
	public void setAdminYn(String adminYn) {
		this.adminYn = adminYn;
	}
	
}
