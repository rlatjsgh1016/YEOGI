package com.yeogi.jspweb.entity;

public class Commu_Post_Img {
	private String id;
	private String Commu_Post_id;
	private String Img;
	private String Commu_Post_Img;
	public Commu_Post_Img(String id, String commu_Post_Img) {
	

	}
	public Commu_Post_Img(String id, String commu_Post_id, String img, String commu_Post_Img) {
		super();
		this.id = id;
		Commu_Post_id = commu_Post_id;
		Img = img;
		Commu_Post_Img = commu_Post_Img;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCommu_Post_id() {
		return Commu_Post_id;
	}
	public void setCommu_Post_id(String commu_Post_id) {
		Commu_Post_id = commu_Post_id;
	}
	public String getImg() {
		return Img;
	}
	public void setImg(String img) {
		Img = img;
	}
	public String getCommu_Post_Img() {
		return Commu_Post_Img;
	}
	public void setCommu_Post_Img(String commu_Post_Img) {
		Commu_Post_Img = commu_Post_Img;
	}
	
}
	
	


