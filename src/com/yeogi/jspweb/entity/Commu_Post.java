package com.yeogi.jspweb.entity;

public class Commu_Post {
	private String Title;
	private String REG_Date;
	private String Content;
	private String Hit;
	private String Mid;
	private String Post_Type;
	private String id;
	private String Commu_Post;
	public Commu_Post(String title, String rEG_Date, String content, String hit, String mid, String post_Type,
			String id, String commu_Post) {
		super();
		Title = title;
		REG_Date = rEG_Date;
		Content = content;
		Hit = hit;
		Mid = mid;
		Post_Type = post_Type;
		this.id = id;
		Commu_Post = commu_Post;

	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getREG_Date() {
		return REG_Date;
	}
	public void setREG_Date(String rEG_Date) {
		REG_Date = rEG_Date;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public String getHit() {
		return Hit;
	}
	public void setHit(String hit) {
		Hit = hit;
	}
	public String getMid() {
		return Mid;
	}
	public void setMid(String mid) {
		Mid = mid;
	}
	public String getPost_Type() {
		return Post_Type;
	}
	public void setPost_Type(String post_Type) {
		Post_Type = post_Type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCommu_Post() {
		return Commu_Post;
	}
	public void setCommu_Post(String commu_Post) {
		Commu_Post = commu_Post;
	}
}
	
