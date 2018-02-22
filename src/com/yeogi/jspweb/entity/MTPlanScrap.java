package com.yeogi.jspweb.entity;

import java.util.Date;

public class MTPlanScrap {
	private String mId;
	private String tPlanId;
<<<<<<< HEAD
	private String scrapDate;	
	
=======
	private Date scrapDate;	
>>>>>>> refs/remotes/origin/master
	
	public MTPlanScrap() {
		// TODO Auto-generated constructor stub
	}

	
<<<<<<< HEAD
	public MTPlanScrap(String mId, String tPlanId, String scrapDate) {
=======
	public MTPlanScrap(String mId, String tPlanId, Date scrapDate) {
>>>>>>> refs/remotes/origin/master
		super();
		this.mId = mId;
		this.tPlanId = tPlanId;
		this.scrapDate = scrapDate;
	}


	public String getmId() {
		return mId;
	}


	public void setmId(String mId) {
		this.mId = mId;
	}


	public String gettPlanId() {
		return tPlanId;
	}


	public void settPlanId(String tPlanId) {
		this.tPlanId = tPlanId;
	}


<<<<<<< HEAD
	public String getScrapDate() {
=======
	public Date getScrapDate() {
>>>>>>> refs/remotes/origin/master
		return scrapDate;
	}


<<<<<<< HEAD
	public void setScrapDate(String scrapDate) {
=======
	public void setScrapDate(Date scrapDate) {
>>>>>>> refs/remotes/origin/master
		this.scrapDate = scrapDate;
	}
	

}
