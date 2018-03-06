<%@page import="com.yeogi.jspweb.entity.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<script type="text/javascript"> 
 /*  
 	function pValue(){ 
 		document.getElementById("userName").value = opener.document.form.name.textcontent; 
 	}	 
 	 
 	function sendCheckValue(){ 
 		opener.document.form.name.value = document.getElementById("userName").value; 
 		self.close(); 
 	}  */
 	 
</script> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href = "../../../../CSS/style.css" type ="text/css" rel ="stylesheet" /> 

</head>
<body >
	<form id ="nameCheckForm" action="friends-request-proc.jsp"> 
 	<img src ="../../../../resources/logo.png" height="80px" alt ="별명 중복 확인" style="padding-left: 160px; margin-top:15px;"/> 
 		<div class="check">			 
				<span style="color:white;"> 친구 요청을 하시겠습니까? </span>
 		</div> 
 		<div id ="msg"></div> 
 		<br> 
 			<input id="useBtn" type="submit" value="요청하기" class="btn btn-cancel"> 
 			<input id="cancelBtn" type="button" value="취소" class="btn btn-cancel" onclick="window.close()">
 		 
 	</form> 
	
</body>
</html>