<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <c:set var="ctx" value="${pageContext.request.servletContext.contextPath}" />
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- <meta name="viewport" content="width=device-width,initial-scale=1"> -->
<title></title>
<link href = "${ctx }/CSS/style.css" type ="text/css" rel ="stylesheet" />
<%-- <link href="${ctx}/student/css/layout.css" type="text/css" rel="stylesheet" /> --%>
</head>
<body>
   <!-- header 부분 -->

   <tiles:insertAttribute name="header" />

	<tiles:insertAttribute name="visual" />
	<!-- content 부분 -->

   <tiles:insertAttribute name="main" />
      
   
   <!-- ------------------- <footer> --------------------------------------- -->
   <tiles:insertAttribute name="footer" />

</body>
</html>
