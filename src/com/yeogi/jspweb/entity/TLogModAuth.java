package com.yeogi.jspweb.entity;

import java.util.Date;

public class TLogModAuth {
	private char acceptYN;
	private String tLogId;
	private String friendId;
	private Date reqDate;
	public TLogModAuth(char acceptYN, String tLogId, String friendId, Date reqDate) {
		super();
		this.acceptYN = acceptYN;
		this.tLogId = tLogId;
		this.friendId = friendId;
		this.reqDate = reqDate;
	}
	public char getAcceptYN() {
		return acceptYN;
	}
	public void setAcceptYN(char acceptYN) {
		this.acceptYN = acceptYN;
	}
	public String gettLogId() {
		return tLogId;
	}
	public void settLogId(String tLogId) {
		this.tLogId = tLogId;
	}
	public String getFriendId() {
		return friendId;
	}
	public void setFriendId(String friendId) {
		this.friendId = friendId;
	}
	public Date getReqDate() {
		return reqDate;
	}
	public void setReqDate(Date reqDate) {
		this.reqDate = reqDate;
	}
	
}
