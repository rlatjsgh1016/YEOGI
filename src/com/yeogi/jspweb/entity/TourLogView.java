package com.yeogi.jspweb.entity;

import java.sql.Date;
import java.sql.Timestamp;

public class TourLogView extends TourLog {
	
	private String nation;
	
	public TourLogView() {

	}
	public TourLogView(String id, String title, String memo, String subTitle, String coverImg, String lockYN, Date regDate,
			int period, Date startDate, int companion, String mid, Timestamp lastModDate, int hit, String tTheme,
			Date endDate, String nation) {
		
		super(id, title, memo, subTitle, coverImg, lockYN, regDate, period, startDate, companion, mid, lastModDate, hit, tTheme, endDate);
		this.nation = nation;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	
}
