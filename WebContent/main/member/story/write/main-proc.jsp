<%@page import="com.yeogi.jspweb.entity.TLogPost"%>
<%@page import="com.yeogi.jspweb.dao.jdbc.JdbcTLogPostDao"%>
<%@page import="com.yeogi.jspweb.dao.TLogPostDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>


<%
	response.setCharacterEncoding("UTF-8");
	response.setContentType("text/html; charset=UTF-8");
	request.setCharacterEncoding("UTF-8");
	
	String tourLogId = request.getParameter("tour-log-id");
	String btnMain = null;
	String btnPost = null;
	String review = null;
	String location = null;
	String transport = null;
	String spdType = null;
	String spdContent = null;
	String spdUnit = null;
	String spdAmount = null;
	String tag = null;
	
	String btnMain_ = request.getParameter("btn-main");
	String btnPost_ = request.getParameter("btn-post");
	String review_ = request.getParameter("review");
	String location_ = request.getParameter("location");
	String transport_ = request.getParameter("transport");
	String spdType_ = request.getParameter("spd-type");
	String spdContent_ = request.getParameter("spd-content");
	String spdUnit_ = request.getParameter("spd-unit");
	String spdAmount_ = request.getParameter("spd-amount");
	String tag_ = request.getParameter("tag");
	
	if(btnPost_ != null && !btnPost_.equals(""))
		btnPost = btnPost_;
	if(review_ != null && !review_.equals(""))
		review = review_;
	if(location_ != null && !location_.equals(""))
		location = location_;
	if(transport_ != null && !transport_.equals(""))
		transport = transport_;
	if(spdType_ != null && !spdType_.equals(""))
		spdType = spdType_;
	if(spdContent_ != null && !spdContent_.equals(""))
		spdContent = spdContent_;
	if(spdUnit_ != null && !spdUnit_.equals(""))
		spdUnit = spdUnit_;
	if(spdAmount_ != null && !spdAmount_.equals(""))
		spdAmount = spdAmount_;
	if(tag_ != null && !tag_.equals(""))
		tag = tag_;
	
	switch(btnPost){
	case "ÀúÀå":
		TLogPostDao tLogPostDao = new JdbcTLogPostDao();
		TLogPost tlp = new TLogPost(review, tourLogId, location, transport);
		tLogPostDao.insert(tlp);
		break;
	}
	response.sendRedirect("main.jsp");
%>