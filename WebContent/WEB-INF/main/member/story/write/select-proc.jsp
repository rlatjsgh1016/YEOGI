<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Date"%>
<%@page import="com.yeogi.jspweb.entity.TourLog"%>
<%@page import="java.util.List"%>
<%@page import="com.yeogi.jspweb.dao.jdbc.JdbcTourLogDao"%>
<%@page import="com.yeogi.jspweb.dao.TourLogDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%
	TourLogDao tourLogDao = new JdbcTourLogDao();
	TourLog tl = null;
	
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	
	String mid = request.getParameter("mid");
	String title = request.getParameter("select-title");
	String nation = request.getParameter("select-nation");
	Date startDate = Date.valueOf(request.getParameter("select-start-date"));
	
	
	int period = Integer.parseInt(request.getParameter("select-period"));
	int companion = Integer.parseInt(request.getParameter("select-companion"));
	String theme = request.getParameter("select-theme");
	Date endDate = Date.valueOf(request.getParameter("select-end-date"));
	
	tl = new TourLog(title,null,null,null,null,period,startDate,companion,mid,theme,endDate);
	
	tourLogDao.insert(tl);
	
	
%>