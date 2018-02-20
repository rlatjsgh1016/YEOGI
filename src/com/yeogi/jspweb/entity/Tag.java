package com.yeogi.jspweb.entity;

public class Tag {
	private String content;
	private String id;
	private String tLogPostId;
	public Tag(String content, String id, String tLogPostId) {
		super();
		this.content = content;
		this.id = id;
		this.tLogPostId = tLogPostId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
