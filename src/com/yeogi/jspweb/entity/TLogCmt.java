package com.yeogi.jspweb.entity;

import java.sql.Date;

public class TLogCmt {
	
	private String id;
	private String tLogId;
	private String mId;
	private String pId;
	private Date regDate;
	private String content;
	private String lockYN;
	
	public TLogCmt() {
		// TODO Auto-generated constructor stub
	}

	public TLogCmt(String id, String tLogId, String mId, String pId, Date regDate, String content,String lockYN) {
		super();
		this.id = id;
		this.tLogId = tLogId;
		this.mId = mId;
		this.pId = pId;
		this.regDate = regDate;
		this.content = content;
	}
	
	public TLogCmt(String tLogId, String mId, String pId, Date regDate, String content,String lockYN) {	
		this.tLogId = tLogId;
		this.mId = mId;
		this.pId = pId;
		this.regDate = regDate;
		this.content = content;
	}

	public String getLockYN() {
		return lockYN;
	}

	public void setLockYN(String lockYN) {
		this.lockYN = lockYN;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String gettLogId() {
		return tLogId;
	}

	public void settLogId(String tLogId) {
		this.tLogId = tLogId;
	}

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String getpId() {
		return pId;
	}

	public void setpId(String pId) {
		this.pId = pId;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}
