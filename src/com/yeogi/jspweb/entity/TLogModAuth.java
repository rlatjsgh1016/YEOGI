package com.yeogi.jspweb.entity;

import java.sql.Date;

public class TLogModAuth {
	private String acceptYN;
	private String tLogId;
	private String friendId;
	private Date reqDate;
	public TLogModAuth() {

	}
	public TLogModAuth(String acceptYN, String tLogId, String friendId, Date reqDate) {
		
		this.acceptYN = acceptYN;
		this.tLogId = tLogId;
		this.friendId = friendId;
		this.reqDate = reqDate;
	}
	
	public TLogModAuth(String acceptYN, String tLogId, String friendId) {
		
		this.acceptYN = acceptYN;
		this.tLogId = tLogId;
		this.friendId = friendId;
	}
	public String getAcceptYN() {
		return acceptYN;
	}
	public void setAcceptYN(String acceptYN) {
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
