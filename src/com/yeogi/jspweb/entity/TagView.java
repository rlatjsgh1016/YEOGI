package com.yeogi.jspweb.entity;

public class TagView extends Tag{
	private String tLogId;
	public TagView() {

	}
	public TagView(String content, String id, String tLogPostId, String tLogId) {

		super(content, id, tLogPostId);
		this.tLogId = tLogId;
	}
	public String gettLogId() {
		return tLogId;
	}
	public void settLogId(String tLogId) {
		this.tLogId = tLogId;
	}
	
}