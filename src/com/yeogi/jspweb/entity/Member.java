
package com.yeogi.jspweb.entity;

import java.sql.Date;

public class Member {
	private String id;
	private String name;
	private String email;
	private String pwd;
	private String phone;
	private Date birthday;
	private String adminYN;
	public Member() {

	}
	public Member(String id, String name, String email, String pwd, String phone, Date birthday, String adminYN) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.pwd = pwd;
		this.phone = phone;
		this.birthday = birthday;
		this.adminYN = adminYN;
	}
	
	public Member(String name, String email, String pwd, String phone, Date birthday) {
		
		this.name = name;
		this.email = email;
		this.pwd = pwd;
		this.phone = phone;
		this.birthday = birthday;
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
	public String getAdminYN() {
		return adminYN;
	}
	public void setAdminYN(String adminYN) {
		this.adminYN = adminYN;
	}
	
	
}
