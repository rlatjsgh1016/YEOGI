package com.yeogi.jspweb.entity;

public class TagView extends Tag{
	private String tLogId;
	public TagView() {

	}
	public TagView(String tagContent, String id, String tLogPostId, String tLogId) {

		super(tagContent, id, tLogPostId);
		this.tLogId = tLogId;
	}
	public String gettLogId() {
		return tLogId;
	}
	public void settLogId(String tLogId) {
		this.tLogId = tLogId;
	}
	
}