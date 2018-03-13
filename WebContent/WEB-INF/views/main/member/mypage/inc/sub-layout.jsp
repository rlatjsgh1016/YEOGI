<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>    
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath}" />
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link href = "${ctx }/CSS/mypage-style.css" type ="text/css" rel ="stylesheet" />



</head>

<body>
	<tiles:insertAttribute name="header" />	

	<!-- Visual 부분 시작 -->
	<tiles:insertAttribute name="visual" />	</div>
	
	<div id = "body">
		<div class="root-container" > <!-- 따옴표 안에 clear-fix --> 
			<!-- aside 시작------------------------------------------------------------------------------------------------------------- --> 			
	
			<tiles:insertAttribute name="aside" />		
				<!-- main 시작-------------------------------------------------------------------------------------------------------------- --> 
		
			<tiles:insertAttribute name="main" />
		</div>
		
	</div>
	
	<!-- footer 시작------------------------------------------------------------------------------------------------------------ --> 
	
	<tiles:insertAttribute name="footer" />
	
</body>
</html>