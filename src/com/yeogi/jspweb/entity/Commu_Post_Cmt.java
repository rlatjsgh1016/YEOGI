package com.yeogi.jspweb.entity;

public class Commu_Post_Cmt {

	private String id;
	private String Reg_Date;
	private String Content;
	private String Commu_Post_id;
	private String Mid;
	private String Pid;
	private String Commu_Post_Cmt;
	public Commu_Post_Cmt(String id, String reg_Date, String content, String commu_Post_id, String mid, String pid,
			String commu_Post_Cmt) {
		super();
		this.id = id;
		Reg_Date = reg_Date;
		Content = content;
		Commu_Post_id = commu_Post_id;
		Mid = mid;
		Pid = pid;
		Commu_Post_Cmt = commu_Post_Cmt;
	}
	
	public Commu_Post_Cmt(String content) {
		super();
		Content = content;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getReg_Date() {
		return Reg_Date;
	}
	public void setReg_Date(String reg_Date) {
		Reg_Date = reg_Date;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public String getCommu_Post_id() {
		return Commu_Post_id;
	}
	public void setCommu_Post_id(String commu_Post_id) {
		Commu_Post_id = commu_Post_id;
	}
	public String getMid() {
		return Mid;
	}
	public void setMid(String mid) {
		Mid = mid;
	}
	public String getPid() {
		return Pid;
	}
	public void setPid(String pid) {
		Pid = pid;
	}
	public String getCommu_Post_Cmt() {
		return Commu_Post_Cmt;
	}
	public void setCommu_Post_Cmt(String commu_Post_Cmt) {
		Commu_Post_Cmt = commu_Post_Cmt;
	}
	
	
	
	
}
