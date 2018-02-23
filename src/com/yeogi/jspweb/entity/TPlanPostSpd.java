package com.yeogi.jspweb.entity;

public class TPlanPostSpd {
	private String id;
	private String tPlanLocId;
	private String tPlanId;
	private String type;
	private String content;
	private String unit;
	private String amount;
	
	public TPlanPostSpd() {
		// TODO Auto-generated constructor stub
	}

	public TPlanPostSpd(String id, String tPlanLocId, String tPlanId, String type, String content, String unit,
			String amount) {
		super();
		this.id = id;
		this.tPlanLocId = tPlanLocId;
		this.tPlanId = tPlanId;
		this.type = type;
		this.content = content;
		this.unit = unit;
		this.amount = amount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTPlanLocId() {
		return tPlanLocId;
	}

	public void setTPlanLocId(String tPlanLocId) {
		this.tPlanLocId = tPlanLocId;
	}

	public String getTPlanId() {
		return tPlanId;
	}

	public void setTPlanId(String tPlanId) {
		this.tPlanId = tPlanId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	
	
	
}
