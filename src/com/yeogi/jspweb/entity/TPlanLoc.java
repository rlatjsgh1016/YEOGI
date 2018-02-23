package com.yeogi.jspweb.entity;

import java.sql.Date;

public class TPlanLoc {
	private String id;
	private String myLocId;
	private String tPlanId;
	private String locId;
	private Date regDate;
	
	public TPlanLoc() {
		// TODO Auto-generated constructor stub
	}

	public TPlanLoc(String id, String myLocId, String tPlanId, String locId, Date regDate) {
		super();
		this.id = id;
		this.myLocId = myLocId;
		this.tPlanId = tPlanId;
		this.locId = locId;
		this.regDate = regDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMyLocId() {
		return myLocId;
	}

	public void setMyLocId(String myLocId) {
		this.myLocId = myLocId;
	}

	public String getTPlanId() {
		return tPlanId;
	}

	public void setTPlanId(String tPlanId) {
		this.tPlanId = tPlanId;
	}

	public String getLocId() {
		return locId;
	}

	public void setLocId(String locId) {
		this.locId = locId;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	
	
	
	
}
