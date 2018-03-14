package com.yeogi.jspweb.entity;

public class TLogPostView extends TLogPost {

	private String name;
	private String img;
	
	public TLogPostView() {
		
	}
	
	public TLogPostView(
			String content, 
			String tLogId, 
			String locId, 
			String trans, 
			String id,
			int day, 
			String name, 
			String img
			) 
	{
		super(content, tLogId, locId, trans, id, day);
		this.name = name;
		this.img = img;
	}
	
	public TLogPostView(
			String content,		
			String name, 
			String img
			) 
	{
		super(content);
		this.name = name;
		this.img = img;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
}
