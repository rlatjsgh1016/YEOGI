package com.yeogi.jspweb.entity;

import java.sql.Date;

public class TLogCmtView extends TLogCmt {
	
	private int count;
	
	public TLogCmtView() {
		
	}

	public TLogCmtView(String id, String tLogId, String mId, String pId, Date regDate, String content,String lockYN, int count) {
		super(id, tLogId, mId, pId, regDate, content, lockYN);
		
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
