package com.yeogi.jspweb.entity;

import java.util.Date;

public class TPlanModAuth {
	private String TPlanId;
	private String FriendId;
	private char acceptYN;
	private Date reqDate;
	public TPlanModAuth(String tPlanId, String friendId, char acceptYN, Date reqDate) {
		super();
		TPlanId = tPlanId;
		FriendId = friendId;
		this.acceptYN = acceptYN;
		this.reqDate = reqDate;
	}
	public String getTPlanId() {
		return TPlanId;
	}
	public void setTPlanId(String tPlanId) {
		TPlanId = tPlanId;
	}
	public String getFriendId() {
		return FriendId;
	}
	public void setFriendId(String friendId) {
		FriendId = friendId;
	}
	public char getAcceptYN() {
		return acceptYN;
	}
	public void setAcceptYN(char acceptYN) {
		this.acceptYN = acceptYN;
	}
	public Date getReqDate() {
		return reqDate;
	}
	public void setReqDate(Date reqDate) {
		this.reqDate = reqDate;
	}
	
	

}
