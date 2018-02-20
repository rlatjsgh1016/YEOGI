package com.yeogi.jspweb.entity;

import java.util.Date;

public class TourLog {
	private String id;
	private String title;
	private String memo;
	private String subTitle;
	private String coverImg;
	private char lockYN;
	private Date regDate;
	private int period;
	private Date startDate;
	private int companion;
	private String mid;
	private Date lastModDate;
	private int hit;
	private String tTheme;
	private Date endDate;
	public TourLog(String id, String title, String memo, String subTitle, String coverImg, char lockYN, Date regDate,
			int period, Date startDate, int companion, String mid, Date lastModDate, int hit, String tTheme,
			Date endDate) {
		super();
		this.id = id;
		this.title = title;
		this.memo = memo;
		this.subTitle = subTitle;
		this.coverImg = coverImg;
		this.lockYN = lockYN;
		this.regDate = regDate;
		this.period = period;
		this.startDate = startDate;
		this.companion = companion;
		this.mid = mid;
		this.lastModDate = lastModDate;
		this.hit = hit;
		this.tTheme = tTheme;
		this.endDate = endDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	public String getCoverImg() {
		return coverImg;
	}
	public void setCoverImg(String coverImg) {
		this.coverImg = coverImg;
	}
	public char getLockYN() {
		return lockYN;
	}
	public void setLockYN(char lockYN) {
		this.lockYN = lockYN;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public int getCompanion() {
		return companion;
	}
	public void setCompanion(int companion) {
		this.companion = companion;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public Date getLastModDate() {
		return lastModDate;
	}
	public void setLastModDate(Date lastModDate) {
		this.lastModDate = lastModDate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String gettTheme() {
		return tTheme;
	}
	public void settTheme(String tTheme) {
		this.tTheme = tTheme;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}