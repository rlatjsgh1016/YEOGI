<%@page import="com.yeogi.jspweb.entity.Commu_Post"%>
<%@page import="com.yeogi.jspweb.dao.jdbc.JdbcCommuPostDao"%>
<%@page import="com.yeogi.jspweb.dao.Commu_PostDao"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>community main page</title>
<link type="text/css" href="${ctx}/CSS/story-write.css" rel="stylesheet">

</head>
	<tiles:insertAttribute name="header" />
<body>
	<tiles:insertAttribute name="main" />
</body>
</html>