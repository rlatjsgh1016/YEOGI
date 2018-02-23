
package com.yeogi.jspweb.entity;

import java.sql.Date;

public class Friend {
	private String id;
	private String myId;
	private Date reqDate;
	private String acceptYN;
	private String friendId;
	public Friend() {

	}
	public Friend(String id, String myId, Date reqDate, String acceptYN, String friendId) {
		this.id = id;
		this.myId = myId;
		this.reqDate = reqDate;
		this.acceptYN = acceptYN;
		this.friendId = friendId;
	}
	public Friend(String myId, String friendId) {
		this.myId = myId;
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
	public String getAcceptYN() {
		return acceptYN;
	}
	public void setAcceptYN(String acceptYN) {
		this.acceptYN = acceptYN;
	}
	public String getFriendId() {
		return friendId;
	}
	public void setFriendId(String friendId) {
		this.friendId = friendId;
	}
}
