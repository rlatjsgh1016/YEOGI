package com.yeogi.jspweb.entity;

import java.util.Date;

public class Member {
	private String id;
	private String name;
	private String email;
	private String pwd;
	private String phone;
	private Date birthday;
	private char adminYN;
	public Member(String id, String name, String email, String pwd, String phone, Date birthday, char adminYN) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.pwd = pwd;
		this.phone = phone;
		this.birthday = birthday;
		this.adminYN = adminYN;
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
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public char getAdminYN() {
		return adminYN;
	}
	public void setAdminYN(char adminYN) {
		this.adminYN = adminYN;
	}
	
	
}
