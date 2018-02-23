package com.yeogi.jspweb.entity;

public class TLogPostImg {
	private String img;
	private String id;
	private String tLogPostId;
	public TLogPostImg() {

	}
	public TLogPostImg(String img, String id, String tLogPostId) {
		
		this.img = img;
		this.id = id;
		this.tLogPostId = tLogPostId;
	}
	public TLogPostImg(String img, String tLogPostId) {
		
		this.img = img;
		this.tLogPostId = tLogPostId;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String gettLogPostId() {
		return tLogPostId;
	}
	public void settLogPostId(String tLogPostId) {
		this.tLogPostId = tLogPostId;
	}
	
	
}
