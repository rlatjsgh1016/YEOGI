<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href = "../CSS/style.css" type ="text/css" rel ="stylesheet" />
<script type="text/javascript">
	function pValue(){
		document.getElementById("userId").value = opener.document.form.id.value;
	}	
	
	function sendCheckValue(){
		opener.document.form.id.value = document.getElementById("userId").value;
		self.close();
	}
	
</script>

</head>
<body onload="pValue()">
	<form id ="idCheckForm" action="join-proc.jsp">
	<img src ="../resources/logo.png" height="80px" alt ="아이디 중복 확인" style="padding-left: 160px; margin-top:15px;"/>
		<div class="check" >			
			<input type ="text" name = "idinput" id="userId">
			<input type="submit" name="btn" value="ID 중복확인" class="btn btn-cancel" onclick="idCheck()">
		</div>
		<div id ="msg"></div>
		<br>
		<input id="useBtn" type="button" value="사용하기" class="btn btn-cancel" onclick="sendCheckValue()">
		<input id="cancelBtn" type="button" value="취소" class="btn btn-cancel" onclick="window.close()">
	</form>
</body>
</html>