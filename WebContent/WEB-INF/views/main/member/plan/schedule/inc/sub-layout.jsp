<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath}"></c:set>
<!DOCTYPE html>
<html>
<%-- <head>
<meta charset="UTF-8">
<title>YEOGI</title>
<link href="${ctx}/CSS/plan-schdule.css" type="text/css" rel="stylesheet" />
<script src="${ctx}/js/plan-side-function.js"></script>
<style type="text/css">
</style>
</head> --%>
<HEAD>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="../../../../CSS/plan-schdule.css" type=text/css
	rel="stylesheet" />
<script src="../../../../js/plan-side-function.js">


</script>
</HEAD>

<body>
<!-- --------------------------- <header> --------------------------------------- -->
	<tiles:insertAttribute name="header"></tiles:insertAttribute>




<!-- --------------------------- <body> --------------------------------------- -->
	<tiles:insertAttribute name="main"></tiles:insertAttribute>
	
	
</body>
</html>