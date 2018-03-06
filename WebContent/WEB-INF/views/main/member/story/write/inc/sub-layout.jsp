<%@page import="com.yeogi.jspweb.entity.Nation"%>
<%@page import="com.yeogi.jspweb.dao.jdbc.JdbcNationDao"%>
<%@page import="com.yeogi.jspweb.dao.NationDao"%>
<%@page import="com.yeogi.jspweb.entity.Day"%>
<%@page import="java.util.List"%>
<%@page import="com.yeogi.jspweb.dao.jdbc.JdbcDayDao"%>
<%@page import="com.yeogi.jspweb.dao.DayDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath}" />


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>story main page</title>
<link type="text/css" href="${ctx}/CSS/story-write.css" rel="stylesheet">

</head>
	<tiles:insertAttribute name="header" />
<body>
	<tiles:insertAttribute name="main" />
</body>
</html>