package com.yeogi.jspweb.entity;

public class TPlanPostSpd {
	private String Id;
	private String TPlanLocId;
	private String TPlanId;
	private String Type;
	private String Content;
	private String Unit;
	private String Amount;
	
	public TPlanPostSpd() {
		// TODO Auto-generated constructor stub
	}
	public TPlanPostSpd(String id, String tPlanLocId, String tPlanId, String type, String content, String unit,
			String amount) {
		super();
		Id = id;
		TPlanLocId = tPlanLocId;
		TPlanId = tPlanId;
		Type = type;
		Content = content;
		Unit = unit;
		Amount = amount;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getTPlanLocId() {
		return TPlanLocId;
	}
	public void setTPlanLocId(String tPlanLocId) {
		TPlanLocId = tPlanLocId;
	}
	public String getTPlanId() {
		return TPlanId;
	}
	public void setTPlanId(String tPlanId) {
		TPlanId = tPlanId;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public String getUnit() {
		return Unit;
	}
	public void setUnit(String unit) {
		Unit = unit;
	}
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String amount) {
		Amount = amount;
	}
	
	
}
