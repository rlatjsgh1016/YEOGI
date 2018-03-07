<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath}"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>YEOGI</title>
<link href="${ctx}/CSS/story-read.css" type="text/css" rel="stylesheet" />
<script src="${ctx}/js/StoryReadMain.js"></script>
<style type="text/css">
</style>
</head>
<body>
	<tiles:insertAttribute name="header"></tiles:insertAttribute>
	
	<tiles:insertAttribute name="main"></tiles:insertAttribute>
	
	<tiles:insertAttribute name="footer"></tiles:insertAttribute>

</body>
</html>