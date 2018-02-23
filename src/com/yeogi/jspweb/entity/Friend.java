package com.yeogi.jspweb.entity;

import java.sql.Date;

public class Friend {

	private String id;
	private String myId;
	private Date reqDate;
	private String acceptYn;
	private String friendId;
	
	public Friend(){
		
	}
	
	public Friend(String id, String myId, Date reqDate, String acceptYn, String friendId){
		this.id =id;
		this.myId = myId;
		this.reqDate = reqDate;
		this.acceptYn = acceptYn;
		this.friendId = friendId;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMyId() {
		return myId;
	}
	public void setMyId(String myId) {
		this.myId = myId;
	}
	public Date getReqDate() {
		return reqDate;
	}
	public void setReqDate(Date reqDate) {
		this.reqDate = reqDate;
	}
	public String getAcceptYn() {
		return acceptYn;
	}
	public void setAcceptYn(String acceptYn) {
		this.acceptYn = acceptYn;
	}
	public String getFriendId() {
		return friendId;
	}
	public void setFriendId(String friendId) {
		this.friendId = friendId;
	}
	
	
	
}
