package com.yeogi.jspweb.entity;

import java.util.Date;

public class TPlanModAuth {
	private String tPlanId;
	private String friendId;
	private char acceptYN;
	private Date regDate;
	
	
	public TPlanModAuth() {
		// TODO Auto-generated constructor stub
	}
	

	public TPlanModAuth(String tPlanId, String friendId, char acceptYN, Date regDate) {
		super();
		this.tPlanId = tPlanId;
		this.friendId = friendId;
		this.acceptYN = acceptYN;
		this.regDate = regDate;
	}


	public String gettPlanId() {
		return tPlanId;
	}


	public void settPlanId(String tPlanId) {
		this.tPlanId = tPlanId;
	}


	public String getFriendId() {
		return friendId;
	}


	public void setFriendId(String friendId) {
		this.friendId = friendId;
	}


	public char getAcceptYN() {
		return acceptYN;
	}


	public void setAcceptYN(char acceptYN) {
		this.acceptYN = acceptYN;
	}


	public Date getRegDate() {
		return regDate;
	}


	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	
	
}
