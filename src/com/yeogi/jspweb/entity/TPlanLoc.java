package com.yeogi.jspweb.entity;

import java.util.Date;

public class TPlanLoc {
	private String Id;
	private String MyLocId;
	private String TPlanId;
	private String LocId;
	private Date RegDate;
	public TPlanLoc(String id, String myLocId, String tPlanId, String locId, Date reqDate) {
		super();
		Id = id;
		MyLocId = myLocId;
		TPlanId = tPlanId;
		LocId = locId;
		RegDate = reqDate;
	}
	
	public TPlanLoc() {
	}
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getMyLocId() {
		return MyLocId;
	}
	public void setMyLocId(String myLocId) {
		MyLocId = myLocId;
	}
	public String getTPlanId() {
		return TPlanId;
	}
	public void setTPlanId(String tPlanId) {
		TPlanId = tPlanId;
	}
	public String getLocId() {
		return LocId;
	}
	public void setLocId(String locId) {
		LocId = locId;
	}
	public Date getReqDate() {
		return RegDate;
	}
	public void setReqDate(Date regDate) {
		RegDate = regDate;
	}
	
	
	
}
