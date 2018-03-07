<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
   <c:set var="ctx" value="${pageContext.request.servletContext.contextPath}" />
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>community main page</title>

<link type="text/css" href="${ctx}/CSS/communitymain-css" rel="stylesheet">

</head>
<tiles:insertAttribute name="header" />
<body>
<tiles:insertAttribute name="visual"/>
<tiles:insertAttribute name="Communitymain"/>
<tiles:insertAttribute name="footer"/>
</body>
</html>