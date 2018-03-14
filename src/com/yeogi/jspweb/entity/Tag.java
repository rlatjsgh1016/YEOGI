package com.yeogi.jspweb.entity;

public class Tag {
	private String tagContent;
	private String id;
	private String tLogPostId;
	public Tag() {

	}
	public Tag(String tagContent, String id, String tLogPostId) {

		this.tagContent = tagContent;
		this.id = id;
		this.tLogPostId = tLogPostId;
	}
	public String getTagContent() {
		return tagContent;
	}
	public void setTagContent(String tagContent) {
		this.tagContent = tagContent;
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
