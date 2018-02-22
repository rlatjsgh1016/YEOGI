package com.yeogi.jspweb.entity;

import java.util.Date;

public class TLogModAuth {
	private char acceptYN;
	private String tLogId;
	private String friendId;
	private Date reqDate;
	public TLogModAuth() {

	}
	public TLogModAuth(char acceptYN, String tLogId, String friendId, Date reqDate) {
		
		this.acceptYN = acceptYN;
		this.tLogId = tLogId;
		this.friendId = friendId;
		this.reqDate = reqDate;
	}
	
	public TLogModAuth(char acceptYN, String tLogId, String friendId) {
		
		this.acceptYN = acceptYN;
		this.tLogId = tLogId;
		this.friendId = friendId;
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
